package teste.groff.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import groff.calculadora.service.Calculadora;

class TesteCalculadora {

	@Test
	void testSomar() {
		List<Integer> valores = new ArrayList<>();
		valores.add(1);
		valores.add(2);
		valores.add(3);
		Calculadora calculadora = new Calculadora(valores);
		assertEquals(6, calculadora.somar());
	}
	
	@Test
	void testSubtrair() {
		List<Integer> valores = new ArrayList<>();
		valores.add(3);
		valores.add(2);
		valores.add(1);
		Calculadora calculadora = new Calculadora(valores);
		assertEquals(0, calculadora.subtrair());
	}
	
	@Test
	void testMultiplicar() {
		List<Integer> valores = new ArrayList<>();
		valores.add(3);
		valores.add(2);
		valores.add(1);
		Calculadora calculadora = new Calculadora(valores);
		assertEquals(6, calculadora.multiplicar());
	}
	
	@Test
	void testMultiplicarZeros() {
		List<Integer> valores = new ArrayList<>();
		valores.add(3);
		valores.add(2);
		valores.add(0);
		Calculadora calculadora = new Calculadora(valores);
		assertEquals(0, calculadora.multiplicar());
	}
	
	@Test
	void testDividir() {
		List<Integer> valores = new ArrayList<>();
		valores.add(12);
		valores.add(3);
		valores.add(2);
		Calculadora calculadora = new Calculadora(valores);
		assertEquals(2, calculadora.dividir());
	}
	
	@Test
	void testDividirZeros() {
		List<Integer> valores = new ArrayList<>();
		valores.add(12);
		valores.add(3);
		valores.add(0);
		Calculadora calculadora = new Calculadora(valores);
		assertEquals(0, calculadora.dividir());
	}

}
