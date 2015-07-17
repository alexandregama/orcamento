package orcamento;

import java.io.Serializable;
import java.util.Collection;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.orcamento.Orcamento;

@Named
@ViewScoped
public class OrcamentoBean implements Serializable {

	private static final long serialVersionUID = -1L;

	private Orcamento orcamento = new Orcamento();

	@Inject
	private Orcamentos orcamentos;
	
	private Collection<Orcamento> lista;

	@Deprecated
	public OrcamentoBean() {
	}
	
	public void cadastra() {
		if (orcamento.getId() == null) {
			orcamentos.cadastra(orcamento);
		} else {
			orcamentos.atualiza(orcamento);
		}
		
		atualizaFormulario();
	}
	
	public void remove(Orcamento orcamento) {
		orcamentos.remove(orcamento);
		
		atualizaFormulario();
	}
	
	public String cancela() {
		atualizaFormulario();
		
		return "orcamento";
	}

	public Collection<Orcamento> getLista() {
		if (lista == null) {
			lista = orcamentos.getLista();
		}
		return lista;
	}
	
	private void atualizaFormulario() {
		this.lista = null;
		this.orcamento = new Orcamento();
	}

	public Orcamento getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}
	
}
