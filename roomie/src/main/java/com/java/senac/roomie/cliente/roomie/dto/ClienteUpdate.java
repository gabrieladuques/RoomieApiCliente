package br.com.java.senac.roomie.cliente.roomie.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClienteUpdade {

    private String Telefone;
    private String Cep; 
    private String NumeroCasa; 
    private String Rua; 
    private Sting Bairro; 
    private String Senha; 
    private byte[] foto;

}