package Insercao;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

// Classe responsável pela geração aleatória de valores inteiros, reais, palavras e datas
public class Randomizer {

    Random random = new Random();

    // Geração dos valores inteiros aleatoriamente
    public List<Integer> geradorListaInteiros(){
        // Criação da lista que armazenará os valores inteiros
        List<Integer> listaInteiros = new ArrayList<>();
        // Criação da variáveis que serão utilizadas para delimitar o range da geração de valores
        // Range: valores entre 0 a 1000
        int max = 1000, min = 0, numero = 0;
        // Loop de geração dos valores, serão gerados 100 valores inteiros de forma aleatória
        for(int i = 0; i < 100; i++){
            // Número aleatório é setado
            numero = random.nextInt((max - min) + 1) + min;
            // Número que foi gerado anteriormente, é armazenado na lista dos valores inteiros
            listaInteiros.add(i, numero);
        }

        // Retorna a lista
        return listaInteiros;
    }

    // Geração dos valores reais aleatoriamente
    public List<Double> geradorListaFloat(){
        // Criação da lista que armazenará os valores reais
        List<Double> listaFloat = new ArrayList<>();
        // Criação da variáveis que serão utilizadas para delimitar o range da geração de valores
        // Range: valores entre 0.0 a 1000.0
        Double max = 1000.0, min = 0.0;
        // Loop de geração dos valores, serão gerados 100 valores reais de forma aleatória
        for(int i = 0; i < 100; i++){
            // Número aleatório é setado
            Double numero = min + (max - min) * random.nextDouble();
            // Número é formatado para conter apenas 2 casas decimais após a virgula
            BigDecimal numberBigDecimal = new BigDecimal(numero);
            numberBigDecimal = numberBigDecimal.setScale(2, RoundingMode.HALF_UP);
            // Número é adicionado a lista de valores reais
            listaFloat.add(i, numberBigDecimal.doubleValue());
        }
        return listaFloat;
    }

    // Geração das palavras aleatoriamente
    public List<String> geradorListaString(){
        // Criação da lista que armazenará os valores reais
        List<String> listaString = new ArrayList<>();
        // Variável que vai armazenar as palavras geradas
        String palavra = "";

        // Loop que vai gerar as palavras aleatóriamente
        for(int j = 0; j < 100; j++){
            // Será gerado 7 caracteres e cada caractere é concatenado em palavra
            // Isso será realizado, 100 vezes
            for(int i = 0; i < 7; i++){
                int rnd = (int) (Math.random() * 52); // or use Random or whatever
                char base = (rnd < 26) ? 'A' : 'a';
                palavra += (char) (base + rnd % 26);
            }
            // Conteúdo da variável palavra é armazenado na lista de Strings
            listaString.add(j, palavra);
            palavra = "";
        }

        // Retorna a lista
        return listaString;
    }

    // Geração das palavras aleatoriamente
    public List<Date> geradorListaDatas() throws ParseException {
        // Criação da lista que irá armazenar as datas
        List<Date> listaDatas = new ArrayList<>();
        // Criação de variáveis que irão auxiliar na geração das datas
        Date dataGerada = null;
        String dataString = "";
        int diaMin = 1, diaMax = 31;
        int mesMin = 1, mesMax = 12;

        // Loop que irá gerar um valor aleatório de 1 - 31 que será considerado como o dia da data,
        // outro valor de 1 - 12 que será considerado como o mês da data.
        // Isso ocorrerá 100 vezes, resultando em 100 datas aleatórias
        for (int i = 0; i < 100; i++){
            // Gera um valor inteiro que representa o dia e um valor inteiro que representa o mês
            int dia = random.nextInt((diaMax - diaMin) + 1) + diaMin;
            int mes = random.nextInt((mesMax - mesMin) + 1) + mesMin;

            // Concatena o dia e o mês num formato de data: dia/mes/2021(ano padrão)
            dataString = dia + "/" + mes + "/" + "2021";
            // Converte a String para Date
            dataGerada = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);

            // Adiciona a data para a lista de datas
            listaDatas.add(i, dataGerada);
            dataString = " ";
        }

        // Retorna a lista
        return listaDatas;
    }
}
