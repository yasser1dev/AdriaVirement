package com.adria.virement.DAO;


import com.adria.virement.Entites.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepo extends JpaRepository<Compte,Long> {
}
