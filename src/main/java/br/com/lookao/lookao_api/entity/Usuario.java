package br.com.lookao.lookao_api.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
public class Usuario extends Auditoria{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false)
    private Long id;

    @Column(name = "nm_usuario")
    private String nome;

    @Column(name = "ds_email")
    private String  email;

    @Column(name = "ds_senha")
    private String senha;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
    private List<Pet> pets;

    @Enumerated(EnumType.STRING)
    @Column(name = "ds_perfil")
    private Perfil perfil;
}
