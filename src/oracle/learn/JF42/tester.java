package oracle.learn.JF42;

public class tester {

	public static void main(String[] args) {
		Student s1 = new Student(520, "Nel", "520-52-7520", 3.7);
		Student s2 = new Student(0, null, null, 0);

		System.out.print("ID   : ");
		System.out.println(s1.getStudentId());
		System.out.print("Name : ");
		System.out.println(s1.getStudentName());
		System.out.print("SSN  : ");
		System.out.println(s1.getStudentSSN());
		System.out.print("GPA  : ");
		System.out.println(s1.getStudentGPA());

		System.out.println();

		System.out.println("empty set");
		System.out.print("ID   : ");
		System.out.println(s2.getStudentId());
		System.out.print("Name : ");
		System.out.println(s2.getStudentName());
		System.out.print("SSN  : ");
		System.out.println(s2.getStudentSSN());
		System.out.print("GPA  : ");
		System.out.println(s2.getStudentGPA());

		System.out.println();
		// set s2 data
		s2.setStudentId(007);
		s2.setStudentName("RuNe");
		s2.setStudentSSN("700-24-6877");
		s2.setStudentGPA(2.6);

		System.out.println("Re-Set Student Data");
		System.out.print("ID   : ");
		System.out.println(s2.getStudentId());
		System.out.print("Name : ");
		System.out.println(s2.getStudentName());
		System.out.print("SSN  : ");
		System.out.println(s2.getStudentSSN());
		System.out.print("GPA  : ");
		System.out.println(s2.getStudentGPA());

	}
}
