package connectFive;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class Roommate extends QuestionFrame{

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
	private JLabel space;
	private ButtonGroup radioGroup;
	int [] array = new int [6];
	
	Roommate (){
		super();
		JPanel button = new JPanel(new GridLayout(0,1));

		//question 1
		gender = new JLabel ("  1)  Are you a female or male?");
		fem = new JRadioButton("Female");
		male = new JRadioButton("Male");
		space = new JLabel("   ");
		button.add(gender);
		button.add(fem);
		button.add(male);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(fem);
		radioGroup.add(male);
		add(button);
		
		//question 2
		year = new JLabel ("  2)  What year of college are you in?");
		fresh = new JRadioButton("Freshman");
		soph = new JRadioButton("Sophomore");
		jun = new JRadioButton("Junior");
		sen = new JRadioButton("Senior");
		grad = new JRadioButton("Graduate");
		space = new JLabel("   ");
		button.add(year);
		button.add(fresh);
		button.add(soph);
		button.add(jun);
		button.add(sen);
		button.add(grad);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(fresh);
		radioGroup.add(soph);
		radioGroup.add(jun);
		radioGroup.add(sen);
		radioGroup.add(grad);
		add(button);
		
		//question 3
		wake = new JLabel ("  3)  Which of these best describes you?");
		dawn = new JRadioButton("Up at dawn");
		bird = new JRadioButton("Early bird");
		owl = new JRadioButton("Night owl");
		space = new JLabel("   ");
		button.add(wake);
		button.add(dawn);
		button.add(bird);
		button.add(owl);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(dawn);
		radioGroup.add(bird);
		radioGroup.add(owl);
		add(button);
		
		//question 4
		you = new JLabel ("  4)  What type of person would you like to room with?");
		less = new JRadioButton("Less like you");
		more = new JRadioButton("More like you");
		any = new JRadioButton("Anyone will do");
		space = new JLabel("   ");
		button.add(you);
		button.add(less);
		button.add(more);
		button.add(any);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(less);
		radioGroup.add(more);
		radioGroup.add(any);
		add(button);
		
		//question 5
		pers = new JLabel ("  5)  Which of these best describes you?");
		soc = new JRadioButton("Social");
		rec = new JRadioButton("Reclusive");
		dep = new JRadioButton("Dependable");
		unre = new JRadioButton("Unreliable");
		space = new JLabel("   ");
		button.add(pers);
		button.add(soc);
		button.add(rec);
		button.add(dep);
		button.add(unre);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(soc);
		radioGroup.add(rec);
		radioGroup.add(dep);
		radioGroup.add(unre);
		add(button);
		
		//question 6
		clean = new JLabel ("  6)  How often do you clean?");
		godly = new JRadioButton("Cleanliness is next to godliness");
		reg = new JRadioButton("Cleaning happens on a regular basis");
		often = new JRadioButton("Cleaning should happen more often");
		pigsty = new JRadioButton("Pigsty is the way to go");
		space = new JLabel("   ");
		button.add(clean);
		button.add(godly);
		button.add(reg);
		button.add(often);
		button.add(pigsty);
		button.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(godly);
		radioGroup.add(reg);
		radioGroup.add(often);
		radioGroup.add(pigsty);
		add(button);
		
		// action listeners
		
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
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		
		// question 1
		if(fem.isSelected()){
			array[0] = 0;
		}else if(male.isSelected()){
			array[0] = 1;
		}
		else{
			array[0] = -1;
		}
		
		// question 2
		if(fresh.isSelected()){
			array[1] = 0;
		}else if(soph.isSelected()){
			array[1] = 1;
		}else if(jun.isSelected()){
			array[1] = 2;
		}else if(sen.isSelected()){
			array[1] = 3;
		}else if(grad.isSelected()){
			array[1] = 4;
		}
		else{
			array[1] = -1;
		}
		
		// question 3
		if(dawn.isSelected()){
			array[2] = 0;
		}else if(bird.isSelected()){
			array[2] = 1;
		}else if(owl.isSelected()){
			array[2] = 2;
		}
		else{
			array[2] = -1;
		}
		
		// question 4
		if(less.isSelected()){
			array[3] = 0;
		}else if(more.isSelected()){
			array[3] = 1;
		}else if(any.isSelected()){
			array[3] = 2;
		}
		else{
			array[3] = -1;
		}
		
		// question 5
		if(soc.isSelected()){
			array[4] = 0;
		}else if(rec.isSelected()){
			array[4] = 1;
		}else if(dep.isSelected()){
			array[4] = 2;
		}else if(unre.isSelected()){
			array[4] = 3;
		}
		else{
			array[4] = -1;
		}
		
		// question 6
		if(godly.isSelected()){
			array[5] = 0;
		}else if(reg.isSelected()){
			array[5] = 1;
		}else if(often.isSelected()){
			array[5] = 2;
		}else if(pigsty.isSelected()){
			array[5] = 3;
		}
		else{
			array[5] = -1;
		}
		
		// testing result storage
		System.out.println("1: " + array[0]);
		System.out.println("2: " + array[1]);
		System.out.println("3: " + array[2]);
		System.out.println("4: " + array[3]);
		System.out.println("5: " + array[4]);
		System.out.println("6: " + array[5]);
		
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