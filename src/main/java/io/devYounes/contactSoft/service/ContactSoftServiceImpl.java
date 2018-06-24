package io.devYounes.contactSoft.service;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import io.devYounes.contactSoft.dao.ContactSoftRepository;
import io.devYounes.contactSoft.entities.Contact;
import io.devYounes.contactSoft.entities.Entreprise;

@Service
@Transactional
public class ContactSoftServiceImpl implements ContactSoftService<Contact>{

	@Autowired
	private ContactSoftRepository dao;

	@Override
	public Contact add(Contact t) {
		// TODO Auto-generated method stub
		return this.dao.save(t);
	}

	@Override
	public Contact update(Contact t) {
		// TODO Auto-generated method stub
		return this.dao.save(t);
	}

	@Override
	public void delete(Integer id) {
		Contact c = this.get(id);
		if(c!=null) this.dao.delete(c);
		
		
	}

	@Override
	public Contact get(Integer id) {
		// TODO Auto-generated method stub
		return this.dao.findOne(id);
	}

	@Override
	public Page<Contact> findAll(String q, Pageable pageable) {
		// TODO Auto-generated method stub
		return this.dao.findByPage("%"+q+"%", pageable);
	}


	

}
