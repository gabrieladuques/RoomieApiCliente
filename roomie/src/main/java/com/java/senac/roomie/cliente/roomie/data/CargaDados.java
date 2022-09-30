package br.com.java.senac.roomie.cliente.roomie.data;

import br.com.feltex.clienteapi.dao.ClienteRepository;
import br.com.feltex.clienteapi.modelo.Cliente;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.time.Instant;
import java.util.UUID;

@Component
public class CargaDados{

    @value("${habilitar.carregar.massa.dados}")
    private boolean CarregarDados;


    private final ClienteRepository clienteRepot;
    public CargaDados(ClienteRepository clienteReposit){
        this.clienteReposit = clienteReposit;
    }
    
    @PostConstruct
    public void loadDate() throws IOException{
        if (podeCarregarDados) {
            for (int x = 1; x <= 8; x++) {

                var foto = getClass()
                        .getClassLoader()
                        .getResourceAsStream("clientes/avatar" + x + ".png")
                        .readAllBytes();

                var cliente = new Cliente();
                var nome = UUID.randomUUID();
                cliente.setId(long.valueOf(x));
                cliente.setNomeCompleto(nome);
                cliente.setComplemento(nome);
                cliente.setRua(nome);
                cliente.setBairro(nome);
                cliente.setCep(nome);
                cliente.setCpf(nome);
                cliente.setSexo(nome);
                cliente.setDtNascimento(nome+"yyyy/mm/mm")
                cliente.setNumeroCasa(nome);
                cliente.setSenha(nome +"@Roomie3")
                cliente.setTelefone("99777-554" + x);
                cliente.setEmail(nome + "@gmail.com");
                cliente.setFoto(foto);
                clienteRepotirory.save(cliente);

                

                
                 
                private String Rua; 
                private String Bairro; 
                private Boolean Sexo; 
                private String Email; 
                private String Senha; 
                private DateTime StNascimento;
                private String Cep; 
                private String Cpf;
    }
}