package com.adria.virement.Entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Inheritance(strategy = InheritanceType.JOINED)
public class Virement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateCreation;
    private Date dateExecution;
    private BigDecimal montant;
    private String motif;
    @ManyToOne
    private Abonne abonne;
    @ManyToOne
    private Compte compte;
}
