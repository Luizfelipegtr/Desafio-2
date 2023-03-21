package Desafio;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static ArrayList<Bilhete> Bilhetes = new ArrayList<Bilhete>();
    static ArrayList<Pessoa> Pessoas = new ArrayList<Pessoa>();
    public void menu(){
        Scanner input = new Scanner(System.in);
        String codigodobilhete;
        int opcoes = 0;
        int guardartipobilhete;
        String usuario,cpf,email,telefone;
        String resposta;


        do {
            System.out.println("1 = Cadastrar Usuário");
            System.out.println("2 = Cadastrar Bilhete");
            System.out.println("3 = Recarregar Bilhete");
            System.out.println("4 = Pagar Passagem");
            System.out.println("5 = Listar Bilhetes");
            System.out.println("6 = Pesquisar Bilhete por CPF");
            System.out.println("Informe a opção desejada ou 99 para sair");

            opcoes = input.nextInt();

            switch (opcoes) {


                case 1:
                        // cadastrar um usuario.

                    resposta = input.nextLine();
                    System.out.println("insira o usuario: ");
                    usuario = input.nextLine();
                    System.out.println("insira o seu número de telefone: ");
                    telefone = input.nextLine();
                    System.out.println("insira o seu cpf: ");
                    cpf = input.nextLine();
                    System.out.println("insira seu email: ");
                    email = input.nextLine();
                    System.out.println("cadastro finalizado!");

                    Pessoa pessoa = new Pessoa(usuario,cpf,email,telefone);
                    Pessoas.add(pessoa);
                    break;

                    case 2:
                        // cadastrar o bilhete pelo cpf.
                    input.nextLine();
                    System.out.println("cadastrar bilhete: ");
                    System.out.println("insira cpf: ");
                    cpf = input.nextLine();
                    Pessoa p1 = null;
                    boolean achou = false;
                    for (Pessoa p: Pessoas) {
                        if (cpf.equals(p.getCpf())) {
                            p1 = p;
                            achou = true;
                        }
                    }
                    if (!achou) {
                        System.out.println("cpf inválido, tente novamente:");
                    }else{
                        System.out.println("insira o código do bilhete: ");
                        codigodobilhete = input.nextLine();
                        System.out.println("digite 1 para Bilhete de Estudante ou 2 para Bilhete Comum: ");
                        guardartipobilhete = input.nextInt();
                        Bilhete b1;
                        if (guardartipobilhete == 1) {
                            b1 = new Bilhete_Estudante(codigodobilhete,p1);
                        }else{
                            b1 = new Bilhete_comum(codigodobilhete,p1);
                        }
                    }
                        System.out.println("seu bilhete foi feito: ");
                    break;

                case 3:
                    System.out.println("insira o código do bilhete: ");
                    codigodobilhete = input.nextLine();
                    Bilhete b1 = null;
                    achou = false;
                    for (Bilhete value:Bilhetes) {
                        if (codigodobilhete.equals(value.getCodigodobilhete())) {
                            b1 = value;
                            achou = true;
                        }
                    }
                    if (!achou) {
                        System.out.println("Código invalido! ");
                    }else{
                        if (b1 instanceof Bilhete_Estudante) {
                            b1.recarregarbilhete();
                        }else{
                            b1.recarregarbilhete();
                        }

                    }
                    break;

                case 4:
                    System.out.println("insira o código do bilhete: ");
                    codigodobilhete = input.nextLine();
                    Bilhete bilhete = null;
                    achou = false;
                    for (Bilhete value:Bilhetes) {
                        if (codigodobilhete.equals(value.getCodigodobilhete())) {
                            bilhete = value;
                            achou = true;
                        }
                    }
                    if (!achou) {
                        System.out.println("Código invalido! ");
                    }else {
                        if (bilhete instanceof Bilhete_Estudante) {
                            bilhete.pagamento();
                        } else {
                            bilhete.pagamento();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Lista de bilhetes: ");
                    for (int i = 0; i < Bilhetes.size(); i++) {
                        if (Bilhetes != null) {
                            String dados = "bilhetes " + "\n" + Bilhetes.get(i);
                            System.out.println(dados);
                        }
                    }

                    break;

                case 6:
                    System.out.println("insira o cpf: ");
                    input.nextLine();
                    Bilhete b2 = null;
                    achou = false;
                    for (Bilhete b:Bilhetes) {
                        if (b2.equals(b2.pessoa.getCpf())) {
                            bilhete = b2;
                            achou = true;
                        }
                    }
                    break;
            }

        }while(opcoes != 99);
    }
}