import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class CalculatorGui {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGui window = new CalculatorGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 224, 356);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("7");
		button.setBounds(10, 119, 47, 40);
		frame.getContentPane().add(button);
		button.addActionListener(null);
		
		JButton button_1 = new JButton("8");
		button_1.setBounds(59, 119, 47, 40);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("9");
		button_2.setBounds(108, 119, 47, 40);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.setBounds(10, 170, 47, 40);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.setBounds(59, 170, 47, 40);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.setBounds(108, 170, 47, 40);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("1");
		button_6.setBounds(10, 221, 47, 40);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("2");
		button_7.setBounds(59, 221, 47, 40);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("3");
		button_8.setBounds(108, 221, 47, 40);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("/");
		button_9.setBounds(156, 68, 47, 40);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("*");
		button_10.setBounds(156, 119, 47, 40);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("-");
		button_11.setBounds(156, 170, 47, 40);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("+");
		button_12.setBounds(156, 221, 47, 40);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("0");
		button_13.setBounds(59, 272, 47, 40);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("-");
		button_14.setBounds(10, 272, 47, 40);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton(",");
		button_15.setBounds(108, 272, 47, 40);
		frame.getContentPane().add(button_15);
		
		JButton btnCe = new JButton("CE");
		btnCe.setBounds(10, 68, 47, 40);
		frame.getContentPane().add(btnCe);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(59, 68, 47, 40);
		frame.getContentPane().add(btnC);
		
		JButton btnDel = new JButton("Del");
		btnDel.setBounds(108, 68, 47, 40);
		frame.getContentPane().add(btnDel);
		
		JButton button_16 = new JButton("=");
		button_16.setBounds(156, 272, 47, 40);
		frame.getContentPane().add(button_16);
		
		textField = new JTextField();
		textField.setBounds(10, 32, 193, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 11, 192, 14);
		frame.getContentPane().add(label);
	}
}
