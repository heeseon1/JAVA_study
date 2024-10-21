package Training_package;

public class array_2 {

	public static void main(String[] args) {
		// 2차원 배열 (대괄호 2개, new와 인덱스 크기 정해주기)
		int [] [] array4 = new int [3][4]; // 앞 3이 일차원, 뒤 4개는 정수값을 담을 수 있는 공간
		
		// 0번째는 실제 int 값을 담을 수 있지 않고, int형 배열을 가르킬 수 있는 참조 변수이므로 정수값을 담지 못함
		// array4[0] = 10;
		
		array4[0][1] = 10;
		array4[0][0] = 10;
		
		// 크기가 다른 배열도 생성 가능하지만 해당 부분을 사용하기 위해서는 배열을 만들어 줘야 함
		int [][] array5 = new int [3][];
		array5[0] = new int[1]; // 해당 배열을 만들지 않으면 array5[0][0] 에 값을 못 넣음
		array5[0][0] = 10;
		System.out.println(array5[0][0]);
		
		// 초기화와 동시에 값 생성
		int [][] array6 = { {1}, {1,2}, {1,2,3}};
		System.out.println(array6[1][0]);
		
		// for each ( : 을 기준으로 2가지 값 넣기, : 앞에는 값을 받아낼 수 있는 변수, : 뒤에는 반복하는 자료 구조 or 배열 입력)
		int [] iarr = {10, 20, 30, 40, 50};
		for(int value : iarr) {
			System.out.println(value);
		}
		

	}
	
	

}
