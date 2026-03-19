
public class Dolar extends Moeda{
    //construtor
    public Dolar(double valor) {
        super(valor);
        setValor(valor);
    }

    @Override
    public String info(){ //apresenta o valor na lista
        return "Dólar - $ " + this.getValor();
    }

    @Override
    public Double converter(){//converte o dolar com base na cotação
        return this.getValor() * 5.33;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Moeda moeda = (Moeda) o;
        return Double.compare(valor, moeda.valor) == 0;
    }


}

