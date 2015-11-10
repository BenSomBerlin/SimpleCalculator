
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

	public double calculate(){
		return 0.0;
	}
}
