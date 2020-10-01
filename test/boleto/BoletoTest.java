package boleto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoletoTest {

    private Boleto boleto;

    @BeforeEach
    public void inicializa() {
        boleto = new Boleto("12345678901357902468", "01/01/2021", 250.00);
    }

    @Test
    public void testCriaBoleto() {
        assertAll(
                "boleto",
                () -> assertEquals("12345678901357902468", boleto.getCodigo()),
                () -> assertEquals("01/01/2021", boleto.getData()),
                () -> assertEquals(250.00, boleto.getValor())
        );
    }
}
