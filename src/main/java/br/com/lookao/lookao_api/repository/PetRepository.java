package br.com.lookao.lookao_api.repository;

import br.com.lookao.lookao_api.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}
