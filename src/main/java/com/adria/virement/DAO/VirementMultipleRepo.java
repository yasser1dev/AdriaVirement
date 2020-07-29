package com.adria.virement.DAO;

import com.adria.virement.Entites.VirementMultiple;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VirementMultipleRepo extends JpaRepository<VirementMultiple,Long> {
}
