package br.com.lookao.lookao_api.service.impl;

import br.com.lookao.lookao_api.entity.User;
import br.com.lookao.lookao_api.repository.UserRepository;
import br.com.lookao.lookao_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    PasswordEncoder passwordEncoder;

    @Override
    public void salvarUsuario(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
