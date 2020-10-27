package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LambdaButtons{
	Random random;
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	JTextField field = new JTextField(20);
	JTextField field2 = new JTextField(20);
	JLabel label = new JLabel();
	
	public LambdaButtons() {
		random = new Random();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		window.add(field);
		window.add(field2);
		window.add(label);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		window.setVisible(true);
		window.pack();
		
		addNumbers.addActionListener((ActionEvent e) -> {
			label.setText(Integer.parseInt(field.getText()) + Integer.parseInt(field2.getText()) + "");
		});
		randNumber.addActionListener((ActionEvent e) -> {
			label.setText(random.nextInt() + "");
		});
		
		tellAJoke.addActionListener((ActionEvent e) -> {
			
			label.setText("Why don't scientists trust atoms? Because they make up everything!");
			
		});
		
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}

	
	
	
}
