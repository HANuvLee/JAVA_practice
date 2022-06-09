package java_else;

public class Sample_Wrapper {
	
	/*
	 * ���� Ŭ������ �ֿ� �뵵�� �⺻ Ÿ���� ���� �ڽ� �ؼ� ���� ��ü�� ����� ��������, ���ڿ��� �⺻ Ÿ�� ������ ��ȯ�� ������ ����Ѵ�. 
	 * ��κ��� ���� Ŭ�������� parse + �⺻ Ÿ�Ը����� �Ǿ��ִ� ���� �޼��尡 �ִ�. �� �޼���� ���ڿ��� �Ű� ������ �޾� �⺻ Ÿ�� ������ ��ȯ���ش�.
	 * ���� ��ü�� ������ ���� ���ϱ� ���� == �����ڸ� ����� �� ����. ������ ���� ���ϴ� ���� �ƴ϶� ���� ��ü�� ���� �ּҸ� ���ϱ� �����̴�.
	 * �� ����� ���۴� ��ü�̹Ƿ� ������ ���� �ּҰ� �ٸ���. ��ü������ �񱳸� �Ϸ��� ������ ���� ��� ���ؾ� �ϱ⿡ equals�� ����ؾ� �Ѵ�. 
	 * ���� Ŭ������ �⺻�ڷ������� �񱳴� == ����� equals���� ��� �����ϴ�. �� ������ �����Ϸ��� �ڵ����� ����ڽ̰� ��ڽ��� ���ֱ� �����̴�.
	 */

	public static void main(String[] args) {
		//Integer num = new Integer(17); �ڽ�
		//int n = num.intValue(); ��ڽ�
		
		//Integer num = 17; �ڵ� �ڽ�
	    //int n = num; �ڵ� ��ڽ�
	
		
		/*
		 * ���ڿ��� �⺻ Ÿ�� ������ ��ȯ	
		 */
		String str = "10";
		String str2 = "20";
		String str3 = "30";
		
		byte b = Byte.parseByte(str);
		int i = Integer.parseInt(str);
        short s = Short.parseShort(str);
        long l = Long.parseLong(str);
        float f = Float.parseFloat(str2);
        double d = Double.parseDouble(str2);
        boolean bool = Boolean.parseBoolean(str3);
        
        System.out.println("���ڿ� byte�� ��ȯ : "+b);
        System.out.println("���ڿ� int�� ��ȯ : "+i);
        System.out.println("���ڿ� short�� ��ȯ : "+s);
        System.out.println("���ڿ� long�� ��ȯ : "+l);
        System.out.println("���ڿ� float�� ��ȯ : "+f);
        System.out.println("���ڿ� double�� ��ȯ : "+d);
        System.out.println("���ڿ� boolean�� ��ȯ : "+bool);
        
        /*
         * ���� ���غ���
         */
        Integer num = new Integer(10); //���� Ŭ����1
        Integer num2 = new Integer(10); //���� Ŭ����2
        int n = 10; //�⺻Ÿ��
		 
        System.out.println("����Ŭ���� == �⺻Ÿ�� : "+(num == n)); //true
        System.out.println("����Ŭ����.equals(�⺻Ÿ��) : "+num.equals(n)); //true
        System.out.println("����Ŭ���� == ����Ŭ���� : "+(num == num2)); //false
        System.out.println("����Ŭ����.equals(����Ŭ����) : "+num.equals(num2)); //true
		
	}

}
