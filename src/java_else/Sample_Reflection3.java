package java_else;

import java.lang.reflect.Field;

/*
 * 3��°������ ������ ������ ���� ��, �װ��� ���� �������� �ٷ�� ����� ���� �����غ���.
 * ���÷����� �̿��ϸ� �ڵ带 �� �� �����ϰ� ���� �� �ֽ��ϴ�.
 * ������ setAccessible(true)�� ���� �޼����� ������� ���� ĸ��ȭ�� ���߸��� ���� ���� �� �ִ�.
 * ��, ���÷����̶�� ����� ����ϴ� JVM�� Perm �޸𸮴� �뷮�� �Ѱ谡 �����Ƿ�
 * �ڵ� ���� �� ���� ���� Ư¡���� ����Ͽ� �����Ѵ�.
 */
public class Sample_Reflection3 {

	public static void main(String[] args) {
		try {
			 ReflectionTest reflectionTest = new ReflectionTest(); // get(), set()�� ���� ��ü ����
			 Class refClass = Class.forName("java_else.ReflectionTest");
			 Field[] refField = refClass.getDeclaredFields(); //�������� ���� ��� 2���� getFields()�� getDeclaredFields() �� getDeclaredFields() ���
			 
			 try {
				for(int i=0; i<refField.length; i++) {
					if(refField[i].getName().equals("name")) {
						System.out.println("name �߰� !!");
						Field field = refClass.getDeclaredField(refField[i].getName()); //field�� �Ҵ�
						field.setAccessible(true); //�����Ϸ��� name ������ private�̹Ƿ� setAccessible(true)����
						
						field.set(reflectionTest, "Thisisnew"); // �� ����
			            Object fieldValue = field.get(reflectionTest);// �� �޾ƿ���, get() �޼���� ��ȯ���� Object�� �ǵ��� �Ͽ� �ٽ� �޾ƿ��Բ� �ۼ�
			            System.out.println(fieldValue);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
