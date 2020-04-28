import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Calculator_gui {

	protected static final AbstractButton txtDisplay = null;
	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator_gui window = new Calculator_gui();
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
	public Calculator_gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 329, 533);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Code a=new Code();
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 29));
		textField.setBounds(9, 13, 289, 130);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String EnterNumber=textField.getText()+btn8.getText();
				textField.setText(EnterNumber);
			
			}
		});
		
		JButton btnBackward = new JButton("<");
		btnBackward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=textField.getText()+btnBackward.getText();
				textField.setText(EnterNumber);
			}
		});
		btnBackward.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnBackward.setBounds(9, 172, 61, 51);
		frame.getContentPane().add(btnBackward);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String EnterNumber=textField.getText()+btn7.getText();
				textField.setText(EnterNumber);				
			}
		});
		
		JButton btnForward = new JButton(">");
		btnForward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=textField.getText()+btnForward.getText();
				textField.setText(EnterNumber);
			}
		});
		btnForward.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnForward.setBounds(82, 172, 61, 51);
		frame.getContentPane().add(btnForward);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				a.setNum1(Integer.parseInt(textField.getText()));
				
				String EnterNumber=textField.getText()+btnAdd.getText();
				
						//a.setNum2(Integer.parseInt(textField.getText()));
				
				textField.setText(EnterNumber);
				
				
				a.setOperation('+');
				
			

		//	JOptionPane.showMessageDialog(null, "test");;
			}
		});
		
		JButton btnDelete = new JButton("AC");
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=textField.getText()+btnDelete.getText();
				textField.setText(null);
			}
		});
		btnDelete.setBounds(155, 172, 61, 51);
		frame.getContentPane().add(btnDelete);
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAdd.setBounds(228, 172, 70, 51);
		frame.getContentPane().add(btnAdd);
		btn7.setForeground(Color.BLACK);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(9, 236, 61, 51);
		frame.getContentPane().add(btn7);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(82, 236, 61, 51);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber=textField.getText()+btn9.getText();
				textField.setText(EnterNumber);
				
				
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(155, 236, 61, 51);
		frame.getContentPane().add(btn9);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=textField.getText()+btnSub.getText();
				a.setNum1(Integer.parseInt(textField.getText()));
				textField.setText(EnterNumber);
				a.setOperation('-');
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSub.setBounds(228, 236, 70, 51);
		frame.getContentPane().add(btnSub);
		
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		 
				String EnterNumber=textField.getText()+btn4.getText();
				textField.setText(EnterNumber);
				
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(9, 300, 61, 51);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=textField.getText()+btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(82, 300, 61, 51);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=textField.getText()+btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(155, 300, 61, 51);
		frame.getContentPane().add(btn6);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber=textField.getText()+btnMultiply.getText();
				a.setNum1(Integer.parseInt(textField.getText()));
				textField.setText(EnterNumber);
				a.setOperation('*');
			}
		});
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMultiply.setBounds(228, 300, 70, 51);
		frame.getContentPane().add(btnMultiply);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String EnterNumber=textField.getText()+btn1.getText();
				textField.setText(EnterNumber);
			   
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(9, 366, 61, 47);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=textField.getText()+btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setBounds(82, 366, 61, 47);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=textField.getText()+btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(155, 366, 61, 47);
		frame.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				String EnterNumber=textField.getText()+btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=textField.getText()+btnDivide.getText();
				a.setNum1(Integer.parseInt(textField.getText()));
				textField.setText(EnterNumber);
				a.setOperation('/');
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDivide.setBounds(228, 364, 70, 51);
		frame.getContentPane().add(btnDivide);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(9, 426, 61, 47);
		frame.getContentPane().add(btn0);
		
		JButton btnDecimal = new JButton(".");
		btnDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=textField.getText()+btnDecimal.getText();
				textField.setText(EnterNumber);
			}
		});
		btnDecimal.setFont(new Font("Tahoma", Font.BOLD, 27));
		btnDecimal.setBounds(82, 426, 61, 47);
		frame.getContentPane().add(btnDecimal);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {				
				
				
				//String EnterNumber=textField.getText()+btnEqual.getText();
         		//textField.setText(EnterNumber);
         		
         		String text=textField.getText();
         		int num2=Integer.parseInt(text.substring(text.indexOf(a.getOperation())+1));
				a.setNum2(num2);
         		
				textField.setText(a.Evaluation()+"");	

			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 38));
		btnEqual.setBounds(155, 422, 143, 51);
		frame.getContentPane().add(btnEqual);
		
		
}}