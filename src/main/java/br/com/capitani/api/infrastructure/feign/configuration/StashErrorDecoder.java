package br.com.capitani.api.infrastructure.feign.configuration;

import br.com.capitani.api.infrastructure.feign.Exeption.RestApiClientException;
import br.com.capitani.api.infrastructure.feign.Exeption.RestApiServerException;
import feign.Response;
import feign.RetryableException;
import feign.codec.ErrorDecoder;
import org.springframework.stereotype.Component;

import java.net.UnknownHostException;

import static feign.FeignException.errorStatus;

@Component
public class StashErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {
        if (response.status() >= 400 && response.status() <= 499) {
            return new RestApiClientException(
                    response.status(),
                    response.reason()
            );
        }
        if (response.status() >= 500 && response.status() <= 599) {
            return new RestApiServerException(
                    response.status(),
                    response.reason()
            );
        }
        if (response.body()!=null && response.body().toString().contains("UnknownHostException")) {
            // Tratar erro de endereço desconhecido
            return new RetryableException(
                    response.status(),
                    "Erro ao se conectar com o servidor. Verifique sua conexão com a internet e tente novamente.",
                    response.request().httpMethod(),
                    null,
                    null,
                    null);
        }
        return errorStatus(methodKey, response);
    }


}
