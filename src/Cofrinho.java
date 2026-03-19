
import java.security.SecureRandom;
import java.util.ArrayList;

public class Cofrinho {
    //Atributos
    private double valor;
    private ArrayList<Moeda> listaMoedas = new ArrayList<>();

    //Métodos
    public void adicionar(Moeda addValor) { //adiciona o valor na lista
        listaMoedas.add(addValor);

    }

    public void remover(Moeda rmvValor) {//remove o valor da lista
        listaMoedas.remove(rmvValor);

    }

    public String listagem() { // cria um loop que incrementa e apresenta a lista
        for (int i = 0; i < listaMoedas.size(); i++) {
            System.out.println((i + 1) + " " + listaMoedas.get(i).info());
        }
        return "";




    }

     public float totalConvertido() { // faz o calculo para converter a moeda
         float total = 0;
         for (Moeda m : listaMoedas) {
             total += m.converter();
         }
         return total;

     }
     //Métodos especiais

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ArrayList<Moeda> getListaMoedas() {
        return listaMoedas;
    }

    public void setListaMoedas(ArrayList<Moeda> listaMoedas) {
        this.listaMoedas = listaMoedas;
    }
}


