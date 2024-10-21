package Training_package;

public class array {

	public static void main(String[] args) {
		// 배열 생성 시 [] +  new 키워드 + 대괄호 안에 몇 개를 지정할 것인지 지정해야 함
		int [] array1 = new int[100];
		
		// 배열에 값 넣을 때 인덱스 지정 (0부터 시작)
		array1[0] = 50;
		array1[10] = 100;
		
		// 다른 방식으로 배열 생성
		int [] array2 = new int[] {1, 2, 3, 4};
		int [] array3 = {1, 2, 3, 4};
		
		// 배열 값 꺼낼 때
		System.out.println(array3[3]);
		
		int value = array3[0];
		System.out.println(value);
		
		// 배열 값 꺼낼 때 (반복문)
		for (int i=0; i<4; i++) {
			System.out.println(array3[i]);
		}
		
		int [] iarray = new int[100];
		iarray[0] = 1;
		iarray[1] = 2;
		
		// 배열 크기를 모르거나, 달라질 땐 length 값으로
		for(int i = 0; i < iarray.length; i++) {
			iarray[i] = i + 1;
		} 
		
		// 배열 인덱스 값을 모두 더한 값 표시하기
		int total = 0;
		for( int i = 0; i < iarray.length; i++) {
			total += iarray[i];
		}
		System.out.println(total);

	}

}
