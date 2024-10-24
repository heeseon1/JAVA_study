package Training_package;

public class overload {
	
		// 메소드 오버로딩 (매개변수 유형, 개수를 다르게 하여 같은 이름의 메소드를 가질 수 있게 함)
		public int plus (int x, int y) {
			return x + y;
	}
		
		public int plus(int x, int y, int z) {
			return x + y + z;
		}
		
		public String plus(String x, String y ) {
			return x + y;
		}
		
/**	이미 있는 타임, 유형이기 때문에 에러 발생
   public int plus(int i, int j) {
			return i + j;
		}
**/		
		
		
		//생성자 오버로딩


}
