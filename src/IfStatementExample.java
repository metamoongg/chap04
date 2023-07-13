
public class IfStatementExample {
	
	
	public static void main(String[] args) {
		
		// if문 응용
		
		int jumsu = (int)(Math.random()*51 +50); 		// [50 ~ 100]	
																	// (Math.random()*101) : [0 ~ 100]
		char grade = 'F';
		
//		if (90 <= jumsu && jumsu <= 100) 					// 90 <= jumsu <= 100
//			grade = 'A';
//		else if (80 <= jumsu && jumsu < 90) 
//			grade = 'B';
//		else if (70 <= jumsu && jumsu < 80) 
//			grade = 'C';
//		else if (60 <= jumsu && jumsu < 70) 
//			grade = 'D';
//		else
//			grade = 'F';
		
		
		if (90 <= jumsu) 					// 90 <= jumsu <= 100
			grade = 'A';
		else if (80 <= jumsu) 
			grade = 'B';
		else if (70 <= jumsu) 
			grade = 'C';
		else if (60 <= jumsu) 
			grade = 'D';
		else
			grade = 'F';
		
			System.out.printf("[%d,%c]\n" , jumsu , grade);
		
		
		
		
	}
	
	
	
	
	
	
	public static void main5(String[] args) {
		
		// if else esleif 문
		
		int num = (int)(Math.random()*100 - 50);
		
		if (num > 0)
			System.out.println("양수");
		else if (num == 0)
			System.out.println("0");
		else 
			System.out.println("음수");
		
		System.out.println("num= " + num);
		
		
		
	}
	
	
	
	public static void main4(String[] args) {
		
		// {} 생략 가능할때 : Statement 가 한줄일때는 생략 가능
		int num = 95;
		if (num%2 == 0)
			System.out.println("짝수 입니다.");
		else 
			System.out.println("홀수 입니다.");
			
	}
	
	public static void main3(String[] args) {
		
		// else if 문
		int num = 99;
		if (num%2 == 0) {
			System.out.println("###########");
			System.out.println("짝수 입니다 num=" + num);
			System.out.println("###########");
		} else {
			System.out.println("@@@@@@@@@@@");
			System.out.println("홀수 입니다 num=" + num);
			System.out.println("@@@@@@@@@@@");
		}
		
		
	}
	
	public static void main2(String[] args) {

		// 기본 if 문
		int num = 99;
		if (num%3 == 0) {
			System.out.println("if문 수행됨");
		} 														// == 0 이 조건식 이기 때문에 if문 성립
		
		System.out.println("Program End ..");
		
		
	}

}
