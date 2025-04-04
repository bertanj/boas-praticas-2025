package OSolid.Exemplo2;

public class PagamentoCartao implements  IConcluirPagamento{
    @Override
    public double realizarPagamento(double valor) {
        System.out.println("Pagamento realizado via cartão no valor de:");
        return valor;    }
}
