package Training_package;

//추상클래스 (메서드가 하나라도 추상 메서드라면 클래스도 추상 클래스)
public abstract class Bird {
	//추상 메서드인 걸 알려주는 키워드: abstract
	public abstract void sing(); 
	
	public void fly() { // 추상 메서드에 일반 메서드 정의 가능
		System.out.println("날다");
	}
	

}
