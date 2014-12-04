package connectFive;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class LoginScreen extends JFrame {

	private JButton login;
	private JButton signUp;
	private JTextField username;
	private JPasswordField password;
	private String empty;
	
	LoginScreen() {
		super("Welcome to Connect Five!");
		
		this.setLayout(null);
		
		//east
		JPanel eastBlank = new JPanel(new GridLayout (30,1));
		eastBlank.setOpaque(false);
		eastBlank.setLayout(null);
		eastBlank.setBounds(0, 0, 360, 640);
		this.add(eastBlank);
		
		username = new JTextField();
		username.setText("Username");
		username.setBounds(50, 100, 260, 50);
		eastBlank.add(username);
		
		password = new JPasswordField();
		password.setText("password");
		password.setBounds(50, 175, 260, 50);
		eastBlank.add(password);
		
		
		login = new JButton("Login");
		login.setBounds(50, 570, 100, 40);
		eastBlank.add(login);
		login.addActionListener(new ActionListener(){
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e){
				// this is where the username and password
				// need to be verified with the DB
				
				if(username.getText().isEmpty() || password.getText().isEmpty()) {	
					JOptionPane.showMessageDialog(LoginScreen.this, String.format("Please "
							+ "enter your username and password.", e.getActionCommand()));
					username.setText(empty);
					password.setText(empty);
				}else {
					MenuHandler menu = new MenuHandler();
					menu.setSize(360,640);
					menu.setVisible(true);
					setVisible(false);	
				}
			}
		});
		
		signUp = new JButton("Sign Up");
		signUp.setBounds(210, 570, 100, 40);
		eastBlank.add(signUp);
		signUp.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ProfileRev pro = new ProfileRev();
				pro.setSize(360,640);
				pro.setVisible(true);
				setVisible(false);
				pro.setResizable(false);
			}
		});
		
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon("imgs/background6.png"));
		background.setBounds(0,0,360,640);
		this.add(background);
	}

}
