package java_else;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import java_else.ReflectionTest.Tool;

/*
 * �Ϲ������� ��ü ������ �ڴ��� Ŭ������ �޼��带 ���� �ۼ��ϸ� ������ �Ǿ� �޸𸮿� �ö󰡴� ���� ������ �Ѵ�.
 * ������ ��������� �ڹٴ� ���� �� ����� ��� ���� �����Ǿ�� �ϱ� �����̴�.
 * ������ ���÷����� �̿��ϸ� ��Ÿ��, �� ���α׷��� ����ǰ� �ִ� ���ȿ��� Ŭ���� ������ �˾Ƴ��� ���� �����ϸ�
 * �̴� �ٷ� �������� �װ��� ����(���� �� ����)�� �� �ְ� �ȴ�.
 */
public class Sample_Reflection2 {
	/*
	 * reflection1������ �������� ������ ������ ���������� �̹����� �ʿ��� ������ �ϳ��� �����Ͽ� ��ü�� �����ϸ� 
	 * �����ڿ� �޼��带 �������� Ȱ���غ���.
	 */

	public static void main(String[] args) {
		Class refClass = null;
		String[] nameArr = { "ȫ�浿", "�Ӳ���", "��ġ", "���̾�" }; // 1.���� ����� �޼��� �� setName�޼ҵ��� ������ ���� �μ��� ���� nameArr�迭 ����
		try {
			refClass = Class.forName("java_else.ReflectionTest");
			Method[] refMethod = refClass.getDeclaredMethods();

			/* �޼��带 �������� �̿��ϴ� ��� */
			/* 1. setName�޼��带 ã�´�. */
			for (int i = 0; i < refMethod.length; i++) {
				if (refMethod[i].getName().equals("setName")) {
					System.out.println("-----------setName �߰� -----------");
					System.out.println(refMethod[i].getName()); // ���� �޸� getName �޼��带 ����Ͽ� �޼���� �̸��� ���� , toString() -> getName()
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		/*
		 * 2. setName()�޼��尡 Private���� public���� Ȯ��, ���� private�̸� setAccessible(true)�� ����
		 * �߰� ���÷��ǿ��� �޼��带 �������� �����ϱ� ���ؼ��� invoke(obj, args) �޼��带 ����ϸ� �Ű����� 2���� �ʿ��ϴ�. 
		 * obj�� �޼���(setName())�� �����ϱ� ���� ��ü�̰�, args�� �޼���(setName())�� �����ϱ� ���� �ʿ��� �Ű������̴�.
		 */
		try {
			ReflectionTest reflectionTest = new ReflectionTest(); // invoke()�� �����ϴµ� �ʿ��� ��ü ����
			refClass = Class.forName("java_else.ReflectionTest");
			Method[] refMethod = refClass.getDeclaredMethods();
			try {
				for (int i = 0; i < refMethod.length; i++) {
					if (refMethod[i].getName().equals("setName")) {
						for (int j = 0; j < nameArr.length; j++) {
							System.out.println("-----------setName ���� -----------");
							refMethod[i].invoke(reflectionTest, nameArr[j]); // ��ü�� �ŰԺ����� �ְ� ����

							System.out.println("-----------getName ���� -----------");
							System.out.println(reflectionTest.getName());
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		/* �����ڸ� �̿��� ��ü ���� */
		 /* ������ �ϳ��� �����Ͽ� ��ü ���� */
		 /*  getConstructor(parameterTypes) : public���� ����� �����ڿ� ���� (���� �Ű� ���� �ʿ�).
		  *  getConstructor(new Class[]{parameterTypes, parameterTypes,...}) : public���� ����� �����ڿ� ���� (���� �Ű� ���� �ʿ�) 
		  *  getDeclaredConstructor(parameterTypes) : ��� �����ڿ� ����  (���� �Ű� ���� �ʿ�). ��, setAccessible(true) �ʿ�.
		  */
		try {
			Constructor refDecConst = refClass.getDeclaredConstructor(Tool.class); // �Ű����� Ÿ���� Tool�� enum Ÿ���̹Ƿ� �޼ҵ�() �ȿ� Tool.class�� �־ ����
			refDecConst.setAccessible(true); // getDeclaredConstructor()�� private�� ������ �� ������ �׷� ��쿡�� setAccessible(true)��� �޼��带 �߰��� �ۼ�.
			refDecConst.newInstance(Tool.ECLIPSE);// newInstance(initargs)��� �޼��带 �̿��Ͽ� ��ü�� ����
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
