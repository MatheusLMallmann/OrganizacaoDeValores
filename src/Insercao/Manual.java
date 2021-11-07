package Inserção;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Manual {

    Scanner input = new Scanner(System.in);

    public List<Integer> manualInteger(){
        List<Integer> listaInteiros = new ArrayList<>();
        System.out.println("Digite a quantidade de valores que deseja adicionar manualmente:");
        int quantidade = Integer.parseInt(input.nextLine());
        int x = 1;
        Integer valor = 0;
        while(x <= quantidade){
            System.out.println("Informe o " + x + "° valor: ");
            valor = Integer.parseInt(input.nextLine());

            listaInteiros.add(x-1, valor);
            x++;
        }

        return listaInteiros;
    }

    public List<Double> manualFloat(){
        List<Double> listaReais = new ArrayList<>();
        Double valor;
        int x = 1;
        System.out.println("Digite a quantidade de valores que deseja adicionar manualmente:");
        int quantidade = Integer.parseInt(input.nextLine());
        while (x <= quantidade){
            System.out.println("Digite o " + x + "° numero real desejado: ");
            valor = input.nextDouble();

            if (valor != null){
                listaReais.add(x-1, valor);
                x++;
            }
        }

        return listaReais;
    }

    public List<String> manualString(){
        List<String> listaPalavras = new ArrayList<>();
        String palavra = " ";
        boolean foiUmValor = false;
        while(!palavra.equals("sair")){
            System.out.println("Digite a palavra desejada: ");
            if (foiUmValor == true)
                System.out.println("Caso deseja parar de adicionar valores, insira SAIR");
            palavra = input.nextLine();
            foiUmValor = true;

            if (!palavra.equals("sair"))
                listaPalavras.add(palavra);
        }

        return listaPalavras;
    }

    public List<Date> manualDate() throws ParseException {
        List<Date> listaDatas = new ArrayList<>();
        String dataString = " ";
        boolean foiUmValor = false;
        Date data = null;
        while(!dataString.equals("sair")){
            System.out.println("Digite a data desejada com o seguinte formato DD/MM/2021: ");
            if (foiUmValor == true)
                System.out.println("Caso deseja parar de adicionar valores, insira SAIR");
            dataString = input.nextLine();
            foiUmValor = true;

            if (!dataString.equals("sair")) {
                data = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);
                listaDatas.add(data);
            }
        }

        return listaDatas;
    }
}