package Insercao;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Randomizer {

    Random random = new Random();

    public List<Integer> geradorListaInteiros(){
        List<Integer> listaInteiros = new ArrayList<>();
        int max = 1000, min = 0, numero = 0;
        for(int i = 0; i < 100; i++){
            numero = random.nextInt((max - min) + 1) + min;
            listaInteiros.add(i, numero);
        }
        return listaInteiros;
    }

    public List<Double> geradorListaFloat(){
        List<Double> listaFloat = new ArrayList<>();
        Double max = 1000.0, min = 0.0;
        for(int i = 0; i < 100; i++){
            Double numero = min + (max - min) * random.nextDouble();
            BigDecimal numberBigDecimal = new BigDecimal(numero);
            numberBigDecimal = numberBigDecimal.setScale(2, RoundingMode.HALF_UP);
            listaFloat.add(i, numberBigDecimal.doubleValue());
        }
        return listaFloat;
    }

    public List<String> geradorListaString(){
        List<String> listaString = new ArrayList<>();
        String palavra = "";

        for(int j = 0; j < 100; j++){
            for(int i = 0; i < 7; i++){
                int rnd = (int) (Math.random() * 52); // or use Random or whatever
                char base = (rnd < 26) ? 'A' : 'a';
                palavra += (char) (base + rnd % 26);
            }
            listaString.add(j, palavra);
            palavra = "";
        }
        return listaString;
    }

    public List<Date> geradorListaDatas() throws ParseException {
        List<Date> listaDatas = new ArrayList<>();
        Date dataGerada = null;
        String dataString = "";
        int diaMin = 1, diaMax = 31;
        int mesMin = 1, mesMax = 12;

        for (int i = 0; i < 100; i++){
            int dia = random.nextInt((diaMax - diaMin) + 1) + diaMin;
            int mes = random.nextInt((mesMax - mesMin) + 1) + mesMin;

            dataString = dia + "/" + mes + "/" + "2021";
            dataGerada = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);

            listaDatas.add(i, dataGerada);
            dataString = " ";
        }
        return listaDatas;
    }
}
