package br.com.lookao.lookao_api.controller;

import br.com.lookao.lookao_api.entity.Pet;
import br.com.lookao.lookao_api.entity.Raca;
import br.com.lookao.lookao_api.service.RacaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/") //Mateus pediu dia 10/12
@RestController
@RequestMapping("/raca")
public class RacaController {

    @Autowired
    RacaService racaService;

    @GetMapping
    public List<Raca> listarRacas(){
        return racaService.listarRacas();
    }

    @PostMapping
    public Raca cadastrarRaca(@RequestBody Raca raca){
        return racaService.cadastrarRaca(raca);
    }
}
