package boleto;

public class Boleto {

    private double valor;
    private String codigo;
    private String data;

    public Boleto(String codigo, String data, double valor) {
        this.codigo = codigo;
        this.data = data;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getData() {
        return data;
    }
}
