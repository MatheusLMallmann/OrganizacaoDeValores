import Insercao.Manual;
import Insercao.Randomizer;
import Insercao.ReadFile;
import Menus.ObterEscolha;
import Ordenacao.BubbleSort;
import Ordenacao.InsertionSort;
import Ordenacao.SelectionSort;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException, IOException {

        // Instancia do objeto ObterEscolha para chamar os métodos dos menus
        ObterEscolha obterEscolha = new ObterEscolha();
        // Instancia de objetos responsáveis pelo ordenação dos valores
        // Cada classe possui 4 métodos e cada método ordena um tipo diferente de variável
        // Os tipos que serão ordenados são: Inteiros, Reais, Datas e Strings
        BubbleSort bs = new BubbleSort();
        InsertionSort is = new InsertionSort();
        SelectionSort ss = new SelectionSort();
        // Chamada de método para pegar o nome do usuário
        String nome = obterEscolha.ColetaNome();

        do {
            // Chamada de métodos para pegar mostrar os menus
            // E coletar as escolhas do usuário
            int escolhaDoTipoDosValores = obterEscolha.ColetaEscolha(nome);
            int escolhaDoFormatoDeInsercaoDosValores = obterEscolha.FormatoDeInsercaoDosDados();

            switch (escolhaDoFormatoDeInsercaoDosValores){
                // Case 1: Usuário informou que deseja ordenar valores inteiros
                case 1:
                    // Usuário deseja inserir os valores manualmente
                    Manual manual = new Manual();

                    // Valores inteiros
                    if (escolhaDoTipoDosValores == 1){
                        // Uma lista de inteiros armazena o retorno da função manualInteger em Manual
                        List<Integer> lista = manual.manualInteger();
                        // Imprime os valores originais
                        System.out.println("Vetor original:");
                        System.out.println(lista);
                        // Imprime os valores ordenados com o método Bubble Sort
                        System.out.println("Vetor ordenado utilizando Bubble Sort:");
                        bs.ordenacaoInteger(lista);
                        // Imprime os valores ordenados com o método Insertion Sort
                        System.out.println("Vetor ordenado utilizando Insertion Sort:");
                        is.ordenacaoInteger(lista);
                        // Imprime os valores ordenados com o método Selection Sort
                        System.out.println("Vetor ordenado utilizando Selection Sort");
                        ss.ordenacaoInteger(lista);
                    }

                    // Valores reais
                    if (escolhaDoTipoDosValores == 2){
                        // Valores reais são armazenados com o retorno da função manualFloat em Manual
                        List<Double> lista = manual.manualFloat();
                        // Imprime os valores originais
                        System.out.println("Vetor original:");
                        System.out.println(lista);
                        // Imprime os valores ordenados com o método Bubble Sort
                        System.out.println("Vetor ordenado utilizando Bubble Sort:");
                        bs.ordenacaoFloat(lista);
                        // Imprime os valores ordenados com o método Insertion Sort
                        System.out.println("Vetor ordenado utilizando Insertion Sort:");
                        is.ordenacaoFloat(lista);
                        // Imprime os valores ordenados com o método Selection Sort
                        System.out.println("Vetor ordenado utilizando Selection Sort");
                        ss.ordenacaoFloat(lista);
                    }

                    // Datas
                    if (escolhaDoTipoDosValores == 3){
                        // Datas são armazenadas na lista com o retorno da função manualDate em Manual
                        List<Date> lista = manual.manualDate();
                        // Imprime valores originais
                        System.out.println("Vetor original:");
                        System.out.println(lista);
                        // Imprime os valores ordenados com o método Bubble Sort
                        System.out.println("Vetor ordenado utilizando Bubble Sort:");
                        bs.ordenacaoDate(lista);
                        // Imprime os valores ordenados com o método Insertion Sort
                        System.out.println("Vetor ordenado utilizando Insertion Sort:");
                        is.ordenacaoDate(lista);
                        // Imprime os valores ordenados com o método Selection Sort
                        System.out.println("Vetor ordenado utilizando Selection Sort:");
                        ss.ordenacaoData(lista);
                    }

                    // Palavras
                    if (escolhaDoTipoDosValores == 4){
                        // Palavras são armazenadas na lista com o retorno da função manualString em Manual
                        List<String> lista = manual.manualString();
                        // Imprime valores originais
                        System.out.println("Vetor original:");
                        System.out.println(lista);
                        // Imprime os valores ordenados com o método Bubble Sort
                        System.out.println("Vetor ordenado utilizando Bubble Sort:");
                        bs.ordenacaoString(lista);
                        // Imprime os valores ordenados com o método Insertion Sort
                        System.out.println("Vetor ordenado utilizando Insertion Sort:");
                        is.ordenacaoString(lista);
                        // Imprime os valores ordenados com o método Selection Sort
                        System.out.println("Vetor ordenado utilizando Selection Sort");
                        ss.ordenacaoString(lista);
                    }
                    break;

                // Case 2: Usuário deseja que os valores ordenados sejam aleatórios
                case 2:
                    Randomizer randomizer = new Randomizer();

                    // Valores inteiros
                    if (escolhaDoTipoDosValores == 1){
                        // Uma lista de inteiros armazena o retorno da função geradorListaInteiros em Randomizer
                        List<Integer> lista = randomizer.geradorListaInteiros();
                        // Imprime valores originais
                        System.out.println("Vetor original:");
                        System.out.println(lista);
                        // Imprime os valores ordenados com o método Bubble Sort
                        System.out.println("Vetor ordenado utilizando Bubble Sort:");
                        bs.ordenacaoInteger(lista);
                        // Imprime os valores ordenados com o método Insertion Sort
                        System.out.println("Vetor ordenado utilizando Insertion Sort:");
                        is.ordenacaoInteger(lista);
                        // Imprime os valores ordenados com o método Selection Sort
                        System.out.println("Vetor ordenado utilizando Selection Sort");
                        ss.ordenacaoInteger(lista);
                    }

                    // Valores reais
                    if (escolhaDoTipoDosValores == 2){
                        // Uma lista armazena os valores reais vindos como retorno da função geradorListaFloat
                        List<Double> lista = randomizer.geradorListaFloat();
                        // Imprime valores originais
                        System.out.println("Vetor original:");
                        System.out.println(lista);
                        // Imprime os valores ordenados com o método Bubble Sort
                        System.out.println("Vetor ordenado utilizando Bubble Sort:");
                        bs.ordenacaoFloat(lista);
                        // Imprime os valores ordenados com o método Insertion Sort
                        System.out.println("Vetor ordenado utilizando Insertion Sort:");
                        is.ordenacaoFloat(lista);
                        // Imprime os valores ordenados com o método Selection Sort
                        System.out.println("Vetor ordenado utilizando Selection Sort");
                        ss.ordenacaoFloat(lista);
                    }

                    // Datas
                    if (escolhaDoTipoDosValores == 3){
                        // Armazena as datas vindas como retorno da função geradorListaDatas
                        List<Date> lista = randomizer.geradorListaDatas();
                        // Imprime valores originais
                        System.out.println("Vetor original:");
                        System.out.println(lista);
                        // Imprime os valores ordenados com o método Bubble Sort
                        System.out.println("Vetor ordenado utilizando Bubble Sort:");
                        bs.ordenacaoDate(lista);
                        // Imprime os valores ordenados com o método Insertion Sort
                        System.out.println("Vetor ordenado utilizando Insertion Sort:");
                        is.ordenacaoDate(lista);
                        // Imprime os valores ordenados com o método Selection Sort
                        System.out.println("Vetor ordenado utilizando Selection Sort");
                        ss.ordenacaoData(lista);
                    }

                    // Palavras
                    if (escolhaDoTipoDosValores == 4){
                        // Armazena as palavras vindas como retorno da função geradorListString
                        List<String> lista = randomizer.geradorListaString();
                        // Imprime valores originais
                        System.out.println("Vetor original:");
                        System.out.println(lista);
                        // Imprime os valores ordenados com o método Bubble Sort
                        System.out.println("Vetor ordenado utilizando Bubble Sort:");
                        bs.ordenacaoString(lista);
                        // Imprime os valores ordenados com o método Insertion Sort
                        System.out.println("Vetor ordenado utilizando Insertion Sort:");
                        is.ordenacaoString(lista);
                        // Imprime os valores ordenados com o método Selection Sort
                        System.out.println("Vetor ordenado utilizando Selection Sort");
                        ss.ordenacaoString(lista);
                    }
                    break;

                // Case 3: Usuário deseja que os valores venham de um arquivo
                case 3:
                    ReadFile readFile = new ReadFile();

                    // Valores inteiros
                    if (escolhaDoTipoDosValores == 1){
                        // Armazena os valores inteiros vindas do arquivo de texto
                        List<Integer> lista = readFile.readInteiros();
                        // Imprime valores originais
                        System.out.println("Vetor original:");
                        System.out.println(lista);
                        // Imprime os valores ordenados com o método Bubble Sort
                        System.out.println("Vetor ordenado utilizando Bubble Sort:");
                        bs.ordenacaoInteger(lista);
                        // Imprime os valores ordenados com o método Insertion Sort
                        System.out.println("Vetor ordenado utilizando Insertion Sort:");
                        is.ordenacaoInteger(lista);
                        // Imprime os valores ordenados com o método Selection Sort
                        System.out.println("Vetor ordenado utilizando Selection Sort");
                        ss.ordenacaoInteger(lista);
                    }

                    // Valores reais
                    if(escolhaDoTipoDosValores == 2){
                        // Armazena os valores reais vindas do arquivo de texto
                        List<Double> lista = readFile.readFloat();
                        // Imprime valores originais
                        System.out.println("Vetor original:");
                        System.out.println(lista);
                        // Imprime os valores ordenados com o método Bubble Sort
                        System.out.println("Vetor ordenado utilizando Bubble Sort:");
                        bs.ordenacaoFloat(lista);
                        // Imprime os valores ordenados com o método Insertion Sort
                        System.out.println("Vetor ordenado utilizando Insertion Sort:");
                        is.ordenacaoFloat(lista);
                        // Imprime os valores ordenados com o método Selection Sort
                        System.out.println("Vetor ordenado utilizando Selection Sort");
                        ss.ordenacaoFloat(lista);
                    }

                    // Datas
                    if(escolhaDoTipoDosValores == 3){
                        // Armazena as datas vindas do arquivo de texto
                        List<Date> lista = readFile.readDatas();
                        // Imprime valores originais
                        System.out.println("Vetor original:");
                        System.out.println(lista);
                        // Imprime os valores ordenados com o método Bubble Sort
                        System.out.println("Vetor ordenado utilizando Bubble Sort:");
                        bs.ordenacaoDate(lista);
                        // Imprime os valores ordenados com o método Insertion Sort
                        System.out.println("Vetor ordenado utilizando Insertion Sort:");
                        is.ordenacaoDate(lista);
                        // Imprime os valores ordenados com o método Selection Sort
                        System.out.println("Vetor ordenado utilizando Selection Sort");
                        ss.ordenacaoData(lista);
                    }

                    // Palavras
                    if(escolhaDoTipoDosValores == 4){
                        // Armazena as palavras vindas do arquivo de texto
                        List<String> lista = readFile.readStrings();
                        // Imprime valores originais
                        System.out.println("Vetor original:");
                        System.out.println(lista);
                        // Imprime os valores ordenados com o método Bubble Sort
                        System.out.println("Vetor ordenado utilizando Bubble Sort:");
                        bs.ordenacaoString(lista);
                        // Imprime os valores ordenados com o método Insertion Sort
                        System.out.println("Vetor ordenado utilizando Insertion Sort:");
                        is.ordenacaoString(lista);
                        // Imprime os valores ordenados com o método Selection Sort
                        System.out.println("Vetor ordenado utilizando Selection Sort");
                        ss.ordenacaoString(lista);
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while(true);
    }
}
