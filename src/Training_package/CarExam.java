package Training_package;

public class CarExam {

	public static void main(String[] args) {
		//Car 클래스 객체 
		// (new 뒤에 나오는 부분을 '생성자'라고 함, 메모리에 만들어진 객체를 '인스턴스'라고 함)
		// 클래스와 new 연산자를 통해 만들어진 것을 인스턴스라 부르며, 인스턴스를 가리키는 변수가 래퍼런스
		Car c1 = new Car();
		Car c2 = new Car();
		
		//Car 클래스 필드(속성) 부여하기
		c1.name = "경찰차";
		c1.number = 1004;
		
		c2.name="검정차";
		c2.number = 1234;
		
		System.out.println(c1.name);
		System.out.println(c1.number);
		System.out.println(c2.name);
		System.out.println(c2.number);
		
		//Car 메서드 사용하기 (객체로 만들어야 사용 가능)
		Car c3 = new Car();
		
		c3.method1();
		c3.method2(5);
		
		int value = c3.method3(); //리턴 값을 갖는 메서드가 실행될 때는 해당 값을 받아낼 변수 필요
		System.out.println(value);
		
		c3.method4(10, 10);
		
		int value2 = c3.method5(20);
		System.out.println(value2);
		
		
		
		// 참조형 타입? 기본형 타입을 제외한 모든 타입 (배열, 클래스... 등등)
		int i = 4; // (기본형 타입)
		
		//참조한다, 레퍼런스 한다는 것은 변수 str이 인스턴스를 가지고 있는 게 아니라 말 그대로 가르킨다(참조한다) 라는 의미
		String str = new String("참조형 타입"); // 'new' 연산자로 새로운 String 인스턴스를 생성하고 이를 참조
		
		//String 클래스: 문자열을 표현하는 자바에서 가장 많이 사용하는 클래스, new 라는 연산자를 이용하지 않고도 만들 수 있음
		String str1 = "hello"; // 문자열 리터럴은 상수들이 저장되는 곳에 저장되고, 해당 인스턴스를 참조함
		String str2 = "hello"; // 앞서 str1과 같은 값을 참조하므로, 동일한 인스턴스를 참조하고 있음
		
		String str3 = new String("hello"); // new 연산자가 있기 때문에 인스턴스를 새로 1개 만들고 그 값을 참조하고 있음 (상수들이 저장되는 메모리와는 다른 영역)
		
		// 참조형 비교  (래퍼런스가 같은지를 확인, 즉 두 변수가 같은 메모리 주소를 가리키는지 확인)
		if (str1 == str3) {
			System.out.println("같은 래퍼런스입니다.");
		}else {
			System.out.println("다른 래퍼런스입니다.");
		}
		
		System.out.println(str1.substring(3)); //substring(인덱스) 부터 자르기: 새로운 string을 만들어서 반환
		System.out.println(str1); // 앞서 substring으로 자르기를 진행했어도 한번 만들어진 string은 변하지 않음
		
		//변수가 저장하는 문자열이 같은 지 확인할 땐 'equals' 메소드 사용
		if(str1.equals(str3)) {
			System.out.println("문자열이 같습니다.");
		}
		
		


	}

}
