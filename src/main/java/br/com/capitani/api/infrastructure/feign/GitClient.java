package br.com.capitani.api.infrastructure.feign;

import br.com.capitani.api.infrastructure.feign.configuration.GitHubClientConfiguration;
import br.com.capitani.api.domain.git.resultado.GitUserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url= "${url.api.github}", name = "GitUserResponse",configuration = GitHubClientConfiguration.class)
public interface GitClient {

    @GetMapping("/users/{user}")
    GitUserResponse getUserData(@PathVariable String user);




}
