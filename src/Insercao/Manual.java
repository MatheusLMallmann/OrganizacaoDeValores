package Insercao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Manual {

    // Objeto que irá pegar o input do usuário
    Scanner input = new Scanner(System.in);

    // Método que pegará os valores inteiros inseridos pelo usuário
    public List<Integer> manualInteger(){
        // Criação das lista que irá armazenar o valores inteiros
        List<Integer> listaInteiros = new ArrayList<>();
        // Printa na tela, informando que o usuário necessita informar um valor
        // que representa a quantidade de valores que serão informados
        System.out.println("Digite a quantidade de valores que deseja adicionar manualmente:");
        // Pega o input
        int quantidade = Integer.parseInt(input.nextLine());
        int x = 1;
        Integer valor = 0;
        // Loop para pegar os valores inseridos pelo usuário e armazenar eles na lista de inteiros
        while(x <= quantidade){
            // Pega input
            System.out.println("Informe o " + x + "° valor: ");
            valor = Integer.parseInt(input.nextLine());

            // Insere input na lista
            listaInteiros.add(x-1, valor);
            x++;
        }

        // Retorna a lista
        return listaInteiros;
    }

    // Método que pegará os valores reais inseridos pelo usuário
    public List<Double> manualFloat(){
        // Criação das lista que irá armazenar o valores inteiros
        List<Double> listaReais = new ArrayList<>();
        Double valor;
        int x = 1;
        // Printa na tela, informando que o usuário necessita informar um valor
        // que representa a quantidade de valores que serão informados
        System.out.println("Digite a quantidade de valores que deseja adicionar manualmente:");
        int quantidade = Integer.parseInt(input.nextLine());
        // Loop para pegar os valores inseridos pelo usuário e armazenar eles na lista de reais
        while (x <= quantidade){
            // Pega o input
            System.out.println("Digite o " + x + "° numero real desejado: ");
            valor = input.nextDouble();

            // Se o input for diferente de null, insere valor na lista
            if (valor != null){
                listaReais.add(x-1, valor);
                x++;
            }
        }

        // Retorna a lista
        return listaReais;
    }

    // Método que pegará as palavras inseridas pelo usuário
    public List<String> manualString(){
        // Criação das lista que irá armazenar o valores inteiros
        List<String> listaPalavras = new ArrayList<>();
        // Criação de variáveis para auxiliar captura e armazenamento das palavras
        String palavra = " ";
        boolean foiUmValor = false;

        // O usuário será capaz de informar quantas palavras ele quiser, sem precisar informar um valor fixo para isso
        // Para isso, basta o usuário continuar informando as palavras. Caso ele queira parar, basta ele inserir SAIR como input
        while(!palavra.equals("sair")){
            System.out.println("Digite a palavra desejada: ");
            // Após a primeira palavra ser informada, é mostrado na tela como funciona para o usuário
            // parar de inserir strings como input
            if (foiUmValor == true)
                System.out.println("Caso deseja parar de adicionar valores, insira SAIR");
            // Captura o input do usuário
            palavra = input.nextLine();
            foiUmValor = true;

            // Se a palavra informada for diferente de SAIR, insere a string na lista
            if (!palavra.equals("sair"))
                listaPalavras.add(palavra);
        }

        // Retorna a lista
        return listaPalavras;
    }

    // Método que pegará as palavras inseridas pelo usuário
    public List<Date> manualDate() throws ParseException {
        // Criação das lista que irá armazenar o valores inteiros
        List<Date> listaDatas = new ArrayList<>();
        // Criação de variáveis para auxiliar captura e armazenamento das palavras
        String dataString = " ";
        boolean foiUmValor = false;
        Date data = null;
        // O usuário será capaz de informar quantas datas ele quiser, sem precisar informar um valor fixo para isso
        // Para isso, basta o usuário continuar informando as datas. E caso ele queira parar, basta ele inserir SAIR como input
        while(!dataString.equals("sair")){
            System.out.println("Digite a data desejada com o seguinte formato DD/MM/2021: ");
            // Após a primeira data ser inserida, é mostrado na tela como funciona para o usuário
            // parar de inserir data como input
            if (foiUmValor == true)
                System.out.println("Caso deseja parar de adicionar valores, insira SAIR");
            dataString = input.nextLine();
            foiUmValor = true;

            // Se a String dataString for diferente da palavra SAIR, dataString é convertida em tipo Date
            // E armazenada na lista de datas
            if (!dataString.equals("sair")) {
                data = new SimpleDateFormat("dd/MM/yyyy").parse(dataString);
                listaDatas.add(data);
            }
        }

        // Retorna a lista
        return listaDatas;
    }
}