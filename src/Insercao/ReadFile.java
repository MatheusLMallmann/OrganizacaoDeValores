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

// Classe responsável pela leitura dos valores inteiros, reais, datas palavras
// Sendo que cada tipo tem sua própria função
public class ReadFile {

    // Método responsável pelo armazenamento de valores inteiros vindos de um arquivo
    public List<Integer> readInteiros() throws IOException {
        // Leitura dos valores inteiros do arquivo
        Scanner scanner = new Scanner(new File("./src/Arquivos/Inteiros"));
        // Criação de uma lista para armazenar os valores
        List<Integer> listaInteiros = new ArrayList<>();
        // Loop para armazenar cada valor na lista anteriormente criada.
        while (scanner.hasNextInt()) {
            // Cada inteiro que for encontrado, será adicionado na lista
            listaInteiros.add(scanner.nextInt());
        }

        // Retorna a lista
        return listaInteiros;
    }

    // Método responsável pelo armazenamento de valores reais vindos de um arquivo
    public List<Double> readFloat() throws IOException{
        // Todo o conteúdo do arquivo é armazenado em uma variável do tipo String
        String conteudoArquivo = new String(Files.readAllBytes(Paths.get("./src/Arquivos/Reais")), StandardCharsets.UTF_8);
        // Utilizada uma função que separa todos os caracteres que armazena em um array
        char[] conteudo = conteudoArquivo.toCharArray();
        // Criação de variáveis para armazenar os valores do array e converter para Double, criação da lista que vai
        // armazenas os valores reais e variáveis de controle
        String numero = "";
        List<Double> listaReais = new ArrayList<>();
        int i = 0, posicao = 0;
        // Enquanto variável i for menor que o tamanho do array com os caracteres, vai fazendo a leitura caractere por caractere
        while(i < conteudo.length){
            // Sempre que for encontrado um valor, ele é armazenado na variável numero, caso seja encontrado um espaço
            // o conteúdo da variável numero é adicionada a lista sendo convertida para Double
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

        // Retorna a lista
        return listaReais;
    }

    // Método responsável pelo armazenamento de palavras vindos de um arquivo
    public List<String> readStrings() throws IOException{
        // Todo o conteúdo do arquivo é armazenado em uma variável do tipo String
        String conteudoArquivo = new String(Files.readAllBytes(Paths.get("./src/Arquivos/Strings")), StandardCharsets.UTF_8);
        // Utilizada uma função que separa todos os caracteres que armazena em um array
        char[] conteudo = conteudoArquivo.toCharArray();
        // Criação de variáveis para armazenar os valores do array concatenando os caracteres, criação da lista que vai
        // armazenas as palavras e variáveis de controle
        String palavra = "";
        List<String> listaString = new ArrayList<>();
        int i = 0, posicao = 0;
        // Enquanto variável i for menor que o tamanho do array com os caracteres, vai fazendo a leitura caractere por caractere
        while(i < conteudo.length){
            // Sempre que for encontrado um valor, ele é armazenado na variável palavra, caso seja encontrado um espaço
            // o conteúdo da variável palavra é adicionada a lista de Strings
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

        // Retorna a lista
        return listaString;
    }

    // Método responsável pelo armazenamento de datas vindos de um arquivo
    public List<Date> readDatas() throws IOException, ParseException {
        // Todo o conteúdo do arquivo é armazenado em uma variável do tipo String
        String conteudoArquivo = new String(Files.readAllBytes(Paths.get("./src/Arquivos/Datas")), StandardCharsets.UTF_8);
        // Utilizada uma função que separa todos os caracteres que armazena em um array
        char[] conteudo = conteudoArquivo.toCharArray();
        // Criação de variáveis para armazenar os valores do array concatenando os caracteres, criação da lista que vai
        // armazenas as datas e variáveis de controle
        String dataString = "";
        Date data = null;
        List<Date> listaDatas = new ArrayList<>();
        int i = 0, posicao = 0;
        // Enquanto variável i for menor que o tamanho do array com os caracteres, vai fazendo a leitura caractere por caractere
        while(i < conteudo.length){
            // Sempre que for encontrado um caractere, ele é armazenado na variável dataString, caso seja encontrado um espaço
            // o conteúdo da variável dataString é adicionada a lista de datas sendo convertida para um tipo Date
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

        // Retorna a lista
        return listaDatas;
    }


}
