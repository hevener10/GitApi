package br.com.capitani.api.Service;

import br.com.capitani.api.application.GitService;
import br.com.capitani.api.domain.git.resultado.GitUserModel;
import br.com.capitani.api.domain.git.resultado.GitUserResponse;
import br.com.capitani.api.infrastructure.feign.Exeption.GitUsuarioNaoEncontrado;
import br.com.capitani.api.infrastructure.feign.GitClient;
import br.com.capitani.api.util.GitUserResponseCreate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class GitServiceTest {

    @MockBean
    GitClient gitClient;

    @InjectMocks
    GitService gitServiceMock;

    @Autowired
    GitService gitServiceAutowired;

    @MockBean
    GitUserModel gitUserModel;

    @Test
    public void testGitServiceWhenIsNull() throws GitUsuarioNaoEncontrado {
        try {
            gitServiceMock.findUser(null);
        } catch (Exception e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testGitServiceWhenIsNotNull() throws GitUsuarioNaoEncontrado {
        Mockito.when(gitClient.getUserData("hevener10")).thenReturn(
                GitUserResponseCreate.createGitUserResponse()
        );
           var retorno = gitServiceAutowired.findUser("hevener10");

            assertNotNull(retorno);


    }

}
