package java_else;

/*
 * �̱����� �� �ϳ��� ��ü���� �����ϰ� �����ϴ� �����̴�. 
 * ��, Ŭ������ ���� ������ �� �ִ� ��ü�� Only One, ��, �� ���� �ǵ��� ����� ���� �̱����̴�.
 */

// Singleton Ŭ������ �����ڿ� private Ű����� �ٸ� Ŭ�������� Singleton Ŭ������ �����ڷ��� ������ ���Ҵ�. 
// �̷��� �����ڸ� private ���� ����� ������ �ٸ� Ŭ�������� Singleton Ŭ������ new �� �̿��Ͽ� ������ �� ���� �ȴ�.
class Singleton{
	/*
	 * Singleton Ŭ������ one �̶�� static������ �ΰ� getInstance�޼ҵ忡�� one���� null�� ��쿡�� ��ü�� �����ϵ��� �Ͽ� one ��ü�� �� �ѹ��� ����������� �ߴ�.
	 * ���� getInstance�� ȣ��Ǹ� one�� null�̹Ƿ� new�� ���ؼ� ��ü�� ������ �ȴ�.
	 * �̷��� �ѹ� ������ �Ǹ� one�� static �����̱� ������ �� ���ķδ� null�� �ƴϰ� �ȴ�. 
	 * �׷� �Ŀ� �ٽ� getInstance �޼ҵ尡 ȣ��Ǹ� ���� one�� null�� �ƴϹǷ� �̹� ������� �̱��� ��ü�� one�� �׻� �����Ѵ�.
	 */
	private static Singleton one; 
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() { 
		if(one == null) {
			one = new Singleton();
		}	
		return one; 
	}
}

public class SingletonPattern {

	public static void main(String[] args) {
//	Singleton singleton = new Singleton();  ��ü ���� �� ������ ���� �߻�!!
	
//	getInstance��� static�޼ҵ带 �̿��Ͽ� Singleton Ŭ������ ��ü�� ���� ����.
//	������ getInstance�� ȣ�� �� ������ ���ο� ��ü�� �����Ǳ� ������ �̱����� �ƴϴ�. 
//	Singleton singleton = Singleton.getInstance(); 
	
	Singleton singleton1 = Singleton.getInstance();
	Singleton singleton2 = Singleton.getInstance();
	
	System.out.println(singleton1 == singleton2); //true���
		
	}

}
