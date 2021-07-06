package hello.calender;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT= "cal>";
	
	public void runPrompt() {

			Scanner scanner = new Scanner(System.in);
			Calender cal = new Calender();
			
			int month = 1;
			int year = 2021;
			
			while (true) {
				System.out.println("년도를 입력해주세요.");
				System.out.println("YEAR> ");
				year = scanner.nextInt();
				System.out.println("월을 입력해주세요.");
				System.out.println("MONTH> ");
				month = scanner.nextInt();
				
				if (month <= -1) {
					break;
				} else if (month > 12) {
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