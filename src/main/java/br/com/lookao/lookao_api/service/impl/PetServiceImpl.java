package br.com.lookao.lookao_api.service.impl;

import br.com.lookao.lookao_api.dto.PetDTO;
import br.com.lookao.lookao_api.entity.Pet;
import br.com.lookao.lookao_api.exception.PetNotFoundException;
import br.com.lookao.lookao_api.repository.PetRepository;
import br.com.lookao.lookao_api.service.PetService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetServiceImpl implements PetService {

    private static final Logger log = LoggerFactory.getLogger(PetServiceImpl.class);

    @Autowired
    PetRepository petRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<Pet> findAllPets() {
        return petRepository.findAll();
    }

    @Override
    public PetDTO savePet(Pet pet) {
        petRepository.save(pet);
        log.info("Pet {} cadastrado com sucesso.", pet.getId());
        PetDTO petDTO = modelMapper.map(pet, PetDTO.class);
        petDTO.setMessage("Pet cadastrado com sucesso.");
        return petDTO;
    }

    @Override
    public PetDTO findPetById(final Long id) throws PetNotFoundException {
        final Pet pet = petRepository.findById(id)
                .orElseThrow(() -> new PetNotFoundException(id));
        return modelMapper.map(pet, PetDTO.class);
    }
}
