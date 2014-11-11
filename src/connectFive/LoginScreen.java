package connectFive;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginScreen extends JFrame {

	private JButton login;
	private JButton signUp;
	private JTextField username;
	private JPasswordField password;
	private JLabel userLabel;
	private JLabel passLabel;
	private JLabel blank;
	private JLabel blank2;
	private JLabel blank3;
	private JLabel welcome;
	
	private String user;
	private String pass;
	private String empty;
	
	LoginScreen() {
		super("Welcome to Connect Five!");
		
		// north
		JPanel header = new JPanel(new GridLayout (10,1));
		welcome = new JLabel("                                     "
				+ "Welcome to Connect Five!");
		welcome.setForeground(Color.WHITE);
		header.add(welcome, BorderLayout.NORTH);
		header.setOpaque(true);
		header.setBackground(Color.BLACK);
		add(header, BorderLayout.NORTH);
		
		blank = new JLabel(" ");
		header.add(blank);
		add(header, BorderLayout.NORTH);
		
		// center
		JPanel panel = new JPanel(new GridLayout (25,1));
		username = new JTextField(user);
		panel.add(username);
		panel.setOpaque(true);
		panel.setBackground(Color.BLACK);
		add(panel, BorderLayout.CENTER);
		
		password = new JPasswordField(pass);
		panel.add(password);
		add(panel, BorderLayout.CENTER);
		
		blank3 = new JLabel("              ");
		panel.add(blank3);
		add(panel);
		
		// west
		JPanel westBlank = new JPanel(new GridLayout (25,1));
		userLabel = new JLabel("              Username: ");
		userLabel.setForeground(Color.WHITE);
		westBlank.add(userLabel);
		westBlank.setOpaque(true);
		westBlank.setBackground(Color.BLACK);
		add(westBlank, BorderLayout.WEST);
		
		passLabel = new JLabel("              Password: ");
		passLabel.setForeground(Color.WHITE);
		westBlank.add(passLabel);
		add(westBlank, BorderLayout.WEST);
		
		//east
		JPanel eastBlank = new JPanel(new GridLayout (30,1));
		blank = new JLabel("              ");
		eastBlank.add(blank);
		eastBlank.setOpaque(true);
		eastBlank.setBackground(Color.BLACK);
		add(eastBlank, BorderLayout.EAST);
		
		blank2 = new JLabel("              ");
		eastBlank.add(blank2);
		add(eastBlank, BorderLayout.EAST);
		
		// south
		JPanel loginPanel = new JPanel(new FlowLayout());
		login = new JButton("Login");
		loginPanel.add(login);
		loginPanel.setOpaque(true);
		loginPanel.setBackground(Color.BLACK);
		add(loginPanel, BorderLayout.SOUTH);
		login.addActionListener(new ActionListener(){
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
		loginPanel.add(signUp);
		add(loginPanel, BorderLayout.SOUTH);
		signUp.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				profile pro = new profile();
				pro.setSize(360,640);
				pro.setVisible(true);
				setVisible(false);
				pro.setResizable(false);
			}
		});
	}

}
