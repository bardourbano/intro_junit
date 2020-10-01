package fatura;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

public class FaturaTest {
    private Fatura fatura;

    @BeforeEach
    public void inicializa() {
        this.fatura = new Fatura("01/01/2020", 500.00, "Fulano de Tal");
    }

    public void testCriaFatura() {
        assertAll(
                "fatura",
                () -> assertEquals("01/01/2020", fatura.getData()),
                () -> assertEquals(500.00, fatura.getTotal()),
                () -> assertEquals("Fulano de Tal", fatura.getCliente())
        );
    }
}


