package com.adria.virement.Entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor @AllArgsConstructor @Data
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroCompte;
    private String intitule;
    private BigDecimal soldeCompatble;
    @ManyToOne
    private Abonne abonne;
}
