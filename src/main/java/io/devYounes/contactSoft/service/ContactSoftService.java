package io.devYounes.contactSoft.service;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ContactSoftService<T> {
	
	public T add(T t);
	public T update(T t);
	public void delete(Integer id);
	public T get(Integer id);
	public Page<T> findAll(String q,Pageable pageable);

}
