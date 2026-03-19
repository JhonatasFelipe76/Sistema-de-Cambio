public class Euro extends Moeda{
    //construtor
    public Euro(double valor) {
        super(valor);
        setValor(valor);
    }

    @Override
    public String info(){//apresenta o valor na lista
        return "Euro - " + this.getValor() + " €";
    }

    @Override
    public Double converter(){ //converte o euro com base na cotação
      return this.getValor() * 6.19;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Moeda moeda = (Moeda) o;
        return Double.compare(valor, moeda.valor) == 0;
    }

}
