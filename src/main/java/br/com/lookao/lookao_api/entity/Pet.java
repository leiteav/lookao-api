package br.com.lookao.lookao_api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "PET")
public class Pet extends Auditoria{
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

}
