package java_else;

/*
 * ĳ����: �θ�� �ڽ� ����(��Ӱ���) ���� ����Ŭ������ ���ϴ� ����Ŭ������ ����Ŭ������ ���ϴ� ����Ŭ������ ����ȯ
 * ��ĳ���� : ����Ŭ���� -> ����Ŭ���� ��ȯ
 * �ٿ�ĳ���� : ����Ŭ���� -> ����Ŭ���� ��ȯ
 * ��ĳ������ ����ϴ� ������ �������� ������ �ִ�.
 * ���� �ؾ��ϴ� �ݺ��� �޼��带 ��ĳ������ ���� �θ�Ŭ�������� �����ͼ� ����Ŭ������ ȣ���Ҷ� ����� �� �ֱ� �����̴�.
 */

class SolarSystem{
	String name = "�¾��";

	public SolarSystem(String name) {
		this.name = name;
	}
}

class Planet extends SolarSystem{
	String kind;
	
	public Planet(String name) {
		super(name);
	}
}

public class Sample_Upcasting {

	public static void main(String[] args) {
		Planet earth = new Planet("����"); //����Ŭ������ ��ü�� �켱 ���� �� name�� ���� �ʱ�ȭ
	//����Ŭ������ �����ڿ� super()�޼ҵ�� ���Ͽ� SolarySystem�� String name�� ���� ������ �� �ִ�.
		
		SolarSystem E = (SolarSystem)earth; //��ĳ���� , Planet������ ������ ��ü�� SolarSystem������ ����Ų��.
	//	SolarSystem E = earth; �θ� ���� ��� ���� ����
	//�� ��� ��ü�� Planet�������� SolarSystem���� ���������� ����Ű�Ƿ� Planet�� ����� ���� �Ұ�.
		
		System.out.println(E.name);
	//  System.out.println(E.kind); �����ÿ� ������ ���� �߻�

	}

}
