package java_else;
/*
 * �ڹ� ��� Ǯ
 * String Constant Pool ������ �� ���� ���ο��� String��ü�� ���� ������ �����ϴ� ������̴�.
 */

public class Sample_String_Constant_Pool {
	
	
	/*
	 * new �����ڰ� �ƴ� ���ͷ�("")�� String ��ü�� �����ϰ� �Ǹ� JVM�� �켱 String Constant Pool ������ �湮�Ѵ�.
	 * �ű⼭ ���� ���� ���� String��ü�� ã���� �� ��ü�� �ּ� ���� ��ȯ�Ͽ� �����ϰ� �ȴ�.
	 * ã�� ���Ѵٸ� String Constant Pool�� �ش� ���� ���� String��ü�� �����ϰ� �� �ּҰ��� ��ȯ�ϰ� �ȴ�.
	 * �� ������ �����ϴ� �޼ҵ嵵 �����ϸ� String�� intern()�޼ҵ��̴�.
	 */
	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");
		String s3 = "Java";
		String s4 = "Java";
		String s5 = new String("Java").intern();
		
		/*
		 * new �����ڷ� String��ü �����ÿ� JVM���� �� ������ String��ü�� ����
		 * ���� s1�� �� �޸𸮿� ����, s2�� �� �� �޸𸮿� �����Ͽ� �� ���� �ٸ� ��ü�� �ȴ�.
		 */
		if(s1 == s2) {
			System.out.println("s1�� s2�� ����.");
		}else {
			System.out.println("s1�� s2�� ���� �ʴ�.");
		}
		
		/*
		 * == �� �ּ� ���� ���Ѵ�.
		 * equals�� �ּҾȿ� ����ִ� ���� ���Ѵ�.
		 */
		if(s1 == s3) {
			System.out.println("s1�� s3�� ����.");
		}else {
			System.out.println("s1�� s3�� ���� �ʴ�."); 
		}
		
		if(s1.equals(s3)) {
			System.out.println("equals�޼ҵ�: s1�� s3�� ����.");
		}else {
			System.out.println("equals�޼ҵ�: s1�� s3�� ���� �ʴ�.");
		}
		
		
		if(s3 == s4) {
			System.out.println("���ͷ� String ��ü: s3�� s4�� ����.");
		}else {
			System.out.println("���ͷ� String ��ü: s3�� s4�� ���� �ʴ�.");
		}
		
		/*
		 * intern�޼Ҵٰ� ����� s5
		 */
		if(s3 == s5) {
			System.out.println("intern�޼ҵ�: s3�� s5�� ����.");
		}else {
			System.out.println("intern�޼ҵ�: s3�� s5�� ���� �ʴ�."); 
		}
		
	}

}
