package es.ivanamat.springboot.apirest.repository;

import es.ivanamat.springboot.apirest.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
public interface UserRepository extends CrudRepository<User, Long> {
    public Optional<User> findById(Long id);
    public Optional<User> findByName(String name);
}
