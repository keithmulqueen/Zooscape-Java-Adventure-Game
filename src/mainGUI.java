import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class mainGUI extends JFrame
{
	Scanner in = new Scanner(System.in);
	Random rand = new Random();
	
	private JButton previousStateButton;
	private JButton nextStateButton;
	private JTextArea theArticle;

	caretaker caretaker = new caretaker();
	originator originator = new originator();
	
	int saveFiles;
	int currentArticle; 

	public mainGUI()
	{
			
		this.setSize(400,600);
		this.setTitle("Memories of the Escape");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(null);
		
		ButtonListener undoListener = new ButtonListener();
		ButtonListener redoListener = new ButtonListener();
	
		theArticle = new JTextArea();
		theArticle.setBounds(10, 40, 360, 500);

		previousStateButton = new JButton("Previous");
		previousStateButton.setBounds(40, 10, 150, 20);
		previousStateButton.addActionListener(undoListener);
			        
		nextStateButton = new JButton("Next");
		nextStateButton.setBounds(200, 10, 150, 20);
		nextStateButton.addActionListener(redoListener);
			
		panel1.add(previousStateButton);
		panel1.add(nextStateButton);
		panel1.add(theArticle);
		    
		this.add(panel1);
		this.setVisible(true);

	}
	
	public void setScreen(String one)
	{
		theArticle.setText(one);
	}
	
	public void setCurrentArticle(int newCurrentArticle)
	{
		this.currentArticle = newCurrentArticle;
	}
	
	class ButtonListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
		 
			if(e.getSource() == previousStateButton)
			{              
				if(currentArticle >= 1)
				{
					currentArticle--;
					String textBoxString = originator.load( caretaker.getMemento(currentArticle) );
					theArticle.setText(textBoxString);
					nextStateButton.setEnabled(true);        
				} 
		     
				else 
				{
					previousStateButton.setEnabled(false);
				}
	                     
			} 
		 
			else if(e.getSource() == nextStateButton)
			{         
				if((saveFiles - 1) > currentArticle)
				{
					currentArticle++;
					String textBoxString = originator.load( caretaker.getMemento(currentArticle) );
					theArticle.setText(textBoxString);
					previousStateButton.setEnabled(true);
				} 
			 
				else 
				{
					nextStateButton.setEnabled(false);
				}
			}
		}
	}
}