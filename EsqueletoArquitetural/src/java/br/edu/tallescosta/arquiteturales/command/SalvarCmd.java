package br.edu.tallescosta.arquiteturales.command;

import br.edu.tallescosta.arquiteturales.entidade.Entidade;
import br.edu.tallescosta.arquiteturales.entidade.Resultado;

/**
 * Comando que encapsula a chamada do método de salvar da Facade.
 * @author Talles Costa
 */
public class SalvarCmd implements ICommand {

	@Override
	public Resultado executar(Entidade entidade) {
		return FACADE.salvar(entidade);
	}
	
}
