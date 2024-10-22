package Training_package;

public class StrintMethod {

	public static void main(String[] args) {
		// string 클래스 사용하기
		// String str = new String("hello"); 원래는 이렇게 선언
		String str = "hello"; // string은 이렇게도 선언 가능
		
		System.out.println(str.length()); // 문자열 길이 반환
		System.out.println(str.concat(" world")); // 문자 결합
		
		// string은 불변 클래스이므로 한번 만들어진 객체는 변하지 않음 (앞서 concat으로 문자열을 붙여도 다시 str을 출력하면 hello만 출력는 이유)
		System.out.println(str);
		
		//아래와 같이 선언해줘야 str 객체가 변함
		str = str.concat(" world");
		System.out.println(str);
		
		System.out.println(str.substring(3)); // 3번째부터 잘라서 출력 (4번째부터 잘라져서 출력됨)
		System.out.println(str.substring(3, 6)); // 3번부터 6번까지 출력 (4,5번째만 출력됨)

	}

}
