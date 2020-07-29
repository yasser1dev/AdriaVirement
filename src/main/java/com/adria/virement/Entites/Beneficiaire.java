package com.adria.virement.Entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Beneficiaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private Integer numeroCompte;

    @OneToMany(mappedBy = "beneficiaire")
    private Collection<VirementMultipleBeneficier> virementMultipleBeneficiers;
}
