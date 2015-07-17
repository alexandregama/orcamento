package orcamento;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Singleton;

import br.com.orcamento.Orcamento;

@Singleton
public class HashMapOrcamentoDao implements Orcamentos {

	private Map<Integer, Orcamento> orcamentos = new HashMap<>();
	
	private Integer primaryKey = 1;
	
	@Override
	public void salva(Orcamento orcamento) {
		orcamento.setId(primaryKey);
		orcamentos.put(primaryKey, orcamento);
		primaryKey++;
	}

	@Override
	public Collection<Orcamento> getLista() {
		return orcamentos.values();
	}
	
}
