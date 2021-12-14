package br.com.lookao.lookao_api.service.impl;

import br.com.lookao.lookao_api.entity.Raca;
import br.com.lookao.lookao_api.repository.RacaRepository;
import br.com.lookao.lookao_api.service.RacaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RacaServiceImpl implements RacaService {

    @Autowired
    RacaRepository racaRepository;

    @Override
    public List<Raca> listarRacas() {
        return racaRepository.findAll();
    }

    @Override
    public Raca cadastrarRaca(Raca raca) {
        return racaRepository.save(raca);
    }


}
