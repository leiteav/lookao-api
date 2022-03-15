package br.com.lookao.lookao_api.service.impl;

import br.com.lookao.lookao_api.entity.Breed;
import br.com.lookao.lookao_api.repository.BreedRepository;
import br.com.lookao.lookao_api.service.BreedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BreedServiceImpl implements BreedService {

    @Autowired
    BreedRepository breedRepository;

    @Override
    public List<Breed> findAllBreeds() {
        return breedRepository.findAll();
    }

    @Override
    public Breed saveBreed(Breed raca) {
        return breedRepository.save(raca);
    }


}
