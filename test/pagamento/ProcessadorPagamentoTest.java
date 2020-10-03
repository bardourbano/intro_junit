package pagamento;

import boleto.Boleto;
import fatura.Fatura;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProcessadorPagamentoTest {

    private Fatura fatura;
    private ArrayList<Boleto> boletos;

    @BeforeEach
    public void inicializa() {
        this.fatura = new Fatura("01/01/2021", 750.00, "Fulano da Silva");
        this.boletos = new ArrayList<Boleto>();

        this.boletos.add(new Boleto("1234567890987654321", "01/01/2021", 250.00));
        this.boletos.add(new Boleto("0384628374859572516", "01/02/2021", 250.00));
        this.boletos.add(new Boleto("4628264618193736182", "01/03/2021", 250.00));
    }

    @Test
    public void testPagarBoleto() {
        ProcessadorPagamento.pagar(this.fatura, this.boletos);
        assertEquals(this.boletos.size(), this.fatura.getQuantidadePagamentos());
    }

}
