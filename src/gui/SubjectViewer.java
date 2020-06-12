package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import manager.SubjectManager;
import subject.Subject;

public class SubjectViewer extends JPanel{
	
	WindowFrame frame;
	
	SubjectManager subjectManager;
	
	public SubjectViewer(WindowFrame frame, SubjectManager subjectManager) {
		this.frame = frame;
		this.subjectManager = subjectManager;
		
		System.out.println("***" + subjectManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Name");
		model.addColumn("Day");
		model.addColumn("Starttime");
		model.addColumn("Finishtime");
		model.addColumn("Professor");
		
		for(int i=0;i<subjectManager.size(); i++) {
			Vector row = new Vector();
			Subject s = subjectManager.get(i);
			row.add(s.getId());
			row.add(s.getName());
			row.add(s.getDay());
			row.add(s.getStarttime());
			row.add(s.getFinishtime());
			row.add(s.getProfessor());
			model.addRow(row);
		}
		
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
