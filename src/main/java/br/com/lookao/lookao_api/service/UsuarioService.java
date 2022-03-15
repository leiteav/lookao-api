package br.com.lookao.lookao_api.service;

import br.com.lookao.lookao_api.entity.Usuario;

import java.util.List;

public interface UsuarioService {

    void salvarUsuario(Usuario usuario);

    List<Usuario> listarUsuarios();
}
