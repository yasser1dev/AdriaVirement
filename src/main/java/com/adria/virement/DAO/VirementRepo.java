package com.adria.virement.DAO;

import com.adria.virement.Entites.Virement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VirementRepo extends JpaRepository<Virement,Long> {
}
