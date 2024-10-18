package Training_package;

public class HelloWord {
	
	/** 문서화 주석
	 * 
	 * @param args
	 */

	//프로그램의 시작점
	public static void main(String[] args) {
		
	    System.out.println("주석 단출:  ctrl + / ");
	    //		System.out.println("하하ㅏ"); 
	    
	    
	    // 변수 선언 (맨 앞쪽에 어떤 type 을 담을 건지 작성하고 변수명)
	    // 변수명은 첫번째는 항상 소문자, 2개의 단어 이상 결합시 camel? 표기법 사용 ex) testScore
	    int count;
	    count = 10;
	    count = 20;
	    // 마지막에 변수에 저장한 값이 저장
	    System.out.println(count);
	    
	   
	    //실수는 실수 type 을 선언해줘야 에러 발생하지 않음
	    double avg = 11.1;
	    System.out.println(avg);
	    
	    
	    //상수: 값이 변하지 않는 것, final을 붙여주고 변수명은 모두 대문자 사용
	    final int NUM = 10;
	    
	    // EX) 원의 넓이를 구할 때 그 값을 담을 변수를 선언할 때, 3.14159와 같은 값이나 값만 봤을 때 어떤 값인지 잘 모르겠을 때 사용
	    double circleArea;
	    final double PI = 3.14159;
	    circleArea = 3 * 3 * PI;
	    System.out.println(circleArea);
	    
	    // EX) 기름 값 계산 (상수는 _ 언더바로 2개 이상 단어 표기)
	    final int OIL_PRICE = 1550;
	    int totalPrice = 50 * OIL_PRICE;
	    System.out.println(totalPrice);
	    
	    
	    //기본형 타입 (참, 거짓)
	    boolean isFun = false;
	    
	    //기본형 타입 (문자 하나만 가능, 작은 따옴표로 감싸기)
	    char c = 'H';
	    
	    //기본형 타입 (정수, 값 자체가 리터럴이라 함)
	    int a = 59;
	    
	    //기본형 타입 (큰 정수 값, 끝에 l or L 넣기)
	    long bing = 3599874654l;
	    
	    //기본형 타입 (실수, 끝에 f or F 넣기)
	    float f = 32.4f;
	    
	    //기본형 타입 (큰 실수 값)
	    double d = 5165128.5;
	    
	    System.out.println(isFun);
	    System.out.println(c);
	    System.out.println(a);
	    System.out.println(bing);
	    System.out.println(f);
	    System.out.println(d);
	    
	    
	   
	    // byte <  short, char < int < long < float < double
	    //묵시적 형변환(작은 거 -> 큰 거 O, 큰 거 -> 작은 거 X)
	    int x = 50000;
	    long y = x;
	    
	    // 단, 큰 그릇에 작은 값이 있다면 작은 값은 작은 그릇에 옮길 수 있음 = 강제 형변환
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
	    int i3 = -i1; // - 연산자에 -가 붙으면 +
	    System.out.println(i1);
	    System.out.println(i2);
	    System.out.println(i3);
	    
	    int i4 = ++i3; // i3 = i3 + 1 : 먼저 더해주고 값 넣기
	    System.out.println(i4);
	    System.out.println(i3);
	    
	    int i5 = i3++; // i3 = i3 + 1 : 먼저 값 넣고 더해주기
	    System.out.println(i5);
	    System.out.println(i3);
	    
	    // 정수끼리 계산은 모두 정수로 나옴, 소수 값이 나오고 싶으면 값 중 하나를 실수로 변경
	    int i = 5;
	    int j = 3;
	    System.out.println( i + j );
	    System.out.println( i - j );
	    System.out.println( i * j );
	    System.out.println( i /  (double)j ); 
	    System.out.println( i % j );
	    
	    
	    
	    //비교 연산자: true, false 로 값이 나옴
	    // == 같다, != 다르다, < 크다, >작다, <= 크거나 같다, >= 작거나 같다
	    int q = 10;
	    int w = 10;
	    System.out.println( q == w );
	    System.out.println( q != w );
	    System.out.println( q < w );
	    System.out.println( q > w );
	    System.out.println( q <= w );
	    System.out.println( q >= w );
	    
	    q +=  10; // q = q + 10
	    System.out.println("복합 대입 연산자: " + q);
	    
	    
		/* 
		 	연산자 우선 수위
		 	.  []  ()
		 	++  --  !  ~  :
		 	* /  %  >  +  -  >>  <<  >>>
		 	>  <  >=  <=  == !=
		 	&  |  ^  ~
		 	&&  >  ||!
		 	조건식?
		 	=  *=  /=  %=  +=  -=
		 	
		 */
	    
	    int ax = 5;
	    int bx = 10;
	    int cx = 15;
	    
	    System.out.println( (ax - bx) *cx );
	    System.out.println( ax > 5 && bx > 5 );
	    System.out.println( ax > 5 || bx > 5);
	    System.out.println( ax++  - 5 );
	    System.out.println( ax );
	    
	
	    
	    
	    
	    
	}


}
