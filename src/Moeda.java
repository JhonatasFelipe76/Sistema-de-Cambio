import java.util.Objects;
public abstract class Moeda {
    //Atributos
    protected double valor;
    protected Moeda(double valor) {
    }
    //Métodos
    public abstract String info(); //serve para ser implementado na lista
    public abstract Double converter();//converte para real

    //Métodos Especiais
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    @Override
    public boolean equals(Object o) { //compara o valor para indicar qual moeda ele deve remover
        if (o == null || getClass() != o.getClass()) return false;
        Moeda moeda = (Moeda) o;
        return Double.compare(valor, moeda.valor) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(valor);
    }
}
