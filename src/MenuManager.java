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
			 else {
				 continue;
			 }
		}
	}
}