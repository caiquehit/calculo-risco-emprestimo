package br.com.dto;

public class RiscoDTO {
	
	public String tipoRisco;
	public Double porcetagemRisco;
	public Double valorMargemRisco;
	
	public RiscoDTO(String tipoRisco, Double porcetagemRisco, Double valorMargemRisco) {
		this.tipoRisco = tipoRisco;
		this.porcetagemRisco = porcetagemRisco;
		this.valorMargemRisco = valorMargemRisco;
	}
	
	
	public String getTipoRisco() {
		return tipoRisco;
	}
	public void setTipoRisco(String tipoRisco) {
		this.tipoRisco = tipoRisco;
	}
	public Double getPorcetagemRisco() {
		return porcetagemRisco;
	}
	public void setPorcetagemRisco(Double porcetagemRisco) {
		this.porcetagemRisco = porcetagemRisco;
	}
	public Double getValorMargemRisco() {
		return valorMargemRisco;
	}
	public void setValorMargemRisco(Double valorMargemRisco) {
		this.valorMargemRisco = valorMargemRisco;
	}
		
}
