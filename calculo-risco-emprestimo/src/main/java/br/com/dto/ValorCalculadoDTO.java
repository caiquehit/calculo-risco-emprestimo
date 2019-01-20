package br.com.dto;

public class ValorCalculadoDTO {
	public RiscoDTO riscoDTO;
	public Double valorCalculado;
	
	
	public RiscoDTO getRiscoDTO() {
		return riscoDTO;
	}
	public void setRiscoDTO(RiscoDTO riscoDTO) {
		this.riscoDTO = riscoDTO;
	}
	public Double getValorCalculado() {
		return valorCalculado;
	}
	public void setValorCalculado(Double valorCalculado) {
		this.valorCalculado = valorCalculado;
	}
}
