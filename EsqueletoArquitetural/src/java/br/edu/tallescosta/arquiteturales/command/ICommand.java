package br.edu.tallescosta.arquiteturales.command;

import br.edu.tallescosta.arquiteturales.entidade.Entidade;
import br.edu.tallescosta.arquiteturales.entidade.Resultado;
import br.edu.tallescosta.arquiteturales.facade.Facade;
import br.edu.tallescosta.arquiteturales.facade.IFacade;

/**
 * Encapsula a chamada de um método que realiza algo desejado.
 * É usado no projeto para encapsular as chamadas ao métodos da Facade.
 * @author Talles Costa
 */
public interface ICommand {
    
    /*
    * Atributos em Interfaces são por default "static final".
    */
	IFacade FACADE = new Facade();
	
    Resultado executar(Entidade entidade);
    
}
