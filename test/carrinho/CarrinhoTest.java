package carrinho;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarrinhoTest {

    private Carrinho car;

    @BeforeEach
    public void initialize() {
        car = new Carrinho();
    }

    @Test
    public void testCarrinhoVazio() {
        assertEquals(0, car.getQtdeItems());
    }

    @Test
    public void testValorCarrinhoVazio() {
        assertTrue(car.getValorTotal() == 0.0);
    }
}
