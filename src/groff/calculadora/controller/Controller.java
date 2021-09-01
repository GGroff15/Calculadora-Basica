package groff.calculadora.controller;

import java.util.ArrayList;
import java.util.List;

import groff.calculadora.service.Calculadora;

public class Controller {

	private List<Integer> numeros;
	private Calculadora calculadora;
	
	public Controller() {
		numeros = new ArrayList<>();
	}
	
	public void adicionarElemento(int numero) {
		this.numeros.add(numero);
	}

	public int somar() {
		calculadora = new Calculadora(numeros);
		return calculadora.somar();
	}

	public Integer subtrair() {
		calculadora = new Calculadora(numeros);
		return calculadora.subtrair();
	}

	public Integer multiplicar() {
		calculadora = new Calculadora(numeros);
		return calculadora.multiplicar();
	}

	public Integer dividir() {
		calculadora = new Calculadora(numeros);
		return calculadora.dividir();
	}
	
}
