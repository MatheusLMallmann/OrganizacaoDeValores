package Ordenacao;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InsertionSort {

    // Ordena valores inteiros
    public void ordenacaoInteger(List<Integer> lista){
        long tempoInicial = System.currentTimeMillis();
        for (int j = 1; j < lista.size(); j++) {
            int valor = lista.get(j);
            int i = j-1;
            while ( (i > -1) && ( lista.get(i) > valor ) ) {
                lista.set(i+1, lista.get(i));
                i--;
            }
            lista.set(i+1, valor);
        }

        this.calculaTempoExcecucao(tempoInicial, System.currentTimeMillis());
        System.out.println(lista);
    }

    // Ordena valores reais
    public void ordenacaoFloat(List<Double> lista){
        long tempoInicial = System.currentTimeMillis();
        for (int j = 1; j < lista.size(); j++) {
            Double valor = lista.get(j);
            int i = j-1;
            while ( (i > -1.0) && ( lista.get(i) > valor ) ) {
                lista.set(i+1, lista.get(i));
                i--;
            }
            lista.set(i+1, valor);
        }

        this.calculaTempoExcecucao(tempoInicial, System.currentTimeMillis());
        System.out.println(lista);
    }

    // Ordena palavras
    public void ordenacaoString(List<String> lista){
        long tempoInicial = System.currentTimeMillis();
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

        this.calculaTempoExcecucao(tempoInicial, System.currentTimeMillis());
        System.out.println(lista);
    }

    // Ordena datas
    public void ordenacaoDate(List<Date> lista){
        long tempoInicial = System.currentTimeMillis();
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

        this.calculaTempoExcecucao(tempoInicial, System.currentTimeMillis());
        List<String> listaFormatada = new ArrayList<>();
        lista.forEach(x-> listaFormatada.add(DateFormat.getDateInstance().format(x)));
        System.out.println(listaFormatada);
    }

    // Calcula tempo de execução
    private void calculaTempoExcecucao(long tempoInicial, long tempoFinal) {
        System.out.println("Tempo de excução foi de " + (tempoFinal - tempoInicial) + " ms");
    }
}
