package Training_package;

public class chapter2 {
    public static void main(String[] args) {
        System.out.println("Thread class 생성 방법 2 가지");
        System.out.println("1. Thread class를 상속 받아 run() 메서드 재정의: Thread 실행 메서드는 start()");
        System.out.print("2. Runnable interface 구현한 뒤 Thread 객체 생성 \n " +
                "Thread a = new Thread(Runnable interface)");
        System.out.println("Thread만 만드는 것과 Runnable을 만들어서 Thread를 만드는 것은 다름: Thread만 만들면 아무 짓도 안 하기 때문");
    }
}
