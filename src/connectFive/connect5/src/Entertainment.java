import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class Entertainment extends QuestionFrame{
	private JRadioButton morning;
	private JRadioButton afternoon;
	private JRadioButton night;
	private JRadioButton sunny;
	private JRadioButton cloudy;
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
	private JLabel time;
	private JLabel weather;
	private JLabel length;
	private JLabel inOrOut;
	private JLabel cost;
	private JLabel age;
	private JLabel distance;
	private JLabel space;
	private ButtonGroup radioGroup;
	private ButtonGroup radioGroup1;
	int [] array = new int [7];
	
	Entertainment (){
		super();
		JPanel button = new JPanel(new GridLayout(0,1));
		
		//question 1
		time = new JLabel ("  1)  What is the time of the day?");
		morning = new JRadioButton("morning");
		afternoon = new JRadioButton("afternoon");
		night = new JRadioButton("night");
		space = new JLabel("   ");
		button.add(time);
		button.add(morning);
		button.add(afternoon);
		button.add(night);
		button.add(space);
		radioGroup1 = new ButtonGroup();
		radioGroup1.add(morning);
		radioGroup1.add(afternoon);
		radioGroup1.add(night);
		add(button);
		
		//question 2
		weather = new JLabel ("  2)  What is the weather like?");
		sunny = new JRadioButton("sunny");
		cloudy = new JRadioButton("cloudy");
		rainy = new JRadioButton("rainy");
		storming = new JRadioButton("storming");
		space = new JLabel("   ");
		button.add(weather);
		button.add(sunny);
		button.add(cloudy);
		button.add(rainy);
		button.add(storming);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(sunny);
		radioGroup.add(cloudy);
		radioGroup.add(rainy);
		radioGroup.add(storming);
		add(button);
		
		//question 3
		length = new JLabel ("  3)  How long do you want to be out for?");
		allDay = new JRadioButton("all day");
		twoHours = new JRadioButton("less than 2 hours");
		twoFiveH = new JRadioButton("2-5 hours");
		space = new JLabel("   ");
		button.add(length);
		button.add(allDay);
		button.add(twoHours);
		button.add(twoFiveH);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(allDay);
		radioGroup.add(twoHours);
		radioGroup.add(twoFiveH);
		add(button);
		
		//question 4
		inOrOut = new JLabel ("  4)  Indoor or outdoor?");
		indoor = new JRadioButton("indoor");
		outdoor = new JRadioButton("outdoor");
		space = new JLabel("   ");
		button.add(inOrOut);
		button.add(indoor);
		button.add(outdoor);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(indoor);
		radioGroup.add(outdoor);
		add(button);
		
		//question 5
		cost = new JLabel ("  5)  How much money can you spend?");
		lessThan = new JRadioButton("less than $10");
		tenTwenty = new JRadioButton("$10-20");
		TwentyFifty = new JRadioButton("$20-50");
		fiftyPlus = new JRadioButton("$50+");
		space = new JLabel("   ");
		button.add(cost);
		button.add(lessThan);
		button.add(tenTwenty);
		button.add(TwentyFifty);
		button.add(fiftyPlus);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(lessThan);
		radioGroup.add(tenTwenty);
		radioGroup.add(TwentyFifty);
		radioGroup.add(fiftyPlus);
		add(button);
		
		//question 6
		age = new JLabel ("  6)  How old are you?");
		young = new JRadioButton("younger than 18");
		eighteenTwenty = new JRadioButton("18-20");
		twentyOnePlus = new JRadioButton("21+");
		space = new JLabel("   ");
		button.add(age);
		button.add(young);
		button.add(eighteenTwenty);
		button.add(twentyOnePlus);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(young);
		radioGroup.add(eighteenTwenty);
		radioGroup.add(twentyOnePlus);
		add(button);
		
		//question 7
		distance = new JLabel ("  7)  How far can you travel?");
		fiveMiles = new JRadioButton("0-5 miles");
		fiveFifteen = new JRadioButton("5-15 miles");
		fifteenThirty = new JRadioButton("15-30 miles");
		thirtyPlus = new JRadioButton("30+ miles");
		space = new JLabel("   ");
		button.add(distance);
		button.add(fiveMiles);
		button.add(fiveFifteen);
		button.add(fifteenThirty);
		button.add(thirtyPlus);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(fiveMiles);
		radioGroup.add(fiveFifteen);
		radioGroup.add(fifteenThirty);
		radioGroup.add(thirtyPlus);
		add(button);
		
		// action listeners
		morning.addActionListener(this);
		afternoon.addActionListener(this);
		night.addActionListener(this);
		sunny.addActionListener(this);
		cloudy.addActionListener(this);
		rainy.addActionListener(this);
		storming.addActionListener(this);
		allDay.addActionListener(this);
		twoHours.addActionListener(this);
		twoFiveH.addActionListener(this);
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
		
		// array to store results
		int [] maxArray = new int [7];
		maxArray[0] = 2;
		maxArray[1] = 3;
		maxArray[2] = 2;
		maxArray[3] = 1;
		maxArray[4] = 3;
		maxArray[5] = 2;
		maxArray[6] = 3;
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		
		if(morning.isSelected()){
			array[0] = 0;
		}
		
		else if(afternoon.isSelected()){
			array[0] = 1;
		}
		
		else if(night.isSelected()){
			array[0] = 2;
		}
		else{
			array[0] = -1;
		}
		
		if(sunny.isSelected()){
			array[1] = 0;
		}
		
		else if(cloudy.isSelected()){
			array[1] = 1;
		}
		
		else if(rainy.isSelected()){
			array[1] = 2;
		}
		
		else if(storming.isSelected()){
			array[1] = 3;
		}
		else{
			array[1] = -1;
		}
		
		if(allDay.isSelected()){
			array[2] = 0;
		}
		
		else if(twoHours.isSelected()){
			array[2] = 1;
		}
		
		else if(twoFiveH.isSelected()){
			array[2] = 2;
		}
		else{
			array[2] = -1;
		}
		
		if(indoor.isSelected()){
			array[3] = 0;
		}
		
		else if(outdoor.isSelected()){
			array[3] = 1;
		}
		else{
			array[3] = -1;
		}
		
		if(lessThan.isSelected()){
			array[4] = 0;
		}
		
		else if(tenTwenty.isSelected()){
			array[4] = 1;
		}
		
		else if(TwentyFifty.isSelected()){
			array[4] = 2;
		}
		
		else if(fiftyPlus.isSelected()){
			array[4] = 3;
		}
		else{
			array[4] = -1;
		}
		
		if(young.isSelected()){
			array[5] = 0;
		}
		
		else if(eighteenTwenty.isSelected()){
			array[5] = 1;
		}
		
		else if(twentyOnePlus.isSelected()){
			array[5] = 2;
		}
		else{
			array[5] = -1;
		}
		
		if(fiveMiles.isSelected()){
			array[6] = 0;
		}
		
		else if(fiveFifteen.isSelected()){
			array[6] = 1;
		}
		
		else if(fifteenThirty.isSelected()){
			array[6] = 2;
		}
		
		else if(thirtyPlus.isSelected()){
			array[6] = 3;
		}
		else{
			array[6] = -1;
		}
		
		for(int i=0; i<array.length; i++){
			if(array[i]<0){
				submit.setEnabled(false);
				break;
			}
			else{
				submit.setEnabled(true);
			}
		}
		
		// testing result storage
		System.out.println("1: " + array[0]);
		System.out.println("2: " + array[1]);
		System.out.println("3: " + array[2]);
		System.out.println("4: " + array[3]);
		System.out.println("5: " + array[4]);
		System.out.println("6: " + array[5]);
		System.out.println("7: " + array[6]);

	}
	

	public static void main( String args[] ){
		   Entertainment buttonFrame = new Entertainment();
		   buttonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		   buttonFrame.setSize( 360, 640 ); // set frame size
		   buttonFrame.setVisible( true ); // display frame
	}

}