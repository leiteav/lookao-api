package br.com.lookao.lookao_api.dto;

import br.com.lookao.lookao_api.entity.Breed;
import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(setterPrefix = "with")
public class PetDTO {
    private Long id;
    private String name;
    private Breed breed;
    private String message;
    private LocalDateTime createdAt;
}

