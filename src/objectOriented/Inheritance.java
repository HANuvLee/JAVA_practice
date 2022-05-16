package objectOriented;
/*
 * ��� => ������ Ŭ������ �����Ͽ� �� Ŭ������ �ۼ��ϴ°�
 * ��Ӵ��п� �� ���� class�� �ɰ���, �� ���� ������ ������, ���� ����
 * ���� �ٸ� Ŭ������ ������ �����Ͱ� �����Ѵٸ� Ŭ���� ������ ���� ������ �����͸� �ڵ� ���� �ʾƵ� �ȴ�. 
 * ��ӹ��� �ڽ�Ŭ������ �θ�Ŭ������ ��� �Ӽ��� �޼ҵ带 ��ӹ޴´�. �� �౸����Ŭ������ ���Ŭ���� �� �� firstName, lastName �Ӽ��� ���� ��
 * ����� ���� �� ������ �����ϰ� �Ѵ�.
 */
class Person {
	private String firstName;
	private String lastName;
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String sayHi() {
	return "Hi my name is " + this.firstName + this.lastName;
	}
}
class SoccerPlayer1 extends Person{ //Ŭ���� �ߺ� ������ ���� Ŭ������ 1�߰�
	//private String firtsName;		=> ������ �����͸� PersonŬ������ ���� ���
	//private String lastName;		=> ������ �����͸� PersonŬ������ ���� ���
	private String team;
	private int shares;
	//������
	public SoccerPlayer1(String firstName, String lastName, String team, int shares) {
		//this.firtsName = firstName;
		//this.lastName = lastName;
		super(firstName, lastName); //super�� �θ� ���� �����ڸ� ȣ���ؼ� �ʱ�ȭ, �� �θ�Ŭ������ ������(Str1, Str2)�� �Է¹޴� ������ ȣ��
		this.team = team;
		this.shares = shares;
	}
}

class Actor extends Person{
	//private String firtsName;		=> ������ �����͸� PersonŬ������ ���� ���
	//private String lastName;		=> ������ �����͸� PersonŬ������ ���� ���
	private int oscars;
	private int age;
	
	public Actor(String firstName, String lastName, int oscars, int age) {
		//this.firtsName = firstName;
		//this.lastName = lastName;
		super(firstName, lastName); //super�� �θ� ���� �����ڸ� ȣ���ؼ� �ʱ�ȭ, �� �θ�Ŭ������ ������(Str1, Str2)�� �Է¹޴� ������ ȣ��
		this.oscars = oscars;
		this.age = age;
	}
	
}

public class Inheritance {

	public static void main(String[] args) {
		SoccerPlayer1 son = new SoccerPlayer1("Son", "HeungMin", "Tottenham",  5000);
		Actor jonny = new Actor("Johnny", "Depp", 20, 58);
		
		System.out.println(son.sayHi());
		System.out.println(jonny.sayHi());

	}

}
