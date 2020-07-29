package com.adria.virement;

import com.adria.virement.Service.InitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VirementApplication implements CommandLineRunner {

    @Autowired
    private InitService initService;
    public static void main(String[] args) {
        SpringApplication.run(VirementApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        initService.initBeneficier();
        initService.initAbonnee();
        initService.initCompte();
    }
}
