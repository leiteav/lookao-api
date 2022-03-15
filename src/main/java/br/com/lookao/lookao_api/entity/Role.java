package br.com.lookao.lookao_api.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Role {

    ADMIN("Admin"),
    USUARIO("User");

    private final String description;
}
