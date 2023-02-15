package br.com.capitani.api.infrastructure.persistence.jpa.springdata;

import br.com.capitani.api.domain.git.resultado.GitUserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SpringDataJPAGitUserRepository extends JpaRepository<GitUserModel, UUID> {

}
