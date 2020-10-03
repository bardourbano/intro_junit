package pagamento;

import boleto.Boleto;
import fatura.Fatura;

import java.util.ArrayList;

public class ProcessadorPagamento {

    public static void pagar(Fatura fatura, ArrayList<Boleto> boletos) {
        for (Boleto boleto : boletos) {
            fatura.addPagamento(
                    new Pagamento(boleto.getValor(), boleto.getData(), "BOLETO")
            );
        }
    }

    public static boolean getFaturaPaga(Fatura fatura) {
        double total_pago = 0.00;

        for (Pagamento pagamento : fatura.getPagamentos()) {
            total_pago += pagamento.getValor();
        }

        return total_pago >= fatura.getTotal();
    }
}
