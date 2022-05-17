package java_else;
/*
 *  �����ϰ� �ִ� ���α׷��� ���μ���(Process)��� �Ѵ�.
 *  ���� �� ���� ���μ����� �� ������ ���� ������, �����带 �̿��ϸ� 
 *  �� ���μ��� ������ �� ���� �Ǵ� �� �̻��� ���� ���ÿ� �� �� �ִ�.
 */

/*[1]
 * Sample Ŭ������ Thread Ŭ������ ���. 
 * Thread Ŭ������ run �޼ҵ带 �����ϸ� sample.start() ���� �� sample ��ü�� run �޼ҵ尡 ����.
 */
public class Sample_Thread extends Thread {
	int seq;
	
	public Sample_Thread(int seq) {
		this.seq = seq;
	}
	public void run() {	// Thread�� ����ϸ� run �޼Ҹ� �����ؾ��Ѵ�.
		System.out.println(this.seq + "thread start."); //������ ����.
		try {
			Thread.sleep(1000); //1�� ���
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(this.seq + "thread end."); //������ ����
	}
	
	public static void main(String[] args) {
		/* [2]
		 * Thread Ŭ������ extends �߱⶧���� start �޼ҵ� ����� run �޼ҵ尡 ����ȴ�. 
		 * Thread Ŭ������ start ���� �� run �޼ҵ尡 ����ǵ��� ���������� �����Ѵ�.
		 * Sample_Thread sample = new Sample_Thread();
		 * sample.start(); //start()�� �����带 �����Ѵ�. 
		 */
		
		/* [3]
		 * ���� �ڵ�� �����尡 �ϳ��ΰ���̱⿡ �������� ������ ��Ȯ�� Ȯ�� �Ұ��Ͽ�, 10���� �����带 �����Ų��.
		 * �� �����带 �����ϱ� ���� �����帶�� �����ڿ� ������ �ο�, ������ �޼ҵ� ���� �� ���� ���, ���۰� ���� ���̿� 1���� ������ �����.
		 * main�޼ҵ� ����� main�޼ҵ� ���� ���� ���.
		 */
		for (int i=0; i < 10; i++) {
			Thread t = new Sample_Thread(i);
			t.start();
		}
		System.out.println("main end"); //main �޼ҵ� ����
	}
	
	/*[4]
	 * 0�� ��������� 9�� ��������� ������� ������ ���� �ʰ� �� ������ ����ġ ���� ���� ���� ������� ������ ������� ���ÿ� ����ȴ�. 
	 * �����尡 ����Ǳ� ���� main �޼ҵ尡 ����ȴ�. 
	 */

}
