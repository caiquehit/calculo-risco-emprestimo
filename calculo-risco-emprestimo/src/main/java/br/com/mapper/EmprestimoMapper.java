package br.com.mapper;

import org.springframework.stereotype.Component;

import br.com.business.EmprestimoBusiness;
import br.com.dto.ValorCalculadoDTO;
import br.com.model.EmprestimoDB;

@Component
public class EmprestimoMapper {
	
	public EmprestimoDB calculoMapper(String nomeCliente, int limiteCredito) {
		EmprestimoBusiness emprestimoBussiness = new EmprestimoBusiness();
		ValorCalculadoDTO calculo = emprestimoBussiness.riscoEmprestimo(limiteCredito);
		
		EmprestimoDB gravaDados = new EmprestimoDB();
		gravaDados.setLimiteCredito(limiteCredito);
		gravaDados.setNomeCliente(nomeCliente);
		gravaDados.setTaxaJuros(calculo.getRiscoDTO().getPorcetagemRisco());
		gravaDados.setValorEmprestimo(calculo.getValorCalculado());
		gravaDados.setTipoRisco(calculo.getRiscoDTO().getTipoRisco());
	
		return gravaDados;
	
	};
	
}
