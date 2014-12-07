package connectFive;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
abstract class Question extends JFrame implements ActionListener{
	protected JButton submit;
	
	Question(){
		setTitle(getClass().getSimpleName() + " Questionnaire");
		JPanel buttonJPanel = new JPanel();
		buttonJPanel.setLayout(null);
		buttonJPanel.setBackground(Color.BLACK);
		submit = new JButton("Submit");
		buttonJPanel.add(submit);
		submit.setBounds(0, 0, 100, 40);
		buttonJPanel.setOpaque(false);
		add(buttonJPanel);
		submit.setEnabled(false);		
		submit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				if(event.getSource() == submit){
					System.out.println("submitted");
					JOptionPane.showMessageDialog(Question.this, "Submitted!");
					setVisible(false);
					Login.pro.viewProfile();
					Login.pro.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
				}	
			}
		});
		
	}

}

