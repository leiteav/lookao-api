package br.com.lookao.lookao_api.service.impl;

import br.com.lookao.lookao_api.dto.PetDTO;
import br.com.lookao.lookao_api.entity.Pet;
import br.com.lookao.lookao_api.exception.PetNotFoundException;
import br.com.lookao.lookao_api.repository.PetRepository;
import br.com.lookao.lookao_api.service.PetService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.commons.logging.Log;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PetServiceImpl implements PetService {

    private static final Logger log = LoggerFactory.getLogger(PetServiceImpl.class);

    @Autowired
    PetRepository petRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<Pet> listarPets() {
        return petRepository.findAll();
    }

    @Override
    public PetDTO cadastrarPet(Pet pet) {
        pet.setDtCadastro(LocalDateTime.now());
        petRepository.save(pet);
        log.info("Pet {} cadastrado com sucesso.", pet.getIdPet());
        PetDTO petDTO = modelMapper.map(pet, PetDTO.class);
        petDTO.setMensagem("Pet cadastrado com sucesso.");
        return petDTO;
    }

    @Override
    public PetDTO buscarPetById(final Long id) throws PetNotFoundException {
        final Pet pet = petRepository.findById(id)
                .orElseThrow(() -> new PetNotFoundException(id));
        return modelMapper.map(pet, PetDTO.class);
    }
}
