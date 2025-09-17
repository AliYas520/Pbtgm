package oracle.praktik.JF42;

public class Praktik_ManagingPeople {

	public static void main(String[] args) {

		Person p1 = new Person("Nel", 16);
		Person p2 = new Person("ReNa", 26);

		if (p1.getPersonAge() == p2.getPersonAge()) {
			System.out.println(p1.getPersonName() + " is the same age as " + p2.getPersonName());
		} else {
			System.out.println(p1.getPersonName() + " is NOT the same age as " + p2.getPersonName());
		}
	}

}
