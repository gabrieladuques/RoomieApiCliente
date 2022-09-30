package br.com.java.senac.roomie.cliente.roomie.validation;

public class NotFound extends RuntimeException {
    public NotFound(String mensagem) {
        super(mensagem);
    }
}