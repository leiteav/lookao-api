package br.com.lookao.lookao_api.service.impl;

import br.com.lookao.lookao_api.entity.Usuario;
import br.com.lookao.lookao_api.repository.UsuarioRepository;
import br.com.lookao.lookao_api.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    PasswordEncoder passwordEncoder;

    @Override
    public void salvarUsuario(Usuario usuario) {
        usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
        usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> findAllUsers() {
        return usuarioRepository.findAll();
    }
}
