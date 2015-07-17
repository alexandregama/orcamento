package orcamento;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

	@Override
	public void remove(Orcamento orcamento) {
		Set<Integer> codigos = orcamentos.keySet();
		for (Integer codigo : codigos) {
			if (codigo.equals(orcamento.getId())) {
				orcamentos.remove(codigo);
				break;
			}
		}
	}
	
}
