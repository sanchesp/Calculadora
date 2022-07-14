public class Subtracao implements Operacao{

    private final double primeiroNumero;
    private final double segundoNumero;

    public Subtracao (double primeiroNumero, double segundoNumero) {
        this.primeiroNumero = primeiroNumero;
        this.segundoNumero = segundoNumero;
    }

    @Override
    public double calcular() {
        return primeiroNumero - segundoNumero;
    }
    @Override
    public String toString (){
        return primeiroNumero+" - "+ segundoNumero +" = " + calcular();
    }
}
