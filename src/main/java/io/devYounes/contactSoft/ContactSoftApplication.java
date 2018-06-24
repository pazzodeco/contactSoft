package io.devYounes.contactSoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.devYounes.contactSoft.entities.Entreprise;
import io.devYounes.contactSoft.entities.Particular;
import io.devYounes.contactSoft.service.ContactSoftServiceImpl;

@SpringBootApplication
public class ContactSoftApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ContactSoftApplication.class, args);
	}

	@Autowired
	ContactSoftServiceImpl serviceEntreprise;
	
	@Override
	public void run(String... arg0) throws Exception {
		//Add new companies
		Entreprise en0 = new Entreprise();
			en0.setCompanyName("First4com");
			en0.setAddress("Casablanca");
			en0.setTel("01000000");
			en0.setIce("23128790003");
			en0.setPicture("fi.png");
		Entreprise en1 = new Entreprise();
			en1.setCompanyName("INFO");
			en1.setAddress("Casablanca");
			en1.setTel("02000000");
			en1.setIce("876382");
			en1.setPicture("i.png");
			
		this.serviceEntreprise.add(en0);
		this.serviceEntreprise.add(en1);
		
		// Add new particulars
		
		Particular pa0= new Particular();
			pa0.setFirstName("Younes");
			pa0.setLastName("DECO");
			pa0.setAddress("casablanca");
			pa0.setTel("087172633123");
			pa0.setPicture("y.png");
		Particular pa1= new Particular();
			pa1.setFirstName("Moi");
			pa1.setLastName("Toi");
			pa1.setAddress("casablanca");
			pa1.setTel("821313");
			pa1.setPicture("mt.png");	
			
			this.serviceEntreprise.add(pa0);
			this.serviceEntreprise.add(pa1);
		
		
		
	}
}
