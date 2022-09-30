package br.com.java.senac.roomie.cliente.roomie.dto;

import lombook.Data; 

import java.time.Instant;

@Data

public class ClienteResponse{
    private Long id;
    private String NomeCompleto;
    private String Telefone; 
    private String Complemento; 
    private int NumeroCasa; 
    private String Rua; 
    private String Bairro; 
    private Boolean Sexo; 
    private String Email; 
    private String Senha; 
    private DateTime StNascimento;
    private String Cep; 
    private String Cpf; 
    private Boolean Sexo;
    private byte[] foto;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return this.NomeCompleto;
	}

	public void setNomeCompleto(String NomeCompleto) {
		this.NomeCompleto = NomeCompleto;
	}

	public String getTelefone() {
		return this.Telefone;
	}

	public void setTelefone(String Telefone) {
		this.Telefone = Telefone;
	}

	public String getComplemento() {
		return this.Complemento;
	}

	public void setComplemento(String Complemento) {
		this.Complemento = Complemento;
	}

	public int getNumeroCasa() {
		return this.NumeroCasa;
	}

	public void setNumeroCasa(int NumeroCasa) {
		this.NumeroCasa = NumeroCasa;
	}

	public String getRua() {
		return this.Rua;
	}

	public void setRua(String Rua) {
		this.Rua = Rua;
	}

	public String getBairro() {
		return this.Bairro;
	}

	public void setBairro(String Bairro) {
		this.Bairro = Bairro;
	}

	public Boolean getSexo() {
		return this.Sexo;
	}

	public void setSexo(Boolean Sexo) {
		this.Sexo = Sexo;
	}

	public String getEmail() {
		return this.Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public String getSenha() {
		return this.Senha;
	}

	public void setSenha(String Senha) {
		this.Senha = Senha;
	}

	public DateTime getStNascimento() {
		return this.StNascimento;
	}

	public void setStNascimento(DateTime StNascimento) {
		this.StNascimento = StNascimento;
	}

	public String getCep() {
		return this.Cep;
	}

	public void setCep(String Cep) {
		this.Cep = Cep;
	}

	public String getCpf() {
		return this.Cpf;
	}

	public void setCpf(String Cpf) {
		this.Cpf = Cpf;
	}

	public Boolean getSexo() {
		return this.Sexo;
	}

	public void setSexo(Boolean Sexo) {
		this.Sexo = Sexo;
	}

	public byte[] getFoto() {
		return this.foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

    
}