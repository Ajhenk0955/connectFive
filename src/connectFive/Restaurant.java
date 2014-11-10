package connectFive;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class Restaurant extends QuestionFrame {
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
		
		//question 1
		type = new JLabel ("  1)  Which of these best describes you?");
		vegan = new JRadioButton("Vegan");
		vegetarian = new JRadioButton("Vegetarian");
		sea = new JRadioButton("Seafood allergies");
		gluten = new JRadioButton("Gluten intolerant");
		none = new JRadioButton("No restrictions");
		space = new JLabel("   ");
		button.add(type);
		button.add(vegan);
		button.add(vegetarian);
		button.add(sea);
		button.add(gluten);
		button.add(none);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(vegan);
		radioGroup.add(vegetarian);
		radioGroup.add(sea);
		radioGroup.add(gluten);
		radioGroup.add(none);
		add(button);
		
		//question 2
		cuisine = new JLabel ("  2)  What type of cuisine are you in the mood for?");
		african = new JRadioButton("African");
		asian  = new JRadioButton("Asian");
		european = new JRadioButton("European");
		oceanic = new JRadioButton("Oceanic");
		americas = new JRadioButton("Americas");
		space = new JLabel("   ");
		button.add(cuisine);
		button.add(african);
		button.add(asian);
		button.add(european);
		button.add(oceanic);
		button.add(americas);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(african);
		radioGroup.add(asian);
		radioGroup.add(european);
		radioGroup.add(oceanic);
		radioGroup.add(americas);
		add(button);
		
		//question 3
		meal = new JLabel ("  3)  Which meal type are you hungry for?");
		breakfast = new JRadioButton("Breakfast");
		lunch = new JRadioButton("Lunch");
		dinner = new JRadioButton("Dinner");
		space = new JLabel("   ");
		button.add(meal);
		button.add(breakfast);
		button.add(lunch);
		button.add(dinner);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(breakfast);
		radioGroup.add(lunch);
		radioGroup.add(dinner);
		add(button);
		
		//question 4
		time = new JLabel ("  4)  What time are you planning to eat?");
		morning = new JRadioButton("Morning");
		midday = new JRadioButton("Midday");
		afternoon = new JRadioButton("Afternoon");
		evening = new JRadioButton("Evening");
		late = new JRadioButton("Late night");
		space = new JLabel("   ");
		button.add(time);
		button.add(morning);
		button.add(midday);
		button.add(afternoon);
		button.add(evening);
		button.add(late);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(morning);
		radioGroup.add(midday);
		radioGroup.add(afternoon);
		radioGroup.add(evening);
		radioGroup.add(late);
		add(button);
		
		//question 5
		travel = new JLabel ("  5)  How far are you willing to travel?");
		less1 = new JRadioButton("Less than a mile");
		more1 = new JRadioButton("More than a mile");
		less5 = new JRadioButton("Less than five miles");
		more5 = new JRadioButton("More than five miles");
		space = new JLabel("   ");
		button.add(travel);
		button.add(less1);
		button.add(more1);
		button.add(less5);
		button.add(more5);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(less1);
		radioGroup.add(more1);
		radioGroup.add(less5);
		radioGroup.add(more5);
		add(button);
		
		//question 6
		price = new JLabel ("  6)  How much are you willing to spend on a meal?");
		zero = new JRadioButton("$0 - $9");
		ten = new JRadioButton("$10 - $19");
		twenty = new JRadioButton("$20 - $29");
		thirty = new JRadioButton("$30+");
		space = new JLabel("   ");
		button.add(price);
		button.add(zero);
		button.add(ten);
		button.add(twenty);
		button.add(thirty);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(zero);
		radioGroup.add(ten);
		radioGroup.add(twenty);
		radioGroup.add(thirty);
		add(button);
				
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