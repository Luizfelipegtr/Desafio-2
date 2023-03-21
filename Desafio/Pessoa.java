package Desafio;

public class Pessoa {
        // criando um usuario
    private String nome;
    private String cpf;
    private String email;
    private String telefone;

    public Pessoa(String nome, String cpf, String email, String numero) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
}
