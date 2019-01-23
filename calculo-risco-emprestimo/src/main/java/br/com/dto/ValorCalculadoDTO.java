package br.com.dto;

public class ValorCalculadoDTO {
	public RiscoDTO riscoDTO;
	public int valorCalculado;
	
	
	public RiscoDTO getRiscoDTO() {
		return riscoDTO;
	}
	public void setRiscoDTO(RiscoDTO riscoDTO) {
		this.riscoDTO = riscoDTO;
	}
	public int getValorCalculado() {
		return valorCalculado;
	}
	public void setValorCalculado(int valorCalculado) {
		this.valorCalculado = valorCalculado;
	}
}
