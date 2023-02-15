package br.com.capitani.api.domain.exeption;



import br.com.capitani.api.infrastructure.feign.Exeption.RestApiClientException;
import feign.Request;

import java.io.IOException;


/**
 * This exception is a wrapper for IO related exceptions.
 *
 * It contains the request made before the exception occurred.
 *
 */
public class ConnectionException extends RestApiClientException {

    private static final long serialVersionUID = 1L;

    private final transient Request request;

    public ConnectionException(String message, IOException cause, Request request) {
        super(0, message);

        this.request = request;
    }

}