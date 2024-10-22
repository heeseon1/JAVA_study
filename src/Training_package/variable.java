package Training_package;

	public class variable {
			// 변수의 scope, static
			int globalScope = 10; // 전역변수 (=인스턴스 변수)
			static int staticVal = 5;
			
			
			public void scopeTest(int value) {
				int localScope = 20; // 지역변수
				
				// 모두 사용이 됨
				System.out.println(globalScope);
				System.out.println(localScope);
				System.out.println(value);
			}
			
			public void scopeTest2(int value2) {
				System.out.println(globalScope); // 사용이 됨
				//System.out.println(localScope);  사용이 안됨
				//System.out.println(value);  사용이 안됨
				System.out.println(value2);
			}
		
			public static void main(String[] args) {
				// 해당 클래스 안에 있어도 사용하지 못하는 이유: static 필드가 아니기 때문
				// System.out.println(globalScope);
				// System.out.println(localScope);
				// System.out.println(value);
				// System.out.println(value2);
				
				// class가 인스턴스화 되지 않아도 static한 메소드,필드는 사용할 수 있음
				System.out.println(staticVal);
				
				// static 필드가 아닌 걸 사용하기 위해서는 객체 생성하고 사용
				variable v1 = new variable();
				System.out.println(v1.globalScope);
				
				variable v2 = new variable();
				v1.staticVal = 50;
				v2.staticVal = 100;
				System.out.println(v1.staticVal);
				System.out.println(v2.staticVal);
				// static 변수는 값을 1개만 가짐 (=class 변수)
				// 인스턴스가 생성되지 않아서 생성될 수 있기 때문에 '래퍼런스.변수명'으로 사용하지 않고, '클래스명.변수' 로 사용
			}

}
