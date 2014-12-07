package connectFive;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		Login login=new Login();
		login.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		login.setSize(360,640);
		login.setResizable(false);
		login.setVisible(true);
	}
}