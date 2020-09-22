package carrinho;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import produto.Produto;
import produto.ProdutoNaoEncontradoException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarrinhoTest {

    private Carrinho car;
    private Produto pipoca;

    @BeforeEach
    public void initialize() {
        car = new Carrinho();
        pipoca = new Produto("pipoca", 5.00);
    }

    @Test
    public void testCarrinhoVazio() {
        assertEquals(0, car.getQtdeItems());
    }

    @Test
    public void testAdicionarItem() {
        car.addItem(pipoca);
        assertEquals(1, car.getQtdeItems());
    }

    @Test
    public void testRemoverItem() {
        car.addItem(pipoca);

        try {
            car.removeItem(pipoca);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            assertEquals(0, car.getQtdeItems());
        }
    }

    @Test
    public void testRemoverItemDeCarrainhoVazio() {
        assertThrows(
                ProdutoNaoEncontradoException.class,
                () -> car.removeItem(pipoca)
        );
    }

    @Test
    public void testValorCarrinhoVazio() {
        assertTrue(car.getValorTotal() == 0.0);
    }

    @Test
    public void testValorTotal() {
        car.addItem(pipoca);
        car.addItem(pipoca);
        assertTrue(car.getValorTotal() == 10);
    }
}
