package connectFive;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class Restaurant extends JFrame implements ActionListener{
	private JButton submit;
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
		super("Restaurant Questionnaire");
		JPanel button = new JPanel(new GridLayout(0,1));
		JPanel buttonJPanel = new JPanel();
		submit = new JButton("Submit");
		buttonJPanel.add(submit);
		add(buttonJPanel, BorderLayout.SOUTH);
		
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
		submit.addActionListener(this);
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
		
		if(e.getSource() == vegan){
			array[0] = 0;
		}else if(e.getSource() == vegetarian){
			array[0] = 1;
		}else if(e.getSource() == sea){
			array[0] = 2;
		}else if(e.getSource() == gluten){
			array[0] = 3;
		}else if(e.getSource() == none){
			array[0] = 4;
		}
		
		if(e.getSource() == african){
			array[1] = 0;
		}else if(e.getSource() == asian){
			array[1] = 1;
		}else if(e.getSource() == european){
			array[1] = 2;
		}else if(e.getSource() == oceanic){
			array[1] = 3;
		}else if(e.getSource() == americas){
			array[1] = 4;
		}
		
		if(e.getSource() == breakfast){
			array[2] = 0;
		}else if(e.getSource() == lunch){
			array[2] = 1;
		}else if(e.getSource() == dinner){
			array[2] = 2;
		}
		
		if(e.getSource() == morning){
			array[3] = 0;
		}else if(e.getSource() == midday){
			array[3] = 1;
		}else if(e.getSource() == afternoon){
			array[3] = 2;
		}else if(e.getSource() == evening){
			array[3] = 3;
		}else if(e.getSource() == late){
			array[3] = 4;
		}
		
		if(e.getSource() == less1){
			array[4] = 0;
		}else if(e.getSource() == more1){
			array[4] = 1;
		}else if(e.getSource() == less5){
			array[4] = 2;
		}else if(e.getSource() == more5){
			array[4] = 3;
		}
		
		if(e.getSource() == zero){
			array[5] = 0;
		}else if(e.getSource() == ten){
			array[5] = 1;
		}else if(e.getSource() == twenty){
			array[5] = 2;
		}else if(e.getSource() == thirty){
			array[5] = 3;
		}
				
		System.out.println("1: " + array[0]);
		System.out.println("2: " + array[1]);
		System.out.println("3: " + array[2]);
		System.out.println("4: " + array[3]);
		System.out.println("5: " + array[4]);
		System.out.println("6: " + array[5]);
		
		if(e.getSource() == submit){
			JOptionPane.showMessageDialog(null, "You've submitted your test!");
			profile pro = new profile();
			pro.setSize(360,640);
			pro.viewProfile();
			setVisible(false);
		}
	}
	

	public static void main( String args[] ){
		   Restaurant buttonFrame = new Restaurant();
		   buttonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		   buttonFrame.setSize( 360, 640 ); // set frame size
		   buttonFrame.setVisible( true ); // display frame
	}

}