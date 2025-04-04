package OSolid.Exemplo2;

public class SistemaPagamento {

    public double pagar(double valor, IConcluirPagamento concluirPagamento) {
        return concluirPagamento.realizarPagamento(valor);
    }
    
    
}
