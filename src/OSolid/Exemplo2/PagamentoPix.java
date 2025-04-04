package OSolid.Exemplo2;

public class PagamentoPix implements  IConcluirPagamento{
    @Override
    public double realizarPagamento(double valor) {
        System.out.println("Pagamento realizado via Pix no valor de:");
        return valor;
    }
}
