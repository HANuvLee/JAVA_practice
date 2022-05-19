package java_else;
/*
 * Java 8 �������� �Լ��� ���α׷����� �����ϱ� ���� ����(Lambda)�� ��Ʈ��(Stream)�� ����. 
 * ���ٿ� ��Ʈ���� ����ϸ� �����ϴ� �Լ��� ���α׷��� ��Ÿ�Ϸ� �ڹ� �ڵ带 �ۼ�����.
 * ���� ���ٿ� ��Ʈ���� ����Ͽ� �ۼ��� �ڵ带 �Ϲ� ��Ÿ���� �ڹ��ڵ�� �ٲپ� �ۼ��ϴ� ���� �Ұ��������� �ʴ�. 
 * �޸� ���ϸ� ���ٿ� ��Ʈ�� ���̵� �ڹ� �ڵ带 �ۼ��ϴµ� ������� ���ٴ� ���̴�. 
 * ������ �׷����� �ұ��ϰ� ���ٿ� ��Ʈ���� ����ϴ� ������ �ۼ��ϴ� �ڵ��� ���� �پ��� �б� ���� �ڵ带 ����µ� �����ϱ� �����̴�.
 */

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

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
		System.out.println("result => " + result);
		
		//��ȣ ������ int a, int b�� Calculator �������̽��� sum �Լ��� �Է��׸� �ش��ϰ� -> ���� a+b �� ���ϰ��� �ش��Ѵ�. 
		//�̷��� �����Լ��� ����ϸ� MyCalculator�� ���� ���� Ŭ���� ���̵� Calculator ��ü�� ������ �� �ִ�.
		Calculator mc2 = (int a, int b) -> a + b;
		int result2 = mc2.sum(3, 4);
		System.out.println("result2 => " + result2);
		
		/* (int a, int b)�� �������̽��� �̹� ����¿� ���� Ÿ���� ���ǵǾ� �����Ƿ� �Է°��� Ÿ���� int�� ������ ����
		 * �׸��� �� ���� ���Ͽ� �� ����� �����ϴ� �Լ� (a, b) -> a+b �� Integer.sum(int a, int b)�� �����ϱ� ������ ������ ���� �� ����� ����
		 * � Ŭ������ �޼��带 ����� ���� ���� ���� :: ��ȣ�� ����Ͽ� Ŭ������ �޼��带 �����Ͽ� ǥ�� */
		Calculator mc3 = Integer::sum;
		int result3 = mc3.sum(3, 4);
		System.out.println("result3 => " + result3);
		
		/*
		 * �����Լ� �������̽�
		 * �������̽� ���� ��� �Լ��� ���α׷����� ���� �����Ǵ� �������̽����� ����Ͽ� �ڵ鸦 �� �� ���
		 * �ڹٰ� �����ϴ� BiFunction �������̽��� ����ϸ� Calculator�������̽��� ����Ͽ� �ۼ� ���� */
		//BiFunction�� <Integer, Integer, Integer> ���׸����� ������� �Է��׸� 2��, ����׸� 1���� �ǹ��Ѵ�. 
		//�׸��� BiFunction �������̽��� apply �޼��带 ȣ���ϸ� �����Լ� (a, b) -> a + b�� ����ȴ�.
		BiFunction<Integer, Integer, Integer>mc4 = (a, b) -> a + b;
		int result4 = mc4.apply(3, 4); //sum�� �ƴ� apply �޼��带 ����
		System.out.println("result4 => " + result4);
		
		//�ۼ��� �ڵ带 �ڼ��� ���� ����� �׸��� Ÿ���� ��� Integer�� �����ϴٴ� ���� �� �� �ִ�. 
		//�̷��� ����� �׸��� ��� ������ ��쿡�� ������ BinaryOperator�� ����Ͽ� �� �����ϰ� ǥ�� �����ϴ�.
		BinaryOperator<Integer>mc5 = (a, b) -> a + b;
		int result5 = mc5.apply(3, 4); //sum�� �ƴ� apply �޼��带 ����
		System.out.println("result5 => " + result5);

	}

}
