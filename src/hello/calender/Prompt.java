package hello.calender;

import java.util.Scanner;

public class Prompt {

	// week 는 요일
	// 요일은 일요일부터 순서대로 0 ~ 6

	public int parseDay(String week) {
		if (week == "SU") {
			return 0;
		} else if (week.equals("MO")) {
			return 1;
		} else if (week.equals("TU")) {
			return 2;
		} else if (week.equals("WE")) {
			return 3;
		} else if (week.equals("TH")) {
			return 4;
		} else if (week.equals("FR")) {
			return 5;
		} else if (week.equals("SA")) {
			return 6;
		} else {
			return 0;
		}
	}

	public void runPrompt() {

		Scanner scanner = new Scanner(System.in);
		Calender cal = new Calender();

		int month = 1;
		int year = 2021;

		while (true) {
			System.out.println("년도를 입력해주세요.(종료: -1)");
			System.out.println("YEAR> ");
			year = scanner.nextInt();

			if (year == -1) {
				break;
			}
			System.out.println("월을 입력해주세요.");
			System.out.println("MONTH> ");
			month = scanner.nextInt();
			
			if (month > 12 || month < 1) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			cal.printCalendar(year, month);
		}

		System.out.println("끝났습니다.");
		scanner.close();
	}

	public static void main(String[] args) {
		// 셀 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}
}