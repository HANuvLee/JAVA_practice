package java_else;
/*
 *  동작하고 있는 프로그램을 프로세스(Process)라고 한다.
 *  보통 한 개의 프로세스는 한 가지의 일을 하지만, 쓰레드를 이용하면 
 *  한 프로세스 내에서 두 가지 또는 그 이상의 일을 동시에 할 수 있다.
 */

/*[1]
 * Sample 클래스가 Thread 클래스를 상속. 
 * Thread 클래스의 run 메소드를 구현하면 sample.start() 실행 시 sample 객체의 run 메소드가 수행.
 */
public class Sample_Thread extends Thread {
	int seq;
	
	public Sample_Thread(int seq) {
		this.seq = seq;
	}
	public void run() {	// Thread를 상속하면 run 메소를 구현해야한다.
		System.out.println(this.seq + "thread start."); //쓰레드 시작.
		try {
			Thread.sleep(1000); //1초 대기
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(this.seq + "thread end."); //쓰레드 종료
	}
	
	public static void main(String[] args) {
		/* [2]
		 * Thread 클래스를 extends 했기때문에 start 메소드 실행시 run 메소드가 수행된다. 
		 * Thread 클래스는 start 실행 시 run 메소드가 수행되도록 내부적으로 동작한다.
		 * Sample_Thread sample = new Sample_Thread();
		 * sample.start(); //start()로 쓰레드를 실행한다. 
		 */
		
		/* [3]
		 * 위의 코드는 쓰레드가 하나인경우이기에 쓰레드의 동작을 명확히 확인 불가하여, 10개의 쓰레드를 실행시킨다.
		 * 각 쓰레드를 구분하기 위해 쓰레드마다 생성자에 순번을 부여, 쓰레드 메소드 시작 및 종료 출력, 시작과 종료 사이에 1초의 간격이 생긴다.
		 * main메소드 종료시 main메소드 종료 문자 출력.
		 */
		for (int i=0; i < 10; i++) {
			Thread t = new Sample_Thread(i);
			t.start();
		}
		System.out.println("main end"); //main 메소드 종료
	}
	
	/*[4]
	 * 0번 쓰레드부터 9번 쓰레드까지 순서대로 실행이 되지 않고 그 순서가 일정치 않은 것을 보면 쓰레드는 순서에 상관없이 동시에 실행된다. 
	 * 쓰레드가 종료되기 전에 main 메소드가 종료된다. 
	 */

}
