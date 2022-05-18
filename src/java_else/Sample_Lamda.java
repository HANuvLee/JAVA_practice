package java_else;
/*
 * Java 8 �������� �Լ��� ���α׷����� �����ϱ� ���� ����(Lambda)�� ��Ʈ��(Stream)�� ����. 
 * ���ٿ� ��Ʈ���� ����ϸ� �����ϴ� �Լ��� ���α׷��� ��Ÿ�Ϸ� �ڹ� �ڵ带 �ۼ�����.
 * ���� ���ٿ� ��Ʈ���� ����Ͽ� �ۼ��� �ڵ带 �Ϲ� ��Ÿ���� �ڹ��ڵ�� �ٲپ� �ۼ��ϴ� ���� �Ұ��������� �ʴ�. 
 * �޸� ���ϸ� ���ٿ� ��Ʈ�� ���̵� �ڹ� �ڵ带 �ۼ��ϴµ� ������� ���ٴ� ���̴�. 
 * ������ �׷����� �ұ��ϰ� ���ٿ� ��Ʈ���� ����ϴ� ������ �ۼ��ϴ� �ڵ��� ���� �پ��� �б� ���� �ڵ带 ����µ� �����ϱ� �����̴�.
 */

@FunctionalInterface
interface Calculator{
	int sum(int a, int b);
	//int mul(int a, int b);  mul �޼��带 �߰��ϸ� ������ ������ �߻��Ѵ�.
	//Calculator �������̽��� �޼��尡 1�� �̻��̸� �����Լ��� ����� �� ����. �׷��� ���� �Լ��� ����� �������̽��� ����ó�� @FunctionalInterface ������̼��� ����ϴ� ���� ����. 
	//@FunctionalInterface �� �� ��° �޼��带 ������� �ʴ´�. 
}

class MyCalculator implements Calculator{

	@Override
	public int sum(int a, int b) {
		
		return a + b;
	}
	
}

public class Sample_Lamda {

	public static void main(String[] args) {
		MyCalculator mc = new MyCalculator();
		int result = mc.sum(3, 4);
		System.out.println(result);
		
		//��ȣ ������ int a, int b�� Calculator �������̽��� sum �Լ��� �Է��׸� �ش��ϰ� -> ���� a+b �� ���ϰ��� �ش��Ѵ�. 
		//�̷��� �����Լ��� ����ϸ� MyCalculator�� ���� ���� Ŭ���� ���̵� Calculator ��ü�� ������ �� �ִ�.
		Calculator mc2 = (int a, int b) -> a + b;
		int result2 = mc2.sum(3, 4);
		System.out.println(result2);

	}

}
