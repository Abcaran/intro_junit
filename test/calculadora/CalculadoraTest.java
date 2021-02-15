package calculadora;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe para teste da calculadora")
public class CalculadoraTest {
	
	private Calculadora calc;
	
	@BeforeEach
	public void inicializa() {
		calc = new Calculadora();
	}
	
	@DisplayName("Testa soma de dois n�meros")
	@Test
	public void testSomaDoisNumeros() {
		int soma = calc.soma(4, 5);		
		assertEquals(9, soma);		
	}
	
	@DisplayName("Testa divisão de dois n�meros")
	@Test
	public void testDivisaoDoisNumeros() {
		int divisao = calc.divisao(8, 4);
		assertEquals(2, divisao);
	}
	
//	@Test
//	public void testDivisaoPorZero() {
//		try {
//			int divisao = calc.divisao(8, 0);
//			fail("Exce��o n�o lan�ada");
//		}catch (ArithmeticException e) {
//			assertEquals("/ by zero", e.getMessage());
//		}		
//	}
	
	@DisplayName("Testa tratamento de erro em divisão por zero")
	@Test
	public void testDivisaoPorZeroComAssertThrows() {
		assertThrows(ArithmeticException.class,
				() -> calc.divisao(8, 0));
	}
	
	@DisplayName("Testa subtração de dois números")
	@Test
	public void testSubtraiDoisNumeros() {
		int sub = calc.subtracao(2, 4);	
		assertEquals(-2, sub);
	}

	@DisplayName("Testa multiplicação de dois números positivos")
	@Test
	public void testMultiplicaDoisNumerosPositivos() {
		int multi = calc.multiplicacao(5, 5);	
		assertEquals(25, multi);
	}

	@DisplayName("Testa multiplicação de dois números negativos")
	@Test
	public void testMultiplicaDoisNumerosNegativos() {
		int multi = calc.multiplicacao(-2, -5);	
		assertEquals(10, multi);
	}

	@DisplayName("Testa multiplicação de número positivo com negativo")
	@Test
	public void testMultiplicaDoisNumeros() {
		int multi = calc.multiplicacao(-3, 5);	
		assertEquals(-15, multi);
	}

	@DisplayName("Testa somatório de número positivo")
	@Test
	public void testSomatoriaPositivo() {
		int somatorio = calc.somatoria(5);	
		assertEquals(15, somatorio);
	}

	@DisplayName("Testa somatório de número negativo")
	@Test
	public void testSomatoriaNegaitivo() {
		int somatorio = calc.somatoria(-5);	
		assertEquals(0, somatorio);
	}

	@DisplayName("Testa número é positivo verdadeiro")
	@Test
	public void testEhPositivoVerdadeiro() {
		boolean ehPositivo = calc.ehPositivo(4);
		assertEquals(true, ehPositivo);
	}

	@DisplayName("Testa número ehPositivo falso")
	@Test
	public void testEhPositivoFalso() {
		boolean ehPositivo = calc.ehPositivo(-3);
		assertEquals(false, ehPositivo);
	}

	@DisplayName("Testa valores iguais")
	@Test
	public void testComparaIgual() {
		int comparacao = calc.compara(1, 1);
		assertEquals(0, comparacao);
	}

	@DisplayName("Testa valores a maior que b")
	@Test
	public void testComparaMaior() {
		int comparacao = calc.compara(2, 1);
		assertEquals(1, comparacao);
	}

	@DisplayName("Testa valores a menor que b")
	@Test
	public void testComparaMenor() {
		int comparacao = calc.compara(1, 2);
		assertEquals(-1, comparacao);
	}

}
