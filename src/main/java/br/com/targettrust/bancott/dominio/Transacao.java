package br.com.targettrust.bancott.dominio;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "transacoes")
public class Transacao {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	
	@Column(name="id")
	private Long id;
	
	
	
	

	@JoinColumn(name="fk_conta_numero_origem" , nullable=false, insertable=true, updatable=true)
	@ManyToOne
	private Conta contaNumeroOrigem;

	
	@JoinColumn(name="fk_conta_numero_destino", nullable=false, insertable=true, updatable=true)
	@ManyToOne
	private Conta contaNumeroDestino;
	
	
	@Column(name="tipo")
	private Integer tipo;
	
	@Column(name="valor")
	private Double valor;
	
	@Column(name="data")
	private Calendar data;
	
	
	
	public Conta getConta_numero_origem() {
		return contaNumeroOrigem;
	}
	public void setConta_numero_origem(Conta conta_numero_origem) {
		this.contaNumeroOrigem = conta_numero_origem;
	}
	public Conta getConta_numero_destino() {
		return contaNumeroDestino;
	}
	public void setConta_numero_destino(Conta conta_numero_destino) {
		this.contaNumeroDestino = conta_numero_destino;
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
