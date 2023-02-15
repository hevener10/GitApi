package br.com.capitani.api.infrastructure.persistence.jpa;

import br.com.capitani.api.domain.git.resultado.GitUserModel;
import br.com.capitani.api.domain.git.resultado.GitUserRepository;
import br.com.capitani.api.infrastructure.persistence.jpa.springdata.SpringDataJPAGitUserRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;


public class JPAGitUserRepository  {

}
