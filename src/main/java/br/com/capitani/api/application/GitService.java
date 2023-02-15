package br.com.capitani.api.application;

import br.com.capitani.api.application.representation.GitUserRepresentation;
import br.com.capitani.api.domain.git.resultado.GitUserModel;
import br.com.capitani.api.domain.git.resultado.GitUserRepository;
import br.com.capitani.api.infrastructure.feign.Exeption.GitUsuarioNaoEncontrado;
import br.com.capitani.api.infrastructure.feign.GitClient;
import br.com.capitani.api.infrastructure.validation.Validacao;
import feign.RetryableException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class GitService {



    private final GitUserRepository gitUserRepository;

    @Autowired
    private GitClient gitClient;

    @Autowired
    public GitService(GitUserRepository gitUserRepository) {
        this.gitUserRepository = gitUserRepository;
    }

    public GitUserRepresentation findUser(String user) throws GitUsuarioNaoEncontrado {
        Validacao.notNull(user);
        try {
            var github = gitClient.getUserData(user);
            GitUserModel gitUserModel = github.toModel(github);
            gitUserRepository.save(gitUserModel);
            return gitUserModel.toRepresentation(gitUserModel);
        } catch (RetryableException ex) {

            throw new ResponseStatusException(
                    HttpStatus.SERVICE_UNAVAILABLE, "Api fora do ar : " + ex.getMessage(), ex
            );
        }catch (Exception ex) {
            ex.printStackTrace();
            if(ex.getMessage().contains("UnknownHostException")){
                throw new ResponseStatusException(
                        HttpStatus.SERVICE_UNAVAILABLE, "Api fora do ar : " + ex.getMessage(), ex
                );
            }
            if(ex.getMessage().contains("404")){
                throw new GitUsuarioNaoEncontrado("Usuário não encontrado:" + ex.getMessage());
            }
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "Erro desconhecido : " + ex.getMessage(), ex
            );
        }



    }


}
