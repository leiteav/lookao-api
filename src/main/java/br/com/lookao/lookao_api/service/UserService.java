package br.com.lookao.lookao_api.service;

import br.com.lookao.lookao_api.entity.User;

import java.util.List;

public interface UserService {

    void salvarUsuario(User user);

    List<User> findAllUsers();
}
