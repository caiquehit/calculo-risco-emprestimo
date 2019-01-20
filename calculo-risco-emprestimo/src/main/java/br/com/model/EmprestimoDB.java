package br.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TbEmprestimo")
public class EmprestimoDB {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="NomeCliente", length = 60, nullable = false)
	private String nomeCliente;
	
	@Column(name="TipoRisco", nullable = false)
	private String tipoRisco;
	
	@Column(name="LimiteCredito", nullable = false)
	private Double limiteCredito;
	
	@Column(name="TaxaJuros", nullable = false)
	private Double taxaJuros;
	
	@Column(name="ValorEmprestimo", nullable = false)
	private Double valorEmprestimo;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public String getTipoRisco() {
		return tipoRisco;
	}

	public void setTipoRisco(String tipoRisco) {
		this.tipoRisco = tipoRisco;
	}

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public Double getValorEmprestimo() {
		return valorEmprestimo;
	}

	public void setValorEmprestimo(Double valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}
}
