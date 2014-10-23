import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

// Original work started on 10/22
// Author: Courtney Kuhlman

class Frame extends JFrame{
	private JButton submit;
	private JRadioButton morning;
	private JRadioButton afternoon;
	private JRadioButton night;
	private JRadioButton sunny;
	private JRadioButton cloudy;
	private JRadioButton rainy;
	private JRadioButton stroming;
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
	private ButtonGroup radioGroup;
	
	Frame (String test){
		super(test);
		JPanel buttonJPanel = new JPanel();
		buttonJPanel.setLayout(new FlowLayout());
		submit = new JButton("Submit");
		buttonJPanel.add(submit);
		add(buttonJPanel, BorderLayout.SOUTH);
		JPanel button = new JPanel();
		JPanel question = new JPanel();
		button.setLayout(new FlowLayout());
		time = new JLabel ("What is the time of the day?");
		morning = new JRadioButton("morning");
		afternoon = new JRadioButton("afternoon");
		night = new JRadioButton("night");
		button.add(time);
		button.add(morning);
		button.add(afternoon);
		button.add(night);
		radioGroup = new ButtonGroup();
		radioGroup.add(morning);
		radioGroup.add(afternoon);
		radioGroup.add(night);
		add(button);
		//new
		JPanel button1 = new JPanel();
		//JPanel question1 = new JPanel();
		button.setLayout(new FlowLayout());
		time = new JLabel ("What is the time of the day?");
		morning = new JRadioButton("morning");
		afternoon = new JRadioButton("afternoon");
		night = new JRadioButton("night");
		button1.add(time);
		button1.add(morning);
		button1.add(afternoon);
		button1.add(night);
		radioGroup = new ButtonGroup();
		radioGroup.add(morning);
		radioGroup.add(afternoon);
		radioGroup.add(night);
		add(button1, BorderLayout.CENTER);
	}
}
public class Entertainment extends JPanel{
	private JRadioButton morning;
	private JRadioButton afternoon;
	private JRadioButton night;
	private JRadioButton sunny;
	private JRadioButton cloudy;
	private JRadioButton rainy;
	private JRadioButton stroming;
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
	
	public Entertainment(){
		JFrame window=new JFrame();
		time = new JLabel ("What is the time of the day?");
		morning = new JRadioButton("morning");
		afternoon = new JRadioButton("afternoon");
		night = new JRadioButton("night");
		window.add(time);
		window.add(morning);
		window.add(afternoon);
		window.add(night);
		sunny = new JRadioButton("sunny");
		
	}
	
	
	public static void main( String args[] ){
		   Frame buttonFrame = new Frame("test");
		   buttonFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		   buttonFrame.setSize( 360, 640 ); // set frame size
		   buttonFrame.setVisible( true ); // display frame
	}
}