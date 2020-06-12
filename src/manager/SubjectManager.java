package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import subject.LiberalartsSubject;
import subject.MajorSubject;
import subject.Subject;
import subject.SubjectKind;

public class SubjectManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2775342094203559872L;
	
	ArrayList<Subject> subjects = new ArrayList<Subject>();
	transient Scanner input;
	SubjectManager(Scanner input) {
		this.input = input;
	}	
	
	public void setScanner(Scanner input) {
	     this.input = input;
	}
	
	public void addSubject() {
		
		int kind = 0; 
		Subject subject;
		while (kind != 1 && kind != 2) {	
			try {
				System.out.println("go into add subjects in while");
				System.out.println("1 for Liberal Arts Subject: ");
				System.out.println("2 for Major Subject: ");
				System.out.print("Select num for Subject Kind between 1 or 2 for Sunject Kind: ");
				kind = input.nextInt();
			
				if (kind == 1) {
					subject = new LiberalartsSubject(SubjectKind.Liberalarts);
					subject.getUserInput(input);
					subjects.add(subject);
					break;  
				}
				else if (kind == 2) {
					subject = new MajorSubject(SubjectKind.Major);
					subject.getUserInput(input);
					subjects.add(subject);
					break;
					}					
				else {
					System.out.print("Select num for Subject Kind: ");
				}
			}
			catch(InputMismatchException e) {
				 System.out.println("Please put integer between 1 or 2!");
				 if (input.hasNext()) {
					 input.next();
				 }
				 kind = -1;
			}
		}
	}	
	
	public void deleteSubject() {
		 System.out.print("Subject ID: ");
		 String subjectId = input.next();
		 int index = findIndex(subjectId); 
		 removefromSubjects(index, subjectId);
	}
	
	public int findIndex(String subjectId) {
		 int index = -1;
		 for (int i = 0; i<subjects.size(); i++) {
			 if (subjects.get(i).getId() == subjectId) {
				 index = i;
				 break;
			 }
		 }	
		 return index;		
	}
	
	public int removefromSubjects(int index, String subjectId) {
		 if (index >= 0) {
			 subjects.remove(index);
			 System.out.println("the subject" + subjectId + "is deleted");
			 return 1;
		 }
		 else {
			 System.out.println("the subject has not been registered");
			 return -1;
		 }
	}
	
	public void editSubject() {
		 System.out.print("Subject ID: ");
		 String subjectId = input.next();
		 for (int i = 0; i<subjects.size(); i++) {
			 Subject subject = subjects.get(i);
			 if (subject.getId() == subjectId) {
				 int num = -1;	  
				 while(num != 5) {
					 showEditMenu();
					 num = input.nextInt();
					 switch(num) {
					 case 1:
						 subject.setSubjectID(input);
						 break;
					 case 2:
						 subject.setSubjectName( input);
						 break;
					 case 3:
						 subject.setSubjectTime(input);
						 break;
					 case 4:
						 subject.setSubjectProfessor(input);
						 break;
					 default:
						 continue;							 	
					 }
				 }
				 break;
			 } 
		 }
	}
	
	public void viewSubjects() {

		 System.out.println("# of resgistered subjects:" + subjects.size());
		 for (int i = 0; i<subjects.size(); i++) {
			 subjects.get(i).printInfo();
		 }
	}	 
	
	public int size() {
		return subjects.size();
	}
	
	public Subject get(int index) {
		return (Subject)subjects.get(index); 
	}
	
	public void showEditMenu() {
		 System.out.println("*** Subject Info Edit Menu ***");
		 System.out.println(" 1. Edit Id");
		 System.out.println(" 2. Edit Name");
		 System.out.println(" 3. Edit Time");
		 System.out.println(" 4. Edit Professor");
		 System.out.println(" 5. Exit");
		 System.out.println("Select one number between 1 - 5:");
	}
}

