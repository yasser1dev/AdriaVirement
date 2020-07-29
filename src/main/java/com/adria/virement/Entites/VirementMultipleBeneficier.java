package com.adria.virement.Entites;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class VirementMultipleBeneficier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal montant;

    @ManyToOne
    private VirementMultiple virementMultiple;
    @ManyToOne
    private Beneficiaire beneficiaire;
}
