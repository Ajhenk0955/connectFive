package connectFive;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		
		// north panel
		JPanel blankN = new JPanel(new GridLayout(10,0));
		blank = new JLabel("  ");
		blankN.add(blank);
		add(blankN, BorderLayout.NORTH);

		welcome = new JLabel("              "
				+ "                   Welcome to the main menu.");
		welcome.setForeground(Color.WHITE);
		blankN.add(welcome);
		blankN.setOpaque(true);
		blankN.setBackground(Color.BLACK);
		add(blankN, BorderLayout.NORTH);
		message = new JLabel("              "
				+ "                     Please make a selection!");
		message.setForeground(Color.WHITE);
		blankN.add(message);
		add(blankN, BorderLayout.NORTH);
				
		// east panel
		JPanel blankE = new JPanel(new GridLayout(0,10));
		blank3 = new JLabel("   ");
		blankE.setOpaque(true);
		blankE.setBackground(Color.BLACK);
		blankE.add(blank3);
		add(blankE, BorderLayout.EAST);
		
		// west panel
		JPanel blankW = new JPanel(new GridLayout(0,10));
		blank4 = new JLabel("   ");
		blankW.setOpaque(true);
		blankW.setBackground(Color.BLACK);
		blankW.add(blank4);
		add(blankW, BorderLayout.WEST);
		
		// center panel
		JPanel menu = new JPanel(new GridLayout(9,0));
		profile = new JButton("Profile");
		menu.setOpaque(true);
		menu.setBackground(Color.BLACK);
		
		try {
            Image img = ImageIO.read(new File("imgs/TrangleButton.png"));
            profile.setIcon(new ImageIcon(img));
            
//            Image img2 = ImageIO.read(new File("imgs/IMAGE_NAME_GOES_HERE.png"));
//            entertainment.setIcon(new ImageIcon(img2));
//            
//            Image img3 = ImageIO.read(new File("imgs/IMAGE_NAME_GOES_HERE.png"));
//            carpool.setIcon(new ImageIcon(img3));
//            
//            Image img4 = ImageIO.read(new File("imgs/IMAGE_NAME_GOES_HERE.png"));
//            clubs.setIcon(new ImageIcon(img4));
//            
//            Image img5 = ImageIO.read(new File("imgs/IMAGE_NAME_GOES_HERE.png"));
//            food.setIcon(new ImageIcon(img5));
//            
//            Image img6 = ImageIO.read(new File("imgs/IMAGE_NAME_GOES_HERE.png"));
//            roommate.setIcon(new ImageIcon(img6));
        } 
        catch (IOException e) {
        	JOptionPane.showMessageDialog(MenuHandler.this, e);
        }
		
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
		
		// south panel
		JPanel so = new JPanel();
		signout = new JButton("Sign out");
		so.setOpaque(true);
		so.setBackground(Color.BLACK);
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
