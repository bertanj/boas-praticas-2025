package OSolid.Exemplo2;

public class MainPagamento {
    SistemaPagamento sistemaPagamento = new SistemaPagamento();
    public static void main(String[] args) {
        SistemaPagamento sistemaPagamento = new SistemaPagamento();
        System.out.println(sistemaPagamento.pagar(45, new PagamentoBoleto()));
        System.out.println(sistemaPagamento.pagar(56, new PagamentoCartao()));
        System.out.println(sistemaPagamento.pagar(87, new PagamentoPix()));
    }

}
