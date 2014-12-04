package connectFive;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		LoginScreen login=new LoginScreen();
		login.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		login.setSize(360,640);
		login.setResizable(false);
		login.setVisible(true);
	}
}