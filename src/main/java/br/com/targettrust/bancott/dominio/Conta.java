package br.com.targettrust.bancott.dominio;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="contas")
public class Conta {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	

	
	
	@Column(name="numero")
	private Long numero;

	@Column(name="DV")
	private Integer DV;
	
	@Column(name="saldo")
	private Double saldo;
	
	@JoinColumn(name="fk_cliente_id", nullable=false)
	@ManyToOne(cascade=CascadeType.ALL)
	private Cliente cliente;	
	
	
	
	@JoinColumn(name="fk_agencia_numero", nullable=false, insertable=true, updatable=true)
	@ManyToOne(cascade=CascadeType.ALL)
	private Agencia agencia;
	
	@Column(name="data_abertura")
	private Calendar data_abertura;
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public Integer getDV() {
		return DV;
	}
	public void setDV(Integer dV) {
		DV = dV;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Calendar getData_abertura() {
		return data_abertura;
	}
	public void setData_abertura(Calendar data_abertura) {
		this.data_abertura = data_abertura;
	}	
	
	
	
	
}
