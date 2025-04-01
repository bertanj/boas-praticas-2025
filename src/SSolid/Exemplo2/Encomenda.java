package SSolid.Exemplo2;

public class Encomenda {
    private String idEncomenda;
    private double peso;
    private double valorFrete;

    public Encomenda(String idEncomenda, double peso) {
        this.idEncomenda = idEncomenda;
        this.peso = peso;
        this.valorFrete = (getPeso() * 10);
    }

    public String getIdEncomenda() {
        return idEncomenda;
    }

    public void setIdEncomenda(String idEncomenda) {
        this.idEncomenda = idEncomenda;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }
}
