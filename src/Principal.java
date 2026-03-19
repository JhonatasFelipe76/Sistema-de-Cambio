//ALUNO: Jhonatas Felipe Gomes da Silva
//RU: 5471251


import java.util.Scanner;

public class Principal{
    static void main(String[] args) {
        Menu mn = new Menu();
        Scanner teclas = new Scanner(System.in);
        Cofrinho c = new Cofrinho();
        while (true){
            mn.menuCofrinho(); //chama o menu
            int opc = teclas.nextInt();

            if (opc == 1) { //Opção para adicionar
                System.out.println("Escolha o tipo da moeda:");
                System.out.println("1 - Dólar");
                System.out.println("2 - Euro");
                System.out.println("3 - Real");
                int tipoMoeda = teclas.nextInt();

                System.out.println("Qual o valor que deseja adicionar? ");
                double valor = teclas.nextDouble();

                Moeda m = null; //verifica o tipo escolhido, cria e adiciona essa moeda ao cofrinho
                if (tipoMoeda == 1) {
                    m = new Dolar(valor);
                } else if (tipoMoeda == 2) {
                    m = new Euro(valor);
                } else if (tipoMoeda == 3) {
                    m = new Real(valor);
                } else {
                    System.out.println("Tipo inválido");
                }
                c.adicionar(m);
                continue;
            }
            if (opc == 2 ) { // Opção para remover
                System.out.println("Escolha a moeda que você quer remover:");
                System.out.println("1 - Dólar");
                System.out.println("2 - Euro");
                System.out.println("2 Real");
                int tipoMoeda = teclas.nextInt();

                System.out.println("Qual o valor que deseja remover? ");
                double rmvValor = teclas.nextDouble();
                //A estrutura se repete, porém ele remove a moeda do cofrinho

                Moeda m = null;
                if (tipoMoeda == 1){
                    m = new Dolar(rmvValor);

                } else if (tipoMoeda == 2){
                    m = new Euro(rmvValor);

                } else if (tipoMoeda == 3){
                    m = new Real(rmvValor);
                } else {
                    System.out.println("Tipo inválido");
                }
                c.remover(m);
                continue;
            }
            if (opc == 3){ //apresenta a listagem
                c.listagem();
                continue;
            }
            if (opc == 4){//Informa ao usuário a taxa de câmbio, chama o total Convertido e apresenta ao usuário
                System.out.println("TAXA DE CÂMBIO");
                System.out.println("1 Dólar = R$ 5,33");
                System.out.println("1 Euro = R$ 6,19");
                System.out.println(" ");

                double  total = c.totalConvertido();
                System.out.printf("Total convertido: R$ %.2f", total);
                System.out.println(" ");
                continue;

            } if (opc == 0){ //encerra o programa
                System.out.println("Encerrando cofrinho...");
                break;
            }

        }


    }
}
