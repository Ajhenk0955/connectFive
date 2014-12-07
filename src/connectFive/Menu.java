package connectFive;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Menu extends JFrame {

	private JButton profile;
	private JButton entertainment;
	private JButton carpool;
	private JButton food;
	private JButton clubs;
	private JButton roommate;
	private JButton signout;	
	
	Menu(){
		super("Main Menu");
		
		this.setLayout(null);
				
		// east panel
		JPanel buttonPanel = new JPanel();
		buttonPanel.setOpaque(false);
		buttonPanel.setBounds(0, 0, 360, 640);
		buttonPanel.setLayout(null);
		add(buttonPanel);
		
		profile = new JButton("Profile");
		buttonPanel.add(profile);
		profile.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Profile profile1 = new Profile();
				profile1.setSize(360,655);
				profile1.viewProfile();
				setVisible(false);
				profile1.setResizable(false);
				profile1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			}
		});
		profile.setBounds(94, 253, 171, 50);
		profile.setIcon(new ImageIcon("imgs/roundButton.png"));
		
		entertainment = new JButton("Entertainment");
		buttonPanel.add(entertainment);
		entertainment.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Entertainment ent = new Entertainment();
				ent.setSize(360,655);
				ent.setVisible(true);
				setVisible(false);
				ent.setResizable(false);
				ent.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			}
		});
		entertainment.setBounds(94, 306, 171, 50);
		entertainment.setIcon(new ImageIcon("imgs/circleButton.png"));
				
		carpool = new JButton("Carpool");
		buttonPanel.add(carpool);
		carpool.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Carpool carpool = new Carpool();
				carpool.setSize(360,655);
				carpool.setVisible(true);
				carpool.setResizable(false);
				setVisible(false);
				carpool.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			}
		});
		carpool.setBounds(94, 359, 171, 50);
		carpool.setIcon(new ImageIcon("imgs/diamondButton.png"));
		
		clubs = new JButton("RSO's");
		buttonPanel.add(clubs);
		clubs.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				RSO clubs = new RSO();
				clubs.setSize(360,655);
				clubs.setVisible(true);
				clubs.setResizable(false);
				setVisible(false);
				clubs.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			}
		});
		clubs.setBounds(94, 412, 171, 50);
		clubs.setIcon(new ImageIcon("imgs/rayButton.png"));
		
		food = new JButton("Restaurants");
		buttonPanel.add(food);
		food.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Restaurant food = new Restaurant();
				food.setSize(360,655);
				food.setVisible(true);
				food.setResizable(false);
				setVisible(false);
				food.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			}
		});
		food.setBounds(94, 465, 171, 50);
		food.setIcon(new ImageIcon("imgs/squareButton.png"));
		
		roommate = new JButton("Roommates");
		buttonPanel.add(roommate);
		roommate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Roommate rm = new Roommate();
				rm.setSize(360,655);
				rm.setVisible(true);
				rm.setResizable(false);
				setVisible(false);
				rm.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			}
		});
		roommate.setBounds(94, 518, 171, 50);
		roommate.setIcon(new ImageIcon("imgs/TrangleButton.png"));

		// south panel
		JPanel so = new JPanel();
		signout = new JButton("Sign out");
		so.setOpaque(false);
		signout.setBounds(130, 570, 100, 40);
		buttonPanel.add(signout);
		signout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Login login = new Login();
				login.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
				login.setSize(360,640);
				login.setResizable(false);
				setVisible(false);
				login.setVisible(true);
			}
		});
		
		JLabel logo = new JLabel();
		logo.setIcon(new ImageIcon("imgs/connect5Logo.png"));
		logo.setBounds(80, 3, 200, 200);
		this.add(logo);
		
		
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon("imgs/background6.png"));
		background.setBounds(0, 0, 360, 640);
		this.add(background);
		
		this.setSize(360,640);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
