package br.com.lookao.lookao_api.service;

import br.com.lookao.lookao_api.entity.Raca;

import java.util.List;

public interface RacaService {

    List<Raca> listarRacas();

    Raca cadastrarRaca(Raca raca);
}
