package testexample;

public class MyDate {

	private int year;
	private int month;
	private int day;
	private boolean isValid = true;

	public MyDate(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			if (day < 1 || day > 31) {
				this.day = day;
				isValid = false;
			} else {
				this.day = day;
			}
			break;
		case 2:
			if (year % 4 == 0) {
				if (day < 1 || day > 29) {
					this.day = day;
					isValid = false;
				} else {
					this.day = day;
				}
			} else {
				if (day < 1 || day > 28) {
					this.day = day;
					isValid = false;
				} else {
					this.day = day;
				}
			}
			break;
		case 4, 6, 9, 11:
			if (day < 1 || day > 30) {
				this.day = day;
				isValid = false;
			} else {
				this.day = day;
			}
			break;
		default:
			this.day = day;
			isValid = false;
		}

	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			this.month = month;
			isValid = false;
		} else {
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year < 1) {
			this.year = year;
			isValid = false;
		} else {
			this.year = year;
		}
	}

	public String isValid() {

		if (isValid) {
			return "유효한 날짜입니다.";
		} else {
			return "유효하지 않은 날짜입니다.";
		}
	}

	public void showMyDate() {
		if (isValid) {
			System.out.println(year + " " + month + " " + day);
			System.out.println("유효한 날짜입니다.");
			System.out.println(isValid);
		} else {
			System.out.println(year + " " + month + " " + day);
			System.out.println("유효하지 않은 날짜입니다.");
			System.out.println(isValid);
		}
	}
}
