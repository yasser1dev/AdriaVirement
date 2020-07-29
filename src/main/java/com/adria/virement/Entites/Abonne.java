package com.adria.virement.Entites;


import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@AllArgsConstructor @NoArgsConstructor @Data
public class Abonne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String nom;
    private String prenom;
    @OneToMany(mappedBy = "abonne")
    private Collection<Compte> comptes;
    @OneToMany
    private Collection<Beneficiaire> beneficiaires;


}
