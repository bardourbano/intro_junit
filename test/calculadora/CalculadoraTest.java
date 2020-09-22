package calculadora;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Classe para teste da calculadora")
public class CalculadoraTest {
	
	private Calculadora calc;
	
	@BeforeEach
	public void inicializa() {
		calc = new Calculadora();
	}
	
	@DisplayName("Testa a soma de dois números")
	@Test
	public void testSomaDoisNumeros() {
		int soma = calc.soma(4, 5);		
		Assertions.assertEquals(9, soma);		
	}

	@Test
	public void testSomaComNumeroNegativo() {
		int soma = calc.soma(4, -5);
		assertTrue(soma == -1);
	}
	
	@Test
	public void testDivisaoDoisNumeros() {
		int divisao = calc.divisao(8, 4);
		assertTrue(divisao == 2);
	}
	
	@Test
	public void testDivisaoPorZero() {
		try {
			int divisao = calc.divisao(8, 0);
			fail("Exceção não lançada");
		}catch (ArithmeticException e) {
			assertEquals("/ by zero", e.getMessage());
		}		
	}
	
	@Test
	public void testDivisaoPorZeroComAssertThrows() {
		assertThrows(ArithmeticException.class,
				() -> calc.divisao(8, 0));
	}

	@Test
	public void testDivisaoDeNumeroNegativo() {
		int divisao = calc.divisao(-4, 2);
		assertTrue(divisao == -2);
	}

	@Test
	public void testDivisaoPorNumeroNegativo() {
		int divisao = calc.divisao(4, -2);
		assertTrue(divisao == -2);
	}

	@Test void testDivisaoDeNumerosNegativos() {
		int divisao = calc.divisao(-4, -2);
		assertTrue(divisao == 2);
	}

	@Test
	public void testSubtraiDoisNumeros() {
		int subtracao = calc.subtracao(8, 4);
		assertTrue(subtracao == 4);
	}

	@Test
	public void testSubtraiDoisNumerosComResultadoNegativo() {
		int subtracao = calc.subtracao(4, 8);
		assertTrue(subtracao == -4);
	}

	@Test
	public void testSubtraiNumerosNegativos() {
		int subtracao = calc.subtracao(-4, -4);
		assertTrue(subtracao == 0);
	}

	@Test
	public void testMultiplicaDoisNumeros() {
		int multiplacao = calc.multiplicacao(2, 5);
		assertTrue(multiplacao == 10);
	}

	@Test
	public void testMultiplicaPorZero() {
		int multiplicacao = calc.multiplicacao(2, 0);
		assertTrue(multiplicacao == 0);
	}

	@Test
	public void testMultiplicaPorNumeroNegativo() {
		int multiplicacao = calc.multiplicacao(2, -5);
		assertTrue(multiplicacao == -10);
	}

	@Test
	public void testMultiplicaNumerosNegativos() {
		int multiplicacao = calc.multiplicacao(-2, -5);
		assertTrue(multiplicacao == 10);
	}

	@Test
	public void testSomatorio() {
		int somatorio = calc.somatoria(3);
		assertTrue(somatorio == 6);
	}

	@Test
	public void testSomatorioDeZero() {
		int somatorio = calc.somatoria(0);
		assertTrue(somatorio == 0);
	}

	@Test
	public void testSomatórioNegativo() {
		int somatorio = calc.somatoria(-3);
		assertTrue(somatorio == -6);
	}

	@Test
	public void testPositivoComNumeroPositivo() {
		boolean positivo = calc.ehPositivo(1);
		assertTrue(positivo);
	}

	@Test
	public void testPositivoComNumeroNegativo() {
		boolean positivo = calc.ehPositivo(-1);
		assertFalse(positivo);
	}

	@Test
	public void testPositivoComZero() {
		boolean positivo = calc.ehPositivo(0);
		assertTrue(positivo);
	}

	@Test
	public void testComparaNumerosIguais() {
		int comparacao = calc.compara(1, 1);
		assertTrue(comparacao == 0);
	}

	@Test
	public void testComparaMenorComMaior() {
		int comparacao = calc.compara(-1, 1);
		assertTrue(comparacao == -1);
	}

	@Test
	public void testComparaMaiorComMenor() {
		int comparacao = calc.compara(2, 1);
		assertTrue(comparacao == 1);
	}
}
