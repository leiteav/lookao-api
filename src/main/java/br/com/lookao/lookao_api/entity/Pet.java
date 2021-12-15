package br.com.lookao.lookao_api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name = "PET")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pet", nullable = false)
    private Long idPet;

    @Column(name = "nm_pet")
    private String nomePet;

    @Column(name = "ds_pet")
    private String descricaoPet;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_raca")
    private Raca raca;

    @Column(name="dt_cadastro")
    private LocalDateTime dtCadastro;
}
