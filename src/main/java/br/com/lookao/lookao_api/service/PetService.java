package br.com.lookao.lookao_api.service;

import br.com.lookao.lookao_api.dto.PetDTO;
import br.com.lookao.lookao_api.entity.Pet;
import br.com.lookao.lookao_api.exception.PetNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PetService {

    List<Pet> listarPets();

    PetDTO cadastrarPet(Pet pet);

    PetDTO buscarPetById(final Long pet) throws PetNotFoundException;
}
