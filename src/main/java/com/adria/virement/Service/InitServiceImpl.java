package com.adria.virement.Service;

import com.adria.virement.DAO.AbonneRepo;
import com.adria.virement.DAO.BeneficiaireRepo;
import com.adria.virement.DAO.CompteRepo;
import com.adria.virement.Entites.Abonne;
import com.adria.virement.Entites.Beneficiaire;
import com.adria.virement.Entites.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

@Service
public class InitServiceImpl implements InitService {

    @Autowired
    AbonneRepo abonneRepo;
    @Autowired
    CompteRepo compteRepo;
    @Autowired
    BeneficiaireRepo beneficiaireRepo;

    @Override
    public void initAbonnee() {
        Abonne abonne=new Abonne();
        abonne.setNom("chihab");
        abonne.setPrenom("yasser");
        abonne.setUsername("yasser1dev");
        abonne.setPassword("123456");
        abonne.setBeneficiaires(beneficiaireRepo.findAll());
        abonneRepo.save(abonne);

    }

    @Override
    public void initCompte() {
        String[] numCompte={"1234","4587","9513","7842"};
        List<Abonne> abonnes=abonneRepo.findAll();
        Abonne abonne=abonnes.get(0);

        Stream.of(numCompte).forEach(num->{
            Compte compte=new Compte();
            compte.setNumeroCompte(num);
            compte.setIntitule("compte xyz");
            compte.setSoldeCompatble(new BigDecimal(500+Math.random()*10000));
            compte.setAbonne(abonne);
            compteRepo.save(compte);

        });

    }

    @Override
    public void initBeneficier() {
        String[] names={"ahmed","hassan","karim","sannaa"};
        Stream.of(names).forEach(name ->{
            Beneficiaire beneficiaire=new Beneficiaire();
            beneficiaire.setNom(name);
            beneficiaire.setPrenom(name);
            beneficiaire.setNumeroCompte(new Integer((int)(1000+Math.random()*2000)));
            beneficiaireRepo.save(beneficiaire);
        });
    }
}
