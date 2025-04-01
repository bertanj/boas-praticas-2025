package SSolid.Exemplo2;

public class MainEncomendas {
    public static void main(String[] args) {
        ProcessadorEncomendas processadorEncomendas = new ProcessadorEncomendas();
        Encomenda encomenda = new Encomenda("1234", 5);

        processadorEncomendas.processar(encomenda);
    }

}
