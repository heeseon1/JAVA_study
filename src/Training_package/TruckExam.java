package Training_package;

public class TruckExam {

	public static void main(String[] args) {
		
		// 트럭을 인스턴스화 할 때 부모인 Car가 먼저 호출되므로 Car의 기본 생성자와 Truck의 기본 생성자가 함께 실행됨
		Truck t = new Truck(); 
		
		Truck t2 = new Truck(new String("부릉"), 3000, 1050);
		System.out.println(t2.name);
		System.out.println(t2.number);
		System.out.println(t2.fee);
		
	}
	

}
