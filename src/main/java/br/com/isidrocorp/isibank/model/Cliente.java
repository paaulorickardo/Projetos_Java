package br.com.isidrocorp.isibank.model;

import java.time.LocalDate;
import javax.persistence.*;

@Entity // essa classe vai ser lida pelo banco de dados
@Table(name = "tbl_cliente") // nome existente no banco de dados
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private int codigo;
	@Column(name = "nome", length = 100)
	private String nome;
	@Column(name = "cpf", length = 15, unique = true)
	private String cpf;
	@Column(name = "telefone", length = 15)
	private String telefone;
	@Column(name = "email", length = 50)
	private String email;
	@Column(name = "data_nasc")
	private LocalDate nascimento;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

}
