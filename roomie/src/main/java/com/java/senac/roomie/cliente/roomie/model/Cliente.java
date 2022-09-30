package br.com.java.senac.roomie.cliente.roomie.model;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;

@Data
@Entity

public class Cliente{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   
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
    private DateTime DtNascimento;
    private String Cep; 
    private String Cpf; 
    @Lob
    private byte[] foto;
}
