package Training_package;

public class chapter4 {
    public static void main(String[] args) {
        int i = 1;
        while (i < 10) {
            System.out.println(2 * i);
            i += 1;
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
    }
}
