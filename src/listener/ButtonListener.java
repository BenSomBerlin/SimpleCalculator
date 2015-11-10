package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonListener implements ActionListener {

	public ButtonListener() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String buttonText = ((JButton) e.getSource()).getText();

		if (!currentNr.contains(",") && buttonText.equals(",")) {
			currentNr += buttonText;
		}

		if (buttonText.equals("1") || buttonText.equals("2") || buttonText.equals("3") || buttonText.equals("4")
				|| buttonText.equals("5") || buttonText.equals("6") || buttonText.equals("7") || buttonText.equals("8")
				|| buttonText.equals("9") || buttonText.equals("0")) {

			currentNr += buttonText;
		}

		if (buttonText.equals("+") || buttonText.equals("-") || buttonText.equals("*") || buttonText.equals("*")) {
			nextCalcAction = buttonText;
		}

	}

}
