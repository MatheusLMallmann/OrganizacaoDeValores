package Menus;

import java.util.Scanner;

// Classe responsável por mostrar os menus ao usuário e capturar sua escolha
public class ObterEscolha {

    // Método responsável pela captura do nome do usuário
    public String ColetaNome(){
        System.out.println("Nos informe o seu nome: ");
        // Input do nome
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();

        // Retorna nome
        return nome;
    }

    // Método que irá capturar a intenção inicial do usuário
    // Aqui ele informa se ele quer ordenar valores inteiros, reais, datas ou palavras
    public int ColetaEscolha(String nome){
        Scanner input = new Scanner(System.in);

        // Mostra menu
        System.out.println("Olá " + nome + ", escolha uma das opções abaixo: ");
        System.out.println("(1) - Ordenar valores inteiros;");
        System.out.println("(2) - Ordenar valores reais;");
        System.out.println("(3) - Ordenar valores datas;");
        System.out.println("(4) - Ordenar palavras;");
        System.out.println("(0) - Sair");

        // Pega input da escolha
        int escolha = Integer.parseInt(input.nextLine());

        // Se escolha for menor que zero ou maior que quatro, isso gera um input inválido
        // Pois não corresponderá com nenhuma opção do menu
        if(escolha < 0 || escolha > 4){
            System.out.println("Opção inválida...");
            return ColetaEscolha(nome);
        }

        // Se escolha for igual a zero, encerra programa
        if(escolha == 0){
            System.out.println("Encerrando sessão... Até logo :)");
            System.exit(0);
        }

        // Retorna escolha informada pelo usuário
        return escolha;
    }

    // Método que irá capturar a forma que serão inseridos os valores
    // Aqui o usuário informa se ele quer inserir os valores manualmente, de forma aleatória, ou a partir da leitura de um arquivo
    public int FormatoDeInsercaoDosDados(){
        Scanner input = new Scanner(System.in);

        // Mostra menu
        System.out.println("Escolha a forma da leitura dos dados conforme as opções abaixo: ");
        System.out.println("(1) - Inserção manual;");
        System.out.println("(2) - Inserção aleatórica;");
        System.out.println("(3) - Inserção através da leitura de um arquivo;");

        // Pega escolha
        int escolha = Integer.parseInt(input.nextLine());

        // Retorna escolha
        return escolha;
    }
}
