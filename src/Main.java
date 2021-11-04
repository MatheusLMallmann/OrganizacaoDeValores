import Menus.ObterEscolha;

public class Main {
    public static void main(String[] args){

        ObterEscolha obterEscolha = new ObterEscolha();
        int escolhaDoTipoDosValores = obterEscolha.ColetaEscolha();
        int escolhaDoFormatoDeInsercaoDosValores = obterEscolha.FormatoDeInsercaoDosDados();

        switch (escolhaDoFormatoDeInsercaoDosValores){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }
}
