package orcamento;

import java.io.Serializable;
import java.math.BigDecimal;
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
		orcamentos.put(1, new Orcamento(1, "FreeShop", new BigDecimal(9000), "BRL"));
		orcamentos.put(2, new Orcamento(2, "PetStore", new BigDecimal(5000), "BRL"));
		orcamentos.put(3, new Orcamento(3, "OnlineCat", new BigDecimal(8000), "URD"));
		orcamentos.put(4, new Orcamento(4, "PhoneStore", new BigDecimal(2000), "URD"));
		orcamentos.put(5, new Orcamento(5, "MicroStore", new BigDecimal(7000), "BRL"));
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
		Orcamento orcamentoEncontrado = busca(orcamento);
		if (orcamentoEncontrado != null) {
			orcamentos.remove(orcamento.getId());
		}
	}

	@Override
	public void atualiza(Orcamento orcamento) {
		Orcamento orcamentoEncontrado = busca(orcamento);
		if (orcamentoEncontrado != null) {
			orcamentos.put(orcamento.getId(), orcamento);
		}
	}

	private Orcamento busca(Orcamento orcamento) {
		Set<Integer> codigos = orcamentos.keySet();
		for (Integer codigo : codigos) {
			if (codigo.equals(orcamento.getId())) {
				return orcamento;
			}
		}		
		return null;
	}
}
