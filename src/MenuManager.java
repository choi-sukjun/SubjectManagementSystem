import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 SubjectManager subjectManager = new SubjectManager(input);
		 
		 int num = -1;	  
		 while(num != 5) {
			 System.out.println("*** Subject Management System Menu ***");
			 System.out.println(" 1. Add Subject");
			 System.out.println(" 2. Delete Subject");
			 System.out.println(" 3. Edit Subject");
			 System.out.println(" 4. View Subject");
			 System.out.println(" 5. Exit");
			 System.out.println("Select one number between 1 - 5:");
			 num = input.nextInt();
			 if (num == 1) {
				 subjectManager.addSubject();
			 }
			 else if (num == 2) {
				 subjectManager.deleteSubject();
			 }
			 else if (num == 3) {
				 subjectManager.editSubject();
			 }
			 else if (num == 4) {
				 subjectManager.viewSubject();
			 }
		}
	}


	public static void addSubject() {
		 Scanner input = new Scanner(System.in);
		 System.out.print("Subject ID: ");
		 int subjectID = input.nextInt();
		 System.out.println(subjectID);
		 System.out.print("Subject name: ");
		 String subjectname = input.next();
		 System.out.println(subjectname);
		 System.out.println("Subject time");
		 System.out.print("Day:");
		 String day = input.next();		
		 System.out.print("Start Time: ");
		 int starttime = input.nextInt();
		 System.out.print("Finish Time: ");
		 int finishtime = input.nextInt();
		 System.out.print(day + ", ");
		 System.out.println(starttime + " to " + finishtime); 
		 System.out.print("Professor's name: ");
		 String professorname = input.next();
		 System.out.println(professorname);
	}
	
	public static void deleteSubject() {
		 Scanner input = new Scanner(System.in);
		 System.out.print("Subject ID: ");
		 int subjectID = input.nextInt();
	}
	
	public static void editSubject() {
		 Scanner input = new Scanner(System.in);
		 System.out.print("Subject ID: ");
		 int subjectID = input.nextInt();
	}
	
	public static void viewSubject() {
		 Scanner input = new Scanner(System.in);
		 System.out.print("Subject ID: ");
		 int subjectID = input.nextInt();
	}
}

	
