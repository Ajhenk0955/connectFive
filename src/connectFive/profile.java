package connectFive;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;


class profile extends JFrame {
	
	boolean created;
	String credentials;
	String name;
	String address;
	String gender;
	BufferedImage picture; 
	BufferedImage map;
	JButton Submit;
	JButton Browse;
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
		
	}
	
	
	class ButtonListener implements ActionListener {
		
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
			
			else {
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
		JFrame frame= new JFrame("User Profile");
		JPanel imagepanel= new JPanel();
		JPanel namepanel= new JPanel();
		JPanel resultspanel= new JPanel();
		imagepanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		namepanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		resultspanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel label;
		JLabel nameandaddresslabel;
		JLabel testresults;
		BufferedImage resizedImage= new BufferedImage(100,100,BufferedImage.TYPE_INT_ARGB);
		label= new JLabel(new ImageIcon(resizedImage));
		nameandaddresslabel= new JLabel("<html>"+name+"<br>"+address+"</html>");
		testresults= new JLabel("Test Results:");
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
		resultspanel.add(testresults);
		frame.add(Box.createRigidArea(new Dimension(0,10)));
		frame.add(imagepanel);
		frame.add(Box.createRigidArea(new Dimension(0,10)));
		frame.add(resultspanel);
		frame.add(Box.createRigidArea(new Dimension(0,500)));
		frame.setSize(360, 640);
		frame.setResizable(false);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		profile profile1= new profile();
		profile1.setSize(360,640);
		profile1.setResizable(false);
		profile1.setVisible(true);
		
	}

}