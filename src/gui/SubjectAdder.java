package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class SubjectAdder extends JPanel {
	
	WindowFrame frame;
	
	public SubjectAdder(WindowFrame frame) {		
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelID.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelTime = new JLabel("Time: ", JLabel.TRAILING);
		JTextField fieldTime = new JTextField(10);
		labelID.setLabelFor(fieldTime);
		panel.add(labelTime);
		panel.add(fieldTime);
		
		JLabel labelProfessor= new JLabel("Professor: ", JLabel.TRAILING);
		JTextField fieldProfessor = new JTextField(10);
		labelID.setLabelFor(fieldProfessor);
		panel.add(labelProfessor);
		panel.add(fieldProfessor);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
			
		this.add(panel);
		this.setVisible(true);
	}

}
