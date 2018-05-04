package br.edu.tallescosta.arquiteturales.command;

import br.edu.tallescosta.arquiteturales.entidade.Entidade;
import br.edu.tallescosta.arquiteturales.entidade.Resultado;

/**
 * Encapsula a chamada de um método que realiza algo desejado.
 * É usado no projeto para encapsular as chamadas ao métodos da Facade.
 * @author Talles Costa
 */
public interface ICommand {
    
    Resultado executar(Entidade entidade);
    
}
