package Training_package;
// 패키지1.패키지2 형식으로 되어 있으면 패키지1>패키지2> 경로에 위치하는 걸 의미

/* 여러
줄 주석
 */

public class input {
    public static void main(String[] args) {
        //출력 메서드 단축어: sout
        System.out.println(2 + 5);
        System.out.println("5" + 1);
        System.out.println(4.5);

        int a = 30;
        String b = "5";
        System.out.println("숫자:" + a);
        System.out.println("문자:" + b);
        System.out.println(a + b);

        System.out.println("줄바꿈 출력");
        System.out.print("그냥");
        System.out.println("출력");

        System.out.printf("자료형 (10진수) 출력: %d \n", a);
        System.out.printf("자료형 (8진수) 출력: %o \n", a);
        System.out.printf("자료형 (16진수) 출력: %x \n", a);


        System.out.printf("자료형 (문자열) 출력: %s \n", a);
        System.out.printf("자료형 (소수) 출력: %f \n", 5.8);
        System.out.printf("자료형 (반올림) 출력: %4.2f \n", 5.8); //전체자리수.소수자리수
        System.out.printf("자료형 출력: %d와 %4.2f \n", a, 5.8);
    }

}
