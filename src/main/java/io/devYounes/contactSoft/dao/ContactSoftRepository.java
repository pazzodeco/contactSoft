package io.devYounes.contactSoft.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import io.devYounes.contactSoft.entities.Contact;
import io.devYounes.contactSoft.entities.Entreprise;

@Repository
public interface ContactSoftRepository extends JpaRepository<Contact, Integer>{

	@Query("Select c from Contact c where companyName like :q or firstName like :q  or lastName like :q")
	public Page<Contact> findByPage(@Param("q")String q,Pageable pageable);
}
