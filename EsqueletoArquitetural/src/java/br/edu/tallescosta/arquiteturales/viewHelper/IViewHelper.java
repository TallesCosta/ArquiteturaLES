package br.edu.tallescosta.arquiteturales.viewHelper;

import br.edu.tallescosta.arquiteturales.entidade.Entidade;
import br.edu.tallescosta.arquiteturales.entidade.Resultado;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Sabe particularidades sobre a tela e ajuda a controlar a mesma, tanto recebendo, quanto formatando e devolvendo dados.
 * É usada no projeto para "montar" uma Entidade específica e determinar a Tela correta no final de uma operação.
 * @author Talles Costa
 */
public interface IViewHelper {
    
    Entidade getEntidade(HttpServletRequest request);
    
    void setTela(Resultado resultado, HttpServletRequest request, HttpServletResponse response);
    
}
