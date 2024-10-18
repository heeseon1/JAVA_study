package Training_package;

public class for_part {
	
	public static void main (String[] args) {
	
		int total = 0;
		
		for( int i = 1; i <= 100; i++) { //초기화, 조건, 증가
			if ( i % 2 != 0) {
				continue; // 짝수가 아니라면 아래로 내려가지 않고 다시 처음으로
			}
			total += i;
		}  
		
		System.out.println(total);
		

	}
}
