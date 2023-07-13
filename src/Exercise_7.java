import java.util.Scanner;

public class Exercise_7 {

	public static void main(String[] args) {

		boolean run = true;
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		for(;;) {
			System.out.println("---------------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("---------------------");
			System.out.println("선택>");
			
			int menu = scanner.nextInt();							// 사용자가 입력 할때까지 (엔터) 멈춤
		//	System.out.println("menu = " + menu);
			switch (menu) {
			case 1 : {//예금
				
				System.out.println("금액>");
				int money = scanner.nextInt();
				balance += money;
			}
				break;
			case 2 : {//출금
				System.out.println("금액>");
				int money = scanner.nextInt();
				balance -= money;
			}
				break;
			case 3 : //잔고
				System.out.println("잔고 : " + balance);
				break;
			}
			
			if (menu == 4) //종료
				break;
				
			
		}
		
		System.out.println("프로그램 종료");
		
	}

}
