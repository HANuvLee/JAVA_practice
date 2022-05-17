package java_else;

import java.util.ArrayList;

/*
 * sample_thread�� �� �����尡 ��� ����ǰ� ����Ǳ� ���� main �޼ҵ尡 ���� ����.
 * ��� �����尡 ����� �Ŀ� main �޼ҵ带 �����Ű�� ���� ��쿡�� join�޼ҵ带 ����Ͽ�
 * �����尡 ����� ������ ��ٸ����� �� �ִ�.
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
		ArrayList<Thread> threads = new ArrayList<>(); //������ �����带 ��� ���� ArrayList��ü�� threads�� ����
		for(int i=0; i<10; i++) {
			Thread t = new Sample_thread_join(i);
			t.start();
			threads.add(t); //������ �����带 threads�� ����
		}
		
		for(int i=0; i<threads.size(); i++) {
			Thread t = threads.get(i);
			try {
				t.join(); //t �����尡 ������ ������ ��ٸ���. main�޼ҵ� ���� �� threads�� ��� �� thread�� join�޼ҵ� ȣ��� ������ ����ñ��� ���.
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("main end.");
	}
	/*
	 * main end."��� ���ڿ��� ���� �������� ��µǴ� ���� Ȯ��.
	 * ������ ���α׷��ֽ� ���� ���� �Ǽ��ϴ� �κ��� �����尡 ������� �ʾҴµ� �����尡 ����� �� �˰� �� ���� ������ �����ϰ� ����� ��.
	 * �����尡 ����� �� �� ���� ������ �����ؾ� �� �� �� �ʿ��� join �޼ҵ带 �� ���.
	 */
}
