package connectFive;

import java.awt.*;

import javax.swing.*;

public class GUI {

	public GUI(){
		
		JFrame window=new JFrame();
		JPanel center=new JPanel();
		JPanel emp1=new JPanel();
		JPanel emp2=new JPanel();
		JPanel emp3=new JPanel();
		JPanel emp4=new JPanel();
		JPanel emp5=new JPanel();
		JPanel emp6=new JPanel();
		JPanel emp7=new JPanel();
		JPanel emp8=new JPanel();
		
		
		JButton profile=new JButton("Profile");
		JButton carpool=new JButton("Carpool");
		JButton food=new JButton("Food");
		JButton entertainment=new JButton("Entertainment");
		JButton clubs=new JButton("Clubs");
		JButton roommate=new JButton("Roommates");
		
		JScrollPane temp=new JScrollPane();
		
		GridLayout layout=new GridLayout(2,3);
		GridLayout layout1=new GridLayout(3,3);
		
		center.setLayout(layout);
		center.setSize(500,500);
		center.add(profile);
		center.add(carpool);
		center.add(food);
		center.add(entertainment);
		center.add(clubs);
		center.add(roommate);
		
		window.setLayout(layout1);
		window.add(emp1);
		window.add(emp2);
		window.add(emp3);
		window.add(emp4);
		window.add(center);
		window.add(emp5);
		window.add(emp6);
		window.add(emp7);
		window.add(emp8);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(540,960);
		window.setResizable(false);
		window.setVisible(true);
	}
}	
	
	


//public class handler() implements ActionListener{
//		
//		
//	}