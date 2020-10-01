package fatura;

public class Fatura {

    private String data;
    private double total;
    private String cliente;

    public Fatura(String data, double total, String cliente) {
        this.cliente = cliente;
        this.data = data;
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public String getCliente() {
        return cliente;
    }

    public String getData() {
        return data;
    }
}
