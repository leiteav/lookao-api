package br.com.lookao.lookao_api.controller;


import br.com.lookao.lookao_api.entity.Usuario;
import br.com.lookao.lookao_api.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> findAllUsers(){
        return usuarioService.findAllUsers();
    }
}
