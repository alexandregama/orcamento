package orcamento;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;

import br.com.orcamento.Orcamento;

@Singleton
public class ListOrcamentoDao implements Orcamentos {

	private List<Orcamento> orcamentos = new ArrayList<>();
	
	@Override
	public void salva(Orcamento orcamento) {
		orcamentos.add(orcamento);
	}

	@Override
	public List<Orcamento> getLista() {
		return orcamentos;
	}
	
}
