package br.com.capitani.api.infrastructure.ws.rest;

import br.com.capitani.api.application.GitService;
import br.com.capitani.api.application.representation.GitUserRepresentation;
import br.com.capitani.api.domain.git.resultado.GitUserResponse;
import br.com.capitani.api.infrastructure.feign.Exeption.GitUsuarioNaoEncontrado;
import feign.Response;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/git")
@AllArgsConstructor
public class GitController {

    @Autowired
    private GitService service;

    @GetMapping(value = "/{user}")
    @ExceptionHandler(GitUsuarioNaoEncontrado.class)
    //@Operation(description = "Enviar email de assinatura do documento")
    public ResponseEntity<GitUserRepresentation> findUser(@PathVariable String user) throws GitUsuarioNaoEncontrado {
        return ResponseEntity.ok().body(service.findUser(user));
    }

}
