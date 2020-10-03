package fatura;

import pagamento.Pagamento;

import java.util.ArrayList;

public class Fatura {

    private String data;
    private double total;
    private String cliente;
    private ArrayList<Pagamento> pagamentos;

    public Fatura(String data, double total, String cliente) {
        this.cliente = cliente;
        this.data = data;
        this.total = total;
        this.pagamentos = new ArrayList<>();
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

    public int getQuantidadePagamentos() {
        return pagamentos.size();
    }

    public void addPagamento(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
    }

    public boolean getStatusPagamento() {

        double total_pago = 0.00;

        for (Pagamento pagamento : this.pagamentos) {
            total_pago += pagamento.getValor();
        }

        return total_pago >= this.total;
    }
}
