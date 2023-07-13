
public class WhileStatementExample {

	public static void main2(String[] args) {
		// while 문
		int dice = 0;
		
		// dice!=5 가 false 가 될때까지 반복 > 5가 나오면 종료
		
		while(dice!=5) {
			dice = (int)(Math.random()*6 + 1);
			System.out.println("dice = " + dice);
		}
		
		System.out.println("End");
		
	}

	public static void main3(String[] args) {
		// do while 문 : 1회 이상 반복
		int dice1 = 0;
		int dice2 = 0;
		
		do {
			dice1 = (int)(Math.random()*6 + 1);
			dice2 = (int)(Math.random()*6 + 1);
			System.out.printf("[%d,%d]\n" , dice1 , dice2);

		} while(dice1 + dice2 != 5);    // while 조건이 true면 다시 do를 실행 / false면 종료
	}

	public static void main(String[] args) {
		
		int dice1 = 0;
		int dice2 = 0;
		
			dice1 = (int)(Math.random()*6 + 1);
			dice2 = (int)(Math.random()*6 + 1);
			System.out.printf("[%d,%d]\n" , dice1 , dice2);

			while(dice1 + dice2 != 5); {
			 dice1 = (int)(Math.random()*6 + 1);
				dice2 = (int)(Math.random()*6 + 1);
				System.out.printf("[%d,%d]\n" , dice1 , dice2);
		 }
		
		
		
		
	}
}
