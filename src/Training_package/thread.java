package Training_package;
public class thread extends Thread {
    int a;

    public thread(int a) {
        this.a = a;
    }

    public void run() { //run 메서드로 스레드 상속
        System.out.println("Thread run" + this.a);
    }

    public static void main(String[] args) {
        System.out.println("Thread class 생성 방법 2 가지");
        System.out.println("1. Thread class를 상속 받아 run() 메서드 재정의: Thread 실행 메서드는 start(), 한번 start를 하면 끝");
        System.out.print("2. Runnable interface 구현한 뒤 Thread 객체 생성 \n " +
                "Thread a = new Thread(Runnable interface)");
        System.out.println("Thread만 만드는 것과 Runnable을 만들어서 Thread를 만드는 것은 다름: Thread만 만들면 아무 짓도 안 하기 때문");

        for (int i = 0; i < 10; i++) {  // 총 10개의 쓰레드를 생성하여 실행한다.
            thread thread = new thread(i);
            thread.start(); //스레드 실행
        }
       System.out.println("main end.");
        // 스레드가 종료되기 전 메인 메서드가 종료되며, 결과는 출력할 때마다 다르게 변한다 (스레드는 순서와 상관없이 동시에 실행되기 때문)
    }
}
