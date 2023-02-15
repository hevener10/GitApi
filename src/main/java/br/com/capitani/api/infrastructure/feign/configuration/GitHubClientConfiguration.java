package br.com.capitani.api.infrastructure.feign.configuration;

import feign.Logger;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class GitHubClientConfiguration {

    @Bean
    public ErrorDecoder errorDecoder(){
        return new StashErrorDecoder();
    }

    @Bean
    Logger.Level feignLoggerLever(){
        return Logger.Level.FULL;
    }
}
