package Training_package;

public class Truck extends Car {
	public Truck() {
		//부모의 생성자를 얘기하는 것: super();
		System.out.println("Truck의 기본 생성자입니다.");
	}

	 int fee;
	 
	 public Truck (String name, int number, int fee) {
		  //super(name, number); ? 부모 클래스에서 기본 생성자가 없을 때 부모 클래스를 명시적으로 호출함
	       this.fee = fee;
	 }
	
}
