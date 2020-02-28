package com.nelioalves.cursomc.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.nelioalves.cursomc.domain.enums.EstadoPagamento;

/* PARA MAPEAR OBJETOS DE UMA HERANÇA VC PRECISA IR
 * NA SUPER CLASSE E COLOCAR A ANOTATION @Inheritance 
 * AI VC TERIA 2 OPCOES -> FAZER UM TABELÃO COM TODAS AS SUBCLASSES
 * OU TABELAS AVULSAS
 * 
 * REFERENTE PORQUE A CLASSE E ABTRACT, PORQUE NAAAOOO VAI PODER
 * INTANCIAR UMA CLASSE DE PAGAMENTO E PARA TRAVAR, SO AS SUBCLASSES
 * VÃO PODER SER INSTANCIADAS
 * 
 */


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Pagamento implements Serializable {

	private static final long serialVersionUID = 1L;

	
	@Id
	private Integer id;
	
	
	private EstadoPagamento estado;
	
	@OneToOne
	@JoinColumn(name="pedido_id")
	@MapsId
	private Pedido pedido;
	
	
	public Pagamento() {
		
		
	}


	public Pagamento(Integer id, EstadoPagamento estado, Pedido pedido) {
	
		super();
		
		this.id = id;
		this.estado = estado;
		this.pedido = pedido;
	
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public EstadoPagamento getEstado() {
		return estado;
	}


	public void setEstado(EstadoPagamento estado) {
		this.estado = estado;
	}


	public Pedido getPedido() {
		return pedido;
	}


	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pagamento other = (Pagamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
