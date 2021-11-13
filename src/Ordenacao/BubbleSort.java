package Ordenacao;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BubbleSort {

    public void ordenacaoInteger(List<Integer> lista){
        long tempoInicial = System.currentTimeMillis();
        int aux = 0;
        for(int i = 0; i<lista.size(); i++){
            for(int j = 0; j<lista.size()-1; j++){
                if(lista.get(j) > lista.get(j + 1)){
                    aux = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, aux);
                }
            }
        }
        this.calculaTempoExcecucao(tempoInicial, System.currentTimeMillis());
        System.out.println(lista);
    }

    public void ordenacaoFloat(List<Double> lista){
        long tempoInicial = System.currentTimeMillis();
        double aux = 0.0;
        for(int i = 0; i<lista.size(); i++){
            for(int j = 0; j<lista.size()-1; j++){
                if(lista.get(j) > lista.get(j + 1)){
                    aux = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, aux);
                }
            }
        }

        this.calculaTempoExcecucao(tempoInicial, System.currentTimeMillis());
        System.out.println(lista);
    }

    public void ordenacaoString(List<String> lista){
        long tempoInicial = System.currentTimeMillis();
        String aux = "";
        for (int i = 0; i < lista.size(); i++) {
            for (int j = lista.size() - 1; j > i; j--) {
                if (lista.get(i).compareToIgnoreCase(lista.get(j)) > 0) {
                    aux = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, aux);
                }
            }
        }

        this.calculaTempoExcecucao(tempoInicial, System.currentTimeMillis());
        System.out.println(lista);
    }

    public void ordenacaoDate(List<Date> lista) {
        long tempoInicial = System.currentTimeMillis();
        Date aux = null;
        for(int i = 0; i<lista.size(); i++){
            for(int j = 0; j<lista.size()-1; j++){
                if(lista.get(j).after(lista.get(j+1))){
                    aux = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, aux);
                }
            }
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