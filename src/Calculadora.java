public class Calculadora {
    private IOperacao operacao;

    int OperacaoMatematica (int a, int b)
    {
        return operacao.Operacao(a, b);
    }
    Calculadora(IOperacao oper)
    {
        this.operacao = oper;
    }
}


