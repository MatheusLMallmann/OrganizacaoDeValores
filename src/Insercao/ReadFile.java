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
        String conteudoArquivo = new String(Files.readAllBytes(Paths.get("./src/Arquivos/Strings")), StandardCharsets.UTF_8);
        char[] conteudo = conteudoArquivo.toCharArray();
        String palavra = "";
        List<String> listaString = new ArrayList<>();
        int i = 0, posicao = 0;
        while(i < conteudo.length){
            if(conteudo[i] == ' '){
                listaString.add(posicao, palavra);
                posicao++;
                i++;
                palavra = "";
            }else{
                palavra += conteudo[i];
                i++;
            }
        }

        return listaString;
    }

    public List<Date> readDatas() throws IOException, ParseException {
        String conteudoArquivo = new String(Files.readAllBytes(Paths.get("./src/Arquivos/Datas")), StandardCharsets.UTF_8);
        char[] conteudo = conteudoArquivo.toCharArray();
        String dataString = "";
        Date data = null;
        List<Date> listaDatas = new ArrayList<>();
        int i = 0, posicao = 0;
        while(i < conteudo.length){
            if(conteudo[i] == ' '){
                data = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);
                listaDatas.add(posicao, data);
                posicao++;
                i++;
                dataString = "";
            }else{
                dataString += conteudo[i];
                i++;
            }
        }

        return listaDatas;
    }


}
