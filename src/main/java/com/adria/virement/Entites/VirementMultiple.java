package com.adria.virement.Entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class VirementMultiple extends Virement {
        private Integer nombreBeneficiaire;
        @OneToMany(mappedBy = "virementMultiple")
        private Collection<VirementMultipleBeneficier> virementMultipleBeneficiers;
}
