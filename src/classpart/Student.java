package classpart;

public class Student {

	public int studenID;
	public String studentName;
	public String address;

	public Student(String name) {
		studentName = name;
	}

	public Student(int id, String name) {
		studenID = id;
		address = "주소 없음";
		studentName = name;

	}

	public void showStudentInfo() {
		System.out.println(studentName + " , " + address);
	}

	public String getStudentName() {
		return studentName;
	}

}
