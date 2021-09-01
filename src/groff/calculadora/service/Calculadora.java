package groff.calculadora.service;

import java.util.List;

public class Calculadora {

	private List<Integer> valores;
	
	public Calculadora(List<Integer> numeros) {
		this.valores = numeros;
	}

	public Integer somar() {
		int resultado = 0;
		for (Integer valor : valores) {
			resultado += valor;
		}
		return resultado;
	}

	public Integer subtrair() {
		int resultado = obterValor(0);
		for (int i = 1; i < valores.size(); i++) {
			resultado -= obterValor(i);
		}
		return resultado;
	}

	public Integer multiplicar() {
		int resultado = 1;
		for (Integer valor : valores) {
			resultado *= valor;
		}
		return resultado;
	}

	public Integer dividir() {
		int resultado = 0;
		if (naoContemZero()) {
			resultado = calcularDivisao();
		}
		return resultado;
	}

	private boolean naoContemZero() {
		return !valores.contains(0);
	}

	private int calcularDivisao() {
		int resultado;
		resultado = obterValor(0);
		resultado = dividirValores(resultado);
		return resultado;
	}

	private Integer obterValor(int indice) {
		return valores.get(indice);
	}

	private int dividirValores(int resultado) {
		for (int i = 1; i < valores.size(); i++) {
			resultado /= obterValor(i);
		}
		return resultado;
	}

}
