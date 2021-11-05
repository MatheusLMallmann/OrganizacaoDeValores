package Ordenacao;

import java.util.Date;
import java.util.List;

public class SelectionSort {
    public void ordenacaoInteger(List<Integer> lista){
        for (int i = 0; i < lista.size() - 1; i++){
            int index = i;
            for (int j = i + 1; j < lista.size(); j++){
                if (lista.get(j) < lista.get(index)){
                    index = j;
                }
            }
            int menorValor = lista.get(index);
            lista.set(index, lista.get(i));
            lista.set(i, menorValor);
        }

        System.out.println(lista);
    }

    public void ordenacaoFloat(List<Double> lista){
        for (int i = 0; i < lista.size() - 1; i++){
            int index = i;
            for (int j = i + 1; j < lista.size(); j++){
                if (lista.get(j) < lista.get(index)){
                    index = j;
                }
            }
            Double menorValor = lista.get(index);
            lista.set(index, lista.get(i));
            lista.set(i, menorValor);
        }

        System.out.println(lista);
    }

    public void ordenacaoString(List<String> lista){
        for (int i = 0; i < lista.size() - 1; i++){
            int index = i;
            for (int j = i + 1; j < lista.size(); j++){
                if (lista.get(j).compareTo(lista.get(index)) < 0 ){
                    index = j;
                }
            }
            String menorValor = lista.get(index);
            lista.set(index, lista.get(i));
            lista.set(i, menorValor);
        }

        System.out.println(lista);
    }

    public void ordenacaoData(List<Date> lista){
        for (int i = 0; i < lista.size() - 1; i++){
            int index = i;
            for (int j = i + 1; j < lista.size(); j++){
                if (lista.get(j).compareTo(lista.get(index)) < 0 ){
                    index = j;
                }
            }
            Date dataMenor = lista.get(index);
            lista.set(index, lista.get(i));
            lista.set(i, dataMenor);
        }

        System.out.println(lista);
    }
}


