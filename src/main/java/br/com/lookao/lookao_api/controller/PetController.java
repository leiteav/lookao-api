package br.com.lookao.lookao_api.controller;

import br.com.lookao.lookao_api.dto.PetDTO;
import br.com.lookao.lookao_api.entity.Pet;
import br.com.lookao.lookao_api.exception.PetNotFoundException;
import br.com.lookao.lookao_api.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/") // Mateus pediu dia 10/12
@RestController
@RequestMapping("api/v1/pet")
public class PetController {

    @Autowired
    PetService petService;

    @GetMapping("/all")
    public List<Pet> findAllPets(){
        return petService.findAllPets();
    }

    @PostMapping("/register")
    public PetDTO savePet(@RequestBody Pet pet){
        return petService.savePet(pet);
    }

    @GetMapping("/{id}")
    public PetDTO findPetById(@PathVariable final Long id) throws PetNotFoundException {
        return petService.findPetById(id);
    }

}
