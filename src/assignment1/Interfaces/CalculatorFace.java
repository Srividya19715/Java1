package assignment1.Interfaces;

public interface CalculatorFace {
	 default int calculate(int operand1, int operand2, String operator) {
		return operand2;
		 
	 }

	public int performCalculation(int operand1, int operand2, String operator, CalculatorFace calculator);

}
