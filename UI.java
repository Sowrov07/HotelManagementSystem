import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class UI {
	
	UI(){
		Font F = new Font("Nirmala UI",(Font.BOLD), 20);
		JFrame frame1 = new JFrame();
		JPanel frame = new JPanel();
		ImageIcon I = new ImageIcon("Logo.png");
		frame1.setIconImage(I.getImage());
		frame1.setBounds(500,150,600,550);
		frame1.setTitle("Login");
		frame1.getContentPane().setBackground(Color.gray);
		
		
		JLabel L1 = new JLabel("Username:");
		L1.setBounds(50,80,110,30);
		L1.setFont(F);
		L1.setOpaque(true);
		L1.setBackground(Color.blue);
		frame.add(L1);
		
		JLabel L2 = new JLabel("Password:");
		L2.setBounds(50,115,110,30);
		L2.setFont(F);
		L2.setOpaque(true);
		L2.setBackground(Color.blue);
		frame.add(L2);
		
		JTextField T1 = new JTextField();
		T1.setHorizontalAlignment(JTextField.CENTER);
		T1.setBounds(170,80,110,30);
		frame.add(T1);
		JPasswordField JP1 = new JPasswordField();
		JP1.setHorizontalAlignment(JPasswordField.CENTER);
		JP1.setEchoChar('*');
	
		JP1.setBounds(170,115,110,30);
		frame.add(JP1);
		
		
		
		
		
		
		frame.setLayout(null);
		
		
		JButton B1 = new JButton("Login");
		B1.setBounds(50,150,110,30);
		B1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String username = T1.getText();
				String password = JP1.getText();
				if(username.equalsIgnoreCase("Hello")&&password.equalsIgnoreCase("Password"))
				{
					JOptionPane.showMessageDialog(null, "Log in Successful");
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Username or password");
				}
				
			}
			
		});
		frame.add(B1);	
		
		JButton B2 = new JButton("Clear");
		B2.setBounds(170,150,110,30);
		B2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				T1.setText("");
				JP1.setText("");
				
			}
			
		});
		frame.add(B2);		
		
		
		
		
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.add(frame);
		frame1.setVisible(true);
	}
	public static void main(String[] args) {
		UI I = new UI();
	}

}
