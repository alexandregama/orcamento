package orcamento;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.orcamento.Orcamento;

@Named
public class OrcamentoBean {

	private Orcamento orcamento = new Orcamento();

	@Inject
	private Orcamentos orcamentos;

	@Deprecated
	public OrcamentoBean() {
	}
	
	public void cadastra() {
		orcamentos.salva("Salvando");
	}

	public Orcamento getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}
	
}
