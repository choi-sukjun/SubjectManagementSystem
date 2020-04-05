
public class Subject {
	String name;
	int id;
	String day;
	int starttime, finishtime;
	String professor;
	
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
	
	public void printInfo() {
		System.out.println("name:" + name + " id:" + id + " time:"  + day + " " + starttime + " to " + finishtime + " professor:" + professor);
	}
	
}




