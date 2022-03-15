package br.com.lookao.lookao_api.repository;

import br.com.lookao.lookao_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {


    Optional<User> findByNameOrMail(String name, String mail);

    Optional<User> findByName(String name);
}
