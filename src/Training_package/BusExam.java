package Training_package;

public class BusExam {
	
	public static void main (String[] args) {
		
		Bus bus = new Bus();
		bus.run();
		bus.ppangppang();
		
		Car car = new Car();
		car.run();
		//car.ppangppang(); 부모 클래스는 자식 클래스에 있는 걸 사용할 수 없음
		
	}
	
	
}
