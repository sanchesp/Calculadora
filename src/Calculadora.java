import java.util.ArrayList;
import java.util.List;

public class Calculadora {

    private List<Operacao> operacaos = new ArrayList<>();


    public List<Operacao> getOperacaos() {
        return operacaos;
    }

    public double armazenar(Operacao operacao) {
        operacaos.add(operacao);
        return operacao.calcular();
    }

}
