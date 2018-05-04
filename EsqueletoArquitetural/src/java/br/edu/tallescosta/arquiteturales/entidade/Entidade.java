package br.edu.tallescosta.arquiteturales.entidade;

import java.util.Date;
import java.util.Objects;

/**
 * Entidade genérica que abstrai todas as Entidades de Domínio, também detém os atributos básicos para ser uma classe persistível.
 * É usada no projeto para agregar toda a flexibidade que a abstração pode nos trazer, 
 * permitindo que a Arquitetura funcione para todas suas subclasses.
 * @author Talles Costa
 */
public abstract class Entidade {
 
    private Long id;
    private Date dataCriacao;
    private Date ultimaAlteracao;

	public Entidade() {
	}

	public Entidade(Long id) {
		this.id = id;
	}

	public Entidade(Long id, Date dataCriacao, Date ultimaAlteracao) {
		this.id = id;
		this.dataCriacao = dataCriacao;
		this.ultimaAlteracao = ultimaAlteracao;
	}
	
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getUltimaAlteracao() {
        return ultimaAlteracao;
    }

    public void setUltimaAlteracao(Date ultimaAlteracao) {
        this.ultimaAlteracao = ultimaAlteracao;
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null || getClass() != obj.getClass())
			return false;
		
		final Entidade outraEntidade = (Entidade) obj;
		return Objects.equals(this.id, outraEntidade.id);
	}
	
}
