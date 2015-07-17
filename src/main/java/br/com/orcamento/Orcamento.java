package br.com.orcamento;

import java.math.BigDecimal;

public class Orcamento {

	private String nome;
	
	private BigDecimal valor;
	
	private String pais;

	@Override
	public String toString() {
		return "Orcamento [nome=" + nome + ", valor=" + valor + ", pais="
				+ pais + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
}
