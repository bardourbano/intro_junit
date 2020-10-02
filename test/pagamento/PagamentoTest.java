package pagamento;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PagamentoTest {
    private Pagamento pagamento;

    @BeforeEach
    public void inicializa() {
        pagamento = new Pagamento(200.00, "01/01/2021", "BOLETO");
    }

    @Test
    public void testCriaPagamento() {
        assertAll(
                "pagamento",
                () -> assertEquals(200.00, pagamento.getValor()),
                () -> assertEquals("01/01/2021", pagamento.getData()),
                () -> assertEquals("BOLETO", pagamento.getTipo())
        );
    }
}
