package io.github.joaomlneto.travis_ci_tutorial_java;

public class Driver {
	public static final void main(String[] args) {
		SimpleCalculator calculator = new SimpleCalculator();
		int x = 27;
		x = calculator.mul(x, 3);
		x = calculator.mul(x, 7);
		x = calculator.mul(x, 13);
		x = calculator.mul(x, 37);
		System.out.println(x);
	}
}
