package connectFive;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
class Roommate extends Question {
	private JPanel question1;
	private JPanel question2;
	private JPanel question3;
	private JPanel question4;
	private JPanel question5;
	private JPanel question6;
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
	int[] array = new int[6];

	Roommate() {
		super();
		JPanel button = new JPanel(new GridLayout(0, 1));
		button.setOpaque(false);
		button.setLayout(null);

		// question 1
		question1 = new JPanel();
		question1.setOpaque(false);
		question1.setLayout(new BoxLayout(question1, BoxLayout.Y_AXIS));
		gender = new JLabel("  1)  Are you a female or male?");
		fem = new JRadioButton("Female");
		male = new JRadioButton("Male");
		space = new JLabel("   ");
		question1.add(gender);
		question1.add(fem);
		question1.add(male);
		question1.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(fem);
		radioGroup.add(male);

		// question 2
		question2 = new JPanel();
		question2.setOpaque(false);
		question2.setLayout(new BoxLayout(question2, BoxLayout.Y_AXIS));
		year = new JLabel("  2)  What year of college are you in?");
		fresh = new JRadioButton("Freshman");
		soph = new JRadioButton("Sophomore");
		jun = new JRadioButton("Junior");
		sen = new JRadioButton("Senior");
		grad = new JRadioButton("Graduate");
		space = new JLabel("   ");
		question2.add(year);
		question2.add(fresh);
		question2.add(soph);
		question2.add(jun);
		question2.add(sen);
		question2.add(grad);
		question2.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(fresh);
		radioGroup.add(soph);
		radioGroup.add(jun);
		radioGroup.add(sen);
		radioGroup.add(grad);

		// question 3
		question3 = new JPanel();
		question3.setOpaque(false);
		question3.setLayout(new BoxLayout(question3, BoxLayout.Y_AXIS));
		wake = new JLabel("  3)  Which of these best describes you?");
		dawn = new JRadioButton("Up at dawn");
		bird = new JRadioButton("Early bird");
		owl = new JRadioButton("Night owl");
		space = new JLabel("   ");
		question3.add(wake);
		question3.add(dawn);
		question3.add(bird);
		question3.add(owl);
		question3.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(dawn);
		radioGroup.add(bird);
		radioGroup.add(owl);

		// question 4
		question4 = new JPanel();
		question4.setOpaque(false);
		question4.setLayout(new BoxLayout(question4, BoxLayout.Y_AXIS));
		you = new JLabel(
				"  4)  What type of person would you like to room with?");
		less = new JRadioButton("Less like you");
		more = new JRadioButton("More like you");
		any = new JRadioButton("Anyone will do");
		space = new JLabel("   ");
		question4.add(you);
		question4.add(less);
		question4.add(more);
		question4.add(any);
		question4.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(less);
		radioGroup.add(more);
		radioGroup.add(any);

		// question 5
		question5 = new JPanel();
		question5.setOpaque(false);
		question5.setLayout(new BoxLayout(question5, BoxLayout.Y_AXIS));
		pers = new JLabel("  5)  Which of these best describes you?");
		soc = new JRadioButton("Social");
		rec = new JRadioButton("Reclusive");
		dep = new JRadioButton("Dependable");
		unre = new JRadioButton("Unreliable");
		space = new JLabel("   ");
		question5.add(pers);
		question5.add(soc);
		question5.add(rec);
		question5.add(dep);
		question5.add(unre);
		question5.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(soc);
		radioGroup.add(rec);
		radioGroup.add(dep);
		radioGroup.add(unre);

		// question 6
		question6 = new JPanel();
		question6.setOpaque(false);
		question6.setLayout(new BoxLayout(question6, BoxLayout.Y_AXIS));
		clean = new JLabel("  6)  How often do you clean?");
		godly = new JRadioButton("Cleanliness is next to godliness");
		reg = new JRadioButton("Cleaning happens on a regular basis");
		often = new JRadioButton("Cleaning should happen more often");
		pigsty = new JRadioButton("Pigsty is the way to go");
		space = new JLabel("   ");
		question6.add(clean);
		question6.add(godly);
		question6.add(reg);
		question6.add(often);
		question6.add(pigsty);
		question6.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(godly);
		radioGroup.add(reg);
		radioGroup.add(often);
		radioGroup.add(pigsty);

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

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 360, 640);
		add(scrollPane);

		JPanel viewPanel = new JPanel();
		viewPanel.setOpaque(false);
		viewPanel.setLayout(new BoxLayout(viewPanel, BoxLayout.Y_AXIS));
		viewPanel.add(question1);
		viewPanel.add(question2);
		viewPanel.add(question3);
		viewPanel.add(question4);
		viewPanel.add(question5);
		viewPanel.add(question6);
		viewPanel.add(submit);

		JViewport view = new JViewport();
		view.setView(viewPanel);
		view.setOpaque(false);

		scrollPane.setViewport(view);
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setOpaque(false);

		JLabel background = new JLabel();
		background.setIcon(new ImageIcon("imgs/background3.png"));
		background.setBounds(0, 0, 360, 640);
		add(background);

		this.add(button);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// question 1
		if (fem.isSelected()) {
			array[0] = 0;
		} else if (male.isSelected()) {
			array[0] = 1;
		} else {
			array[0] = -1;
		}

		// question 2
		if (fresh.isSelected()) {
			array[1] = 0;
		} else if (soph.isSelected()) {
			array[1] = 1;
		} else if (jun.isSelected()) {
			array[1] = 2;
		} else if (sen.isSelected()) {
			array[1] = 3;
		} else if (grad.isSelected()) {
			array[1] = 4;
		} else {
			array[1] = -1;
		}

		// question 3
		if (dawn.isSelected()) {
			array[2] = 0;
		} else if (bird.isSelected()) {
			array[2] = 1;
		} else if (owl.isSelected()) {
			array[2] = 2;
		} else {
			array[2] = -1;
		}

		// question 4
		if (less.isSelected()) {
			array[3] = 0;
		} else if (more.isSelected()) {
			array[3] = 1;
		} else if (any.isSelected()) {
			array[3] = 2;
		} else {
			array[3] = -1;
		}

		// question 5
		if (soc.isSelected()) {
			array[4] = 0;
		} else if (rec.isSelected()) {
			array[4] = 1;
		} else if (dep.isSelected()) {
			array[4] = 2;
		} else if (unre.isSelected()) {
			array[4] = 3;
		} else {
			array[4] = -1;
		}

		// question 6
		if (godly.isSelected()) {
			array[5] = 0;
		} else if (reg.isSelected()) {
			array[5] = 1;
		} else if (often.isSelected()) {
			array[5] = 2;
		} else if (pigsty.isSelected()) {
			array[5] = 3;
		} else {
			array[5] = -1;
		}
		// #####
		boolean validAnswers = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				submit.setEnabled(false);
				validAnswers = false;
				break;
			} else {
				submit.setEnabled(true);
				validAnswers = true;
				// store results in DB
				// insert code here
			}
		}
		if (validAnswers) {
			Login.publicData.pushData(array, "roomateID");
		}
	}
}