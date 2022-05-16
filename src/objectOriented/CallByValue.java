package objectOriented;

/*
 * ====================�⺻Ÿ�Կ����� �۵����====================
 * �⺻���� Stack������ ����
 * �ڹٿ��� Call by value ���� �� ���ڰ��� ���� �޼ҵ忡�� ���� ������ �� �� ���������� ����
 * Method2�� Method1�� ������ ����� ���� �ƴ϶�, �ڽ��� ���Ӱ� ������ ���� ������ Method1�� ���� �̸��� ���� ���� �����Ͽ� ���.
 * ���� Method2���� �ƹ��� ���� �ٲپ Method1���Դ� �ƹ��� ������ ��ġ�� �ʴ´�.
 * �� Method1 & Method2 a, b�� �̸��� ���� �� �ٸ��ּҸ� ������ �ִ�!
 */
public class CallByValue {
	
	public void method_1() {
		int a = 10;
		int b = 5;
		System.out.println("Before Call Method2 : ( a = " + a + ", b = " + b + " )");
		method_2(a, b);
		System.out.println("After Call Method2 : ( a = " + a + ", b = " + b + " )");
	}
	
	public void method_2(int a, int b) {
		a = 20;
		b = 10;
		System.out.println("Inside Method2 : ( a = " + a + ", b = " + b + " )");
	}
	
	//�⺻Ÿ���� �ƴ� ����Ÿ���� ���ڷ� �޴� �޼��� ����
	public void method_3() {
		String a = "Ann";
		String b = "Nick";
		System.out.println("Before Call Method2 : ( a = " + a + ", b = " + b + " )");
		method_4(a, b);
		System.out.println("After Call Method2 : ( a = " + a + ", b = " + b + " )");
	}
	
	public void method_4(String a, String b) {
		a = "Nick";
		b = "Ann";
		System.out.println("Inside Method2 : ( a = " + a + ", b = " + b + " )");
	}

	public static void main(String[] args) {
		CallByValue method1 = new CallByValue();
		CallByValue method3 = new CallByValue();
		method1.method_1(); // method_1�� ���� �ٲ��� �ʴ´�.!! �ڹٰ� CALL BY VALUE�̱� ������!!
		System.out.println("==================�⺻Ÿ���� �ƴ� ����Ÿ���� ���ڰ��� �޴� �޼��� ����==================");
		method3.method_3(); // method_3�� �� ���� �ٲ��� �ʴ´�!!
	}

}
