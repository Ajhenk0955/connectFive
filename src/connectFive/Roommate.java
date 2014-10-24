package connectFive;

import java.awt.*;
import java.awt.event.*;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class Roommate extends JFrame implements ActionListener{
	private JButton submit;
	private JRadioButton fem;
	private JRadioButton male;
	private JRadioButton fresh;
	private JRadioButton soph;
	private JRadioButton jun;
	private JRadioButton sen;
	private JRadioButton grad;
	private JRadioButton dawn;
	private JRadioButton bird;
	private JRadioButton owl;
	private JRadioButton less;
	private JRadioButton more;
	private JRadioButton any;
	private JRadioButton soc;
	private JRadioButton rec;
	private JRadioButton dep;
	private JRadioButton unre;
	private JRadioButton godly;
	private JRadioButton reg;
	private JRadioButton often;
	private JRadioButton pigsty;
	private JLabel gender;
	private JLabel year;
	private JLabel wake;
	private JLabel you;
	private JLabel pers;
	private JLabel clean;
	private ButtonGroup radioGroup;
	int [] array = new int [7];
	
	Roommate (){
		super("Roommate Questionnaire");
		JPanel button = new JPanel(new GridLayout(0,1));
		JPanel buttonJPanel = new JPanel();
		submit = new JButton("Submit");
		buttonJPanel.add(submit);
		add(buttonJPanel, BorderLayout.SOUTH);
		
		//question 1
		gender = new JLabel ("1) Are you a female or male?");
		fem = new JRadioButton("Female");
		male = new JRadioButton("Male");
		button.add(gender);
		button.add(fem);
		button.add(male);
		radioGroup = new ButtonGroup();
		radioGroup.add(fem);
		radioGroup.add(male);
		add(button);
		
		//question 2
		year = new JLabel ("2) What year of college are you in?");
		fresh = new JRadioButton("Freshman");
		soph = new JRadioButton("Sophomore");
		jun = new JRadioButton("Junior");
		sen = new JRadioButton("Senior");
		grad = new JRadioButton("Graduate");
		button.add(year);
		button.add(fresh);
		button.add(soph);
		button.add(jun);
		button.add(sen);
		button.add(grad);
		radioGroup = new ButtonGroup();
		radioGroup.add(fresh);
		radioGroup.add(soph);
		radioGroup.add(jun);
		radioGroup.add(sen);
		radioGroup.add(grad);
		add(button);
		
		//question 3
		wake = new JLabel ("3) Which of these best describes you?");
		dawn = new JRadioButton("Up at dawn");
		bird = new JRadioButton("Early bird");
		owl = new JRadioButton("Night owl");
		button.add(wake);
		button.add(dawn);
		button.add(bird);
		button.add(owl);
		radioGroup = new ButtonGroup();
		radioGroup.add(dawn);
		radioGroup.add(bird);
		radioGroup.add(owl);
		add(button);
		
		//question 4
		you = new JLabel ("4) What type of person would you like to room with?");
		less = new JRadioButton("Less like you");
		more = new JRadioButton("More like you");
		any = new JRadioButton("Anyone will do");
		button.add(you);
		button.add(less);
		button.add(more);
		button.add(any);
		radioGroup = new ButtonGroup();
		radioGroup.add(less);
		radioGroup.add(more);
		radioGroup.add(any);
		add(button);
		
		//question 5
		pers = new JLabel ("5) Which of these best describes you?");
		soc = new JRadioButton("Social");
		rec = new JRadioButton("Reclusive");
		dep = new JRadioButton("Dependable");
		unre = new JRadioButton("Unreliable");
		button.add(pers);
		button.add(soc);
		button.add(rec);
		button.add(dep);
		button.add(unre);
		radioGroup = new ButtonGroup();
		radioGroup.add(soc);
		radioGroup.add(rec);
		radioGroup.add(dep);
		radioGroup.add(unre);
		add(button);
		
		//question 6
		clean = new JLabel ("6) How often do you clean?");
		godly = new JRadioButton("Cleanliness is next to godliness");
		reg = new JRadioButton("Cleaning happens on a regular basis");
		often = new JRadioButton("Cleaning should happen more often");
		pigsty = new JRadioButton("Pigsty is the way to go");
		button.add(clean);
		button.add(godly);
		button.add(reg);
		button.add(often);
		button.add(pigsty);
		radioGroup = new ButtonGroup();
		radioGroup.add(godly);
		radioGroup.add(reg);
		radioGroup.add(often);
		radioGroup.add(pigsty);
		add(button);
		
		// action listeners
		submit.addActionListener(this);
		fem.addActionListener(this);
		male.addActionListener(this);
		fresh.addActionListener(this);
		soph.addActionListener(this);
		jun.addActionListener(this);
		sen.addActionListener(this);
		grad.addActionListener(this);
		dawn.addActionListener(this);
		bird.addActionListener(this);
		owl.addActionListener(this);
		less.addActionListener(this);
		more.addActionListener(this);
		any.addActionListener(this);
		soc.addActionListener(this);
		rec.addActionListener(this);
		dep.addActionListener(this);
		unre.addActionListener(this);
		godly.addActionListener(this);
		reg.addActionListener(this);
		often.addActionListener(this);
		pigsty.addActionListener(this);
		
		// array to store results
		int [] maxArray = new int [6];
		maxArray[0] = 2;
		maxArray[1] = 5;
		maxArray[2] = 3;
		maxArray[3] = 3;
		maxArray[4] = 4;
		maxArray[5] = 4;
	}
	
	public void actionPerformed(ActionEvent e){
		
		// question 1
		if(e.getSource() == fem){
			array[0] = 0;
		}else if(e.getSource() == male){
			array[0] = 1;
		}
		
		// question 2
		if(e.getSource() == fresh){
			array[1] = 0;
		}else if(e.getSource() == soph){
			array[1] = 1;
		}else if(e.getSource() == jun){
			array[1] = 2;
		}else if(e.getSource() == sen){
			array[1] = 3;
		}else if(e.getSource() == grad){
			array[1] = 4;
		}
		
		// question 3
		if(e.getSource() == dawn){
			array[2] = 0;
		}else if(e.getSource() == bird){
			array[2] = 1;
		}else if(e.getSource() == owl){
			array[2] = 2;
		}
		
		// question 4
		if(e.getSource() == less){
			array[3] = 0;
		}else if(e.getSource() == more){
			array[3] = 1;
		}else if(e.getSource() == any){
			array[3] = 2;
		}
		
		// question 5
		if(e.getSource() == soc){
			array[4] = 0;
		}else if(e.getSource() == rec){
			array[4] = 1;
		}else if(e.getSource() == dep){
			array[4] = 2;
		}else if(e.getSource() == unre){
			array[4] = 3;
		}
		
		// question 6
		if(e.getSource() == godly){
			array[5] = 0;
		}else if(e.getSource() == reg){
			array[5] = 1;
		}else if(e.getSource() == often){
			array[5] = 2;
		}else if(e.getSource() == pigsty){
			array[5] = 3;
		}
		
		// testing result storage
		System.out.println("1: " + array[0]);
		System.out.println("2: " + array[1]);
		System.out.println("3: " + array[2]);
		System.out.println("4: " + array[3]);
		System.out.println("5: " + array[4]);
		System.out.println("6: " + array[5]);
		
		if(e.getSource() == submit){
			JOptionPane.showMessageDialog(null, "You've submitted your test!");
			this.setVisible(false);
		}
	}
	

	public static void main( String args[] ){
		   Roommate buttonFrame = new Roommate();
		   buttonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		   buttonFrame.setSize( 360, 640 ); // set frame size
		   buttonFrame.setVisible( true ); // display frame
	}

}