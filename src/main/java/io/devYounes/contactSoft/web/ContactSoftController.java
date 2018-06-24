package io.devYounes.contactSoft.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.devYounes.contactSoft.entities.Contact;
import io.devYounes.contactSoft.entities.Entreprise;
import io.devYounes.contactSoft.entities.Particular;
import io.devYounes.contactSoft.service.ContactSoftServiceImpl;

@RestController
@RequestMapping(value="/api")
public class ContactSoftController {
	
	@Autowired
	ContactSoftServiceImpl service;
	
	
	@GetMapping(value="/contacts/index")
	public Page<Contact> index(
			@RequestParam(name="q",defaultValue="")String q, 
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size) {
		
		return this.service.findAll(q, new PageRequest(page, size));
	}
	
	@GetMapping(value="/contacts/{id}")
	public Contact get(@PathVariable(name="id")Integer id) {
		
		return this.service.get(id);
	}
	
	@PostMapping(value="/contacts/saveEntreprise")
	public Contact saveEntreprise(@RequestBody Entreprise entreprise) {
		
		return this.service.add(entreprise);
	}
	
	@PostMapping(value="/contacts/saveParticular")
	public Contact saveParticular(@RequestBody Particular particular) {
		
		return this.service.add(particular);
	}
	
	@PutMapping(value="/contacts/updateParticular")
	public Contact updateParticular(@RequestBody Particular particular) {
		
		return this.service.update(particular);
	}
	
	@PutMapping(value="/contacts/updateEntreprise")
	public Contact updateEntreprise(@RequestBody Entreprise entreprise) {
		
		return this.service.update(entreprise);
	}
	
	@DeleteMapping(value="/contacts/delete/{id}")
	public boolean delete(@PathVariable(name="id")Integer id) {
		this.service.delete(id);
		return true;
	}
	

}
