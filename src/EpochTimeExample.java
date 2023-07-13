
public class EpochTimeExample {

	public static void main(String[] args) {

		long epoch = System.currentTimeMillis()/1000 + 9*60*60;    		// 우리나라 시간 구하는법 (초단위로 변환)
		System.out.println(epoch); 
		
		
		int year = 1970;
		for (;;) {
			boolean isLeap = (year%4 == 0 && year%100 != 0) || (year%400 == 0);  // > 윤년 계산법
			int days0Year = isLeap ? 366 : 365;
			if ((epoch - days0Year*24*60*60) >= 0) {
				epoch = epoch - days0Year*24*60*60;
				year++;
		}	else 
			break;
			
		}
		
		System.out.println(year);
		System.out.println(epoch);       			 							//1689219225132    1970
		
	}

}
