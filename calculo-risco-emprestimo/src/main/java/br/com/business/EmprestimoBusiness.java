package br.com.business;

import java.util.ArrayList;
import java.util.List;

import br.com.dto.RiscoDTO;
import br.com.dto.ValorCalculadoDTO;

public class EmprestimoBusiness {
	
	public ValorCalculadoDTO riscoEmprestimo(Double limiteCredito) {
		
		List<RiscoDTO> calculaRisco = populaDados();
		ValorCalculadoDTO valorCalculado = new ValorCalculadoDTO();
		for (RiscoDTO riscoDTO : calculaRisco) {
			if(limiteCredito >= riscoDTO.getValorMargemRisco()) {
				valorCalculado.setRiscoDTO(riscoDTO);
				valorCalculado.setValorCalculado(retornaValorCalculado(limiteCredito, riscoDTO.getPorcetagemRisco()));
			}
		}
		return valorCalculado;
	}
	
	private Double retornaValorCalculado(Double valor, Double porcentagem) {
		Double calculo = 0.0;
		calculo = (valor*porcentagem)/100.0; 
		return calculo;
	}
	
	private List<RiscoDTO> populaDados(){
		
		List<RiscoDTO> risco = new ArrayList<RiscoDTO>();
				
		risco.add(new RiscoDTO("A", 0.0, 0.0));
		risco.add(new RiscoDTO("B", 0.10, 200.0));
		risco.add(new RiscoDTO("C", 0.20, 300.0));
		
		return risco;
	}
	
	
	
}
