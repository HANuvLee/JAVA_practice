package java_else;

/*
 * 기존의 메소드명과 같은 이름의 메소드를 선언하고 이름과 매개변수를 재정의 해서 사용하는것.
 */



class Overloading{
	String name;
	String sex;
	int age;

	// 기존의 기본 생성자를 다양한 방법으로 객체를 생성 하도록 매개변수 타입과 갯수를 달리하여 다수의 생성자 생성
	public Overloading() {
		
	}

	public Overloading(String name) {//이름을 매개변수로 받는 생성자
		this.name = name;
	}
	
	
	public Overloading(String name, String sex) { //이름과 성병을 매개변수로 받는 생성자
		this.name = name;
		this.sex = sex;
	}
	
	public Overloading(String name, String sex, int age) { //이름과 성병 나이를 매개변수로 받는 생성자
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
}

public class Sample_Overloading {

	public static void main(String[] args) {
		Overloading a = new Overloading();
    	Overloading b = new Overloading("홍길동");
    	Overloading c = new Overloading("홍길동", "남");	
    	Overloading d = new Overloading("홍길동", "남", 25);
   
    	System.out.println(b.name);
    	System.out.println(c.name + " " + c.sex);
    	System.out.println(d.name + " " + d.sex + " " + d.age);

	}

}
