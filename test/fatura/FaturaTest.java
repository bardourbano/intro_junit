package fatura;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FaturaTest {
    private Fatura fatura;

    @BeforeEach
    public void inicializa() {
        this.fatura = new Fatura("01/01/2020", 500.00, "Fulano de Tal");
    }

    @Test
    public void testCriaFatura() {
        assertAll(
                "fatura",
                () -> assertEquals("01/01/2020", fatura.getData()),
                () -> assertEquals(500.00, fatura.getTotal()),
                () -> assertEquals("Fulano de Tal", fatura.getCliente())
        );
    }

    @Test
    public void testQuantidadeDePagamento() {
        assertEquals(0, fatura.getQuantidadePagamentos());
    }
}