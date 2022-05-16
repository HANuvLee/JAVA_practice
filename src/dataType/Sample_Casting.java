package dataType;
/*
 * casting(����ȯ)�� final
 * 
 */
public class Sample_Casting {

	public static void main(String[] args) {
		/* �ڷ����� ���ڿ������� �� ������ ���ڷ� �̷���� ���̴�. 
		 * �̷� ��쿡 ���ڿ��� ����(integer)�� �ٲܼ� �ִ�. 
		 * ���ڿ��� ������ �ٲٷ��� ������ ���� Integer Ŭ������ ����Ѵ�. Integer�� int�ڷ����� WrapperŬ�����̴�.
		 */
		String age = "23";
		int Age = Integer.parseInt(age);
		System.out.println(Age);
		
		/*
		 * ������ ���ڿ��� �ٲٴ� ���� ���� ����� ���� �տ� ���ڿ�("")�� ���� �ִ� ��.
		 */
		int weight = 84;
		String Weight = "" + weight;
		System.out.println(Weight);
		//�ٸ� ����� ������ ���ڿ��� ĳ����
		int height = 174;
		String height1 = String.valueOf(height);
		String height2 = Integer.toString(height);
		
		/*
		 * �Ҽ��� ���� ���������� ���ڿ��� �Ǽ������� ĳ����
		 * �Ҽ����� ���ԵǾ� �ִ� ���������� ���ڿ��� Double.parseDouble �Ǵ� Float.parseFloat�� ����Ͽ� ����ȯ
		 */
		 String num = "123.456";
	     double d = Double.parseDouble(num);
	     System.out.println(d);
	     
	     /*
	      * ������ �Ǽ� ������ ����ȯ
	      */
	     int n1 = 123;
	     double d1 = n1;// ������ �Ǽ��� �ٲܶ����� ĳ������ �ʿ����.
	     System.out.println(d1);  // 123.0 ���

	     double d2 = 123.456;
	     int n2 = (int) d2; // �Ǽ��� ������ �ٲܶ����� �ݵ�� ���������� ĳ������ �־�� �Ѵ�.
	     System.out.println(n2);  // �Ҽ����� ������ 123 ���, �Ǽ��� ������ ��ȯ�ϸ� �Ǽ��� �Ҽ����� ����
	}

}
