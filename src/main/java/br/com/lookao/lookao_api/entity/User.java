package br.com.lookao.lookao_api.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "USERS")
public class User extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user", nullable = false)
    private Long id;

    @Column(name = "nm_user")
    private String name;

    @Column(name = "ds_mail")
    private String mail;

    @Column(name = "ds_password")
    private String password;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Pet> pets;

    @Enumerated(EnumType.STRING)
    @Column(name = "ds_role")
    private Role role;
}
