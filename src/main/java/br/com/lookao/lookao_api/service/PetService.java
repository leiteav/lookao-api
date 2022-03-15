package br.com.lookao.lookao_api.service;

import br.com.lookao.lookao_api.dto.PetDTO;
import br.com.lookao.lookao_api.entity.Pet;
import br.com.lookao.lookao_api.exception.PetNotFoundException;

import java.util.List;

public interface PetService {

    List<Pet> findAllPets();

    PetDTO savePet(Pet pet);

    PetDTO findPetById(final Long pet) throws PetNotFoundException;
}
