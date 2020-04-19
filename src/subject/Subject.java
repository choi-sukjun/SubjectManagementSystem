package subject;

import java.util.Scanner;

public class Subject {

	protected SubjectKind Kind = SubjectKind.major;
	protected String name;
	protected int id;
	protected String day;
	protected int starttime, finishtime;
	protected String professor;

	
	public Subject() {	

	}

	public Subject(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public Subject(String name, int id, String day, int starttime, int finishtime, String professor) {
		this.name = name;
		this.id = id;
		this.day = day;
		this.starttime = starttime;
		this.finishtime = finishtime;
		this.professor = professor;
	}
	public SubjectKind getKind() {
		return Kind;
	}

	public void setKind(SubjectKind kind) {
		Kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public int getStarttime() {
		return starttime;
	}

	public void setStarttime(int starttime) {
		this.starttime = starttime;
	}

	public int getFinishtime() {
		return finishtime;
	}

	public void setFinishtime(int finishtime) {
		this.finishtime = finishtime;
	}
	
	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	public void printInfo() {
		System.out.println("name:" + name + " id:" + id + " time:"  + day + " " + starttime + " to " + finishtime + " and " +  " professor:" + professor);
	}
	
	public void getUserInput(Scanner input) {
		 System.out.print("Subject ID: ");
		 int id= input.nextInt();
		 this.setId(id);
		 
		 System.out.print("Subject name: ");
		 String name = input.next();
		 this.setName(name);
		 
		 System.out.println("Subject time");
		 System.out.print("Day:");
		 String day = input.next();	
		 this.setDay(day);
		 
		 System.out.print("Start Time: ");
		 int starttime = input.nextInt();
		 this.setStarttime(starttime);
		 
		 System.out.print("Finish Time: ");
		 int finishtime = input.nextInt();
		 this.setFinishtime(finishtime);
		 
		 System.out.print("Professor: ");
		 String professor = input.next();
		 this.setProfessor(professor);
	}
	
}




