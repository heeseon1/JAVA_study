package Training_package;

public class if_boolean {

	  public static void main(String[] args) {
	        
	        // if�� �⺻
	        int x = 60;
	        int y = 60;
	        
	        if(  x < y ) {
	            System.out.println("x�� y���� �۽��ϴ�.");
	        } else if( x > y ){
	            System.out.println("x�� y���� Ů�ϴ�.");
	        } else if(x == y) {
	            System.out.println("x�� y�� �����ϴ�.");
	        }
	        
	        // �� ������
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
	            System.out.println("A��� �Դϴ�.");
	        } else {
	            System.out.println("A����� �ƴմϴ�.");
	        }
	        
	        // ���� ������
	        int b1 = (5 < 4) ? 50 : 40;  // ������ true�� ���� ��, false�� ���� ��
	        System.out.println(b1);
	    }

}
