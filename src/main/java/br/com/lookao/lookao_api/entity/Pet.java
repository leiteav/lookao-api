package br.com.lookao.lookao_api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "PET")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pet", nullable = false)
    private Long id;

    @Column(name = "nm_pet")
    private String nome;

    @Column(name = "ds_pet")
    private String dsRaca;

    @OneToOne
    private Raca raca;
}
