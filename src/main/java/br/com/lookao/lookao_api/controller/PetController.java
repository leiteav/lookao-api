package br.com.lookao.lookao_api.controller;

import br.com.lookao.lookao_api.entity.Pet;
import br.com.lookao.lookao_api.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pet")
public class PetController {

    @Autowired
    PetRepository petRepository;

    @GetMapping
    public List<Pet> listarPets(){
        return petRepository.findAll();
    }

    @PostMapping
    public Pet cadastrarPet(@RequestBody Pet pet){
        return petRepository.save(pet);
    }

}
