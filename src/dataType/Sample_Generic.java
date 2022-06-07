package dataType;

/*
 * ���׸��� Ŭ������ �޼ҵ忡�� ����� ������ Ÿ���� ������ �ÿ� �̸� �����ϴ� ���. 
 * �̸� ���ؼ� Ŭ������ �޼ҵ� ���ο� ���Ǵ� ��ü�� Ÿ�� �������� ���� �� �ִ�. 
 * ��ȯ���� ���� Ÿ�� ��ȯ �� Ÿ�� �˻翡 ���� ����� ���� �� �ֽ��ϴ�.
 */
class Man <T>{ //�� T�� �ƴϾ �ȴ�. �ٸ� ���ڶ� ����� ����.
	private T name; //�̸� �ʵ�
	private T bloodType; //������ �ʵ�
	
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public T getBloodType() {
		return bloodType;
	}
	public void setBloodType(T bloodType) {
		this.bloodType = bloodType;
	}
}
//��Ƽ ���׸� : ���׸� Ÿ�� ���� �� �� ���� ���� �ƴ� �� ���� �̻��� Ÿ���� �޴� �͵� ����.
class Car<A, A2>{
	private A name; // �� �̸� �ʵ�
	private A company; // ���� ȸ�� �ʵ�
	
	private A2 price; //�� ����
	
	public A getName() {
		return name;
	}
	public void setName(A name) {
		this.name = name;
	}
	public A getCompany() {
		return company;
	}
	public void setCompany(A company) {
		this.company = company;
	}
	public A2 getPrice() {
		return price;
	}
	public void setPrice(A2 price) {
		this.price = price;
	}
}

class CarInfo{
	//���׸� �޼���� �Ű����� Ÿ�԰� ���� Ÿ���� ���׸� Ÿ������ �޴� �޼����̴�.
		public static <A, A2> void info(A a, A2 a2) {
			// Ÿ�� �Ķ����  / ����Ÿ�� �Ķ���� or void / �޼ҵ�� �Ű����� Ÿ��
			Car<A, A2> car = new Car<>();
			car.setName(a);
			car.setPrice(a2);
			
			System.out.println("�ڵ����� �̸���" + car.getName() + "�Դϴ�.");
			System.out.println("������" + car.getPrice() +"�� �Դϴ�.");
		}
}

public class Sample_Generic {

	public static void main(String[] args) {
		Man<String> man1 = new Man<>(); //�� ��ü ���� �� ���ϴ� ����� ���� Ÿ���� ����ؾ��Ѵ�.
		Car<String, Integer> car = new Car<>(); //��Ƽ ���׸� ��ü ����
		
		man1.setName("Lee");
		man1.setBloodType("O");
		
		System.out.println(man1.getName());
		System.out.println(man1.getBloodType());
		
		
		car.setCompany("KIA");
		car.setName("K9");
		car.setPrice(50000000);
		
		System.out.println(car.getCompany());
		System.out.println(car.getName());
		System.out.println(car.getPrice());
		System.out.println("=============================");
		
		CarInfo.info("K7", 35000000);

	}

}
