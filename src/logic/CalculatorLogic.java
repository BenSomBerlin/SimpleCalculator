package logic;

public class CalculatorLogic {
	String nextCalcAction = "";
	String currentDezimal = "";
	String currentSum = "";

	public String getNextCalcAction() {
		return nextCalcAction;
	}

	public void setNextCalcAction(String nextCalcAction) {
		this.nextCalcAction = nextCalcAction;
	}

	public double getCurrentDezimal() {
		return Double.parseDouble(currentDezimal);
	}

	public void addCurrentDezimal(String currentDezimal) {
		this.currentDezimal += currentDezimal;
	}

	public double calculate() {
		double term1 = Double.parseDouble(currentSum);
		double term2 = Double.parseDouble(currentDezimal);
		double result = 0.0;
		switch (nextCalcAction) {
		case "+":
			result = term1+term2;
			break;
		case "-":
			result = term1-term2;
			break;
		case "*":
			result = term1*term2;
			break;
		case "/":
			result = term1/term2;
			break;
		case "=":
			result = term1; 
			break;
		default:
			System.out.println("This shouldn't happen");
			break;
		}
		currentSum = ""+result;
		return result;
	}
}
