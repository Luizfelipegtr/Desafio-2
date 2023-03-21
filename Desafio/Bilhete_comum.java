package Desafio;


public class Bilhete_comum extends Bilhete {
public double saldo;

    public Bilhete_comum(String Codigodobilhete, Pessoa pessoa){
        super(Codigodobilhete,pessoa);
    }


    @Override
    public void recarregarbilhete() {
        saldo = saldo + 10;
    }

    @Override
    public void pagamento() {
        saldo = saldo - 5;
    }

    public double getSaldo() {
        return saldo;
    }
    public String toString(){
        String dados = "";

        dados += "nome do usuario" + pessoa.getNome() + "\n";
        dados += "cpf do usuario" + pessoa.getCpf() + "\n";
        dados += "Email do usuario" + pessoa.getEmail() + "\n";
        dados += "numero de telefone do usuario" + pessoa.getTelefone() + "\n";
        dados += "código do bilhete" + this.getCodigodobilhete() + "\n";

        return dados;
    }
}
