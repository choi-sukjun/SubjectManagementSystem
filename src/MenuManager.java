import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 SubjectManager subjectManager = getObject("subjectmanager.ser");
		 if(subjectManager == null) {
			 subjectManager= new SubjectManager(input);
		 }
		 else {
			 subjectManager.setScanner(input);
		 }
		 
		 selectMenu(input, subjectManager);
		 putObject(subjectManager, "subjectmanager.ser");
	}
	
	public static void selectMenu(Scanner input, SubjectManager subjectManager) { 
		int num = -1;	  
		 while(num != 5) {
			 try {
			 showMenu();
			 num = input.nextInt();
			 switch(num) {
			 case 1:
				 subjectManager.addSubject();
				 logger.log("add a subject");
				 break;
			 case 2:
				 subjectManager.deleteSubject();
				 logger.log("delet a subject");
				 break;
			 case 3:
				 subjectManager.editSubject();
				 logger.log("edit a subject");
				 break;
			 case 4:
				 subjectManager.viewSubjects();
				 logger.log("view a subject");
				 break;
				 default:
					 continue;
			 	}
			 }
			 catch(InputMismatchException e) {
				 System.out.println("Please put integer between 1 to 5!");
				 if (input.hasNext()) {
					 input.next();
				 }
				 num = -1;
			 }
		}
	}
	
	public static void showMenu() {
		 System.out.println("*** Subject Management System Menu ***");
		 System.out.println(" 1. Add Subject");
		 System.out.println(" 2. Delete Subject");
		 System.out.println(" 3. Edit Subject");
		 System.out.println(" 4. View Subjects");
		 System.out.println(" 5. Exit");
		 System.out.println("Select one number between 1 - 5:");		
	}
	
	public static SubjectManager getObject(String filename) {
		SubjectManager subjectManager = null;
		
		
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
		
			subjectManager = (SubjectManager) in.readObject();
			in.close();
			file.close();			
	
		} catch (FileNotFoundException e) {
			return subjectManager;		
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return subjectManager;
	}
	
	public static void putObject(SubjectManager subjectManager, String filename) {
		
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(subjectManager);
			
			out.close();
			file.close();			
	
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
