package br.com.lookao.lookao_api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
public class Pet extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pet", nullable = false)
    private Long id;

    @Column(name = "nm_pet")
    private String name;

    @Column(name = "ds_pet")
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_breed")
    private Breed breed;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

}
