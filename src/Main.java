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
                // Case 1: Usuário deseja informar manualmente os valores
                case 1:
                    Manual manual = new Manual();

                    if (escolhaDoTipoDosValores == 1){
                        List<Integer> lista = manual.manualInteger();
                        System.out.println("Vetor original:");
                        System.out.println(lista);
                        System.out.println("Vetor ordenado utilizando Bubble Sort:");
                        bs.ordenacaoInteger(lista);
                        System.out.println("Vetor ordenado utilizando Insertion Sort:");
                        is.ordenacaoInteger(lista);
                        System.out.println("Vetor ordenado utilizando Selection Sort");
                        ss.ordenacaoInteger(lista);
                    }

                    if (escolhaDoTipoDosValores == 2){
                        List<Double> lista = manual.manualFloat();
                        System.out.println("Vetor original:");
                        System.out.println(lista);
                        System.out.println("Vetor ordenado utilizando Bubble Sort:");
                        bs.ordenacaoFloat(lista);
                        System.out.println("Vetor ordenado utilizando Insertion Sort:");
                        is.ordenacaoFloat(lista);
                        System.out.println("Vetor ordenado utilizando Selection Sort");
                        ss.ordenacaoFloat(lista);
                    }

                    if (escolhaDoTipoDosValores == 3){
                        List<Date> lista = manual.manualDate();
                        System.out.println("Vetor original:");
                        System.out.println(lista);
                        System.out.println("Vetor ordenado utilizando Bubble Sort:");
                        bs.ordenacaoDate(lista);
                        System.out.println("Vetor ordenado utilizando Insertion Sort:");
                        is.ordenacaoDate(lista);
                        System.out.println("Vetor ordenado utilizando Selection Sort:");
                        ss.ordenacaoData(lista);
                    }

                    if (escolhaDoTipoDosValores == 4){
                        List<String> lista = manual.manualString();
                        System.out.println("Vetor original:");
                        System.out.println(lista);
                        System.out.println("Vetor ordenado utilizando Bubble Sort:");
                        bs.ordenacaoString(lista);
                        System.out.println("Vetor ordenado utilizando Insertion Sort:");
                        is.ordenacaoString(lista);
                        System.out.println("Vetor ordenado utilizando Selection Sort");
                        ss.ordenacaoString(lista);
                    }
                    break;

                // Case 2: Usuário deseja que os valores ordenados sejam aleatórios
                case 2:
                    Randomizer randomizer = new Randomizer();

                    if (escolhaDoTipoDosValores == 1){
                        List<Integer> lista = randomizer.geradorListaInteiros();
                        System.out.println("Vetor original:");
                        System.out.println(lista);
                        System.out.println("Vetor ordenado utilizando Bubble Sort:");
                        bs.ordenacaoInteger(lista);
                        System.out.println("Vetor ordenado utilizando Insertion Sort:");
                        is.ordenacaoInteger(lista);
                        System.out.println("Vetor ordenado utilizando Selection Sort");
                        ss.ordenacaoInteger(lista);
                    }

                    if (escolhaDoTipoDosValores == 2){
                        List<Double> lista = randomizer.geradorListaFloat();
                        System.out.println("Vetor original:");
                        System.out.println(lista);
                        System.out.println("Vetor ordenado utilizando Bubble Sort:");
                        bs.ordenacaoFloat(lista);
                        System.out.println("Vetor ordenado utilizando Insertion Sort:");
                        is.ordenacaoFloat(lista);
                        System.out.println("Vetor ordenado utilizando Selection Sort");
                        ss.ordenacaoFloat(lista);
                    }

                    if (escolhaDoTipoDosValores == 3){
                        List<Date> lista = randomizer.geradorListaDatas();
                        System.out.println("Vetor original:");
                        System.out.println(lista);
                        System.out.println("Vetor ordenado utilizando Bubble Sort:");
                        bs.ordenacaoDate(lista);
                        System.out.println("Vetor ordenado utilizando Insertion Sort:");
                        is.ordenacaoDate(lista);
                        System.out.println("Vetor ordenado utilizando Selection Sort");
                        ss.ordenacaoData(lista);
                    }

                    if (escolhaDoTipoDosValores == 4){
                        List<String> lista = randomizer.geradorListaString();
                        System.out.println("Vetor original:");
                        System.out.println(lista);
                        System.out.println("Vetor ordenado utilizando Bubble Sort:");
                        bs.ordenacaoString(lista);
                        System.out.println("Vetor ordenado utilizando Insertion Sort:");
                        is.ordenacaoString(lista);
                        System.out.println("Vetor ordenado utilizando Selection Sort");
                        ss.ordenacaoString(lista);
                    }
                    break;

                // Case 3: Usuário deseja que os valores venham de um arquivo
                case 3:
                    ReadFile readFile = new ReadFile();

                    if (escolhaDoTipoDosValores == 1){
                        List<Integer> lista = readFile.readInteiros();
                        System.out.println("Vetor original:");
                        System.out.println(lista);
                        System.out.println("Vetor ordenado utilizando Bubble Sort:");
                        bs.ordenacaoInteger(lista);
                        System.out.println("Vetor ordenado utilizando Insertion Sort:");
                        is.ordenacaoInteger(lista);
                        System.out.println("Vetor ordenado utilizando Selection Sort");
                        ss.ordenacaoInteger(lista);
                    }

                    if(escolhaDoTipoDosValores == 2){
                        List<Double> lista = readFile.readFloat();
                        System.out.println("Vetor original:");
                        System.out.println(lista);
                        System.out.println("Vetor ordenado utilizando Bubble Sort:");
                        bs.ordenacaoFloat(lista);
                        System.out.println("Vetor ordenado utilizando Insertion Sort:");
                        is.ordenacaoFloat(lista);
                        System.out.println("Vetor ordenado utilizando Selection Sort");
                        ss.ordenacaoFloat(lista);
                    }

                    if(escolhaDoTipoDosValores == 3){
                        List<Date> lista = readFile.readDatas();
                        System.out.println("Vetor original:");
                        System.out.println(lista);
                        System.out.println("Vetor ordenado utilizando Bubble Sort:");
                        bs.ordenacaoDate(lista);
                        System.out.println("Vetor ordenado utilizando Insertion Sort:");
                        is.ordenacaoDate(lista);
                        System.out.println("Vetor ordenado utilizando Selection Sort");
                        ss.ordenacaoData(lista);
                    }

                    if(escolhaDoTipoDosValores == 4){
                        List<String> lista = readFile.readStrings();
                        System.out.println("Vetor original:");
                        System.out.println(lista);
                        System.out.println("Vetor ordenado utilizando Bubble Sort:");
                        bs.ordenacaoString(lista);
                        System.out.println("Vetor ordenado utilizando Insertion Sort:");
                        is.ordenacaoString(lista);
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
