package br.com.capitani.api.domain.git.resultado;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GitUserRepository extends JpaRepository<GitUserModel, UUID> {

}
