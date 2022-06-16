package java_else;

/*
 * Object클래스는 모든 클래스의 최상위 클래스
 * 아무것도 상속받지 않으면 자동으로 Object 상속
 * Object가 갖고있는 메소드는 모든 클래스에서 다 사용가능
 * 
 *  아래의 3개 모두 오버라이딩 후 사용
	 * equals : 객체가 가진 값이 같은지 비교할 때 사용 기준은 오버라이딩으로 해줘야 한다.
	 * toString : 객체가 가진 값을 문자열로 반환한다.
	 * hashCode	: 객체의 해시코드 값을 반환 한다.
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
	
	@Override //hashCode 를 오버라이딩하면 직접 해시코드 생성가능.
	public int hashCode() { //두 객체가 동일한 객체인지 비교 (동일성)
		final int prime = 31;
		int result = 1;
		result = prime*result+ ((number == null) ? 0 : number.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) { //두 객체의 내용이 같은지 비교 (동등성)
		if (this == obj) //객체가 동일하면 중복저장 불가.
			return true;
		if (obj == null) //객체가 널이면 false
			return false;
		if (getClass() != obj.getClass()) //객체의 클래스 값이 다르면 false , 객체의 소속검사
			return false;
		//해당 객체로 다운 캐스팅 후 멤버변수를 검사한다.
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
		Student s1 = new Student("철호", "777", "980330");
		Student s2 = new Student("수진", "777", "980917");
		
		if(s1.equals(s2)) {
			System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}
		System.out.println("s1 hashcode : " + s1.hashCode());
		System.out.println("s2 hashcode : " + s2.hashCode());
	}

}
