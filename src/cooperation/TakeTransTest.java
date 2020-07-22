package cooperation;

public class TakeTransTest {

	public static void main(String[] args) {

		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 9000);

		Bus bus110 = new Bus(110);
		Bus bus7016 = new Bus(7016);
		Subway subwayGreen = new Subway(2);
		Subway subwayBrown = new Subway(6);

		studentJ.takeBus(bus7016);
		studentT.takeSubway(subwayBrown);
		
		studentJ.showInfo();
		studentT.showInfo();

		bus110.showInfo();
		bus7016.showInfo();

		subwayBrown.showInfo();
		subwayGreen.showInfo();

	}

}
