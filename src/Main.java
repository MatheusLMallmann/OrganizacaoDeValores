import Inserção.Manual;
import Menus.ObterEscolha;
import Ordenacao.BubbleSort;
import Ordenacao.InsertionSort;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {

        ObterEscolha obterEscolha = new ObterEscolha();
        Manual manual = new Manual();
        BubbleSort bs = new BubbleSort();
        InsertionSort is = new InsertionSort();
        int escolhaDoTipoDosValores = obterEscolha.ColetaEscolha();
        int escolhaDoFormatoDeInsercaoDosValores = obterEscolha.FormatoDeInsercaoDosDados();

        switch (escolhaDoFormatoDeInsercaoDosValores){
            case 1:
                if (escolhaDoTipoDosValores == 1){
                    List<Integer> lista = manual.manualInteger();
                    System.out.println("Vetor original:");
                    System.out.println(lista);
                    System.out.println("Vetor ordenado utilizando Bubble Sort:");
                    bs.ordenacaoInteger(lista);
                    System.out.println("Vetor ordenado utilizando Insertion Sort:");
                    is.ordenacaoInteger(lista);
                }

                if (escolhaDoTipoDosValores == 2){
                    List<Double> lista = manual.manualFloat();
                    System.out.println("Vetor original:");
                    System.out.println(lista);
                    System.out.println("Vetor ordenado utilizando Bubble Sort:");
                    bs.ordenacaoFloat(lista);
                    System.out.println("Vetor ordenado utilizando Insertion Sort:");
                    is.ordenacaoFloat(lista);
                }

                if (escolhaDoTipoDosValores == 3){
                    List<Date> lista = manual.manualDate();
                    System.out.println("Vetor original:");
                    System.out.println(lista);
                    System.out.println("Vetor ordenado utilizando Bubble Sort:");
                    bs.ordenacaoDate(lista);
                }

                if (escolhaDoTipoDosValores == 4){
                    List<String> lista = manual.manualString();
                    System.out.println("Vetor original:");
                    System.out.println(lista);
                    System.out.println("Vetor ordenado utilizando Bubble Sort:");
                    bs.ordenacaoString(lista);
                    System.out.println("Vetor ordenado utilizando Insertion Sort:");
                    is.ordenacaoPalavras(lista);

                }
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }
}
