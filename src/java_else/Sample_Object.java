package java_else;

/*
 * ObjectŬ������ ��� Ŭ������ �ֻ��� Ŭ����
 * �ƹ��͵� ��ӹ��� ������ �ڵ����� Object ���
 * Object�� �����ִ� �޼ҵ�� ��� Ŭ�������� �� ��밡��
 * 
 *  �Ʒ��� 3�� ��� �������̵� �� ���
	 * equals : ��ü�� ���� ���� ������ ���� �� ��� ������ �������̵����� ����� �Ѵ�.
	 * toString : ��ü�� ���� ���� ���ڿ��� ��ȯ�Ѵ�.
	 * hashCode	: ��ü�� �ؽ��ڵ� ���� ��ȯ �Ѵ�.
 */

class Student{
	String name;
	String number;
	String birth;
	
	public Student(String name, String number, String birth) {
		super();
		this.name = name;
		this.number = number;
		this.birth = birth;
	}
	
	@Override //hashCode �� �������̵��ϸ� ���� �ؽ��ڵ� ��������.
	public int hashCode() { //�� ��ü�� ������ ��ü���� �� (���ϼ�)
		final int prime = 31;
		int result = 1;
		result = prime*result+ ((number == null) ? 0 : number.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) { //�� ��ü�� ������ ������ �� (���)
		if (this == obj) //��ü�� �����ϸ� �ߺ����� �Ұ�.
			return true;
		if (obj == null) //��ü�� ���̸� false
			return false;
		if (getClass() != obj.getClass()) //��ü�� Ŭ���� ���� �ٸ��� false , ��ü�� �ҼӰ˻�
			return false;
		//�ش� ��ü�� �ٿ� ĳ���� �� ��������� �˻��Ѵ�.
		Student other = (Student) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		}else if (!number.equals(other.number))
			return false;
		return true;
	}
}

public class Sample_Object {

	public static void main(String[] args) {
		Student s1 = new Student("öȣ", "777", "980330");
		Student s2 = new Student("����", "777", "980917");
		
		if(s1.equals(s2)) {
			System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}
		System.out.println("s1 hashcode : " + s1.hashCode());
		System.out.println("s2 hashcode : " + s2.hashCode());
	}

}
