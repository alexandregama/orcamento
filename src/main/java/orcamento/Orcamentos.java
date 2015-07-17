package orcamento;

import java.io.Serializable;
import java.util.Collection;

import br.com.orcamento.Orcamento;

public interface Orcamentos extends Serializable {

	void cadastra(Orcamento orcamento);

	Collection<Orcamento> getLista();

	void remove(Orcamento orcamento);

	void atualiza(Orcamento orcamento);

}
