package connectFive;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
class RSO extends Question {
	private JPanel question1;
	private JPanel question2;
	private JPanel question3;
	private JPanel question4;
	private JPanel question5;
	private JPanel question6;
	private JPanel question7;
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

	int[] array = new int[7];

	RSO() {
		super();
		JPanel button = new JPanel(new GridLayout(0, 1));
		button.setOpaque(false);
		button.setLayout(null);

		// question 1
		question1 = new JPanel();
		question1.setOpaque(false);
		question1.setLayout(new BoxLayout(question1, BoxLayout.Y_AXIS));
		enjoy = new JLabel(
				"  1)  What do you enjoy doing (select one that applies most)?");
		baking = new JRadioButton("Baking");
		gaming = new JRadioButton("Gaming");
		reading = new JRadioButton("Reading");
		building = new JRadioButton("Building");
		volunteering = new JRadioButton("Volunteering");
		sports = new JRadioButton("Sports");
		space = new JLabel("   ");
		question1.add(enjoy);
		question1.add(baking);
		question1.add(gaming);
		question1.add(reading);
		question1.add(building);
		question1.add(volunteering);
		question1.add(sports);
		question1.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(baking);
		radioGroup.add(gaming);
		radioGroup.add(reading);
		radioGroup.add(building);
		radioGroup.add(volunteering);
		radioGroup.add(sports);

		// question 2
		question2 = new JPanel();
		question2.setOpaque(false);
		question2.setLayout(new BoxLayout(question2, BoxLayout.Y_AXIS));
		major = new JLabel("  2)  What is your major?");
		engineering = new JRadioButton("Engineering");
		math = new JRadioButton("Math");
		hs = new JRadioButton("Health Professions and Social Works");
		his = new JRadioButton("History");
		eng = new JRadioButton("English");
		arts = new JRadioButton("Arts");
		space = new JLabel("   ");
		question2.add(major);
		question2.add(engineering);
		question2.add(math);
		question2.add(hs);
		question2.add(his);
		question2.add(eng);
		question2.add(arts);
		question2.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(engineering);
		radioGroup.add(math);
		radioGroup.add(hs);
		radioGroup.add(eng);
		radioGroup.add(arts);

		// question 3
		question3 = new JPanel();
		question3.setOpaque(false);
		question3.setLayout(new BoxLayout(question3, BoxLayout.Y_AXIS));
		connect = new JLabel("  3)  Do you prefer something major related?");
		yes = new JRadioButton("Yes");
		no = new JRadioButton("No");
		space = new JLabel("   ");
		question3.add(connect);
		question3.add(yes);
		question3.add(no);
		question3.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(yes);
		radioGroup.add(no);

		// question 4
		question4 = new JPanel();
		question4.setOpaque(false);
		question4.setLayout(new BoxLayout(question4, BoxLayout.Y_AXIS));
		least = new JLabel("  4)  What is least interesting to you?");
		baking2 = new JRadioButton("Baking");
		gaming2 = new JRadioButton("Gaming");
		reading2 = new JRadioButton("Reading");
		building2 = new JRadioButton("Building");
		volunteering2 = new JRadioButton("Volunteering");
		sports2 = new JRadioButton("Sports");
		space = new JLabel("   ");
		question4.add(least);
		question4.add(baking2);
		question4.add(gaming2);
		question4.add(reading2);
		question4.add(building2);
		question4.add(volunteering2);
		question4.add(sports2);
		question4.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(baking2);
		radioGroup.add(gaming);
		radioGroup.add(reading2);
		radioGroup.add(building2);
		radioGroup.add(volunteering2);
		radioGroup.add(sports2);

		// question 5
		question5 = new JPanel();
		question5.setOpaque(false);
		question5.setLayout(new BoxLayout(question5, BoxLayout.Y_AXIS));
		most = new JLabel("  5)  Which category is most interesting to you?");
		acad = new JRadioButton("Academic");
		cult = new JRadioButton("Culture");
		med = new JRadioButton("Media");
		pol = new JRadioButton("Politics");
		rel = new JRadioButton("Religion");
		ser = new JRadioButton("Service");
		sports3 = new JRadioButton("Sports");
		space = new JLabel("   ");
		question5.add(most);
		question5.add(acad);
		question5.add(cult);
		question5.add(med);
		question5.add(pol);
		question5.add(rel);
		question5.add(ser);
		question5.add(sports3);
		question5.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(acad);
		radioGroup.add(cult);
		radioGroup.add(med);
		radioGroup.add(pol);
		radioGroup.add(rel);
		radioGroup.add(ser);
		radioGroup.add(sports3);

		// question 6
		question6 = new JPanel();
		question6.setOpaque(false);
		question6.setLayout(new BoxLayout(question6, BoxLayout.Y_AXIS));
		meet = new JLabel("  6)  How often are you available to meet?");
		multi = new JRadioButton("Multiple times a week");
		week = new JRadioButton("Once a week");
		bi = new JRadioButton("Biweekly");
		month = new JRadioButton("Once a month");
		space = new JLabel("   ");
		question6.add(meet);
		question6.add(multi);
		question6.add(week);
		question6.add(bi);
		question6.add(month);
		question6.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(multi);
		radioGroup.add(week);
		radioGroup.add(bi);
		radioGroup.add(month);

		// question 7
		question7 = new JPanel();
		question7.setOpaque(false);
		question7.setLayout(new BoxLayout(question7, BoxLayout.Y_AXIS));
		donate = new JLabel("  7)  How often can you donate to the RSO?");
		zero = new JRadioButton("$0");
		five = new JRadioButton("$5 - $10");
		ten = new JRadioButton("$10 - $30");
		thirty = new JRadioButton("$30+");
		space = new JLabel("   ");
		question7.add(donate);
		question7.add(zero);
		question7.add(five);
		question7.add(ten);
		question7.add(thirty);
		question7.add(space);
		radioGroup = new ButtonGroup();
		radioGroup.add(zero);
		radioGroup.add(five);
		radioGroup.add(ten);
		radioGroup.add(thirty);

		// action listener
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
		viewPanel.add(question7);
		viewPanel.add(submit);

		JViewport view = new JViewport();
		view.setView(viewPanel);
		view.setOpaque(false);

		scrollPane.setViewport(view);
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setOpaque(false);

		JLabel background = new JLabel();
		background.setIcon(new ImageIcon("imgs/LoginBackground.png"));
		background.setBounds(0, 0, 360, 640);
		add(background);

		this.add(button);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// question 1
		if (baking.isSelected()) {
			array[0] = 0;
		} else if (gaming.isSelected()) {
			array[0] = 1;
		} else if (reading.isSelected()) {
			array[0] = 2;
		} else if (building.isSelected()) {
			array[0] = 3;
		} else if (volunteering.isSelected()) {
			array[0] = 4;
		} else if (sports.isSelected()) {
			array[0] = 5;
		} else {
			array[0] = -1;
		}

		// question 2
		if (engineering.isSelected()) {
			array[1] = 0;
		} else if (math.isSelected()) {
			array[1] = 1;
		} else if (hs.isSelected()) {
			array[1] = 2;
		} else if (his.isSelected()) {
			array[1] = 3;
		} else if (eng.isSelected()) {
			array[1] = 4;
		} else if (arts.isSelected()) {
			array[1] = 5;
		} else {
			array[1] = -1;
		}

		// question 3
		if (yes.isSelected()) {
			array[2] = 0;
		} else if (no.isSelected()) {
			array[2] = 1;
		} else {
			array[2] = -1;
		}

		// question 4
		if (baking2.isSelected()) {
			array[3] = 0;
		} else if (gaming2.isSelected()) {
			array[3] = 1;
		} else if (reading2.isSelected()) {
			array[3] = 2;
		} else if (building2.isSelected()) {
			array[3] = 3;
		} else if (volunteering2.isSelected()) {
			array[3] = 4;
		} else if (sports2.isSelected()) {
			array[3] = 5;
		} else {
			array[3] = -1;
		}

		// question 5
		if (acad.isSelected()) {
			array[4] = 0;
		} else if (cult.isSelected()) {
			array[4] = 1;
		} else if (med.isSelected()) {
			array[4] = 2;
		} else if (pol.isSelected()) {
			array[4] = 3;
		} else if (rel.isSelected()) {
			array[4] = 4;
		} else if (ser.isSelected()) {
			array[4] = 5;
		} else if (sports3.isSelected()) {
			array[4] = 6;
		} else {
			array[4] = -1;
		}

		// question 6
		if (multi.isSelected()) {
			array[5] = 0;
		} else if (week.isSelected()) {
			array[5] = 1;
		} else if (bi.isSelected()) {
			array[5] = 2;
		} else if (month.isSelected()) {
			array[5] = 3;
		} else {
			array[5] = -1;
		}

		// question 7
		if (zero.isSelected()) {
			array[6] = 0;
		} else if (five.isSelected()) {
			array[6] = 1;
		} else if (ten.isSelected()) {
			array[6] = 2;
		} else if (thirty.isSelected()) {
			array[6] = 3;
		} else {
			array[6] = -1;
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
			Login.publicData.pushData(array, "clubsID");
		}
	}
}