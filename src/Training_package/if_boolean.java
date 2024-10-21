package Training_package;

public class if_boolean {

	  public static void main(String[] args) {
	        
	        // if의 기본
	        int x = 60;
	        int y = 60;
	        
	        if(  x < y ) {
	            System.out.println("x는 y보다 작습니다.");
	        } else if( x > y ){
	            System.out.println("x는 y보다 큽니다.");
	        } else if(x == y) {
	            System.out.println("x는 y와 같습니다.");
	        }
	        
	        // 논리 연산자
	        boolean a1 = true;
	        boolean a2 = false;
	        boolean a3 = true;
	        
	        System.out.println(a1 && a2);
	        System.out.println(a1 && a3);
	        System.out.println(a1 || a2);
	        System.out.println(a2 || a3);
	        System.out.println(a1 ^ a2);
	        System.out.println(!a1);    
	        
	        int score = 88;
	        
	        if (score <= 100 && score >= 90) {
	            System.out.println("A학점 입니다.");
	        } else {
	            System.out.println("A학점이 아닙니다.");
	        }
	        
	        // 삼항 연산자
	        int b1 = (5 < 4) ? 50 : 40;  // 조건이 true일 때, false일 때 반환 값
	        System.out.println(b1);
	    }

}
