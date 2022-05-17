package java_else;
/*
 * ���� ������ ��ü�� ���� �� Thread�� ����Ͽ� ����⵵ �Ѵ�.
 * ������ ������ Runnable �������̽��� �����ϵ��� �ϴ� ����� �ַ� ����Ѵ�. 
 * �ֳ��ϸ� Thread Ŭ������ ����ϸ� �ٸ� Ŭ������ ����� �� ���� �����̴�.
 */

import java.util.ArrayList;

public class Sample_thread_Runnable implements Runnable { //Thread�� extends �ϴ� �Ϳ��� Runnable�� implements �ϵ��� ����,  Runnable �������̽��� run �޼ҵ带 �����ϵ��� ����
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
			 * Thread�� �����ڷ� Runnable �������̽��� ������ ��ü�� �ѱ� �� �������� new Thread(new Sample_thread_Runnable(i)) ����� ���
			 * ����� �ڵ�� �� ���� ������� ������ ������ �����ϰ� ����. �ٸ� �������̽� ������� ��� �� ��Ÿ ���� �� �� ������ ���α׷����� ����
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
