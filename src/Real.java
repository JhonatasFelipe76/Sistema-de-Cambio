public class Real extends Moeda{
    //construtor
    public Real(double valor) {
        super(valor);
        setValor(valor);
    }

    @Override
    public String info() {//apresenta o valor na lista
        return "Real - R$ " + this.getValor();
    }

    @Override
    public Double converter(){ //Apresenta o próprio real
        return this.getValor();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Moeda moeda = (Moeda) o;
        return Double.compare(valor, moeda.valor) == 0;
    }


}
