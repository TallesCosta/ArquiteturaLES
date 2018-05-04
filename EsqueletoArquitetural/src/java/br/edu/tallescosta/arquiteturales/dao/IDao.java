package br.edu.tallescosta.arquiteturales.dao;

import br.edu.tallescosta.arquiteturales.entidade.Entidade;
import java.util.List;

/**
 * Modulariza e detém toda a lógica de operacionalização com o Banco de Dados.
 * É usado no projeto para realizar as chamadas SQL ao Banco de Dados.
 * @author Talles Costa
 * @param <T> Subclasse de Entidade, tornará os Dao específicos para cada Entidade.
 */
public interface IDao<T extends Entidade> {
    
    void salvar(T entidade);
    
    List<T> listar(T entidade);
    
    void editar(T entidade);
    
    void excluir(T entidade);
    
}
