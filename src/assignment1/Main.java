package assignment1;

import java.util.Scanner;

import assignment1.Interfaces.CalculatorFace;

public class Main implements CalculatorFace {
	int opr1;
	int opr2;

	public int getOpr1() {
		return opr1;
	}

	public void setOpr1(int opr1) {
		this.opr1 = opr1;
	}

	public int getOpr2() {
		return opr2;
	}

	public void setOpr2(int opr2) {
		this.opr2 = opr2;
	}

	public String getOpertors() {
		return opertors;
	}

	public void setOpertors(String opertors) {
		this.opertors = opertors;
	}

	String opertors;

	Main(int operand1, int operand2, String operator) {
		this.opr1 = operand1;
		this.opertors = operator;
		this.opr2 = operand2;
	}

	public int performCalculation(int operand1, int operand2, String operator, CalculatorFace calculator) {
		return obj.performCalculation(operand1, operand2, operator, calculator);
	}

	CalculatorFace obj = (int operand1, int operand2, String operator, CalculatorFace calculator) -> {
		switch (operator) {
		case "Addition":
			System.out.println( (getOpr1() + operand2));
		case "Subtraction":
			System.out.println( (getOpr1() - operand2));
		case "Multiplication":
			System.out.println( (getOpr1() * operand2));
		case "Division":
			System.out.println( (getOpr1() / operand2));
		}
		return 0;
	};

	public static void main(String[] s) {

		Scanner sc = new Scanner(System.in);
		int operand1 = sc.nextInt();
		int operand2 = sc.nextInt();
		String operator = sc.next();
		CalculatorFace calculator = new Main(operand1, operand2, operator);
		calculator.performCalculation(operand1, operand2, operator, calculator);
        
		sc.close();
	}

}