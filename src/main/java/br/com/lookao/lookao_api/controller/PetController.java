package br.com.lookao.lookao_api.controller;

import br.com.lookao.lookao_api.entity.Pet;
import br.com.lookao.lookao_api.repository.PetRepository;
import br.com.lookao.lookao_api.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/") //Mateus pediu dia 10/12
@RestController
@RequestMapping("/pet")
public class PetController {

    @Autowired
    PetRepository petRepository;

    @Autowired
    PetService petService;

    @GetMapping
    public List<Pet> listarPets(){
        return petService.listarPets();
    }

    @PostMapping
    public Pet cadastrarPet(@RequestBody Pet pet){
        return petRepository.save(pet);
    }

}
