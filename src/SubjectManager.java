import java.util.Scanner;

public class SubjectManager {
	Subject subject;
	Scanner input;
	SubjectManager(Scanner input) {
		this.input = input;
	}
	
	public void addSubject() {
		 subject = new Subject();
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
		 System.out.print("Professor's name: ");
		 subject.professor = input.next();
	}
	
	public void deleteSubject() {
		 System.out.print("Subject ID: ");
		 int subjectId = input.nextInt();
		 if (subject == null) {
			 System.out.println("the subject has not been registered");
			 return;
		 }
		 if (subject.id == subjectId) {
			 subject = null;
			 System.out.println("the subject is deleted");
		 }
	}
	
	public void editSubject() {
		 System.out.print("Subject ID: ");
		 int subjectId = input.nextInt();
		 if (subject.id == subjectId) {
			 System.out.println("the subject to be edited is " + subjectId);
			 
		 }
	}
	
	public void viewSubject() {;
		 System.out.print("Subject ID: ");
		 int subjectId = input.nextInt();
		 if (subject.id == subjectId) {
			 subject.printInfo();
		 }
	}
}
