package br.com.lookao.lookao_api.service.impl;

import br.com.lookao.lookao_api.entity.Pet;
import br.com.lookao.lookao_api.repository.PetRepository;
import br.com.lookao.lookao_api.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetServiceImpl implements PetService {

    @Autowired
    PetRepository petRepository;

    @Override
    public List<Pet> listarPets() {
        return petRepository.findAll();
    }
}
