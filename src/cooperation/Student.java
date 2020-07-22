package cooperation;

public class Student {

	String studentName;
	int grade;
	int money;
	
	public Student (String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		this.money -= 1000;
		bus.take(1000);
	}
	
	public void takeSubway(Subway subway) {
		this.money -= 1200;
		subway.take(1200);
	}
	
	public void  showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}
}
