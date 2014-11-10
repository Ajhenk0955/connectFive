package connectFive;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

import connectFive.MenuHandler;


class profile extends JFrame {
	
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
	
	JTextField imagepath;
	JTextField namefield;
	JTextField addressfield;
	JTextField genderfield;
	
	JLabel enterName;
	JLabel enterGender;
	JLabel enterAddress;
	JLabel enterImage;
	
	
	public profile(){
		super("Create Profile");
		Submit= new JButton("Submit");
		Browse= new JButton("Browse");
		
		namePanel= new JPanel();
		genderpanel= new JPanel();
		addresspanel= new JPanel();
		picturepanel= new JPanel();
		buttonpanel= new JPanel();
		
		chooser= new JFileChooser();
		
		FlowLayout flowlayout= new FlowLayout(FlowLayout.LEFT);
		
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
		
		enterName= new JLabel("Name:      ");
		namefield= new JTextField(8);
		enterAddress= new JLabel("Address: ");
		addressfield= new JTextField(15);
		enterImage= new JLabel("Upload your favorite picture: ");
		imagepath= new JTextField(20);
		enterGender= new JLabel("M/F:           ");
		genderfield= new JTextField(3);
		namePanel.setLayout(flowlayout);
		namePanel.add(enterName);
		namePanel.add(namefield);		
		genderpanel.setLayout(flowlayout);
		genderpanel.add(enterGender);
		genderpanel.add(genderfield);
		addresspanel.setLayout(flowlayout);
		addresspanel.add(enterAddress);
		addresspanel.add(addressfield);
		picturepanel.setLayout(flowlayout);
		picturepanel.add(enterImage);
		picturepanel.add(imagepath);
		picturepanel.add(Browse);
		buttonpanel.add(Submit);
		
		ButtonListener handler= new ButtonListener();
		Browse.addActionListener(handler);
		Submit.addActionListener(handler);
		
		this.add(namePanel);
		this.add(Box.createRigidArea(new Dimension(0,10)));
		this.add(genderpanel);
		this.add(Box.createRigidArea(new Dimension(0,10)));
		this.add(addresspanel);
		this.add(Box.createRigidArea(new Dimension(0,10)));
		this.add(picturepanel);
		this.add(Box.createRigidArea(new Dimension(0,10))); 
		this.add(Box.createRigidArea(new Dimension(0,300)));
		this.add(buttonpanel);
		validate();
		
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
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
		
			}
			
			else if (e.getSource()==menu) {
				MenuHandler mainmenu= new MenuHandler();
				frame.setVisible(false);
				mainmenu.setVisible(true);
			}	
			else {
				
				// the DB needs to be scanned from this point to
				// verify no duplicate username is being created
				
				if(!namefield.getText().isEmpty()&&!addressfield.getText().isEmpty()&&!genderfield.getText().isEmpty()) {
					name=namefield.getText();
					address=addressfield.getText();	
					gender= genderfield.getText();
					setVisible(false);
					viewProfile();
					
				}	
			}
		}
	}
	
	public void viewProfile() {
		frame= new JFrame("User Profile");
		JPanel imagepanel= new JPanel();
		JPanel namepanel= new JPanel();
		JPanel entresultspanel= new JPanel();
		JPanel restresultspanel= new JPanel();
		JPanel clubresultspanel=  new JPanel();
		JPanel roomresultspanel= new JPanel();
		JPanel carresultspanel= new JPanel();
		JPanel menupanel= new JPanel();
		
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
		nameandaddresslabel= new JLabel("<html>"+name+"<br>"+address+"</html>");
		entresults= new JLabel("Entertainment Results:");
		restresults= new JLabel("Restaurant Results: ");
		clubresults= new JLabel("Club Results: ");
		roomresults= new JLabel("Roomate Results: ");
		carresults= new JLabel("Carpool Results: ");
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
		
		menupanel.add(menu);
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
		
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
}