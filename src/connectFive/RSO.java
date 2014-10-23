import java.awt.BorderLayout;
//import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class RSO extends JFrame implements ActionListener{
	private JButton submit;
	private JRadioButton baking;
	private JRadioButton gaming;
	private JRadioButton reading;
	private JRadioButton building;
	private JRadioButton volunteering;
	private JRadioButton sports;
	private JRadioButton engineering;
	private JRadioButton health;
	private JRadioButton rainy;
	private JRadioButton storming;
	private JRadioButton allDay;
	private JRadioButton twoHours;
	private JRadioButton twoFiveH;
	private JRadioButton indoor;
	private JRadioButton outdoor;
	private JRadioButton lessThan;
	private JRadioButton tenTwenty;
	private JRadioButton TwentyFifty;
	private JRadioButton fiftyPlus;
	private JRadioButton young;
	private JRadioButton eighteenTwenty;
	private JRadioButton twentyOnePlus;
	private JRadioButton fiveMiles;
	private JRadioButton fiveFifteen;
	private JRadioButton fifteenThirty;
	private JRadioButton thirtyPlus;
	private JLabel enjoy;
	private JLabel weather;
	private JLabel length;
	private JLabel inOrOut;
	private JLabel cost;
	private JLabel age;
	private JLabel distance;
	private ButtonGroup radioGroup;

	int [] array = new int [7];
	
	RSO (String test){
		super(test);
		JPanel button = new JPanel(new GridLayout(0,1));
		JPanel buttonJPanel = new JPanel();
		submit = new JButton("Submit");
		buttonJPanel.add(submit);
		add(buttonJPanel, BorderLayout.SOUTH);
		
		//question 1
		enjoy = new JLabel ("What do you enjoy doing (select one that applies most)?");
		baking = new JRadioButton("baking");
		gaming = new JRadioButton("gaming");
		reading = new JRadioButton("reading");
		building = new JRadioButton("building");
		volunteering = new JRadioButton("volunteering");
		sports = new JRadioButton("sports");
		button.add(enjoy);
		button.add(baking);
		button.add(gaming);
		button.add(reading);
		button.add(building);
		button.add(volunteering);
		button.add(sports);
		radioGroup = new ButtonGroup();
		radioGroup.add(baking);
		radioGroup.add(gaming);
		radioGroup.add(reading);
		radioGroup.add(building);
		radioGroup.add(volunteering);
		radioGroup.add(sports);
		add(button);
		
		//question 2
		weather = new JLabel ("What college are you in?");
		engineering = new JRadioButton("engineering");
		health  = new JRadioButton("health professions and social works ");
		rainy = new JRadioButton("rainy");
		storming = new JRadioButton("storming");
		button.add(weather);
		button.add(engineering);
		button.add(health);
		button.add(rainy);
		button.add(storming);
		radioGroup = new ButtonGroup();
		radioGroup.add(engineering);
		radioGroup.add(health);
		radioGroup.add(rainy);
		radioGroup.add(storming);
		add(button);
		
		//question 3
		length = new JLabel ("Would you want a RSO connected to your major?");
		allDay = new JRadioButton("yes");
		twoHours = new JRadioButton("no");
		button.add(length);
		button.add(allDay);
		button.add(twoHours);
		radioGroup = new ButtonGroup();
		radioGroup.add(allDay);
		radioGroup.add(twoHours);
		add(button);
		
		//question 4
		inOrOut = new JLabel ("How much can you donate to the RSO?");
		indoor = new JRadioButton("$0");
		outdoor = new JRadioButton("$5-10");
		// = new JRadioButton("$10-30");
		// = new JRadioButton("$30+")
		button.add(inOrOut);
		button.add(indoor);
		button.add(outdoor);
		//button.add();
		//button.add();
		radioGroup = new ButtonGroup();
		radioGroup.add(indoor);
		radioGroup.add(outdoor);
		//radioGroup.add();
		//radioGroup.add();
		add(button);
		
		//question 5
		cost = new JLabel ("What is least interesting to you?");
		lessThan = new JRadioButton("biking");
		tenTwenty = new JRadioButton("gaming");
		TwentyFifty = new JRadioButton("reading");
		fiftyPlus = new JRadioButton("building");
		// = new JRadioButton("volunteering");
		// = new JRadioButton("sports");
		button.add(cost);
		button.add(lessThan);
		button.add(tenTwenty);
		button.add(TwentyFifty);
		button.add(fiftyPlus);
		//button.add();
		//button.add();
		radioGroup = new ButtonGroup();
		radioGroup.add(lessThan);
		radioGroup.add(tenTwenty);
		radioGroup.add(TwentyFifty);
		radioGroup.add(fiftyPlus);
		//radioGroup.add();
		//radioGroup.add();
		add(button);
		
		//question 6
		age = new JLabel ("Which category is most interesting to you?");
		young = new JRadioButton("academic");
		eighteenTwenty = new JRadioButton("media");
		twentyOnePlus = new JRadioButton("politics");
		//new JRadioButton("religion");
		//new JRadioButton("service");
		//new JRadioButton("sports");
		button.add(age);
		button.add(young);
		button.add(eighteenTwenty);
		button.add(twentyOnePlus);
		//button.add();
		//button.add();
		//button.add();
		radioGroup = new ButtonGroup();
		radioGroup.add(young);
		radioGroup.add(eighteenTwenty);
		radioGroup.add(twentyOnePlus);
		//radioGroup.add();
		//radioGroup.add();
		//radioGroup.add();
		add(button);
		
		//question 7
		distance = new JLabel ("How often are you available to meet?");
		fiveMiles = new JRadioButton("multiple times a week");
		fiveFifteen = new JRadioButton("once a week");
		fifteenThirty = new JRadioButton("biweekly");
		thirtyPlus = new JRadioButton("once a month");
		button.add(distance);
		button.add(fiveMiles);
		button.add(fiveFifteen);
		button.add(fifteenThirty);
		button.add(thirtyPlus);
		radioGroup = new ButtonGroup();
		radioGroup.add(fiveMiles);
		radioGroup.add(fiveFifteen);
		radioGroup.add(fifteenThirty);
		radioGroup.add(thirtyPlus);
		add(button);
		submit.addActionListener(this);
		baking.addActionListener(this);
		gaming.addActionListener(this);
		reading.addActionListener(this);
		building.addActionListener(this);
		volunteering.addActionListener(this);
		sports.addActionListener(this);
		engineering.addActionListener(this);
		health.addActionListener(this);
		rainy.addActionListener(this);
		storming.addActionListener(this);
		allDay.addActionListener(this);
		twoHours.addActionListener(this);
		indoor.addActionListener(this);
		outdoor.addActionListener(this);
		lessThan.addActionListener(this);
		tenTwenty.addActionListener(this);
		TwentyFifty.addActionListener(this);
		fiftyPlus.addActionListener(this);
		young.addActionListener(this);
		eighteenTwenty.addActionListener(this);
		twentyOnePlus.addActionListener(this);
		fiveMiles.addActionListener(this);
		fiveFifteen.addActionListener(this);
		fifteenThirty.addActionListener(this);
		thirtyPlus.addActionListener(this);
		int [] maxArray = new int [7];
		maxArray[0] = 5;
		maxArray[1] = 4;
		maxArray[2] = 1;
		maxArray[3] = 5;
		maxArray[4] = 6;
		maxArray[5] = 3;
		maxArray[6] = 2;
	}
	
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource() == baking){
			array[0] = 0;
		}
		
		else if(e.getSource() == gaming){
			array[0] = 1;
		}
		
		else if(e.getSource() == reading){
			array[0] = 2;
		}
		
		else if(e.getSource() == building){
			array[0] = 3;
		}
		
		else if(e.getSource() == volunteering){
			array[0] = 4;
		}
		
		else if(e.getSource() == sports){
			array[0] = 5;
		}
		
		if(e.getSource() == engineering){
			array[1] = 0;
		}
		
		else if(e.getSource() == health){
			array[1] = 1;
		}
		
		else if(e.getSource() == rainy){
			array[1] = 2;
		}
		
		else if(e.getSource() == storming){
			array[1] = 3;
		}
		
		if(e.getSource() == allDay){
			array[2] = 0;
		}
		
		else if(e.getSource() == twoHours){
			array[2] = 1;
		}
		
		else if(e.getSource() == twoFiveH){
			array[2] = 2;
		}
		
		if(e.getSource() == indoor){
			array[3] = 0;
		}
		
		else if(e.getSource() == outdoor){
			array[3] = 1;
		}
		
		if(e.getSource() == lessThan){
			array[4] = 0;
		}
		
		else if(e.getSource() == tenTwenty){
			array[4] = 1;
		}
		
		else if(e.getSource() == TwentyFifty){
			array[4] = 2;
		}
		
		else if(e.getSource() == fiftyPlus){
			array[4] = 3;
		}
		
		if(e.getSource() == young){
			array[5] = 0;
		}
		
		else if(e.getSource() == eighteenTwenty){
			array[5] = 1;
		}
		
		else if(e.getSource() == twentyOnePlus){
			array[5] = 2;
		}
		
		if(e.getSource() == fiveMiles){
			array[6] = 0;
		}
		
		else if(e.getSource() == fiveFifteen){
			array[6] = 1;
		}
		
		else if(e.getSource() == fifteenThirty){
			array[6] = 2;
		}
		
		else if(e.getSource() == thirtyPlus){
			array[6] = 3;
		}
		
		System.out.println("1: " + array[0]);
		System.out.println("2: " + array[1]);
		System.out.println("3: " + array[2]);
		System.out.println("4: " + array[3]);
		System.out.println("5: " + array[4]);
		System.out.println("6: " + array[5]);
		System.out.println("7: " + array[6]);
		
		if(e.getSource() == submit){
			JOptionPane.showMessageDialog(null, "You've submitted your test!");
			this.setVisible(false);
		}
	}
	

	public static void main( String args[] ){
		   RSO buttonFrame = new RSO("test");
		   buttonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		   buttonFrame.setSize( 360, 640 ); // set frame size
		   buttonFrame.setVisible( true ); // display frame
	}

}