package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import manager.SubjectManager;

public class WindowFrame extends JFrame{
	
	MenuSelection menuSelection;
	SubjectManager subjectManager;
	SubjectAdder subjectadder;
	SubjectViewer subjectviewer;
	
	public WindowFrame(SubjectManager subjectManager) {	
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.subjectManager = subjectManager;
		menuSelection = new MenuSelection(this);
		subjectadder = new SubjectAdder(this);
		subjectviewer = new SubjectViewer(this, this.subjectManager);

		this.add(menuSelection);
		 
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuSelection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuSelection = menuselection;
	}

	public SubjectAdder getSubjectadder() {
		return subjectadder;
	}

	public void setSubjectadder(SubjectAdder subjectadder) {
		this.subjectadder = subjectadder;
	}

	public SubjectViewer getSubjectviewer() {
		return subjectviewer;
	}

	public void setSubjectviewer(SubjectViewer subjectviewer) {
		this.subjectviewer = subjectviewer;
	}
	
}
