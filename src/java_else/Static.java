package java_else;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * �������� = Ŭ�������� = Static����
 * �׻� ���� ������ �ʴ� ����� static ���� �޸��� ������ ���� �� �ִ�.
 * static�� ����ϴ� �� �Ѱ��� ������ ���� ������ �ִ�. 
 * static���� �����ϸ� ���� ���� �޸� �ּҸ��� �ٶ󺸱� ������ static ������ ���� �����ϰ� �ȴ�.
 */
class Counter{
//	int count = 0; //��ü ������ ��ü������ count���� �������ѵ� c1�� c2��ü�� ���� �ٸ� �޸𸮸� ����Ű�� �־� ī��Ʈ�� �������� �ʴ´�(��ü������ �׻� �������� ���� ���´�).
	static int count = 0; //������ static Ű���带 ���̸� �ڹٴ� �޸� �Ҵ��� �� �ѹ��� �ϰ� �Ǿ� �޸� ��뿡 ����. staticŰ����� ���� count���� �����Ǿ� ī��Ʈ�� ����!!!
	
	Counter() {
		count++; //count�� ���̻� ��ü������ �ƴ����� this.�� ����
		System.out.println(count);//this.����
	}
	
	// ����ƽ �޼ҵ� �ȿ����� ��ü���� ������ �Ұ��� �ϴ�. �� �������� count ������ static �����̱� ������ ����ƽ �޼ҵ�(static method)���� ������ �����Ѱ�.
	public static int getCount() { //getCount() ��� static �޼ҵ尡 �߰�
		return count;
	}
}

//���� static �޼ҵ�� ��ƿ��Ƽ�� �޼ҵ带 �ۼ��� �� ���� ���
class Util{
	public static String getCurrentDate(String fmt) {
		SimpleDateFormat sdf = new SimpleDateFormat(fmt);
		return sdf.format(new Date());
	}
}

public class Static {

	public static void main(String[] args) {
		Counter c1 = new Counter(); //��ü���� �޸� ���� ����
		Counter c2 = new Counter(); //��ü���� �޸� ���� ����
		System.out.println(Counter.getCount()); //�޼ҵ� �տ� static Ű���带 ���̸� Counter.getCount() �� ���� ��ü �������� Ŭ������ ���� �޼��带 ���� ȣ�Ⱑ��
		System.out.println(Util.getCurrentDate("yyyyMMdd")); //��ƿ�޼ҵ� ���� ��¥ ���
	}

}
