import java.util.ArrayList;
import java.util.Scanner;

import subject.MajorSubject;
import subject.Subject;


public class SubjectManager {
	ArrayList<Subject> subjects = new ArrayList<Subject>();
	Scanner input;
	SubjectManager(Scanner input) {
		this.input = input;
	}
	
	public void addSubject() {
		int kind = 0;
		Subject subject;
		while (kind != 1 && kind != 2) {
			
			System.out.print("1 for Major Subject: ");
			System.out.print("2 for Liberal Arts Subject: ");
			System.out.print("Select num for Subject Kind between 1 and 2: ");
			kind = input.nextInt();
			if (kind == 1) {
				subject = new MajorSubject();
				subject.getUserInput(input);
				subjects.add(subject);
				break;
			}
			else if (kind == 2) {
				subject = new Subject();
				subject.getUserInput(input);
				subjects.add(subject);
				break;  
			}
			else {
				System.out.print("Select num for Subject Kind: ");
			}
		 }
		 

	}
	
	public void deleteSubject() {
		 System.out.print("Subject ID: ");
		 int subjectId = input.nextInt();
		 int index = -1;
		 for (int i = 0; i<subjects.size(); i++) {
			 if (subjects.get(i).getId() == subjectId) {
				 index = i;
				 break;
			 }
		 }
		 
		 if (index >= 0) {
			 subjects.remove(index);
			 System.out.println("the subject" + subjectId + "is deleted");
		 }
		 else {
			 System.out.println("the subject has not been registered");
			 return;
		 }

	}

	
	public void editSubject() {
		 System.out.print("Subject ID: ");
		 int subjectId = input.nextInt();
		 for (int i = 0; i<subjects.size(); i++) {
			 Subject subject = subjects.get(i);
			 if (subject.getId() == subjectId) {
				 int num = -1;	  
				 while(num != 5) {
					 System.out.println("*** Subject Info Edit Menu ***");
					 System.out.println(" 1. Edit Id");
					 System.out.println(" 2. Edit Name");
					 System.out.println(" 3. Edit Time");
					 System.out.println(" 4. Edit Professor");
					 System.out.println(" 5. Exit");
					 System.out.println("Select one number between 1 - 5:");
					 num = input.nextInt();
					 if (num == 1) {
						 System.out.print("Subject ID: ");
						 int id= input.nextInt();
						 subject.setId(id);
					 }
					 else if (num == 2) {
						 System.out.print("Subject name: ");
						 String name = input.next();
						 subject.setName(name);
					 }
					 else if (num == 3) {
						 System.out.println("Subject time");
						 System.out.print("Day:");
						 String day = input.next();	
						 subject.setDay(day);
						 System.out.print("Start Time: ");
						 int starttime = input.nextInt();
						 subject.setStarttime(starttime);
						 System.out.print("Finish Time: ");
						 int finishtime = input.nextInt();		
						 subject.setFinishtime(finishtime);
					 }
					 else if (num == 4) {
						 System.out.print("Professor: ");
						 String professor = input.next();	
						 subject.setProfessor(professor);
					 }
					 else {
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
}

