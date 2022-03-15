package br.com.lookao.lookao_api.repository;

import br.com.lookao.lookao_api.entity.Breed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BreedRepository extends JpaRepository<Breed, Long> {
}
