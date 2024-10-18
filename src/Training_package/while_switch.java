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
              System.out.printf("%d \n", a); //while(true)값은 항상 참이기 때문에 breake 문이 호출 되기 전까지는 무조건 출력

              if( a == 4){
                  System.out.println("while 횟수 정해진 것을 처리하기보단 조건이 정해져 있을 경우를 처리");
                  break;
              }
          }
          
    int value = 6;
          
          // switch 문 : 각 case에서 명령문을 실행한 후 탈출을 위해 break를 사용하기
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
                  System.out.println("해당 숫자와 일치하는 값이 없습니다.");
          }
          // 1.7 버전 이후부터는 switch 문에서 문자열도 사용 가능
          
          
          // while문 : 조건 안에서 값이 참일 경우 계속해서 반복
          while ( value < 10 ) {
              System.out.println(value);
              value += 1; // value++;
          }
          
          // while문을 이용해 100까지의 합 구하기
          int total = 0;
          int i = 1;
          
          while ( i <= 100) {
              total = total + i;
              i++;
          }
          System.out.println(total);
          

          // while 문에서 짝수만 출력하기
          int s = 1;
          while(s < 11) {
              if( s % 2 == 0) {
                 System.out.println(s);
              }
              s++; 
          } 
          
          // do while문 : 조건이 맞지 않아도 1번은 실행되는 반복문
          int num = 0;
          
          // input 클래스
          Scanner scan = new Scanner(System.in);
          
          do {
              // 반복할 문장 작성 (1번은 실행)
              num = scan.nextInt(); // 정수값을 입력받아 넣어주는 것: nextInt()
              System.out.println("입력받은 값:" + num);
              
          } while( num != 10 );
          
          System.out.println("반복 종료");
          

          
      }
      
  }
