package thisex;

public class PersonTest {

	public static void main(String[] args) {
		
		Person personNoname = new Person();
		
		personNoname.showInfo();

		Person personLee = new Person("JB", 28);
		personLee.showInfo();
	}

}
