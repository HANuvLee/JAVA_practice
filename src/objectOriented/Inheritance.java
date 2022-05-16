package objectOriented;
/*
 * 상속 => 기존의 클래스를 재사용하여 새 클래스를 작성하는것
 * 상속덕분에 더 작은 class로 쪼개고, 더 작은 단위로 나누고, 재사용 가능
 * 각기 다른 클래스의 공통의 데이터가 존재한다면 클래스 생성시 마다 공통의 데이터를 코딩 하지 않아도 된다. 
 * 상속받은 자식클래스는 부모클래스이 모든 속성과 메소드를 상속받는다. 즉 축구선수클래스와 배우클래스 둘 다 firstName, lastName 속성을 갖게 됨
 * 상속은 분할 및 정복을 가능하게 한다.
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
class SoccerPlayer1 extends Person{ //클래스 중복 방지를 위해 클래스명에 1추가
	//private String firtsName;		=> 공통의 데이터를 Person클래스로 부터 상속
	//private String lastName;		=> 공통의 데이터를 Person클래스로 부터 상속
	private String team;
	private int shares;
	//생성자
	public SoccerPlayer1(String firstName, String lastName, String team, int shares) {
		//this.firtsName = firstName;
		//this.lastName = lastName;
		super(firstName, lastName); //super는 부모가 가진 생성자를 호출해서 초기화, 즉 부모클래스의 생성자(Str1, Str2)를 입력받는 생성자 호출
		this.team = team;
		this.shares = shares;
	}
}

class Actor extends Person{
	//private String firtsName;		=> 공통의 데이터를 Person클래스로 부터 상속
	//private String lastName;		=> 공통의 데이터를 Person클래스로 부터 상속
	private int oscars;
	private int age;
	
	public Actor(String firstName, String lastName, int oscars, int age) {
		//this.firtsName = firstName;
		//this.lastName = lastName;
		super(firstName, lastName); //super는 부모가 가진 생성자를 호출해서 초기화, 즉 부모클래스의 생성자(Str1, Str2)를 입력받는 생성자 호출
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
