package java_else;

/*
 * ������ �޼ҵ��� ���� �̸��� �޼ҵ带 �����ϰ� �̸��� �Ű������� ������ �ؼ� ����ϴ°�.
 */



class Overloading{
	String name;
	String sex;
	int age;

	// ������ �⺻ �����ڸ� �پ��� ������� ��ü�� ���� �ϵ��� �Ű����� Ÿ�԰� ������ �޸��Ͽ� �ټ��� ������ ����
	public Overloading() {
		
	}

	public Overloading(String name) {//�̸��� �Ű������� �޴� ������
		this.name = name;
	}
	
	
	public Overloading(String name, String sex) { //�̸��� ������ �Ű������� �޴� ������
		this.name = name;
		this.sex = sex;
	}
	
	public Overloading(String name, String sex, int age) { //�̸��� ���� ���̸� �Ű������� �޴� ������
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
}

public class Sample_Overloading {

	public static void main(String[] args) {
		Overloading a = new Overloading();
    	Overloading b = new Overloading("ȫ�浿");
    	Overloading c = new Overloading("ȫ�浿", "��");	
    	Overloading d = new Overloading("ȫ�浿", "��", 25);
   
    	System.out.println(b.name);
    	System.out.println(c.name + " " + c.sex);
    	System.out.println(d.name + " " + d.sex + " " + d.age);

	}

}
