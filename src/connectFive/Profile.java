package connectFive;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Profile extends JFrame{
	
	boolean created;
	String credentials;
	String name;
	String address;
	String gender;
	BufferedImage picture; 
	BufferedImage map;
	JFrame frame;
	JButton Submit;
	JButton Browse;
	JButton menu;
	JPanel grid;
	JPanel namePanel;
	JPanel genderpanel;
	JPanel addresspanel;
	JPanel picturepanel;
	JPanel buttonpanel;
	JFileChooser chooser;
	
	JLabel ent1;
	JLabel ent2;
	JLabel ent3;
	JLabel food1;
	JLabel food2;
	JLabel food3;
	JLabel club1;
	JLabel club2;
	JLabel club3;
	JLabel room1;
	JLabel room2;
	JLabel room3;
	JLabel car1;
	JLabel car2;
	JLabel car3;
	
	JTextField imagepath;
	JTextField namefield;
	JTextField addressfield;
	JTextField genderfield;
	
	JLabel enterName;
	JLabel enterGender;
	JLabel enterAddress;
	JLabel enterImage;

	Profile(){
		super("Create Profile");
		this.setLayout(null);
		
		chooser = new JFileChooser();
		
		Submit = new JButton("Submit");
		Browse = new JButton("Browse");
		
		JPanel button = new JPanel();
		button.setOpaque(false);
		button.setBounds(0,0,360,640);
		button.setLayout(null);
		
		enterName = new JLabel("Name: ");
		namefield = new JTextField();
		enterName.setForeground(Color.WHITE);
		enterName.setBounds(10, 30, 100, 50);
		namefield.setBounds(130, 30, 200, 50);
		button.add(enterName);
		button.add(namefield);
		
		enterAddress = new JLabel("Address: ");
		addressfield = new JTextField();
		enterAddress.setBounds(10, 110, 100, 50);
		enterAddress.setForeground(Color.WHITE);
		addressfield.setBounds(130, 110, 200, 50);
		button.add(enterAddress);
		button.add(addressfield);
		
		enterGender = new JLabel("Male/Female: ");
		genderfield = new JTextField();
		enterGender.setBounds(10, 190, 100, 50);
		enterGender.setForeground(Color.WHITE);
		genderfield.setBounds(130, 190, 200, 50);
		button.add(enterGender);
		button.add(genderfield);
		
		enterImage = new JLabel("Enter your favorite image:");
		imagepath = new JTextField();
		Browse = new JButton("Browse");
		enterImage.setBounds(10, 270, 100, 50);
		enterImage.setForeground(Color.WHITE);
		imagepath.setBounds(130, 270, 150, 50);
		Browse.setBounds(290, 270, 50, 50);
		button.add(enterImage);
		button.add(imagepath);
		button.add(Browse);
		
		Submit = new JButton("Submit");
		Submit.setBounds(130, 580, 100, 50);
		button.add(Submit);
		
		ButtonListener handler= new ButtonListener();
		Browse.addActionListener(handler);
		Submit.addActionListener(handler);
		
		add(button);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon("imgs/background6.png"));
		background.setBounds(0, 0, 360, 640);
		add(background);
		
	}
	
	class ButtonListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==Browse) {
				int returnVal=chooser.showOpenDialog(Browse);
				if(returnVal==JFileChooser.APPROVE_OPTION) {
					File file= chooser.getSelectedFile();
					String filepath=chooser.getName(file);
					imagepath.setText(filepath);
					
					try {
						picture= ImageIO.read(file);
					}
					catch (IOException ex) {
						System.err.println("Error.");
					}
				}
			}else if (e.getSource()==menu) {
				Menu mainmenu= new Menu();
				frame.setVisible(false);
				mainmenu.setVisible(true);
			}else {
				
				// the DB needs to be scanned from this point to
				// verify no duplicate username is being created
				
				if(!namefield.getText().isEmpty() && !addressfield.getText().isEmpty() && !genderfield.getText().isEmpty() && !imagepath.getText().isEmpty()) {
					name=namefield.getText();
					address=addressfield.getText();	
					gender= genderfield.getText();
					setVisible(false);
					viewProfile();
				}	
			}
		}
	}
	
	public void viewProfile(){
		
		frame= new JFrame("User Profile");
		JPanel imagepanel= new JPanel();
		imagepanel.setBackground(Color.BLACK);
		JPanel namepanel= new JPanel();
		namepanel.setBackground(Color.BLACK);
		JPanel entresultspanel= new JPanel();
		entresultspanel.setBackground(Color.BLACK);
		JPanel restresultspanel= new JPanel();
		restresultspanel.setBackground(Color.BLACK);
		JPanel clubresultspanel=  new JPanel();
		clubresultspanel.setBackground(Color.BLACK);
		JPanel roomresultspanel= new JPanel();
		roomresultspanel.setBackground(Color.BLACK);
		JPanel carresultspanel= new JPanel();
		carresultspanel.setBackground(Color.BLACK);
		JPanel menupanel= new JPanel();
		menupanel.setBackground(Color.BLACK);
		
		frame.setBackground(Color.BLACK);
		
		// DB needs to be called here and displayed
		// within each respective panel
		
		imagepanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		namepanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		entresultspanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		restresultspanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		clubresultspanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		roomresultspanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		carresultspanel.setLayout(new FlowLayout(FlowLayout.LEFT));

		menupanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JLabel label;
		JLabel nameandaddresslabel;
		JLabel entresults;
		JLabel restresults;
		JLabel clubresults;
		JLabel roomresults;
		JLabel carresults;
		
		menu= new JButton("Menu");
		ButtonListener handler= new ButtonListener();
		menu.addActionListener(handler);
		
		BufferedImage resizedImage= new BufferedImage(100,100,BufferedImage.TYPE_INT_ARGB);
		label= new JLabel(new ImageIcon(resizedImage));
		nameandaddresslabel= new JLabel("<html>"+name+"<br>"+address+"<br>"+gender+"</html>");
		nameandaddresslabel.setForeground(Color.WHITE);
		entresults= new JLabel("Entertainment Results:");
		entresults.setForeground(Color.WHITE);
		restresults= new JLabel("Restaurant Results: ");
		restresults.setForeground(Color.WHITE);
		clubresults= new JLabel("Club Results: ");
		clubresults.setForeground(Color.WHITE);
		roomresults= new JLabel("Roomate Results: ");
		roomresults.setForeground(Color.WHITE);
		carresults= new JLabel("Carpool Results: ");
		carresults.setForeground(Color.WHITE);
		
		Graphics2D g= resizedImage.createGraphics();
		g.setBackground(Color.WHITE);
		g.drawImage(picture, 0, 0, 100,100,null);
		g.dispose();
		g.setComposite(AlphaComposite.Src);
		g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g.setRenderingHint(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY);
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		
		Container container = frame.getContentPane();
		frame.setLayout(new BoxLayout(container, BoxLayout.PAGE_AXIS));
		imagepanel.add(label);
		imagepanel.add(nameandaddresslabel);
		entresultspanel.add(entresults);
		restresultspanel.add(restresults);
		clubresultspanel.add(clubresults);
		roomresultspanel.add(roomresults);
		carresultspanel.add(carresults);
		
		frame.add(Box.createRigidArea(new Dimension(0,10)));
		frame.add(imagepanel);
		frame.add(Box.createRigidArea(new Dimension(0,10)));
		frame.add(entresultspanel);
		frame.add(Box.createRigidArea(new Dimension(0,10)));
		frame.add(restresultspanel);
		frame.add(Box.createRigidArea(new Dimension(0,10)));
		frame.add(clubresultspanel);
		frame.add(Box.createRigidArea(new Dimension(0,10)));
		frame.add(roomresultspanel);
		frame.add(Box.createRigidArea(new Dimension(0,10)));
		frame.add(carresultspanel);
		frame.add(Box.createRigidArea(new Dimension(0,10)));
		frame.add(menupanel);
		frame.setSize(360, 640);
		frame.setResizable(false);
		frame.setVisible(true);
		
		menupanel.add(menu);
		
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
}


