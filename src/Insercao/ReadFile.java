package Insercao;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ReadFile {

    public List<Integer> readInteiros() throws IOException {
        Scanner scanner = new Scanner(new File("./src/Arquivos/Inteiros"));
        List<Integer> listaInteiros = new ArrayList<Integer>();
        while (scanner.hasNextInt()) {
            listaInteiros.add(scanner.nextInt());
        }

        return listaInteiros;
    }

    public List<Double> readFloat() throws IOException{
        String conteudoArquivo = new String(Files.readAllBytes(Paths.get("./src/Arquivos/Reais")), StandardCharsets.UTF_8);
        char[] conteudo = conteudoArquivo.toCharArray();
        String numero = "";
        List<Double> listaReais = new ArrayList<>();
        int i = 0, posicao = 0;
        while(i < conteudo.length){
            if(conteudo[i] == ' '){
                listaReais.add(posicao, Double.parseDouble(numero));
                posicao++;
                i++;
                numero = "";
            }else{
                numero += conteudo[i];
                i++;
            }
        }
        return listaReais;
    }

    public List<String> readStrings() throws IOException{
        Scanner scanner = new Scanner(new File("./src/Arquivos/Strings"));
        List<String> listaString = new ArrayList<String>();
        while (scanner.hasNext()) {
            listaString.add(scanner.nextLine());
        }

        return listaString;
    }

    public List<Date> readDatas() throws IOException, ParseException {
        List<String> listaString = Files.readAllLines(Paths.get("Datas"));
        List<Date> listaDatas = new ArrayList<>();

        for (int i = 0; i < listaString.size(); i++){
            listaDatas.add(i, new SimpleDateFormat("dd/MM/yyyy").parse(listaString.get(i)));
        }

        return listaDatas;
    }


}
