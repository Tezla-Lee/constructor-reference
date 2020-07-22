package testexample;

public class MyDateTest {

	public static void main(String[] args) {

		MyDate date = new MyDate(2020, 2, 29);
		
		System.out.println(date.isValid());
		date.showMyDate();
		
	}

}
