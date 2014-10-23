package connectFive;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EntertainmentFrame extends JFrame{
	private JButton submit; // adds submit button
	
	private GridLayout g;
	
	// buttons that hold answers
	private JRadioButton morning; // selects morning
	private JRadioButton afternoon; // selects afternoon
	private JRadioButton night; // selects night
	private JRadioButton sunny; // selects sunny
	private JRadioButton cloudy; // selects cloudy
	private JRadioButton rainy; // selects rainy
	private JRadioButton storming; // selects storming
	private JRadioButton allDay; // selects allDay
	private JRadioButton twoHours; // selects twoHours
	private JRadioButton twoFiveH; // selects twoFiveH
	private JRadioButton indoor; // selects indoor
	private JRadioButton outdoor; // selects outdoor
	private JRadioButton lessThan; // selects lessThan
	private JRadioButton tenTwenty; // selects tenTwenty
	private JRadioButton twentyFifty; // selects twentyFifty
	private JRadioButton fiftyPlus; // selects fiftyPlus
	private JRadioButton young; // selects young
	private JRadioButton eighteenTwenty; // selects eighteenTwenty
	private JRadioButton twentyOnePlus; // selects twentyOnePlus
	private JRadioButton fiveMiles; // selects fiveMiles
	private JRadioButton fiveFifteen; // selects fiveFifteen
	private JRadioButton fifteenThirty; // selects fifteenThirty
	private JRadioButton thirtyPlus; // selects thirtyPlus
	
	// button group to hold radio buttons
	private ButtonGroup radioGroup1;
	private ButtonGroup radioGroup2;
	private ButtonGroup radioGroup3;
	private ButtonGroup radioGroup4;
	private ButtonGroup radioGroup5;
	private ButtonGroup radioGroup6;
	private ButtonGroup radioGroup7;
	
	// labels that hold questions
	private JLabel time;
	private JLabel weather;
	private JLabel length;
	private JLabel inOrOut;
	private JLabel cost;
	private JLabel age;
	private JLabel distance;
	private JLabel space;
	
	public EntertainmentFrame(){
		super("Entertainment Questionnaire");
						
		g = new GridLayout(0, 1); // rows, columns
		setLayout( g ); // set JFrame layout
		
		// question 1
		JPanel q1 = new JPanel();
		JPanel b1 = new JPanel();
		JPanel t1 = new JPanel();
		radioGroup1 = new ButtonGroup();
		time = new JLabel("1) What is the time of day?");
		morning = new JRadioButton("Morning");
		afternoon = new JRadioButton("Afternoon");
		night = new JRadioButton("Night");
		space = new JLabel("        ");
		q1.add( time);
		b1.add( morning );
		b1.add( afternoon );
		b1.add( night );
		t1.add( space );
		radioGroup1.add( morning );
		radioGroup1.add( afternoon );
		radioGroup1.add( night );
		add( q1 );
		add( b1 );
		add( t1 );
		
		// question 2
		JPanel q2 = new JPanel();
		JPanel b2 = new JPanel();
		JPanel t2 = new JPanel();
		radioGroup2 = new ButtonGroup();
		weather = new JLabel("2) What is the weather like?");
		sunny = new JRadioButton("Sunny");
		cloudy = new JRadioButton("Cloudy");
		rainy = new JRadioButton("Rainy");
		storming = new JRadioButton("Storming");
		space = new JLabel("        ");
		q2.add( weather );
		b2.add( sunny );
		b2.add( cloudy );
		b2.add( rainy );
		b2.add( storming );
		t1.add( space );
		radioGroup2.add( sunny );
		radioGroup2.add( cloudy );
		radioGroup2.add( rainy );
		radioGroup2.add( storming );
		add( q2 );
		add( b2 );
		add( t2 );
		
		// question 3
		JPanel q3 = new JPanel();
		JPanel b3 = new JPanel();
		JPanel t3 = new JPanel();
		radioGroup3 = new ButtonGroup();
		length = new JLabel("3) How long do you want to be out for?");
		allDay = new JRadioButton("All day");
		twoHours = new JRadioButton("Less than two hours");
		twoFiveH = new JRadioButton("Two to five hours");
		q3.add( length );
		b3.add( allDay );
		b3.add( twoHours );
		b3.add( twoFiveH );
		t3.add( space );
		radioGroup3.add( allDay );
		radioGroup3.add( twoHours );
		radioGroup3.add( twoFiveH );
		add( q3 );
		add( b3 );
		add( t3 );
		
		// question 4
		JPanel q4 = new JPanel();
		JPanel b4 = new JPanel();
		JPanel t4 = new JPanel();
		radioGroup4 = new ButtonGroup();
		inOrOut = new JLabel("4) Indoor or outdoor?");
		indoor = new JRadioButton("Indoor");
		outdoor = new JRadioButton("Outdoor");
		q4.add( inOrOut );
		b4.add( indoor );
		b4.add( outdoor );
		t4.add( space );
		radioGroup4.add( indoor );
		radioGroup4.add( outdoor );
		add( q4 );
		add( b4 );
		add( t4 );	
		
		// question 5
		JPanel q5 = new JPanel();
		JPanel b5 = new JPanel();
		JPanel t5 = new JPanel();
		radioGroup5 = new ButtonGroup();
		cost = new JLabel("5) What is your budget?");
		lessThan = new JRadioButton("Less than $10");
		tenTwenty = new JRadioButton("$10 - $20");
		twentyFifty = new JRadioButton("$20 - $50");
		fiftyPlus = new JRadioButton("$50+");
		q5.add( cost );
		b5.add( lessThan );
		b5.add( tenTwenty );
		b5.add( twentyFifty );
		b5.add( fiftyPlus );
		t5.add( space );
		radioGroup5.add( lessThan );
		radioGroup5.add( tenTwenty );
		radioGroup5.add( twentyFifty );
		radioGroup5.add( fiftyPlus );
		add( q5 );
		add( b5 );
		add( t5 );
		
		
		// question 6
		JPanel q6 = new JPanel();
		JPanel b6 = new JPanel();
		JPanel t6 = new JPanel();
		radioGroup6 = new ButtonGroup();
		age = new JLabel("6) How old are you"); // should this be grabbed from profile?
		young = new JRadioButton("Younger than 18");
		eighteenTwenty = new JRadioButton("18 - 20");
		twentyOnePlus = new JRadioButton("21+");
		q6.add( age );
		b6.add( young );
		b6.add( eighteenTwenty );
		b6.add( twentyOnePlus );
		t6.add( space );
		radioGroup6.add( young );
		radioGroup6.add( eighteenTwenty );
		radioGroup6.add( twentyOnePlus );
		add( q6 );
		add( b6 );
		add( t6 );
		
		// question 7
		JPanel q7 = new JPanel();
		JPanel b7 = new JPanel();
		JPanel t7 = new JPanel();
		radioGroup7 = new ButtonGroup();
		distance = new JLabel("7) How far are you willing to travel?");
		fiveMiles = new JRadioButton("0 - 5 miles");
		fiveFifteen = new JRadioButton("5 - 15 miles");
		fifteenThirty = new JRadioButton("15 - 30 miles");
		thirtyPlus = new JRadioButton("30+ miles");
		q7.add( distance );
		b7.add( fiveMiles );
		b7.add( fiveFifteen );
		b7.add( fifteenThirty );
		b7.add( thirtyPlus );
		t7.add( space );
		radioGroup7.add( fiveMiles );
		radioGroup7.add( fiveFifteen );
		radioGroup7.add( fifteenThirty );
		radioGroup7.add( thirtyPlus );
		add( q7 );
		add( b7 );
		add( t7 );
		
		// adds submit button
		submit = new JButton("Submit");
		JPanel buttonJPanel = new JPanel();
		buttonJPanel.add(submit);
		add(buttonJPanel);
		
		ButtonHandler handler = new ButtonHandler();
		submit.addActionListener( handler );
			
	}
	
	// class for button event handling
	class ButtonHandler implements ActionListener{
		
		public void actionPerformed( ActionEvent e){
			JOptionPane.showMessageDialog(EntertainmentFrame.this, 
					String.format("Questionnaire Submitted!", e.getActionCommand() ) );
			
		}								
	}	
	
	public static void main( String[] args ){
		EntertainmentFrame eFrame = new EntertainmentFrame();
		eFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		eFrame.setSize(360, 640); // set frame size
		eFrame.setVisible(true); // display frame
		
	}

}
