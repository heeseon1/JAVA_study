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
              System.out.printf("%d \n", a); // while(true)문은 반드시 무한 루프가 되므로 break 문을 호출하여 종료할 조건을 만들어야 함

              if( a == 4){
                  System.out.println("while 문 내부에서 break로 루프를 중단하고 나감");
                  break;
              }
          }
          
    int value = 6;
          
          // switch 문 : 각 case에서 만족하면 그 이후는 전부 실행되므로 break를 추가하여 빠져나옴
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
                  System.out.println("해당 숫자에 일치하는 값이 없습니다.");
          }
          // 1.7 버전부터는 문자열도 switch 문에서 사용할 수 있음
          
          
          // while문 : 조건 안에서 실행 문을 반복하여 실행
          while ( value < 10 ) {
              System.out.println(value);
              value += 1; // value++;
          }
          
          // while문을 이용한 100까지의 합 계산
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
          
          // do while문 : 조건이 맞지 않아도 1회는 반드시 실행되는 반복문
          int num = 0;
          
          // input 클래스
          Scanner scan = new Scanner(System.in);
          
          do {
              // 반복문 내용 작성 (1회 실행)
              num = scan.nextInt(); // 사용자로부터 값을 입력받을 때: nextInt()
              System.out.println("입력받은 값:" + num);
              
          } while( num != 10 );
          
          System.out.println("반복 종료");
          
      }
      
  }
