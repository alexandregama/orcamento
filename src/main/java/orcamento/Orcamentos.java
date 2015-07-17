package orcamento;

import java.util.Collection;

import br.com.orcamento.Orcamento;

public interface Orcamentos {

	void salva(Orcamento orcamento);

	Collection<Orcamento> getLista();

	void remove(Orcamento orcamento);

}
