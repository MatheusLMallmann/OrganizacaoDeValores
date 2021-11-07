package Ordenacao;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SelectionSort {
    public void ordenacaoInteger(List<Integer> lista){
        long tempoInicial = System.currentTimeMillis();
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

        this.calculaTempoExcecucao(tempoInicial, System.currentTimeMillis());
        System.out.println(lista);
    }

    public void ordenacaoFloat(List<Double> lista){
        long tempoInicial = System.currentTimeMillis();
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

        this.calculaTempoExcecucao(tempoInicial, System.currentTimeMillis());
        System.out.println(lista);
    }

    public void ordenacaoString(List<String> lista){
        long tempoInicial = System.currentTimeMillis();
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

        this.calculaTempoExcecucao(tempoInicial, System.currentTimeMillis());
        System.out.println(lista);
    }

    public void ordenacaoData(List<Date> lista){
        long tempoInicial = System.currentTimeMillis();
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

        this.calculaTempoExcecucao(tempoInicial, System.currentTimeMillis());
        List<String> listaFormatada = new ArrayList<>();
        lista.forEach(x-> listaFormatada.add(DateFormat.getDateInstance().format(x)));
        System.out.println(listaFormatada);
    }

    private void calculaTempoExcecucao(long tempoInicial, long tempoFinal) {
        System.out.println("Tempo de excução foi de " + (tempoFinal - tempoInicial) + " ms");
    }
}


