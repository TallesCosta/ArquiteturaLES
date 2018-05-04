package br.edu.tallescosta.arquiteturales.entidade;

import java.util.ArrayList;
import java.util.List;

/**
 * Encapsula o resultado de uma operação, para isso conta com um atributo de msg, que concatenará quaisquer mensagens de erro e
 * uma lista de Entidades, usada para conter os dados da listagem de alguma entidade ou uma busca pontual.
 * @author Talles Costa
 */
public class Resultado {
    
    private StringBuilder msg;
    private List<Entidade> entidades;

	public Resultado() {
		this.msg = new StringBuilder();
		this.entidades = new ArrayList<Entidade>();
	}

	public String getMsg() {
		return msg.toString();
	}

	public void setMsg(String msg) {
		this.msg = new StringBuilder(msg);
	}

	public void addMsg(String msg) {
		this.msg.append(msg);
	}
	
	public List<Entidade> getEntidades() {
		return this.entidades;
	}

	public Entidade getPrimeiraEntidade() {
		return !this.entidades.isEmpty() ? this.entidades.get(0) : null;
	}
	
	public void setEntidades(List<Entidade> entidades) {
		this.entidades = entidades;
	}
	
	public void addEntidade(Entidade entidade) {
		this.entidades.add(entidade);
	}
    
	public boolean vazia() {
		return this.entidades.isEmpty();
	}
	
	public int tamanho() {
		return this.entidades.size();
	}
	
}
