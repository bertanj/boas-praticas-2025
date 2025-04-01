package SSolid.Exemplo2;

import java.io.*;
import java.util.Scanner;

public class ProcessadorEncomendas {

    public void processar(Encomenda encomenda) {
        try (Scanner sc = new Scanner(System.in)) {
            String idEncomenda = encomenda.getIdEncomenda();

            double peso = encomenda.getPeso();


            System.out.println("Valor do frete calculado: " + encomenda.getValorFrete());

            SaveArquivo.salvarEmArquivo(idEncomenda, encomenda.getValorFrete());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
