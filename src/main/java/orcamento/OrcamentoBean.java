package orcamento;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.orcamento.Orcamento;

@Named
@RequestScoped
public class OrcamentoBean {

	private Orcamento orcamento = new Orcamento();

	@Inject
	private Orcamentos orcamentos;
	
	private List<Orcamento> lista;

	@Deprecated
	public OrcamentoBean() {
	}
	
	public void cadastra() {
		orcamentos.salva(orcamento);
	}
	
	public List<Orcamento> getLista() {
		if (lista == null) {
			lista = orcamentos.getLista();
		}
		return lista;
	}

	public Orcamento getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}
	
}
