package subject;

import java.util.Scanner;

public abstract class Subject implements SubjectInput {
	protected SubjectKind Kind = SubjectKind.Liberalarts;
	protected String name;
	protected String id;
	protected String day;
	protected int starttime, finishtime;
	protected String professor;
	protected String majorname;
	protected String professor2;
	
	public Subject() {	

	}
	public Subject(SubjectKind kind) {
		this.Kind = kind;
	}

	public Subject(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public Subject(SubjectKind kind, String name, String id, String day, int starttime, int finishtime, String professor) {
		this.Kind = kind;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
	
	public String getProfessor2() {
		return professor2;
	}

	public void setProfessor2(String professor2) {
		this.professor2 = professor2;
	}
	
	public String getMajorname() {
		return majorname;
	}

	public void setMajorname(String majorname) {
		this.majorname = majorname;
	}
	
		
	public abstract void printInfo(); 
	
	public void setSubjectID(Scanner input) {
		 System.out.print("Subject ID: ");
		 String id= input.next();
		 this.setId(id);
	}
	
	public void setSubjectName(Scanner input) {
		 System.out.print("Subject name: ");
		 String name = input.next();
		 this.setName(name);
	}
	
	public void setSubjectTime(Scanner input) {
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
	}
	
	public void setSubjectProfessor(Scanner input) {	
		System.out.print("Professor: ");
		String professor = input.next();	
		this.setProfessor(professor);
	}
	
	public void setSubjectProfessor2(Scanner input) {
		 System.out.print("Professor2: ");
		 String professor2 = input.next();	
		 this.setProfessor2(professor2);
		
	}
	
	public String getKindString() {
		String skind = "none";
		switch(this.Kind) {
			case Major:
				skind = "maj";
				break;
			
			case Liberalarts:
				skind = "liberal";
				break;
				
			default:		
			}
		return skind;
	}
}



