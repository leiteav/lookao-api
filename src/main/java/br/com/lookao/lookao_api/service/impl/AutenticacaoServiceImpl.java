package br.com.lookao.lookao_api.service.impl;

import br.com.lookao.lookao_api.entity.User;
import br.com.lookao.lookao_api.entity.UserAuthentication;
import br.com.lookao.lookao_api.repository.UserRepository;
import br.com.lookao.lookao_api.service.AutenticaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AutenticacaoServiceImpl implements AutenticaoService, UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        User user = userRepository.findByName(name)
                .orElseThrow(() ->
        new UsernameNotFoundException(String.format("Nome de usuário não encontrado", name)));

        return new UserAuthentication(user.getName(),
                 user.getMail(),
                 user.getPassword(), user.getRole().getDescription());
    }
}
