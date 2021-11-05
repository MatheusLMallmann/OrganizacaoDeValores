package Ordenacao;

import java.util.Date;
import java.util.List;

public class InsertionSort {
    public void ordenacaoInteger(List<Integer> lista){
        for (int j = 1; j < lista.size(); j++) {
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
        for (int j = 1; j < lista.size(); j++) {
            Double valor = lista.get(j);
            int i = j-1;
            while ( (i > -1.0) && ( lista.get(i) > valor ) ) {
                lista.set(i+1, lista.get(i));
                i--;
            }
            lista.set(i+1, valor);
        }

        System.out.println(lista);
    }
    public void ordenacaoString(List<String> lista){
        for (int j = 1; j < lista.size(); j++) {
            String valor = lista.get(j);
            int i = j - 1;

            while (i >= 0) {
                if (valor.compareTo(lista.get(i)) > 0) {
                    break;
                }
                lista.set(i+1, lista.get(i));
                i--;
            }
            lista.set(i+1, valor);
        }

        System.out.println(lista);
    }
    public void ordenacaoDate(List<Date> lista){
        for (int j = 1; j < lista.size(); j++) {
            Date valor = lista.get(j);
            int i = j - 1;

            while (i >= 0) {
                if (valor.compareTo(lista.get(i)) > 0) {
                    break;
                }
                lista.set(i+1, lista.get(i));
                i--;
            }
            lista.set(i+1, valor);
        }

        System.out.println(lista);
    }
}
