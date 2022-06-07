package dataType;

/*
 * 제네릭은 클래스나 메소드에서 사용할 데이터 타입을 컴파일 시에 미리 지정하는 방법. 
 * 이를 통해서 클래스나 메소드 내부에 사용되는 객체의 타입 안정성을 높일 수 있다. 
 * 반환값에 대한 타입 변환 및 타입 검사에 들어가는 노력을 줄일 수 있습니다.
 */
class Man <T>{ //꼭 T가 아니어도 된다. 다른 문자라도 상관이 없다.
	private T name; //이름 필드
	private T bloodType; //혈액형 필드
	
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
//멀티 제네릭 : 제네릭 타입 선언 시 한 가지 값이 아닌 두 가지 이상의 타입을 받는 것도 가능.
class Car<A, A2>{
	private A name; // 차 이름 필드
	private A company; // 제작 회사 필드
	
	private A2 price; //차 가격
	
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
	//제네릭 메서드는 매개변수 타입과 리턴 타입을 제네릭 타입으로 받는 메서드이다.
		public static <A, A2> void info(A a, A2 a2) {
			// 타입 파라미터  / 리턴타입 파라미터 or void / 메소드명 매개변수 타입
			Car<A, A2> car = new Car<>();
			car.setName(a);
			car.setPrice(a2);
			
			System.out.println("자동차의 이름은" + car.getName() + "입니다.");
			System.out.println("가격은" + car.getPrice() +"원 입니다.");
		}
}

public class Sample_Generic {

	public static void main(String[] args) {
		Man<String> man1 = new Man<>(); //새 객체 생서 시 원하는 사용할 실제 타입을 명시해야한다.
		Car<String, Integer> car = new Car<>(); //멀티 제네릭 객체 생성
		
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
