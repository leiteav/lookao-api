package br.com.lookao.lookao_api.dto;

import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")
public class PetDTO {
    private Long idpet;
    private String nomePet;
    private String nomeRaca;
    private String mensagem;
    private LocalDateTime dtCadastro;
}

