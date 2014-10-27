package connectFive;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class RSO extends JFrame implements ActionListener{
	private JButton submit;
	private JRadioButton baking;
	private JRadioButton gaming;
	private JRadioButton reading;
	private JRadioButton building;
	private JRadioButton volunteering;
	private JRadioButton sports;
	private JRadioButton engineering;
	private JRadioButton math;
	private JRadioButton hs;
	private JRadioButton his;
	private JRadioButton eng;
	private JRadioButton arts;
	private JRadioButton yes;
	private JRadioButton no;
	private JRadioButton baking2;
	private JRadioButton gaming2;
	private JRadioButton reading2;
	private JRadioButton building2;
	private JRadioButton volunteering2;
	private JRadioButton sports2;
	private JRadioButton acad;
	private JRadioButton cult;
	private JRadioButton med;
	private JRadioButton pol;
	private JRadioButton rel;
	private JRadioButton ser;
	private JRadioButton sports3;
	private JRadioButton multi;
	private JRadioButton week;
	private JRadioButton bi;
	private JRadioButton month;
	private JRadioButton zero;
	private JRadioButton five;
	private JRadioButton ten;
	private JRadioButton thirty;
	private JLabel enjoy;
	private JLabel major;
	private JLabel connect;
	private JLabel least;
	private JLabel most;
	private JLabel meet;
	private JLabel donate;
	private JLabel space;
	private ButtonGroup radioGroup;

	int [] array = new int [7];
	
	RSO (){
		super("RSO Questionnaire");
		JPanel button = new JPanel(new GridLayout(0,1));
		JPanel buttonJPanel = new JPanel();
		submit = new JButton("Submit");
		buttonJPanel.add(submit);
		add(buttonJPanel, BorderLayout.SOUTH);
		
		//question 1
		enjoy = new JLabel ("  1)  What do you enjoy doing (select one that applies most)?");
		baking = new JRadioButton("Baking");
		gaming = new JRadioButton("Gaming");
		reading = new JRadioButton("Reading");
		building = new JRadioButton("Building");
		volunteering = new JRadioButton("Volunteering");
		sports = new JRadioButton("Sports");
		space = new JLabel("   ");
		button.add(enjoy);
		button.add(baking);
		button.add(gaming);
		button.add(reading);
		button.add(building);
		button.add(volunteering);
		button.add(sports);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(baking);
		radioGroup.add(gaming);
		radioGroup.add(reading);
		radioGroup.add(building);
		radioGroup.add(volunteering);
		radioGroup.add(sports);
		add(button);
		
		//question 2
		major = new JLabel ("  2)  What is your major?");
		engineering = new JRadioButton("Engineering");
		math  = new JRadioButton("Math");
		hs = new JRadioButton("Health Professions and Social Works");
		his = new JRadioButton("History");
		eng = new JRadioButton("English");
		arts = new JRadioButton("Arts");
		space = new JLabel("   ");
		button.add(major);
		button.add(engineering);
		button.add(math);
		button.add(hs);
		button.add(his);
		button.add(eng);
		button.add(arts);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(engineering);
		radioGroup.add(math);
		radioGroup.add(hs);
		radioGroup.add(eng);
		radioGroup.add(arts);
		add(button);
		
		//question 3
		connect = new JLabel ("  3)  Do you prefer something major related?");
		yes = new JRadioButton("Yes");
		no = new JRadioButton("No");
		space = new JLabel("   ");
		button.add(connect);
		button.add(yes);
		button.add(no);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(yes);
		radioGroup.add(no);
		add(button);
		
		//question 4
		least = new JLabel ("  4)  What is least interesting to you?");
		baking2 = new JRadioButton("Baking");
		gaming2 = new JRadioButton("Gaming");
		reading2 = new JRadioButton("Reading");
		building2 = new JRadioButton("Building");
		volunteering2 = new JRadioButton("Volunteering");
		sports2 = new JRadioButton("Sports");
		space = new JLabel("   ");
		button.add(least);
		button.add(baking2);
		button.add(gaming2);
		button.add(reading2);
		button.add(building2);
		button.add(volunteering2);
		button.add(sports2);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(baking2);
		radioGroup.add(gaming);
		radioGroup.add(reading2);
		radioGroup.add(building2);
		radioGroup.add(volunteering2);
		radioGroup.add(sports2);
		add(button);
		
		//question 5
		most = new JLabel ("  5)  Which category is most interesting to you?");
		acad = new JRadioButton("Academic");
		cult = new JRadioButton("Culture");
		med = new JRadioButton("Media");
		pol = new JRadioButton("Politics");
		rel = new JRadioButton("Religion");
		ser = new JRadioButton("Service");
		sports3 = new JRadioButton("Sports");
		space = new JLabel("   ");
		button.add(most);
		button.add(acad);
		button.add(cult);
		button.add(med);
		button.add(pol);
		button.add(rel);
		button.add(ser);
		button.add(sports3);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(acad);
		radioGroup.add(cult);
		radioGroup.add(med);
		radioGroup.add(pol);
		radioGroup.add(rel);
		radioGroup.add(ser);
		radioGroup.add(sports3);
		add(button);
		
		//question 6
		meet = new JLabel ("  6)  How often are you available to meet?");
		multi = new JRadioButton("Multiple times a week");
		week = new JRadioButton("Once a week");
		bi = new JRadioButton("Biweekly");
		month = new JRadioButton("Once a month");
		space = new JLabel("   ");
		button.add(meet);
		button.add(multi);
		button.add(week);
		button.add(bi);
		button.add(month);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(multi);
		radioGroup.add(week);
		radioGroup.add(bi);
		radioGroup.add(month);
		add(button);
		
		//question 7
		donate = new JLabel ("  7)  How often can you donate to the RSO?");
		zero = new JRadioButton("$0");
		five = new JRadioButton("$5 - $10");
		ten = new JRadioButton("$10 - $30");
		thirty = new JRadioButton("$30+");
		space = new JLabel("   ");
		button.add(donate);
		button.add(zero);
		button.add(five);
		button.add(ten);
		button.add(thirty);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(zero);
		radioGroup.add(five);
		radioGroup.add(ten);
		radioGroup.add(thirty);
		add(button);
		
		// action listener
		submit.addActionListener(this);
		baking.addActionListener(this);
		gaming.addActionListener(this);
		reading.addActionListener(this);
		building.addActionListener(this);
		volunteering.addActionListener(this);
		sports.addActionListener(this);
		engineering.addActionListener(this);
		math.addActionListener(this);
		hs.addActionListener(this);
		his.addActionListener(this);
		eng.addActionListener(this);
		arts.addActionListener(this);
		yes.addActionListener(this);
		no.addActionListener(this);
		baking2.addActionListener(this);
		gaming2.addActionListener(this);
		reading2.addActionListener(this);
		building2.addActionListener(this);
		volunteering2.addActionListener(this);
		sports2.addActionListener(this);
		acad.addActionListener(this);
		cult.addActionListener(this);
		med.addActionListener(this);
		pol.addActionListener(this);
		rel.addActionListener(this);
		ser.addActionListener(this);
		sports3.addActionListener(this);
		multi.addActionListener(this);
		week.addActionListener(this);
		bi.addActionListener(this);
		month.addActionListener(this);
		zero.addActionListener(this);
		five.addActionListener(this);
		ten.addActionListener(this);
		thirty.addActionListener(this);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource() == baking){
			array[0] = 0;
		}else if(e.getSource() == gaming){
			array[0] = 1;
		}else if(e.getSource() == reading){
			array[0] = 2;
		}else if(e.getSource() == building){
			array[0] = 3;
		}else if(e.getSource() == volunteering){
			array[0] = 4;
		}else if(e.getSource() == sports){
			array[0] = 5;
		}
		
		if(e.getSource() == engineering){
			array[1] = 0;
		}else if(e.getSource() == math){
			array[1] = 1;
		}else if(e.getSource() == hs){
			array[1] = 2;
		}else if(e.getSource() == his){
			array[1] = 3;
		}else if(e.getSource() == eng){
			array[1] = 4;
		}else if(e.getSource() == arts){
			array[1] = 5;
		}
		
		if(e.getSource() == yes){
			array[2] = 0;
		}else if(e.getSource() == no){
			array[2] = 1;
		}
		
		if(e.getSource() == baking2){
			array[3] = 0;
		}else if(e.getSource() == gaming2){
			array[3] = 1;
		}else if(e.getSource() == reading2){
			array[3] = 2;
		}else if(e.getSource() == building2){
			array[3] = 3;
		}else if(e.getSource() == volunteering2){
			array[3] = 4;
		}else if(e.getSource() == sports2){
			array[3] = 5;
		}
		
		if(e.getSource() == acad){
			array[4] = 0;
		}else if(e.getSource() == cult){
			array[4] = 1;
		}else if(e.getSource() == med){
			array[4] = 2;
		}else if(e.getSource() == pol){
			array[4] = 3;
		}else if(e.getSource() == rel){
			array[4] = 4;
		}else if(e.getSource() == ser){
			array[4] = 5;
		}else if(e.getSource() == sports3){
			array[4] = 6;
		}
		
		if(e.getSource() == multi){
			array[5] = 0;
		}else if(e.getSource() == week){
			array[5] = 1;
		}else if(e.getSource() == bi){
			array[5] = 2;
		}else if(e.getSource() == month){
			array[5] = 3;
		}
		
		if(e.getSource() == zero){
			array[6] = 0;
		}else if(e.getSource() == five){
			array[6] = 1;
		}else if(e.getSource() == ten){
			array[6] = 2;
		}else if(e.getSource() == thirty){
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
			profile pro = new profile();
			pro.setSize(360,640);
			pro.viewProfile();
			setVisible(false);
		}
	}
	

	public static void main( String args[] ){
		   RSO buttonFrame = new RSO();
		   buttonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		   buttonFrame.setSize( 360, 640 ); // set frame size
		   buttonFrame.setVisible( true ); // display frame
	}

}