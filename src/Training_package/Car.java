package Training_package;

//Car 클래스 선언
public class Car {

	//타입 필드 선언 (속성 or 상태)
	String name; //차 이름
	int number; // 차 번호

/**메소드 선언 (행동 or 기능)
 * 입력값: 매개변수, 인자
	 * 인자(argument): 어떤 함수를 호출 시 전달되는 값
	 * 매개변수(parameter): 전달된 인자를 받아들이는 변수
 * 결과값: 리턴값 
*/
	
	// public 리턴타입 메소드명(매개변수들){ 구현 }
	
	// 리턴 타입 X,  매개변수 X
	public void method1() {
		System.out.println("method1 실행");
	}
	
	// 리턴 타입 X, 매개변수 정수 O
	public void method2(int x) {
		System.out.println("method2 실행" + x);
	}
	
	// 리턴 타입 O, 매개변수 X (메서드 안에서 리턴하는 부분이 반드시 존재해야 함)
	public int method3() {
		System.out.println("method3 실행");
		return 30;
	}

	// 리턴 타입 X, 매개변수 정수 2개 O
	public void method4(int x, int y) {
		System.out.println("method4 실행" + x + y);
	}
	
	// 리턴 타입 O, 매개변수 정수 O
	public int method5(int x) {
		System.out.println("method5 실행" + x);
		return x + 20;
	}
	

}
