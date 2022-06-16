package java_else;

/*
 * 캐스팅: 부모와 자식 관계(상속관계) 에서 상위클래스에 속하는 슈퍼클래스와 하위클래스에 속하는 서브클래스의 형변환
 * 업캐스팅 : 서브클래스 -> 슈퍼클래스 변환
 * 다운캐스팅 : 슈퍼클래스 -> 서브클래스 변환
 * 업캐스팅을 사용하는 이유는 다형성과 관련이 있다.
 * 재사용 해야하는 반복된 메서드를 업캐스팅을 통해 부모클래스에서 가져와서 서브클래스를 호출할때 사용할 수 있기 때문이다.
 */

class SolarSystem{
	String name = "태양계";

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
		Planet earth = new Planet("지구"); //서브클래스에 객체를 우선 생성 후 name의 값을 초기화
	//서브클래스의 생성자에 super()메소드로 인하여 SolarySystem의 String name의 값을 변경할 수 있다.
		
		SolarSystem E = (SolarSystem)earth; //업캐스팅 , Planet형으로 생성된 객체를 SolarSystem형으로 가르킨다.
	//	SolarSystem E = earth; 부모 유형 명시 생략 가능
	//이 경우 객체는 Planet형이지만 SolarSystem형을 참조변수로 가리키므로 Planet의 멤버는 참조 불가.
		
		System.out.println(E.name);
	//  System.out.println(E.kind); 참조시에 컴파일 에러 발생

	}

}
