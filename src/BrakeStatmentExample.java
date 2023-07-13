
public class BrakeStatmentExample {

	public static void main(String[] args) {
		
		int choice = (int)(Math.random()*100 + 1);           // [1 ~ 100]
		System.out.println("choice = " + choice);
		
		int sum = 0;
		for (int i = 1; i <= 100; i ++) {
			sum += i;
			if (i == choice)
				break;														// 중간에 break 삽입 : 가장 가까운 반복문을 끝냄
		}
		
		System.out.println("sum = " + sum);
		
		
		
	}

}
