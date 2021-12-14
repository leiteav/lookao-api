package br.com.lookao.lookao_api.service;

import br.com.lookao.lookao_api.entity.Pet;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PetService {

    List<Pet> listarPets();

    Pet cadastrarPet(Pet pet);
}
