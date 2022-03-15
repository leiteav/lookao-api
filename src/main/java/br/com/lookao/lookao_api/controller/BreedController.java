package br.com.lookao.lookao_api.controller;

import br.com.lookao.lookao_api.entity.Breed;
import br.com.lookao.lookao_api.service.BreedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/") //Mateus pediu dia 10/12
@RestController
@RequestMapping("api/v1/breed")
public class BreedController {

    @Autowired
    BreedService breedService;

    @GetMapping
    public List<Breed> findAllBreeds(){
        return breedService.findAllBreeds();
    }

    @PostMapping
    public Breed saveBreed(@RequestBody Breed breed){
        return breedService.saveBreed(breed);
    }
}
