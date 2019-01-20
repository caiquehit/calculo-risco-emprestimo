package br.com.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.mapper.EmprestimoMapper;
import br.com.model.EmprestimoDB;
import br.com.repository.EmprestimoRepository;

@RestController
@RequestMapping("/emprestimo")
public class EmprestimoController {
	
	@Autowired
	@Qualifier("emprestimoRepository")
	EmprestimoRepository emprestimoRepository;	
	
	@Autowired 
	EmprestimoMapper emprestimoMapper;
		
	@RequestMapping(method = RequestMethod.POST)
	public EmprestimoDB emprestimo(@RequestParam(value = "nomeCliente") String nomeCliente, @RequestParam(value = "limite") Double limiteCredito) {
	 return emprestimoRepository.save(emprestimoMapper.calculoMapper(nomeCliente, limiteCredito));
	
	}
	
}
