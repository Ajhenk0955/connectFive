package connectFive;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Carpool extends JFrame implements ActionListener{
	private JButton submit;
	private JRadioButton give;
	private JRadioButton receive;	
	private JRadioButton me;
	private JRadioButton two;
	private JRadioButton three;
	private JRadioButton four;
	private JRadioButton female;
	private JRadioButton male;
	private JRadioButton none;
	private JRadioButton on;
	private JRadioButton close;
	private JRadioButton less5;
	private JRadioButton more5;
	private JRadioButton on2;
	private JRadioButton close2;
	private JRadioButton less52;
	private JRadioButton more52;
	private JRadioButton now;
	private JRadioButton fifteen;
	private JRadioButton thirty;
	private JRadioButton hour;
	private JRadioButton hourP;
	private JRadioButton fifteen2;
	private JRadioButton thirty2;
	private JRadioButton hour2;
	private JRadioButton hourP2;
	private JLabel look;
	private JLabel party;
	private JLabel prefer;
	private JLabel whereAt;
	private JLabel whereTo;
	private JLabel depart;
	private JLabel arrive;
	private JLabel space;
	private ButtonGroup radioGroup;

	int [] array = new int [7];
	
	Carpool (){
		super("Carpool Questionnaire");
		JPanel button = new JPanel(new GridLayout(0,1));
		JPanel buttonJPanel = new JPanel();
		submit = new JButton("Submit");
		buttonJPanel.add(submit);
		add(buttonJPanel, BorderLayout.SOUTH);
		
		//question 1
		look = new JLabel ("  1)  Are you looking to:");
		give = new JRadioButton("Give a ride");
		receive = new JRadioButton("Receive a ride");
		space = new JLabel("  ");
		button.add(look);
		button.add(give);
		button.add(receive);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(give);
		radioGroup.add(receive);
		add(button);
		
		//question 2
		party = new JLabel ("  2)  How many people are in your party?");
		me = new JRadioButton("Just me");
		two  = new JRadioButton("Two");
		three = new JRadioButton("Three");
		four = new JRadioButton("Four");
		space = new JLabel("  ");
		button.add(party);
		button.add(me);
		button.add(two);
		button.add(three);
		button.add(four);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(me);
		radioGroup.add(two);
		radioGroup.add(three);
		radioGroup.add(four);
		add(button);
		
		//question 3
		prefer = new JLabel ("  3)  Who would you prefer to ride with?");
		female = new JRadioButton("A female");
		male = new JRadioButton("A male");
		none = new JRadioButton("No preference");
		space = new JLabel("  ");
		button.add(prefer);
		button.add(female);
		button.add(male);
		button.add(none);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(female);
		radioGroup.add(male);
		radioGroup.add(none);
		add(button);
		
		//question 4
		whereAt = new JLabel ("  4)  Where are you?");
		on = new JRadioButton("On campus");
		close = new JRadioButton("Within a mile of campus");
		less5 = new JRadioButton("Less than five miles from campus");
		more5 = new JRadioButton("More than five miles from campus");
		space = new JLabel("  ");
		button.add(whereAt);
		button.add(on);
		button.add(close);
		button.add(less5);
		button.add(more5);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(on);
		radioGroup.add(close);
		radioGroup.add(less5);
		radioGroup.add(more5);
		add(button);
		
		//question 5
		whereTo = new JLabel ("  5)  Where are you going?");
		on2 = new JRadioButton("On campus");
		close2 = new JRadioButton("Within a mile of campus");
		less52 = new JRadioButton("Less than five miles from campus");
		more52 = new JRadioButton("More than five miles from campus");
		space = new JLabel("  ");
		button.add(whereTo);
		button.add(on2);
		button.add(close2);
		button.add(less52);
		button.add(more52);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(on2);
		radioGroup.add(close2);
		radioGroup.add(less52);
		radioGroup.add(more52);
		add(button);
		
		//question 6
		depart = new JLabel ("  6)  What time do you need to depart?");
		now = new JRadioButton("Now");
		fifteen = new JRadioButton("15 minutes");
		thirty = new JRadioButton("30 minutes");
		hour = new JRadioButton("1 hour");
		hourP = new JRadioButton("More than an hour");
		space = new JLabel("  ");
		button.add(depart);
		button.add(now);
		button.add(fifteen);
		button.add(thirty);
		button.add(hour);
		button.add(hourP);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(now);
		radioGroup.add(fifteen);
		radioGroup.add(thirty);
		radioGroup.add(hour);
		radioGroup.add(hourP);
		add(button);
		
		//question 7
		arrive = new JLabel ("  7)  What time do you need to arrive?");
		fifteen2 = new JRadioButton("15 minutes");
		thirty2 = new JRadioButton("30 minutes");
		hour2 = new JRadioButton("1 hour");
		hourP2 = new JRadioButton("More than an hour");
		space = new JLabel("  ");
		button.add(arrive);
		button.add(fifteen2);
		button.add(thirty2);
		button.add(hour2);
		button.add(hourP2);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(fifteen2);
		radioGroup.add(thirty2);
		radioGroup.add(hour2);
		radioGroup.add(hourP2);
		add(button);
		
		// action listener
		submit.addActionListener(this);
		give.addActionListener(this);
		receive.addActionListener(this);
		me.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		female.addActionListener(this);
		male.addActionListener(this);
		none.addActionListener(this);
		on.addActionListener(this);
		close.addActionListener(this);
		less5.addActionListener(this);
		more5.addActionListener(this);
		on2.addActionListener(this);
		close2.addActionListener(this);
		less52.addActionListener(this);
		more52.addActionListener(this);
		now.addActionListener(this);
		fifteen.addActionListener(this);
		thirty.addActionListener(this);
		hour.addActionListener(this);
		hourP.addActionListener(this);
		fifteen2.addActionListener(this);
		thirty2.addActionListener(this);
		hour2.addActionListener(this);
		hourP2.addActionListener(this);
				
	}
	
	
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource() == give){
			array[0] = 0;
		}else if(e.getSource() == receive){
			array[0] = 1;
		}
		
		if(e.getSource() == me){
			array[1] = 0;
		}else if(e.getSource() == two){
			array[1] = 1;
		}else if(e.getSource() == three){
			array[1] = 2;
		}else if(e.getSource() == four){
			array[1] = 3;
		}
		
		if(e.getSource() == female){
			array[2] = 0;
		}else if(e.getSource() == male){
			array[2] = 1;
		}else if(e.getSource() == none){
			array[2] = 2;
		}
		
		if(e.getSource() == on){
			array[3] = 0;
		}else if(e.getSource() == close){
			array[3] = 1;
		}else if(e.getSource() == less5){
			array[3] = 2;
		}else if(e.getSource() == more5){
			array[3] = 3;
		}

		if(e.getSource() == on2){
			array[4] = 0;
		}else if(e.getSource() == close2){
			array[4] = 1;
		}else if(e.getSource() == less52){
			array[4] = 2;
		}else if(e.getSource() == more52){
			array[4] = 3;
		}
		
		if(e.getSource() == now){
			array[5] = 0;
		}else if(e.getSource() == fifteen){
			array[5] = 1;
		}else if(e.getSource() == thirty){
			array[5] = 2;
		}else if(e.getSource() == hour){
			array[5] = 3;
		}else if(e.getSource() == hourP){
			array[5] = 4;
		}
		
		if(e.getSource() == fifteen2){
			array[6] = 0;
		}else if(e.getSource() == thirty2){
			array[6] = 1;
		}else if(e.getSource() == hour2){
			array[6] = 2;
		}else if(e.getSource() == hourP2){
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
		   Carpool buttonFrame = new Carpool();
		   buttonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		   buttonFrame.setSize( 360, 640 ); // set frame size
		   buttonFrame.setVisible( true ); // display frame
	}

}