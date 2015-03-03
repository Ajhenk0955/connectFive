package connectFive;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Login extends JFrame {

	// Adding a static database methods object here
	// that way we don't have to reinstantiate the object anywhere
	static DatabaseMethods publicData;
	private JButton login;
	private JButton signUp;
	private JTextField username;
	private JPasswordField password;
	private String empty;

	public static Profile pro; // changed

	Login() {
		super("Welcome to Connect Five!");

		// #####
		try {
			publicData = new DatabaseMethods();
		} catch (ClassNotFoundException e2) {
			System.out.println("can't connect to database");
			e2.printStackTrace();
		}
		this.setLayout(null);

		// east
		JPanel eastBlank = new JPanel(new GridLayout(30, 1));
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
		login.addActionListener(new ActionListener() {
			@SuppressWarnings({ "deprecation", "unused" })
			public void actionPerformed(ActionEvent e) {
				
				boolean userExists = false;

				if (username.getText().isEmpty()
						|| password.getText().isEmpty()
						|| username.getText().equals("Username")) {
					JOptionPane.showMessageDialog(
							Login.this,
							String.format("Please "
									+ "enter your username and password.",
									e.getActionCommand()));
					username.setText(empty);
					password.setText(empty);

				} else {
					// #####
					try {
						userExists = publicData.confirmUser(username.getText(),
								password.getPassword());
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
				// here you could insert a "wrong password" text
				if (userExists) {
					Profile pro = new Profile();
					Menu menu = new Menu();
					menu.setSize(360, 640);
					menu.setVisible(true);
					setVisible(false);
				}
			}
		});

		signUp = new JButton("Sign Up");
		signUp.setBounds(210, 570, 100, 40);
		eastBlank.add(signUp);
		signUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pro = new Profile(); // changed
				pro.setSize(360, 640);
				pro.setVisible(true);
				setVisible(false);
				pro.setResizable(false);
			}
		});

		JLabel background = new JLabel();
		background.setIcon(new ImageIcon("imgs/background6.png"));
		background.setBounds(0, 0, 360, 640);
		this.add(background);
	}

}
