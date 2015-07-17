package orcamento;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.enterprise.context.SessionScoped;

import br.com.orcamento.Orcamento;

@SessionScoped
public class HashMapOrcamentoDao implements Orcamentos, Serializable {

	private static final long serialVersionUID = 1L;

	private Map<Integer, Orcamento> orcamentos = new HashMap<>();
	
	private Integer primaryKey = 1;
	
	public HashMapOrcamentoDao() {
	}
	
	@Override
	public void cadastra(Orcamento orcamento) {
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

	@Override
	public void atualiza(Orcamento orcamento) {
		Set<Integer> codigos = orcamentos.keySet();
		for (Integer codigo : codigos) {
			if (codigo.equals(orcamento.getId())) {
				orcamentos.put(codigo, orcamento);
				break;
			}
		}
	}
	
}
