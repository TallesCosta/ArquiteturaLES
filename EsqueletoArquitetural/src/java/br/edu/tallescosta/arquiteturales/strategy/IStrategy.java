package br.edu.tallescosta.arquiteturales.strategy;

import br.edu.tallescosta.arquiteturales.entidade.Entidade;
import br.edu.tallescosta.arquiteturales.entidade.Resultado;

/**
 * Trecho de código "terceirizado", geralmente utilizado para implementar diversas lógicas para uma mesma funcionadidade.
 * É usada no projeto para implementar as Regras de Negócio e Requisitos Não Funcionais, específicas para cada Entidade.
 * @author Talles Costa
 * @param <T> Subclasse de Entidade, tornará as estratégias específicas para cada Entidade.
 */
public interface IStrategy<T extends Entidade> {
    
    Resultado processar(T entidade);
    
}
