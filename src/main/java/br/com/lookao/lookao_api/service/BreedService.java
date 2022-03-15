package br.com.lookao.lookao_api.service;

import br.com.lookao.lookao_api.entity.Breed;

import java.util.List;

public interface BreedService {

    List<Breed> findAllBreeds();

    Breed saveBreed(Breed raca);
}
