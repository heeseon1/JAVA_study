package Training_package;

public class for_part {
	
	public static void main (String[] args) {
	
		int total = 0;
		
		for( int i = 1; i <= 100; i++) {  // 초기화, 조건, 증감
			if ( i % 2 != 0) {
				continue; // 홀수가 아니면 아래를 실행하지 않고 다시 처리함
			}
			total += i;
		}  
		
		System.out.println(total);
		

	}
}
