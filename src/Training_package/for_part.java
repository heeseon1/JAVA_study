package Training_package;

public class for_part {
	
	public static void main (String[] args) {
	
		int total = 0;
		
		for( int i = 1; i <= 100; i++) { //�ʱ�ȭ, ����, ����
			if ( i % 2 != 0) {
				continue; // ¦���� �ƴ϶�� �Ʒ��� �������� �ʰ� �ٽ� ó������
			}
			total += i;
		}  
		
		System.out.println(total);
		

	}
}
