
public class Exercise_1 {

	public static void main(String[] args) {

		int x = 15;
		if (x>10 && x<20) {
			System.out.println("참 입니다.");
		}
		
		char ch = 'A';
		if (ch != ' ' || ch !='\t') {
			System.out.println("참 입니다.");
		}
		
		if (ch == 'x' || ch == 'X') {
			System.out.println("참 입니다.");
		}
		
		if (ch <= 9 &&  ch >= 0)
			System.out.println("참 입니다.");
		
	}

}
