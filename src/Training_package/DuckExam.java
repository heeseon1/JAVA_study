package Training_package;

public class DuckExam {

	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.sing();
		// 상속받지는 않았지만 추상 클래스의 메서드를 사용할 수 있다
		duck.fly(); 
		
		// 추상 클래스는 부모로써 역할은 가능하지만 추상 클래스 자체를 이용하여 객체 생성은 불가능
		// Bird b = new Bird(); 에러 발생

	}

}
