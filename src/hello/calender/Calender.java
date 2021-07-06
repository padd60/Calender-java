package hello.calender;

public class Calender {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	public int maxDaysOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		} else {
			return MAX_DAYS[month - 1];
		}
	}

	public void printCalendar(int year, int month, int weekday) {
		System.out.printf("   <<%4d년%3d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");

		// 첫줄 빈칸 출력
		for (int i = 0; i < weekday; i++) {
			System.out.print("   ");
		}

		int maxDay = maxDaysOfMonth(year, month);
		int count = 7 - weekday;
		int newcount = (count < 7) ? count : 0;

		// 첫줄 출력
		for (int i = 1; i <= count; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();

		// 두번째 줄 출력
		count++;
		for (int i = count; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == newcount) {
				System.out.println();
			}
		}

		System.out.println();
		System.out.println();
	}
}
