
public class Exercise_4 {

	public static void main2(String[] args) {

		// 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) 
		int totalSum = 0;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++)
				totalSum += j;
		}
		System.out.println("totalSum= " + totalSum);
		
		totalSum = 0;
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			totalSum = totalSum + sum;
		}
		System.out.println("totalSum= " + totalSum);
	}
	
	public static void main(String[] args) {
		
		
		int i = 0;
		int sum = 0;
		
		while(sum <= 100) {
			i++;
			if (i%2 == 0)
				sum -= i;											// 짝수일때
			else 
				sum += i;											// 홀수일때
			}
			System.out.println(i);
			
		
			
		}
		
		
		
	}
	
	


