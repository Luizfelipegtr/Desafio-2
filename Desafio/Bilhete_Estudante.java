package Desafio;

public class Bilhete_Estudante extends Bilhete {

public double cota;
    public Bilhete_Estudante(String codigodobilhete, Pessoa pessoa){
        super(codigodobilhete,pessoa);

    }
    @Override
    public void recarregarbilhete(){
        cota = cota + 48;
    }

    @Override
    public void pagamento(){
        cota = cota - 1;
    }

    @Override
    public String pesquisarporcpf() {
        super.pesquisarporcpf();
        return null;
    }
}
