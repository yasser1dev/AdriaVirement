package com.adria.virement.DAO;

import com.adria.virement.Entites.Beneficiaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeneficiaireRepo extends JpaRepository<Beneficiaire,Long> {
}
