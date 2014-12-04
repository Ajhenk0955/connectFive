package connectFive;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
class Entertainment extends QuestionFrame{
	private JPanel question1;
	private JPanel question2;
	private JPanel question3;
	private JPanel question4;
	private JPanel question5;
	private JPanel question6;
	private JPanel question7;
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
		button.setOpaque(false);
		button.setLayout(null);
		
		//question 1
		question1 = new JPanel();
		question1.setOpaque(false);
		question1.setLayout(new BoxLayout(question1, BoxLayout.Y_AXIS));
		time = new JLabel ("  1)  What is the time of the day?");
		morning = new JRadioButton("morning");
		afternoon = new JRadioButton("afternoon");
		night = new JRadioButton("night");
		space = new JLabel("   ");
		question1.add(time);
		question1.add(morning);
		question1.add(afternoon);
		question1.add(night);
		question1.add(space);
		radioGroup1 = new ButtonGroup();
		radioGroup1.add(morning);
		radioGroup1.add(afternoon);
		radioGroup1.add(night);
		
		// text color
		time.setForeground(Color.WHITE);
		morning.setForeground(Color.WHITE);
		afternoon.setForeground(Color.WHITE);
		night.setForeground(Color.WHITE);
		
		//question 2
		question2 = new JPanel();
		question2.setOpaque(false);
		question2.setLayout(new BoxLayout(question2, BoxLayout.Y_AXIS));
		weather = new JLabel ("  2)  What is the weather like?");
		sunny = new JRadioButton("sunny");
		cloudy = new JRadioButton("cloudy");
		rainy = new JRadioButton("rainy");
		storming = new JRadioButton("storming");
		space = new JLabel("   ");
		question2.add(weather);
		question2.add(sunny);
		question2.add(cloudy);
		question2.add(rainy);
		question2.add(storming);
		question2.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(sunny);
		radioGroup.add(cloudy);
		radioGroup.add(rainy);
		radioGroup.add(storming);
		
		// text color
		weather.setForeground(Color.WHITE);
		sunny.setForeground(Color.WHITE);
		cloudy.setForeground(Color.WHITE);
		rainy.setForeground(Color.WHITE);
		storming.setForeground(Color.WHITE);
		
		//question 3
		question3 = new JPanel();
		question3.setOpaque(false);
		question3.setLayout(new BoxLayout(question3, BoxLayout.Y_AXIS));
		length = new JLabel ("  3)  How long do you want to be out for?");
		allDay = new JRadioButton("all day");
		twoHours = new JRadioButton("less than 2 hours");
		twoFiveH = new JRadioButton("2-5 hours");
		space = new JLabel("   ");
		question3.add(length);
		question3.add(allDay);
		question3.add(twoHours);
		question3.add(twoFiveH);
		question3.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(allDay);
		radioGroup.add(twoHours);
		radioGroup.add(twoFiveH);
		
		// text color
		length.setForeground(Color.WHITE);
		allDay.setForeground(Color.WHITE);
		twoHours.setForeground(Color.WHITE);
		twoFiveH.setForeground(Color.WHITE);
		
		//question 4
		question4 = new JPanel();
		question4.setOpaque(false);
		question4.setLayout(new BoxLayout(question4, BoxLayout.Y_AXIS));
		inOrOut = new JLabel ("  4)  Indoor or outdoor?");
		indoor = new JRadioButton("indoor");
		outdoor = new JRadioButton("outdoor");
		space = new JLabel("   ");
		question4.add(inOrOut);
		question4.add(indoor);
		question4.add(outdoor);
		question4.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(indoor);
		radioGroup.add(outdoor);
		
		// text color
		inOrOut.setForeground(Color.WHITE);
		indoor.setForeground(Color.WHITE);
		outdoor.setForeground(Color.WHITE);
		
		//question 5
		question5 = new JPanel();
		question5.setOpaque(false);
		question5.setLayout(new BoxLayout(question5, BoxLayout.Y_AXIS));
		cost = new JLabel ("  5)  How much money can you spend?");
		lessThan = new JRadioButton("less than $10");
		tenTwenty = new JRadioButton("$10-20");
		TwentyFifty = new JRadioButton("$20-50");
		fiftyPlus = new JRadioButton("$50+");
		space = new JLabel("   ");
		question5.add(cost);
		question5.add(lessThan);
		question5.add(tenTwenty);
		question5.add(TwentyFifty);
		question5.add(fiftyPlus);
		question5.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(lessThan);
		radioGroup.add(tenTwenty);
		radioGroup.add(TwentyFifty);
		radioGroup.add(fiftyPlus);
		
		// text color
		cost.setForeground(Color.WHITE);
		lessThan.setForeground(Color.WHITE);
		tenTwenty.setForeground(Color.WHITE);
		TwentyFifty.setForeground(Color.WHITE);
		fiftyPlus.setForeground(Color.WHITE);
		
		//question 6
		question6 = new JPanel();
		question6.setOpaque(false);
		question6.setLayout(new BoxLayout(question6, BoxLayout.Y_AXIS));
		age = new JLabel ("  6)  How old are you?");
		young = new JRadioButton("younger than 18");
		eighteenTwenty = new JRadioButton("18-20");
		twentyOnePlus = new JRadioButton("21+");
		space = new JLabel("   ");
		question6.add(age);
		question6.add(young);
		question6.add(eighteenTwenty);
		question6.add(twentyOnePlus);
		question6.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(young);
		radioGroup.add(eighteenTwenty);
		radioGroup.add(twentyOnePlus);
		
		// text color
		age.setForeground(Color.WHITE);
		young.setForeground(Color.WHITE);
		eighteenTwenty.setForeground(Color.WHITE);
		twentyOnePlus.setForeground(Color.WHITE);
		
		//question 7
		question7 = new JPanel();
		question7.setOpaque(false);
		question7.setLayout(new BoxLayout(question7, BoxLayout.Y_AXIS));
		distance = new JLabel ("  7)  How far can you travel?");
		fiveMiles = new JRadioButton("0-5 miles");
		fiveFifteen = new JRadioButton("5-15 miles");
		fifteenThirty = new JRadioButton("15-30 miles");
		thirtyPlus = new JRadioButton("30+ miles");
		space = new JLabel("   ");
		question7.add(distance);
		question7.add(fiveMiles);
		question7.add(fiveFifteen);
		question7.add(fifteenThirty);
		question7.add(thirtyPlus);
		question7.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(fiveMiles);
		radioGroup.add(fiveFifteen);
		radioGroup.add(fifteenThirty);
		radioGroup.add(thirtyPlus);
		
		// text color
		distance.setForeground(Color.WHITE);
		fiveMiles.setForeground(Color.WHITE);
		fiveFifteen.setForeground(Color.WHITE);
		fifteenThirty.setForeground(Color.WHITE);
		thirtyPlus.setForeground(Color.WHITE);
		
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
		background.setIcon(new ImageIcon("imgs/background2.png"));
		background.setBounds(0, 0, 360, 640);
		add(background);
		
		this.add(button);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		
		if(morning.isSelected()){
			array[0] = 0;
		}else if(afternoon.isSelected()){
			array[0] = 1;
		}else if(night.isSelected()){
			array[0] = 2;
		}else{
			array[0] = -1;
		}
		
		if(sunny.isSelected()){
			array[1] = 0;
		}else if(cloudy.isSelected()){
			array[1] = 1;
		}else if(rainy.isSelected()){
			array[1] = 2;
		}else if(storming.isSelected()){
			array[1] = 3;
		}else{
			array[1] = -1;
		}
		
		if(allDay.isSelected()){
			array[2] = 0;
		}else if(twoHours.isSelected()){
			array[2] = 1;
		}else if(twoFiveH.isSelected()){
			array[2] = 2;
		}else{
			array[2] = -1;
		}
		
		if(indoor.isSelected()){
			array[3] = 0;
		}else if(outdoor.isSelected()){
			array[3] = 1;
		}else{
			array[3] = -1;
		}
		
		if(lessThan.isSelected()){
			array[4] = 0;
		}else if(tenTwenty.isSelected()){
			array[4] = 1;
		}else if(TwentyFifty.isSelected()){
			array[4] = 2;
		}else if(fiftyPlus.isSelected()){
			array[4] = 3;
		}else{
			array[4] = -1;
		}
		
		if(young.isSelected()){
			array[5] = 0;
		}else if(eighteenTwenty.isSelected()){
			array[5] = 1;
		}else if(twentyOnePlus.isSelected()){
			array[5] = 2;
		}else{
			array[5] = -1;
		}
		
		if(fiveMiles.isSelected()){
			array[6] = 0;
		}else if(fiveFifteen.isSelected()){
			array[6] = 1;
		}else if(fifteenThirty.isSelected()){
			array[6] = 2;
		}else if(thirtyPlus.isSelected()){
			array[6] = 3;
		}else{
			array[6] = -1;
		}
		
		for(int i=0; i<array.length; i++){
			if(array[i]<0){
				submit.setEnabled(false);
				break;
			}else{
				submit.setEnabled(true);
				// store results in DB
				// insert code here
			}
		}
	}
}