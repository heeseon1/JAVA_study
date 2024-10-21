package Training_package;

public class HelloWord {
	
	/** 설명화 주석
	 * 
	 * @param args
	 */

	//프로그램의 시작점
	public static void main(String[] args) {
		
	    System.out.println("주석 사용:  ctrl + / ");
	    //		System.out.println("출력문"); 
	    
	    
	    // 변수 선언 (한 줄에 어떤 type의 변수를 선언하고 사용)
	    // 변수명은 첫글자는 반드시 소문자, 2단어 이상일 경우 camel 표기법 사용 ex) testScore
	    int count;
	    count = 10;
	    count = 20;
	    // 변수값이 변경된 결과 출력
	    System.out.println(count);
	    
	   
	    //실수형 변수를 선언하고 실수 타입에서 발생할 수 있는 오류 설명
	    double avg = 11.1;
	    System.out.println(avg);
	    
	    
	    //상수: 값을 변경할 수 없는 변수, final로 선언하며 변수명은 모두 대문자로
	    final int NUM = 10;
	    
	    // EX) 원의 면적을 구할 때처럼 변하지 않는 값이 있을 경우, 3.14159와 같은 값을 상수로 선언하여 사용
	    double circleArea;
	    final double PI = 3.14159;
	    circleArea = 3 * 3 * PI;
	    System.out.println(circleArea);
	    
	    // EX) 기름값 계산 예시 (변수를 _로 구분하고 2단어 이상을 나타냄)
	    final int OIL_PRICE = 1550;
	    int totalPrice = 50 * OIL_PRICE;
	    System.out.println(totalPrice);
	    
	    
	    //기본형 타입 (논리형, 참/거짓)
	    boolean isFun = false;
	    
	    //기본형 타입 (문자 하나, 문자 리터럴을 표현)
	    char c = 'H';
	    
	    //기본형 타입 (정수형, 작은 크기의 데이터 타입)
	    int a = 59;
	    
	    //기본형 타입 (큰 정수형, 끝에 l 또는 L을 붙임)
	    long bing = 3599874654l;
	    
	    //기본형 타입 (실수형, 끝에 f 또는 F를 붙임)
	    float f = 32.4f;
	    
	    //기본형 타입 (큰 실수형)
	    double d = 5165128.5;
	    
	    System.out.println(isFun);
	    System.out.println(c);
	    System.out.println(a);
	    System.out.println(bing);
	    System.out.println(f);
	    System.out.println(d);
	    
	   
	    // byte < short, char < int < long < float < double
	    //자동형 변환(작은 타입 -> 큰 타입으로 O, 큰 타입 -> 작은 타입으로 X)
	    int x = 50000;
	    long y = x;
	    
	    // 단, 큰 타입에서 작은 타입으로 변환할 때에는 강제 변환을 해야 함 = 명시적 변환
	    long x2 = 10;
	    int y2 = (int) x2;
	    
	    System.out.println(y);
	    System.out.println(y2);

	    
	    
	    
/*   
 연산자
	   부호 연산자: +, -  
	   산술 연산자: +, -, *, /, %  
	   증감 연산자: ++, --
 */
	    
	    int i1 = -5;
	    int i2 = +i1;
	    int i3 = -i1; // - 연산자에 -를 붙이면 +
	    System.out.println(i1);
	    System.out.println(i2);
	    System.out.println(i3);
	    
	    int i4 = ++i3; // i3 = i3 + 1 : 먼저 증가하고 값 넣기
	    System.out.println(i4);
	    System.out.println(i3);
	    
	    int i5 = i3++; // i3 = i3 + 1 : 먼저 값 넣고 증가하기
	    System.out.println(i5);
	    System.out.println(i3);
	    
	    // 기본적으로 정수와 실수 연산은 정수형이 실수형으로 변환되어 계산, 나눗셈은 반드시 하나의 피연산자가 실수여야 함
	    int i = 5;
	    int j = 3;
	    System.out.println( i + j );
	    System.out.println( i - j );
	    System.out.println( i * j );
	    System.out.println( i /  (double)j ); 
	    System.out.println( i % j );
	    
	    
	    
	    //비교 연산: true, false로 결과 출력
	    // == 같다, != 다르다, < 작다, > 크다, <= 작거나 같다, >= 크거나 같다
	    int q = 10;
	    int w = 10;
	    System.out.println( q == w );
	    System.out.println( q != w );
	    System.out.println( q < w );
	    System.out.println( q > w );
	    System.out.println( q <= w );
	    System.out.println( q >= w );
	    
	    q +=  10; // q = q + 10
	    System.out.println("복합 대입 연산자 결과: " + q);
	    
	    
		/* 
		 	연산자의 우선순위
		 	.  []  ()
		 	++  --  !  ~  :
		 	* /  %  >  +  -  >>  <<  >>>
		 	>  <  >=  <=  == !=
		 	&  |  ^  ~
		 	&&  >  ||!
		 	삼항연산자?
		 	=  *=  /=  %=  +=  -=
		 	
		 */
	    
	    int ax = 5;
	    int bx = 10;
	    int cx = 15;
	    
	    System.out.println( (ax - bx) * cx );
	    System.out.println( ax > 5 && bx > 5 );
	    System.out.println( ax > 5 || bx > 5);
	    System.out.println( ax++  - 5 );
	    System.out.println( ax );
	    
	
	    
	    
	    
	    
	}


}
