package connectFive;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class MenuHandler extends JFrame {

	private JButton profile;
	private JButton entertainment;
	private JButton carpool;
	private JButton food;
	private JButton clubs;
	private JButton roommate;
	private JButton signout;
	private JLabel blank;
	private JLabel blank2;
	private JLabel blank3;
	private JLabel blank4;
	private JLabel message;
	private JLabel welcome;
	
	MenuHandler(){
		super("Main Menu");
		
		JPanel blankN = new JPanel(new GridLayout(10,0));
		blank = new JLabel("  ");
		blankN.add(blank);
		add(blankN, BorderLayout.NORTH);
	
		welcome = new JLabel("              "
				+ "                   Welcome to the main menu.");
		blankN.add(welcome);
		add(blankN, BorderLayout.NORTH);
		
		message = new JLabel("              "
				+ "                     Please make a selection!");
		blankN.add(message);
		add(blankN, BorderLayout.NORTH);
				
		JPanel blankE = new JPanel(new GridLayout(0,10));
		blank3 = new JLabel("   ");
		blankE.add(blank3);
		add(blankE, BorderLayout.EAST);
		
		JPanel blankW = new JPanel(new GridLayout(0,10));
		blank4 = new JLabel("   ");
		blankW.add(blank4);
		add(blankW, BorderLayout.WEST);
		
		JPanel menu = new JPanel(new GridLayout(9,0));
		profile = new JButton("Profile");
		menu.add(profile);
		add(menu, BorderLayout.CENTER);
		profile.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				profile profile1 = new profile();
				profile1.setSize(360,640);
				profile1.viewProfile();
				setVisible(false);
				profile1.setResizable(false);
				profile1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			}
		});
		
		
		entertainment = new JButton("Entertainment");
		menu.add(entertainment);
		add(menu, BorderLayout.CENTER);
		entertainment.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Entertainment ent = new Entertainment();
				ent.setSize(360,640);
				ent.setVisible(true);
				setVisible(false);
				ent.setResizable(false);
				ent.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			}
		});
		
		carpool = new JButton("Carpool");
		menu.add(carpool);
		add(menu, BorderLayout.CENTER);
		carpool.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Carpool carpool = new Carpool();
				carpool.setSize(360,640);
				carpool.setVisible(true);
				carpool.setResizable(false);
				setVisible(false);
				carpool.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			}
		});
		
		clubs = new JButton("RSO's");
		menu.add(clubs);
		add(menu, BorderLayout.CENTER);
		clubs.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				RSO clubs = new RSO();
				clubs.setSize(360,640);
				clubs.setVisible(true);
				clubs.setResizable(false);
				setVisible(false);
				clubs.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			}
		});
		
		food = new JButton("Restaurants");
		menu.add(food);
		add(menu, BorderLayout.CENTER);
		food.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Restaurant food = new Restaurant();
				food.setSize(360,640);
				food.setVisible(true);
				food.setResizable(false);
				setVisible(false);
				food.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			}
		});
		
		roommate = new JButton("Roommates");
		menu.add(roommate);
		add(menu, BorderLayout.CENTER);
		roommate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Roommate rm = new Roommate();
				rm.setSize(360,640);
				rm.setVisible(true);
				rm.setResizable(false);
				setVisible(false);
				rm.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			}
		});

		blank2 = new JLabel("  ");
		menu.add(blank2);
		add(menu, BorderLayout.CENTER);
		
		JPanel so = new JPanel();
		signout = new JButton("Sign out");
		so.add(signout);
		add(so, BorderLayout.SOUTH);
		signout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				LoginScreen login=new LoginScreen();
				login.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
				login.setSize(360,640);
				login.setResizable(false);
				setVisible(false);
				login.setVisible(true);
			}
		});
		
		this.setSize(360,640);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
