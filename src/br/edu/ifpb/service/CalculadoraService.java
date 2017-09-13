package br.edu.ifpb.service;

import br.edu.ifpb.model.Calculadora;
import br.edu.ifpb.model.Operacao;

public class CalculadoraService {

	public Double calcular(String op, Double num1, Double num2) {
		Calculadora c = new Calculadora();
		c.setNum1(num1);
		c.setNum2(num2);
		c.setOp(op);

		return getResultado(c);
	}

	private Double getResultado(Calculadora c) {
		Operacao opr = new Operacao();
		switch (c.getOp()) {
		case "+":
			return opr.soma(c.getNum1(), c.getNum2());
		case "-":
			return opr.sub(c.getNum1(), c.getNum2());
		case "d":
			return opr.div(c.getNum1(), c.getNum2());
		case "*":
			return opr.mult(c.getNum1(), c.getNum2());
		default:
			return -1D;
		}
	}
	
	public Double soma (Double num1, Double num2) {
		return new Operacao().soma(num1, num2);
	}
	
	public Double sub (Double num1, Double num2) {
		return new Operacao().sub(num1, num2);
	}
	
	public Double div (Double num1, Double num2) {
		return new Operacao().div(num1, num2);
	}
	
	public Double mult (Double num1, Double num2) {
		return new Operacao().mult(num1, num2);
	}
}
