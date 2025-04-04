package OSolid.Exemplo2;

public class PagamentoBoleto implements  IConcluirPagamento {
    @Override
    public double realizarPagamento( double valor) {
        System.out.println("Pagamento realizado via boleto no valor de:");
        return valor;
    }
}
