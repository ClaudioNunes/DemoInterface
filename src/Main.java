

public class Main {
    public static void main(String[] args) {
        IOperacao vivian = new Multiplicacao();
        Calculadora calculadora = new Calculadora(vivian);

        int r = calculadora.OperacaoMatematica(5,3);
        System.out.println(String.format("Resultado da Operacao: %d",r));

    }
}