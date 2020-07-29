package com.adria.virement.DAO;


import com.adria.virement.Entites.VirementMultipleBeneficier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VirementMultipleBeneficiaireRepo extends JpaRepository<VirementMultipleBeneficier,Long> {
}
