package connectFive;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
abstract class QuestionFrame extends JFrame implements ActionListener{
	protected JButton submit;
	
	QuestionFrame(){
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
					JOptionPane.showMessageDialog(QuestionFrame.this, "Submitted!");
					setVisible(false);
					ProfileRev pro = new ProfileRev();
					pro.setSize(360,640);
					pro.viewProfile();
					pro.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
				}	
			}
		});
		
	}

}

