package Training_package;

public class HelloWord {
	
	/** ����ȭ �ּ�
	 * 
	 * @param args
	 */

	//���α׷��� ������
	public static void main(String[] args) {
		
	    System.out.println("�ּ� ����:  ctrl + / ");
	    //		System.out.println("���Ϥ�"); 
	    
	    
	    // ���� ���� (�� ���ʿ� � type �� ���� ���� �ۼ��ϰ� ������)
	    // �������� ù��°�� �׻� �ҹ���, 2���� �ܾ� �̻� ���ս� camel? ǥ��� ��� ex) testScore
	    int count;
	    count = 10;
	    count = 20;
	    // �������� ������ ������ ���� ����
	    System.out.println(count);
	    
	   
	    //�Ǽ��� �Ǽ� type �� ��������� ���� �߻����� ����
	    double avg = 11.1;
	    System.out.println(avg);
	    
	    
	    //���: ���� ������ �ʴ� ��, final�� �ٿ��ְ� �������� ��� �빮�� ���
	    final int NUM = 10;
	    
	    // EX) ���� ���̸� ���� �� �� ���� ���� ������ ������ ��, 3.14159�� ���� ���̳� ���� ���� �� � ������ �� �𸣰��� �� ���
	    double circleArea;
	    final double PI = 3.14159;
	    circleArea = 3 * 3 * PI;
	    System.out.println(circleArea);
	    
	    // EX) �⸧ �� ��� (����� _ ����ٷ� 2�� �̻� �ܾ� ǥ��)
	    final int OIL_PRICE = 1550;
	    int totalPrice = 50 * OIL_PRICE;
	    System.out.println(totalPrice);
	    
	    
	    //�⺻�� Ÿ�� (��, ����)
	    boolean isFun = false;
	    
	    //�⺻�� Ÿ�� (���� �ϳ��� ����, ���� ����ǥ�� ���α�)
	    char c = 'H';
	    
	    //�⺻�� Ÿ�� (����, �� ��ü�� ���ͷ��̶� ��)
	    int a = 59;
	    
	    //�⺻�� Ÿ�� (ū ���� ��, ���� l or L �ֱ�)
	    long bing = 3599874654l;
	    
	    //�⺻�� Ÿ�� (�Ǽ�, ���� f or F �ֱ�)
	    float f = 32.4f;
	    
	    //�⺻�� Ÿ�� (ū �Ǽ� ��)
	    double d = 5165128.5;
	    
	    System.out.println(isFun);
	    System.out.println(c);
	    System.out.println(a);
	    System.out.println(bing);
	    System.out.println(f);
	    System.out.println(d);
	    
	    
	   
	    // byte <  short, char < int < long < float < double
	    //������ ����ȯ(���� �� -> ū �� O, ū �� -> ���� �� X)
	    int x = 50000;
	    long y = x;
	    
	    // ��, ū �׸��� ���� ���� �ִٸ� ���� ���� ���� �׸��� �ű� �� ���� = ���� ����ȯ
	    long x2 = 10;
	    int y2 = (int) x2;
	    
	    System.out.println(y);
	    System.out.println(y2);

	    
	    
	    
/*   
 ������
	   ��ȣ ������: +, -  
	   ��� ������: +, -, *, /, %  
	   ���� ������: ++, --
 */
	    
	    int i1 = -5;
	    int i2 = +i1;
	    int i3 = -i1; // - �����ڿ� -�� ������ +
	    System.out.println(i1);
	    System.out.println(i2);
	    System.out.println(i3);
	    
	    int i4 = ++i3; // i3 = i3 + 1 : ���� �����ְ� �� �ֱ�
	    System.out.println(i4);
	    System.out.println(i3);
	    
	    int i5 = i3++; // i3 = i3 + 1 : ���� �� �ְ� �����ֱ�
	    System.out.println(i5);
	    System.out.println(i3);
	    
	    // �������� ����� ��� ������ ����, �Ҽ� ���� ������ ������ �� �� �ϳ��� �Ǽ��� ����
	    int i = 5;
	    int j = 3;
	    System.out.println( i + j );
	    System.out.println( i - j );
	    System.out.println( i * j );
	    System.out.println( i /  (double)j ); 
	    System.out.println( i % j );
	    
	    
	    
	    //�� ������: true, false �� ���� ����
	    // == ����, != �ٸ���, < ũ��, >�۴�, <= ũ�ų� ����, >= �۰ų� ����
	    int q = 10;
	    int w = 10;
	    System.out.println( q == w );
	    System.out.println( q != w );
	    System.out.println( q < w );
	    System.out.println( q > w );
	    System.out.println( q <= w );
	    System.out.println( q >= w );
	    
	    q +=  10; // q = q + 10
	    System.out.println("���� ���� ������: " + q);
	    
	    
		/* 
		 	������ �켱 ����
		 	.  []  ()
		 	++  --  !  ~  :
		 	* /  %  >  +  -  >>  <<  >>>
		 	>  <  >=  <=  == !=
		 	&  |  ^  ~
		 	&&  >  ||!
		 	���ǽ�?
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
