package br.com.capitani.api.infrastructure.feign.Exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class GitUsuarioNaoEncontrado extends Exception{

    public GitUsuarioNaoEncontrado(String message) {
        super(message);
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Usuario não encontrado :"+message
        );
    }
}
