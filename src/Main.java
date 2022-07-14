import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Adicao adicao = new Adicao(2,2);
        Subtracao subtracao = new Subtracao(5,3);

        calculadora.armazenar(adicao);
        calculadora.armazenar(subtracao);

        List<Operacao> operacoes = calculadora.getOperacaos();

        System.out.println("Historico de operações");
        for (Operacao operacao: operacoes) {
            System.out.println(operacao);
        }
    }
}

