
public class SwitchStatementExample {
	
	
	public static void main(String[] args) {
	
	
		char ch = (char)(Math.random()*26 + 'A'); 		// [A ~ Z]
		
		// breake; 생략할시
		
		switch (ch) {
		case 'A':
		case 'I':
		case 'E':
		case 'O':
		case 'U':
			System.out.println("모음");
			break;
		default:
			System.out.println("자음");
		}
	
		System.out.println(ch);
	
	}
	
	public static void main2(String[] args) {

		int num = (int)(Math.random()*5); 				// [0 ~ 4]
		char ch = '모';
		
//		if (num == 0)
//			ch = '도';
//		else if (num == 1)
//			ch = '개';
//		else if (num == 2)
//			ch = '걸';
//		else if (num == 3)
//			ch = '윷';
//		else 
//			ch = '모';
		
		// Switch 문 : 동등 비교일경우 가독성이 if 문보다 좋음
		
		switch (num) {
		case 0:											// 0 일때 Statement 실행후 brake
			ch = '도';
			break;											// break; 를 걸어야 문장에서 빠져나감
		case 1 :
			ch = '개';
			break;
		case 2 :
			ch = '걸';
			break;
		case 3 :
			ch = '윷';
			break;
		case 4 :
			ch = '모';
			break;
		default: 											// = else (생략 가능)
			break;
		}
		
		System.out.printf("[%c,%d]\n" , ch , num);
		
		
		
		
		
		
		
		
		
		
		
	}

}
