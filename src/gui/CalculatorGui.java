package gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

import listener.ButtonListener;

import javax.swing.JLabel;

public class CalculatorGui {

	private JFrame frame;
	private JTextField textField;
	ButtonListener listener = new ButtonListener();
	

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
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 224, 356);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		
		JButton button = new JButton("7");
		button.setBounds(10, 119, 47, 40);
		getFrame().getContentPane().add(button);
		button.addActionListener(listener);
		
		JButton button_1 = new JButton("8");
		button_1.setBounds(59, 119, 47, 40);
		getFrame().getContentPane().add(button_1);
		button_1.addActionListener(listener);
		
		JButton button_2 = new JButton("9");
		button_2.setBounds(108, 119, 47, 40);
		getFrame().getContentPane().add(button_2);
		button_2.addActionListener(listener);
		
		JButton button_3 = new JButton("4");
		button_3.setBounds(10, 170, 47, 40);
		getFrame().getContentPane().add(button_3);
		button_3.addActionListener(listener);
		
		JButton button_4 = new JButton("5");
		button_4.setBounds(59, 170, 47, 40);
		getFrame().getContentPane().add(button_4);
		button_4.addActionListener(listener);
		
		JButton button_5 = new JButton("6");
		button_5.setBounds(108, 170, 47, 40);
		getFrame().getContentPane().add(button_5);
		button_5.addActionListener(listener);
		
		JButton button_6 = new JButton("1");
		button_6.setBounds(10, 221, 47, 40);
		getFrame().getContentPane().add(button_6);
		button_6.addActionListener(listener);
		
		JButton button_7 = new JButton("2");
		button_7.setBounds(59, 221, 47, 40);
		getFrame().getContentPane().add(button_7);
		button_7.addActionListener(listener);
		
		JButton button_8 = new JButton("3");
		button_8.setBounds(108, 221, 47, 40);
		getFrame().getContentPane().add(button_8);
		button_8.addActionListener(listener);
		
		JButton button_9 = new JButton("/");
		button_9.setBounds(156, 68, 47, 40);
		getFrame().getContentPane().add(button_9);
		button_9.addActionListener(listener);
		
		JButton button_10 = new JButton("*");
		button_10.setBounds(156, 119, 47, 40);
		getFrame().getContentPane().add(button_10);
		button_10.addActionListener(listener);
		
		JButton button_11 = new JButton("-");
		button_11.setBounds(156, 170, 47, 40);
		getFrame().getContentPane().add(button_11);
		button_11.addActionListener(listener);
		
		JButton button_12 = new JButton("+");
		button_12.setBounds(156, 221, 47, 40);
		getFrame().getContentPane().add(button_12);
		button_12.addActionListener(listener);
		
		JButton button_13 = new JButton("0");
		button_13.setBounds(59, 272, 47, 40);
		getFrame().getContentPane().add(button_13);
		button_13.addActionListener(listener);
		
		JButton button_14 = new JButton("-");
		button_14.setBounds(10, 272, 47, 40);
		getFrame().getContentPane().add(button_14);
		button_14.addActionListener(listener);
		
		JButton button_15 = new JButton(",");
		button_15.setBounds(108, 272, 47, 40);
		getFrame().getContentPane().add(button_15);
		button_15.addActionListener(listener);
		
		JButton btnCe = new JButton("CE");
		btnCe.setBounds(10, 68, 47, 40);
		getFrame().getContentPane().add(btnCe);
		btnCe.addActionListener(listener);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(59, 68, 47, 40);
		getFrame().getContentPane().add(btnC);
		btnC.addActionListener(listener);
		
		JButton btnDel = new JButton("Del");
		btnDel.setBounds(108, 68, 47, 40);
		getFrame().getContentPane().add(btnDel);
		btnDel.addActionListener(listener);
		
		JButton button_16 = new JButton("=");
		button_16.setBounds(156, 272, 47, 40);
		getFrame().getContentPane().add(button_16);
		button_16.addActionListener(listener);
		
		textField = new JTextField();
		textField.setBounds(10, 32, 193, 20);
		getFrame().getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 11, 192, 14);
		getFrame().getContentPane().add(label);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
