package br.com.lookao.lookao_api.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Perfil {

    ADMIN("Admin"),
    USUARIO("Usuario");

    private final String descricao;
}
