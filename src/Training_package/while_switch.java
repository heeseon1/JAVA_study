package Training_package;

import java.util.Scanner;

public class while_switch {
    public static void main(String[] args) {
    	  int a1 = 1;
          while (a1 < 10) {
              System.out.println(2 * a1);
              a1+= 1;
          }

          int a = 1;
          while (true) {
              a = a + 1;
              System.out.printf("%d \n", a); //while(true)���� �׻� ���̱� ������ breake ���� ȣ�� �Ǳ� �������� ������ ���

              if( a == 4){
                  System.out.println("while Ƚ�� ������ ���� ó���ϱ⺸�� ������ ������ ���� ��츦 ó��");
                  break;
              }
          }
          
    int value = 6;
          
          // switch �� : �� case���� ��ɹ��� ������ �� Ż���� ���� break�� ����ϱ�
          switch(value) { 
              case 1: 
                  System.out.println("1");
                  break;
              case 2:
                  System.out.println("2");
                  break;
              case 3:
                  System.out.println("3");
                  break;
              default :
                  System.out.println("�ش� ���ڿ� ��ġ�ϴ� ���� �����ϴ�.");
          }
          // 1.7 ���� ���ĺ��ʹ� switch ������ ���ڿ��� ��� ����
          
          
          // while�� : ���� �ȿ��� ���� ���� ��� ����ؼ� �ݺ�
          while ( value < 10 ) {
              System.out.println(value);
              value += 1; // value++;
          }
          
          // while���� �̿��� 100������ �� ���ϱ�
          int total = 0;
          int i = 1;
          
          while ( i <= 100) {
              total = total + i;
              i++;
          }
          System.out.println(total);
          

          // while ������ ¦���� ����ϱ�
          int s = 1;
          while(s < 11) {
              if( s % 2 == 0) {
                 System.out.println(s);
              }
              s++; 
          } 
          
          // do while�� : ������ ���� �ʾƵ� 1���� ����Ǵ� �ݺ���
          int num = 0;
          
          // input Ŭ����
          Scanner scan = new Scanner(System.in);
          
          do {
              // �ݺ��� ���� �ۼ� (1���� ����)
              num = scan.nextInt(); // �������� �Է¹޾� �־��ִ� ��: nextInt()
              System.out.println("�Է¹��� ��:" + num);
              
          } while( num != 10 );
          
          System.out.println("�ݺ� ����");
          

          
      }
      
  }
