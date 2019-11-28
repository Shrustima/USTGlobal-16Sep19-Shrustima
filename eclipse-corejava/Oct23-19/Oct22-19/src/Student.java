
public class Student {
	int id;
	String name;
	char grade;
	String classSec;
	String gender;
	public Student(int id, String name, char grade, String classSec, String gender) {
		this.id=id;
		this.name=name;
		this.grade=grade;
		this.classSec=classSec;
		this.gender=gender;
	}
	void test() {
		System.out.println("Student name "+name);
		System.out.println("Student id "+id);
		System.out.println("Student grade "+grade);
		System.out.println("Student section "+classSec);
		System.out.println("Student gender "+gender);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(1, "shru", 'A', "Bsec", "female");
		s1.test();
		Student s2 = new Student(2, "shra", 'A', "Asec", "female");
		s2.test();
		Student s3 = new Student(3, "shiv", 'B', "Bsec", "female");
		s3.test();
		Student s4 = new Student(4, "pra", 'A', "Asec", "female");
		s4.test();
		Student s5 = new Student(5, "Arsh", 'B', "Bsec", "male");
		s5.test();
		Student s6 = new Student(6, "Rohan", 'C', "Csec", "male");
		s6.test();
		Student s7 = new Student(7, "Niki", 'A', "Bsec", "female");
		s7.test();
		Student s8 = new Student(8, "Ranveer", 'C', "Asec", "male");
		s8.test();
		Student s9 = new Student(9, "Jazz", 'B', "Csec", "female");
		s9.test();
		Student s10 = new Student(10, "Kavya", 'B', "Bsec", "female");
		s10.test();
		
	}
}
