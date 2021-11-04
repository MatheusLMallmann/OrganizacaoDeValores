package Ordenacao;

import java.util.Date;
import java.util.List;

public class BubbleSort {
    public void ordenacaoInteger(List<Integer> lista){
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

        System.out.println(lista);
    }

    public void ordenacaoFloat(List<Double> lista){
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

        System.out.println(lista);
    }

    public void ordenacaoString(List<String> lista){
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

        System.out.println(lista);
    }

    public void ordenacaoDate(List<Date> lista) {
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

        System.out.println(lista);
    }
}
