package dataType;
/*
 * Enum�� ���� ������ �ִ� ���� ���� ��� ������ ������ �� ����Ѵ�.
 * Enum�� ����ϴ� ����
 * �����ѹ�(1�� ���� ���� �����)�� ����� ������ �ڵ尡 ��Ȯ�� ����.
 * �߸��� ���� ��������� ���� �߻��Ҽ� �ִ� ���輺�� �������
 */
public class Sample_Enum {
	enum Avengers{
		IronMan,
		Thor,
		Hulk
	}

	public static void main(String[] args) {
		System.out.println(Avengers.IronMan);
		System.out.println(Avengers.Hulk);
		System.out.println(Avengers.Thor);
		
		for(Avengers member : Avengers.values()) {
			System.out.println("Avengers Member => " + member);
		}
	}

}
