package hiding;

public class MyDateTest {

	public static void main(String[] args) {

		MyDate date = new MyDate();
		date.setDay(21);
		date.setMonth(55);
		date.setYear(2020);

		date.showDate();
		
		MyDate date2 = new MyDate();
		date2.setDay(22);
		date2.setMonth(07);
		date2.setYear(2020);
		
		date2.showDate();

	}
}
