package br.com.lookao.lookao_api.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "RACA")
public class Raca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_raca", nullable = false)
    private Long id;

    @Column(name = "nm_raca")
    private String nomeRaca;


}
