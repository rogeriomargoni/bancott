package br.com.targettrust.bancott.dominio;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Transacao {

	@Column(name="id")
	private Long id;
	
	
	@JoinColumn(name="fk_conta_numero_origem" , nullable=false, insertable=true, updatable=true)
	@JoinColumn(name="fk_conta_numero_destino", nullable=false, insertable=true, updatable=true)
	@ManyToOne

	private Conta conta_numero_origem;
	private Conta conta_numero_destino;
	
	
	@Column(name="tipo")
	private Integer tipo;
	
	@Column(name="valor")
	private Double valor;
	
	@Column(name="data")
	private Calendar data;
	
	
	
	public Conta getConta_numero_origem() {
		return conta_numero_origem;
	}
	public void setConta_numero_origem(Conta conta_numero_origem) {
		this.conta_numero_origem = conta_numero_origem;
	}
	public Conta getConta_numero_destino() {
		return conta_numero_destino;
	}
	public void setConta_numero_destino(Conta conta_numero_destino) {
		this.conta_numero_destino = conta_numero_destino;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	
	
	
	
	
}
