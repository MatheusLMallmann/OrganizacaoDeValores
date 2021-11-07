package Menus;

import java.util.Scanner;

public class ObterEscolha {

    public String ColetaNome(){
        System.out.println("Nos informe o seu nome: ");
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();

        return nome;
    }

    public int ColetaEscolha(String nome){
        Scanner input = new Scanner(System.in);

        System.out.println("Olá " + nome + ", escolha uma das opções abaixo: ");
        System.out.println("(1) - Ordenar valores inteiros;");
        System.out.println("(2) - Ordenar valores reais;");
        System.out.println("(3) - Ordenar valores datas;");
        System.out.println("(4) - Ordenar palavras;");
        System.out.println("(0) - Sair");

        int escolha = Integer.parseInt(input.nextLine());

        if( escolha != 0 && escolha != 1 && escolha != 2 && escolha != 3 && escolha != 3 && escolha != 4){
            System.out.println("Opção inválida...");
            return ColetaEscolha(nome);
        }

        if(escolha == 0){
            System.out.println("Encerrando sessão... Até logo :)");
            System.exit(0);
        }

        return escolha;
    }

    public int FormatoDeInsercaoDosDados(){
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha a forma da leitura dos dados conforme as opções abaixo: ");
        System.out.println("(1) - Inserção manual;");
        System.out.println("(2) - Inserção aleatórica;");
        System.out.println("(3) - Inserção através da leitura de um arquivo;");
        int escolha = Integer.parseInt(input.nextLine());

        return escolha;
    }
}
