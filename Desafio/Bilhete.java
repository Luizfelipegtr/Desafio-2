package Desafio;


public class Bilhete {
    protected String codigodobilhete;
    protected Pessoa pessoa;

    public Bilhete(String codigodobilhete, Pessoa pessoa){
        this.codigodobilhete = codigodobilhete;
        this.pessoa = pessoa;
    }

    public void recarregarbilhete(){

    }
    public void pagamento(){

    }

    public String pesquisarporcpf(){
        String dados = "";

        dados += "nome do usuario" + pessoa.getNome() + "\n";
        dados += "cpf do usuario" + pessoa.getCpf() + "\n";
        dados += "Email do usuario" + pessoa.getEmail() + "\n";
        dados += "numero de telefone do usuario" + pessoa.getTelefone() + "\n";
        dados += "código do bilhete" + this.getCodigodobilhete() + "\n";

        if (this instanceof Bilhete_Estudante){
            dados += "saldo do usuario: " + ((Bilhete_Estudante)this).cota + "\n";
        } if (this instanceof  Bilhete_comum){
            dados += "saldo do usuario: " + ((Bilhete_comum) this).getSaldo() + "\n";
        }
        return dados;
    }

    public String getCodigodobilhete() {
        return codigodobilhete;
    }


}
