package pagamento;

public class Pagamento {

    private double valor;
    private String data;
    private String tipo;

    public Pagamento(double valor, String data, String tipo) {
        this.data = data;
        this.tipo = tipo;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }

    public String getTipo() {
        return tipo;
    }
}
