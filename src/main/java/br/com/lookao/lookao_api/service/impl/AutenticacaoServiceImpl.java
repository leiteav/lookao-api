package br.com.lookao.lookao_api.service.impl;

import br.com.lookao.lookao_api.entity.Usuario;
import br.com.lookao.lookao_api.entity.UsuarioAutenticado;
import br.com.lookao.lookao_api.repository.UsuarioRepository;
import br.com.lookao.lookao_api.service.AutenticaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AutenticacaoServiceImpl implements AutenticaoService, UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String nome) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByNome(nome)
                .orElseThrow(() ->
        new UsernameNotFoundException(String.format("Nome de usuário não encontrado", nome)));

        return new UsuarioAutenticado(usuario.getNome(),
                 usuario.getEmail(),
                 usuario.getSenha(), usuario.getPerfil().getDescricao());
    }
}
