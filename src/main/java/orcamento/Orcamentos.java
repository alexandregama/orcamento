package orcamento;

import java.util.List;

import br.com.orcamento.Orcamento;

public interface Orcamentos {

	void salva(Orcamento orcamento);

	List<Orcamento> getLista();

}
