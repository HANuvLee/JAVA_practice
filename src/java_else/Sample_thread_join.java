package java_else;

import java.util.ArrayList;

/*
 * sample_thread결 과 쓰레드가 모두 수행되고 종료되기 전에 main 메소드가 먼저 종료.
 * 모든 쓰레드가 종료된 후에 main 메소드를 종료시키고 싶은 경우에는 join메소드를 사용하여
 * 쓰레드가 종료될 때까지 기다리게할 수 있다.
 */
public class Sample_thread_join extends Thread {
	int seq;
		
	public Sample_thread_join(int seq) {
		this.seq = seq;
	}
	
	public void run() {
		System.out.println(this.seq + "thread start.");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(this.seq+"thread end.");
	}
	
	public static void main(String[] args) {
		ArrayList<Thread> threads = new ArrayList<>(); //생성된 쓰레드를 담기 위해 ArrayList객체인 threads를 생성
		for(int i=0; i<10; i++) {
			Thread t = new Sample_thread_join(i);
			t.start();
			threads.add(t); //생성된 쓰레드를 threads에 저장
		}
		
		for(int i=0; i<threads.size(); i++) {
			Thread t = threads.get(i);
			try {
				t.join(); //t 쓰레드가 종료할 때까지 기다린다. main메소드 종료 전 threads에 담긴 각 thread에 join메소드 호출로 쓰레드 종료시까지 대기.
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("main end.");
	}
	/*
	 * main end."라는 문자열이 가장 마지막에 출력되는 것을 확인.
	 * 쓰레드 프로그래밍시 가장 많이 실수하는 부분이 쓰레드가 종료되지 않았는데 쓰레드가 종료된 줄 알고 그 다음 로직을 수행하게 만드는 일.
	 * 쓰레드가 종료된 후 그 다음 로직을 수행해야 할 때 꼭 필요한 join 메소드를 꼭 기억.
	 */
}
