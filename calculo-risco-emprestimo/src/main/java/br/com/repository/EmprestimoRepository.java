package br.com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.model.EmprestimoDB;

@Repository
public interface EmprestimoRepository extends CrudRepository<EmprestimoDB, Integer>{
	
}