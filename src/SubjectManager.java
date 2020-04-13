import java.util.ArrayList;
import java.util.Scanner;


public class SubjectManager {
	ArrayList<Subject> subjects = new ArrayList<Subject>();
	Scanner input;
	SubjectManager(Scanner input) {
		this.input = input;
	}
	
	public void addSubject() {
		 Subject subject = new Subject();
		 System.out.print("Subject ID: ");
		 subject.id= input.nextInt();
		 System.out.print("Subject name: ");
		 subject.name = input.next();
		 System.out.println("Subject time");
		 System.out.print("Day:");
		 subject.day = input.next();		
		 System.out.print("Start Time: ");
		 subject.starttime = input.nextInt();
		 System.out.print("Finish Time: ");
		 subject.finishtime = input.nextInt();
		 System.out.print("Professor: ");
		 subject.professor = input.next();
		 subjects.add(subject);
	}
	
	public void deleteSubject() {
		 System.out.print("Subject ID: ");
		 int subjectId = input.nextInt();
		 int index = -1;
		 for (int i = 0; i<subjects.size(); i++) {
			 if (subjects.get(i).id == subjectId) {
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
			 if (subject.id == subjectId) {
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
						 subject.id= input.nextInt();
					 }
					 else if (num == 2) {
						 System.out.print("Subject name: ");
						 subject.name = input.next();			
					 }
					 else if (num == 3) {
						 System.out.println("Subject time");
						 System.out.print("Day:");
						 subject.day = input.next();		
						 System.out.print("Start Time: ");
						 subject.starttime = input.nextInt();
						 System.out.print("Finish Time: ");
						 subject.finishtime = input.nextInt();		
					 }
					 else if (num == 4) {
						 System.out.print("Professor: ");
						 subject.professor = input.next();			
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
//		 System.out.print("Subject ID: ");
//		 int subjectId = input.nextInt();
		 for (int i = 0; i<subjects.size(); i++) {
			 subjects.get(i).printInfo();
		 }
	}	 
}

