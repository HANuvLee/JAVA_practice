package java_else;
/*
 * 보통 쓰레드 객체를 만들 때 Thread를 상속하여 만들기도 한다.
 * 하지만 보통은 Runnable 인터페이스를 구현하도록 하는 방법을 주로 사용한다. 
 * 왜냐하면 Thread 클래스를 상속하면 다른 클래스를 상속할 수 없기 때문이다.
 */

import java.util.ArrayList;

public class Sample_thread_Runnable implements Runnable { //Thread를 extends 하던 것에서 Runnable을 implements 하도록 변경,  Runnable 인터페이스는 run 메소드를 구현하도록 강제
	int seq;
	
	public Sample_thread_Runnable(int seq) {
		this.seq = seq;
	}
	
	public void run() {
		System.out.println(this.seq + "thread start.");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(this.seq + "thread end.");
	}

	public static void main(String[] args) {
		ArrayList<Thread> threads = new ArrayList<>();
		for(int i=0; i<10; i++) {
			/*
			 * Thread의 생성자로 Runnable 인터페이스를 구현한 객체를 넘길 수 있음으로 new Thread(new Sample_thread_Runnable(i)) 방식을 사용
			 * 변경된 코드는 이 전에 만들었던 예제와 완전히 동일하게 동작. 다만 인터페이스 사용으로 상속 및 기타 등등에서 좀 더 유연한 프로그램으로 발전
			 */
			Thread t = new Thread(new Sample_thread_Runnable(i));
			t.start();
			threads.add(t);
		}
		
		for(int i=0; i<threads.size(); i++) {
			Thread t = threads.get(i);
			try {
				t.join();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("main end.");
	}

}
