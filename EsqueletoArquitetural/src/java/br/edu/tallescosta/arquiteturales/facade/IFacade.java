package br.edu.tallescosta.arquiteturales.facade;

import br.edu.tallescosta.arquiteturales.entidade.Entidade;
import br.edu.tallescosta.arquiteturales.entidade.Resultado;

/**
 * Abstrai a complexidade das operações para as camadas anteriores e orquestra a execução da operação em sua totalidade.
 * É usada no projeto para executar as operações do CRUD, 
 * processando todas as Regras de Negócios necessárias para aquela operação daquela Entidade específica e, posteriormente,
 * delegar ao Dao específico que faça a operação que foi solicitada.
 * @author Talles Costa
 */
public interface IFacade {
 
    Resultado salvar(Entidade entidade);
    
    Resultado listar(Entidade entidade);
    
    Resultado editar(Entidade entidade);
    
    Resultado excluir(Entidade entidade);
    
}
