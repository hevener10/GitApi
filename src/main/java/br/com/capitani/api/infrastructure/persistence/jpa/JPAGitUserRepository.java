package br.com.capitani.api.infrastructure.persistence.jpa;

import br.com.capitani.api.domain.git.resultado.GitUserModel;
import br.com.capitani.api.domain.git.resultado.GitUserRepository;
import br.com.capitani.api.infrastructure.persistence.jpa.springdata.SpringDataJPAGitUserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class JPAGitUserRepository implements GitUserRepository {

    SpringDataJPAGitUserRepository repository;
    @Override
    public void add(GitUserModel obj) {
        this.repository.save(obj);
    }

    @Override
    public void remove(GitUserModel obj) {
        this.repository.delete(obj);
    }

    @Override
    public GitUserModel get(UUID id) {
        return this.repository.findById(id).orElse(null);
    }

    @Override
    public boolean exists(GitUserModel obj) {
        return this.repository.existsById(obj.getId());
    }

    @Override
    public List<GitUserModel> all() {
        return this.repository.findAll();
    }
}
