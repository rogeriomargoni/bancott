package br.com.targettrust.bancott.dominio;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;

@Entity
@Table(name = "clientes")
public class Cliente {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)

	@Column(name="id")
	private Long id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="endereco")
	private String endereco;
	
	@Column(name="telefone")
	private String telefone;
	
	@Column(name="cpf")
	private String cpf;
	
	@Temporal(TemporalType.DATE) 
	@Column(name="data_nascimento")
	private Calendar dataNascimento;
	
	@Column(name="nome_mae")
	private String nomeMae;
	
	
	@Column(name="email")
	@Email
	private String email;
	
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Calendar getData_nascimento() {
		return dataNascimento;
	}
	public void setData_nascimento(Calendar data_nascimento) {
		this.dataNascimento = data_nascimento;
	}
	public String getNome_mae() {
		return nomeMae;
	}
	public void setNome_mae(String nome_mae) {
		this.nomeMae = nome_mae;
	}
	
	
	
}
