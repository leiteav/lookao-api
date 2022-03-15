package br.com.lookao.lookao_api.repository;

import br.com.lookao.lookao_api.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {


    Optional<Usuario> findByNomeOrAndEmail(String email, String nome);

    Optional<Usuario> findByNome(String nome);
}
