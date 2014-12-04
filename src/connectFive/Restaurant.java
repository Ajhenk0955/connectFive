package connectFive;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class Restaurant extends QuestionFrame {
	private JPanel question1;
	private JPanel question2;
	private JPanel question3;
	private JPanel question4;
	private JPanel question5;
	private JPanel question6;
	private JRadioButton vegan;
	private JRadioButton vegetarian;
	private JRadioButton sea;
	private JRadioButton gluten;
	private JRadioButton none;
	private JRadioButton african;
	private JRadioButton asian;
	private JRadioButton european;
	private JRadioButton oceanic;
	private JRadioButton americas;
	private JRadioButton breakfast;
	private JRadioButton lunch;
	private JRadioButton dinner;
	private JRadioButton morning;
	private JRadioButton midday;
	private JRadioButton afternoon;
	private JRadioButton evening;
	private JRadioButton late;
	private JRadioButton less1;
	private JRadioButton more1;
	private JRadioButton less5;
	private JRadioButton more5;
	private JRadioButton zero;
	private JRadioButton ten;
	private JRadioButton twenty;
	private JRadioButton thirty;
	private JLabel type;
	private JLabel cuisine;
	private JLabel meal;
	private JLabel time;
	private JLabel travel;
	private JLabel price;
	private JLabel space;
	private ButtonGroup radioGroup;

	int [] array = new int [6];
	
	Restaurant (){
		super();
		JPanel button = new JPanel(new GridLayout(0,1));
		button.setOpaque(false);
		button.setLayout(null);
		
		//question 1
		question1 = new JPanel();
		question1.setOpaque(false);
		question1.setLayout(new BoxLayout(question1, BoxLayout.Y_AXIS));
		type = new JLabel ("  1)  Which of these best describes you?");
		vegan = new JRadioButton("Vegan");
		vegetarian = new JRadioButton("Vegetarian");
		sea = new JRadioButton("Seafood allergies");
		gluten = new JRadioButton("Gluten intolerant");
		none = new JRadioButton("No restrictions");
		space = new JLabel("   ");
		question1.add(type);
		question1.add(vegan);
		question1.add(vegetarian);
		question1.add(sea);
		question1.add(gluten);
		question1.add(none);
		question1.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(vegan);
		radioGroup.add(vegetarian);
		radioGroup.add(sea);
		radioGroup.add(gluten);
		radioGroup.add(none);
		
		//question 2
		question2 = new JPanel();
		question2.setOpaque(false);
		question2.setLayout(new BoxLayout(question2, BoxLayout.Y_AXIS));
		cuisine = new JLabel ("  2)  What type of cuisine are you in the mood for?");
		african = new JRadioButton("African");
		asian  = new JRadioButton("Asian");
		european = new JRadioButton("European");
		oceanic = new JRadioButton("Oceanic");
		americas = new JRadioButton("Americas");
		space = new JLabel("   ");
		question2.add(cuisine);
		question2.add(african);
		question2.add(asian);
		question2.add(european);
		question2.add(oceanic);
		question2.add(americas);
		question2.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(african);
		radioGroup.add(asian);
		radioGroup.add(european);
		radioGroup.add(oceanic);
		radioGroup.add(americas);
		
		//question 3
		question3 = new JPanel();
		question3.setOpaque(false);
		question3.setLayout(new BoxLayout(question3, BoxLayout.Y_AXIS));
		meal = new JLabel ("  3)  Which meal type are you hungry for?");
		breakfast = new JRadioButton("Breakfast");
		lunch = new JRadioButton("Lunch");
		dinner = new JRadioButton("Dinner");
		space = new JLabel("   ");
		question3.add(meal);
		question3.add(breakfast);
		question3.add(lunch);
		question3.add(dinner);
		question3.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(breakfast);
		radioGroup.add(lunch);
		radioGroup.add(dinner);
		
		//question 4
		question4 = new JPanel();
		question4.setOpaque(false);
		question4.setLayout(new BoxLayout(question4, BoxLayout.Y_AXIS));
		time = new JLabel ("  4)  What time are you planning to eat?");
		morning = new JRadioButton("Morning");
		midday = new JRadioButton("Midday");
		afternoon = new JRadioButton("Afternoon");
		evening = new JRadioButton("Evening");
		late = new JRadioButton("Late night");
		space = new JLabel("   ");
		question4.add(time);
		question4.add(morning);
		question4.add(midday);
		question4.add(afternoon);
		question4.add(evening);
		question4.add(late);
		question4.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(morning);
		radioGroup.add(midday);
		radioGroup.add(afternoon);
		radioGroup.add(evening);
		radioGroup.add(late);
		
		//question 5
		question5 = new JPanel();
		question5.setOpaque(false);
		question5.setLayout(new BoxLayout(question5, BoxLayout.Y_AXIS));
		travel = new JLabel ("  5)  How far are you willing to travel?");
		less1 = new JRadioButton("Less than a mile");
		more1 = new JRadioButton("More than a mile");
		less5 = new JRadioButton("Less than five miles");
		more5 = new JRadioButton("More than five miles");
		space = new JLabel("   ");
		question5.add(travel);
		question5.add(less1);
		question5.add(more1);
		question5.add(less5);
		question5.add(more5);
		question5.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(less1);
		radioGroup.add(more1);
		radioGroup.add(less5);
		radioGroup.add(more5);
		
		//question 6
		question6 = new JPanel();
		question6.setOpaque(false);
		question6.setLayout(new BoxLayout(question6, BoxLayout.Y_AXIS));
		price = new JLabel ("  6)  How much are you willing to spend on a meal?");
		zero = new JRadioButton("$0 - $9");
		ten = new JRadioButton("$10 - $19");
		twenty = new JRadioButton("$20 - $29");
		thirty = new JRadioButton("$30+");
		space = new JLabel("   ");
		question6.add(price);
		question6.add(zero);
		question6.add(ten);
		question6.add(twenty);
		question6.add(thirty);
		question6.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(zero);
		radioGroup.add(ten);
		radioGroup.add(twenty);
		radioGroup.add(thirty);
				
		// action listener
		vegan.addActionListener(this);
		vegetarian.addActionListener(this);
		sea.addActionListener(this);
		gluten.addActionListener(this);
		none.addActionListener(this);
		african.addActionListener(this);
		asian.addActionListener(this);
		european.addActionListener(this);
		oceanic.addActionListener(this);
		americas.addActionListener(this);
		breakfast.addActionListener(this);
		lunch.addActionListener(this);
		dinner.addActionListener(this);
		morning.addActionListener(this);
		midday.addActionListener(this);
		afternoon.addActionListener(this);
		evening.addActionListener(this);
		late.addActionListener(this);
		less1.addActionListener(this);
		more1.addActionListener(this);
		less5.addActionListener(this);
		more5.addActionListener(this);
		zero.addActionListener(this);
		ten.addActionListener(this);
		twenty.addActionListener(this);
		thirty.addActionListener(this);
		
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
		viewPanel.add(submit);
		
		JViewport view=new JViewport();
		view.setView(viewPanel);
		view.setOpaque(false);
		
		scrollPane.setViewport(view);
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setOpaque(false);
		
		
		JLabel background = new JLabel();
		background.setIcon(new ImageIcon("imgs/background5.png"));
		background.setBounds(0, 0, 360, 640);
		add(background);
		
		this.add(button);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e){
		
		if(vegan.isSelected()){
			array[0] = 0;
		}else if(vegetarian.isSelected()){
			array[0] = 1;
		}else if(sea.isSelected()){
			array[0] = 2;
		}else if(gluten.isSelected()){
			array[0] = 3;
		}else if(none.isSelected()){
			array[0] = 4;
		}
		else{
			array[0] = -1;
		}
		
		if(african.isSelected()){
			array[1] = 0;
		}else if(asian.isSelected()){
			array[1] = 1;
		}else if(european.isSelected()){
			array[1] = 2;
		}else if(oceanic.isSelected()){
			array[1] = 3;
		}else if(americas.isSelected()){
			array[1] = 4;
		}
		else{
			array[1] = -1;
		}
		
		if(breakfast.isSelected()){
			array[2] = 0;
		}else if(lunch.isSelected()){
			array[2] = 1;
		}else if(dinner.isSelected()){
			array[2] = 2;
		}
		else{
			array[2] = -1;
		}
		
		if(morning.isSelected()){
			array[3] = 0;
		}else if(midday.isSelected()){
			array[3] = 1;
		}else if(afternoon.isSelected()){
			array[3] = 2;
		}else if(evening.isSelected()){
			array[3] = 3;
		}else if(late.isSelected()){
			array[3] = 4;
		}
		else{
			array[3] = -1;
		}
		
		if(less1.isSelected()){
			array[4] = 0;
		}else if(more1.isSelected()){
			array[4] = 1;
		}else if(less5.isSelected()){
			array[4] = 2;
		}else if(more5.isSelected()){
			array[4] = 3;
		}
		else{
			array[4] = -1;
		}
		
		if(zero.isSelected()){
			array[5] = 0;
		}else if(ten.isSelected()){
			array[5] = 1;
		}else if(twenty.isSelected()){
			array[5] = 2;
		}else if(thirty.isSelected()){
			array[5] = 3;
		}
		else{
			array[5] = -1;
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
				
		System.out.println("1: " + array[0]);
		System.out.println("2: " + array[1]);
		System.out.println("3: " + array[2]);
		System.out.println("4: " + array[3]);
		System.out.println("5: " + array[4]);
		System.out.println("6: " + array[5]);

	}
}