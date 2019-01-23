package br.com.business;

import java.util.ArrayList;
import java.util.List;

import br.com.dto.RiscoDTO;
import br.com.dto.ValorCalculadoDTO;

public class EmprestimoBusiness {
	
	public ValorCalculadoDTO riscoEmprestimo(int limiteCredito) {
		
		List<RiscoDTO> calculaRisco = populaDados();
		ValorCalculadoDTO valorCalculado = new ValorCalculadoDTO();
		for (RiscoDTO riscoDTO : calculaRisco) {
			if(("B".equalsIgnoreCase(riscoDTO.tipoRisco) && limiteCredito < riscoDTO.getValorMargemRisco()) 
				|| ("C".equalsIgnoreCase(riscoDTO.tipoRisco) && limiteCredito > riscoDTO.getValorMargemRisco()) 
					) {
				valorCalculado.setRiscoDTO(riscoDTO);
				valorCalculado.setValorCalculado(retornaValorCalculado(limiteCredito, riscoDTO.getPorcetagemRisco()));
			}
		}
		return valorCalculado;
	}
	
	private int retornaValorCalculado(int valor, int porcentagem) {
		int calculo = 0;
		calculo = (valor*porcentagem)/100; 
		calculo = valor + calculo;
		return calculo;
	}
	
	private List<RiscoDTO> populaDados(){
		
		List<RiscoDTO> risco = new ArrayList<RiscoDTO>();
				
		risco.add(new RiscoDTO("A", 0, 0));
		risco.add(new RiscoDTO("B", 10, 200));
		risco.add(new RiscoDTO("C", 20, 300));
		
		return risco;
	}
	
	
	
}
