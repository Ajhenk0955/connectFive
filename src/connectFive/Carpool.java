package connectFive;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
class Carpool extends QuestionFrame{
	private JPanel question1;
	private JPanel question2;
	private JPanel question3;
	private JPanel question4;
	private JPanel question5;
	private JPanel question6;
	private JPanel question7;
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
		super();
		JPanel button = new JPanel(new GridLayout(0,1));
		button.setOpaque(false);
		button.setLayout(null);
		
		//question 1
		question1 = new JPanel();
		question1.setOpaque(false);
		question1.setLayout(new BoxLayout(question1, BoxLayout.Y_AXIS));
		look = new JLabel ("  1)  Are you looking to:");
		give = new JRadioButton("Give a ride");
		receive = new JRadioButton("Receive a ride");
		space = new JLabel("  ");
		question1.add(look);
		question1.add(give);
		question1.add(receive);
		question1.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(give);
		radioGroup.add(receive);
		
		//question 2
		question2 = new JPanel();
		question2.setOpaque(false);
		question2.setLayout(new BoxLayout(question2, BoxLayout.Y_AXIS));
		party = new JLabel ("  2)  How many people are in your party?");
		me = new JRadioButton("Just me");
		two  = new JRadioButton("Two");
		three = new JRadioButton("Three");
		four = new JRadioButton("Four");
		space = new JLabel("  ");
		question2.add(party);
		question2.add(me);
		question2.add(two);
		question2.add(three);
		question2.add(four);
		question2.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(me);
		radioGroup.add(two);
		radioGroup.add(three);
		radioGroup.add(four);
		
		//question 3
		question3 = new JPanel();
		question3.setOpaque(false);
		question3.setLayout(new BoxLayout(question3, BoxLayout.Y_AXIS));
		prefer = new JLabel ("  3)  Who would you prefer to ride with?");
		female = new JRadioButton("A female");
		male = new JRadioButton("A male");
		none = new JRadioButton("No preference");
		space = new JLabel("  ");
		question3.add(prefer);
		question3.add(female);
		question3.add(male);
		question3.add(none);
		question3.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(female);
		radioGroup.add(male);
		radioGroup.add(none);
		
		//question 4
		question4 = new JPanel();
		question4.setOpaque(false);
		question4.setLayout(new BoxLayout(question4, BoxLayout.Y_AXIS));
		whereAt = new JLabel ("  4)  Where are you?");
		on = new JRadioButton("On campus");
		close = new JRadioButton("Within a mile of campus");
		less5 = new JRadioButton("Less than five miles from campus");
		more5 = new JRadioButton("More than five miles from campus");
		space = new JLabel("  ");
		question4.add(whereAt);
		question4.add(on);
		question4.add(close);
		question4.add(less5);
		question4.add(more5);
		question4.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(on);
		radioGroup.add(close);
		radioGroup.add(less5);
		radioGroup.add(more5);
		
		//question 5
		question5 = new JPanel();
		question5.setOpaque(false);
		question5.setLayout(new BoxLayout(question5, BoxLayout.Y_AXIS));
		whereTo = new JLabel ("  5)  Where are you going?");
		on2 = new JRadioButton("On campus");
		close2 = new JRadioButton("Within a mile of campus");
		less52 = new JRadioButton("Less than five miles from campus");
		more52 = new JRadioButton("More than five miles from campus");
		space = new JLabel("  ");
		question5.add(whereTo);
		question5.add(on2);
		question5.add(close2);
		question5.add(less52);
		question5.add(more52);
		question5.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(on2);
		radioGroup.add(close2);
		radioGroup.add(less52);
		radioGroup.add(more52);
		
		//question 6
		question6 = new JPanel();
		question6.setOpaque(false);
		question6.setLayout(new BoxLayout(question6, BoxLayout.Y_AXIS));
		depart = new JLabel ("  6)  What time do you need to depart?");
		now = new JRadioButton("Now");
		fifteen = new JRadioButton("15 minutes");
		thirty = new JRadioButton("30 minutes");
		hour = new JRadioButton("1 hour");
		hourP = new JRadioButton("More than an hour");
		space = new JLabel("  ");
		question6.add(depart);
		question6.add(now);
		question6.add(fifteen);
		question6.add(thirty);
		question6.add(hour);
		question6.add(hourP);
		question6.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(now);
		radioGroup.add(fifteen);
		radioGroup.add(thirty);
		radioGroup.add(hour);
		radioGroup.add(hourP);
		
		//question 7
		question7 = new JPanel();
		question7.setOpaque(false);
		question7.setLayout(new BoxLayout(question7, BoxLayout.Y_AXIS));
		arrive = new JLabel ("  7)  What time do you need to arrive?");
		fifteen2 = new JRadioButton("15 minutes");
		thirty2 = new JRadioButton("30 minutes");
		hour2 = new JRadioButton("1 hour");
		hourP2 = new JRadioButton("More than an hour");
		space = new JLabel("  ");
		question7.add(arrive);
		question7.add(fifteen2);
		question7.add(thirty2);
		question7.add(hour2);
		question7.add(hourP2);
		question7.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(fifteen2);
		radioGroup.add(thirty2);
		radioGroup.add(hour2);
		radioGroup.add(hourP2);
		
		// action listener
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 360, 640);
		add(scrollPane);
		
		JPanel viewPanel=new JPanel();
		viewPanel.setOpaque(false);
		viewPanel.setLayout(new BoxLayout(viewPanel, BoxLayout.Y_AXIS));
		viewPanel.add(question1);
		viewPanel.add(question2);
		viewPanel.add(question3);
		viewPanel.add(question4);
		viewPanel.add(question5);
		viewPanel.add(question6);
		viewPanel.add(question7);
		viewPanel.add(submit);
		
		JViewport view=new JViewport();
		view.setView(viewPanel);
		view.setOpaque(false);
		
		scrollPane.setViewport(view);
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setOpaque(false);
		
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon("imgs/background4.png"));
		background.setBounds(0, 0, 360, 640);
		add(background);
		
		this.add(button);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		
		if(give.isSelected()){
			array[0] = 0;
		}else if(receive.isSelected()){
			array[0] = 1;
		}else{
			array[0] = -1;
		}
		
		if(me.isSelected()){
			array[1] = 0;
		}else if(two.isSelected()){
			array[1] = 1;
		}else if(three.isSelected()){
			array[1] = 2;
		}else if(four.isSelected()){
			array[1] = 3;
		}else{
			array[1] = -1;
		}
		
		if(female.isSelected()){
			array[2] = 0;
		}else if(male.isSelected()){
			array[2] = 1;
		}else if(none.isSelected()){
			array[2] = 2;
		}else{
			array[2] = -1;
		}
		
		if(on.isSelected()){
			array[3] = 0;
		}else if(close.isSelected()){
			array[3] = 1;
		}else if(less5.isSelected()){
			array[3] = 2;
		}else if(more5.isSelected()){
			array[3] = 3;
		}else{
			array[3] = -1;
		}

		if(on2.isSelected()){
			array[4] = 0;
		}else if(close2.isSelected()){
			array[4] = 1;
		}else if(less52.isSelected()){
			array[4] = 2;
		}else if(more52.isSelected()){
			array[4] = 3;
		}else{
			array[4] = -1;
		}
		
		if(now.isSelected()){
			array[5] = 0;
		}else if(fifteen.isSelected()){
			array[5] = 1;
		}else if(thirty.isSelected()){
			array[5] = 2;
		}else if(hour.isSelected()){
			array[5] = 3;
		}else if(hourP.isSelected()){
			array[5] = 4;
		}else{
			array[5] = -1;
		}
		
		if(fifteen2.isSelected()){
			array[6] = 0;
		}else if(thirty2.isSelected()){
			array[6] = 1;
		}else if(hour2.isSelected()){
			array[6] = 2;
		}else if(hourP2.isSelected()){
			array[6] = 3;
		}else{
			array[6] = -1;
		}
		
		for(int i=0; i<array.length; i++){
			if(array[i]<0){
				submit.setEnabled(false);
				break;
			}
			else{
				submit.setEnabled(true);
				// store results in DB
				// insert code here
			}
		}
	}
}