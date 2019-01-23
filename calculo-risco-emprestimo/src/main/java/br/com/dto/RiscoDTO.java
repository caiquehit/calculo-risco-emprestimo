package br.com.dto;

public class RiscoDTO {
	
	public String tipoRisco;
	public int porcetagemRisco;
	public int valorMargemRisco;
	
	public RiscoDTO(String tipoRisco, int porcetagemRisco, int valorMargemRisco) {
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
	public int getPorcetagemRisco() {
		return porcetagemRisco;
	}
	public void setPorcetagemRisco(int porcetagemRisco) {
		this.porcetagemRisco = porcetagemRisco;
	}
	public int getValorMargemRisco() {
		return valorMargemRisco;
	}
	public void setValorMargemRisco(int valorMargemRisco) {
		this.valorMargemRisco = valorMargemRisco;
	}
		
}
