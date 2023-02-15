package br.com.capitani.api.infrastructure.feign.Exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class GitApiError extends RuntimeException{

        public GitApiError(HttpStatus message) {

            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR, "erro na api :"+message
            );
        }

}
