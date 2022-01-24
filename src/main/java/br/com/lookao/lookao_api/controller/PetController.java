package br.com.lookao.lookao_api.controller;

import br.com.lookao.lookao_api.dto.PetDTO;
import br.com.lookao.lookao_api.entity.Pet;
import br.com.lookao.lookao_api.exception.PetNotFoundException;
import br.com.lookao.lookao_api.repository.PetRepository;
import br.com.lookao.lookao_api.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:3000/") // Mateus pediu dia 10/12
@RestController
@RequestMapping("/pet")
public class PetController {

    @Autowired
    PetService petService;

    @GetMapping
    public List<Pet> listarPets(){
        return petService.listarPets();
    }

    @PostMapping("/cadastrar")
    public PetDTO cadastrarPet(@RequestBody Pet pet){
        return petService.cadastrarPet(pet);
    }

    @GetMapping("/{id}")
    public PetDTO buscarPetById(@PathVariable final Long id) throws PetNotFoundException {
        return petService.buscarPetById(id);
    }

}
