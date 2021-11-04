package Ordenacao;

import java.util.Date;
import java.util.List;

public class InsertionSort {
    public void ordenacaoInteger(List<Integer> lista){
        int n = lista.size();
        for (int j = 1; j < n; j++) {
            int valor = lista.get(j);
            int i = j-1;
            while ( (i > -1) && ( lista.get(i) > valor ) ) {
                lista.set(i+1, lista.get(i));
                i--;
            }
            lista.set(i+1, valor);
        }

        System.out.println(lista);
    }
    public void ordenacaoFloat(List<Double> lista){

    }
    public void ordenacaoString(List<String> lista){

    }
    public void ordenacaoDate(List<Date> lista){

    }
}
