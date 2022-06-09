package dataType;

import java.util.Arrays;

/*
 * 와일드카드는 제네릭 타입을 매개 값이나 리턴 타입으로 사용할 때 구체적인 타입 대신에 사용하는 것으로 코드에서는?로 표현된다.
 * 사용법은 3가지로 나누어 지며, 아래와 같다.
 *  1. 제네릭타입<?> : 모든 클래스 / 인터페이스 타입이 올 수 있다.
 *  2. 제네릭타입<? extend 상위 타입> : 타입 파라미터와 대치하는 상위 타입과 하위 타입이 올 수 있다.
 *  3. 제네릭타입<? super 하위 타입> : 타입 파라미터와 대치하는 하위 타입과 상위 타입이 올 수 있다.
 */
class Specice <T> { //제네릭 타입을 받을 변수로 클래스들의 종족을 결정해줄 클래스
	private String name;
	private T[] specices;
	
	public Specice(String name, int num) {
		this.name = name;
		specices = (T[])(new Object[num]);// 제네릭 타입의 배열로 형변환을 해준다.
	}
	
	public String getName() {return name;}
	public T[] getSpecices() {return specices;}
	
	public void add(T t) {
		for(int i = 0; i < specices.length; i++) {
			if(specices[i] == null) {
				specices[i] = t;
				break;
			}
		}
	}	
}

class Animal{ //가장 상위의 클래스
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	//getName()과 to String을 정의하여, 나머지 하위 클래스들은 이를 상속받아 사용
	public String getName() {return name;}	
	public String toString() {return name;}
}

class Simian extends Animal{

	public Simian(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
}

class Human extends Simian {

	public Human(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
}

class Lion extends Animal{

	public Lion(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}

public class Sample_GenericWildCard {
	
	public static void defineSpecice(Specice<?> specice) {
		System.out.println(specice.getName() + " " +
			Arrays.toString(specice.getSpecices()));
	}
	
	public static void defineSpeciceSimian(Specice<? extends Simian> specice) {
		System.out.println(specice.getName() + " " +
			Arrays.toString(specice.getSpecices()));
	}
	
	public static void defineSpeciceLion(Specice<? super Lion> specice) {
		System.out.println(specice.getName() + " " +
			Arrays.toString(specice.getSpecices()));
	}


	public static void main(String[] args) {
		
		Specice<Animal> sAnimal = new Specice<Animal>("종족: ", 4);
		sAnimal.add(new Animal("동물"));
		sAnimal.add(new Simian("유인원"));
		sAnimal.add(new Human("사람"));
		sAnimal.add(new Lion("사자"));
		
		Specice<Simian> sSimian = new Specice<Simian>("종족: ", 2);
		sSimian.add(new Simian("유인원"));
		sSimian.add(new Human("사람"));
		
		Specice<Human> sHuman = new Specice<Human>("종족: ", 1);
		sHuman.add(new Human("사람"));
		
		Specice<Lion> sLion = new Specice<Lion>("종족: ", 2);	
		sLion.add(new Lion("사자"));
		
		
		/*
		 * defineSpecice(specice <?> specice)는 모든 제네릭 타입의 값을 받을 수 있다.
		 */
		defineSpecice(sAnimal);
		defineSpecice(sSimian);
		defineSpecice(sHuman);
		defineSpecice(sLion);
		System.out.println();
		
		/*
		 * defineSpeciceSimian(specice <? extends simian> specice)의 경우 자신과 자신의 자식 클래스의 제네릭 타입 값만 입력받아 컴파일을 할 수 있다.
		 */
//		defineSpeciceSimian(sAnimal); // 상위 클래스는 컴파일 오류
		defineSpeciceSimian(sSimian); // 자신 정상출력
		defineSpeciceSimian(sHuman); //상속받은 클래스는 정상 출력
//		defineSpeciceSimian(sLion); // 상속받지 않은 클래스는 컴파일 오류
		System.out.println();
		
		/*
		 * defineSpeciceLion(specice <? super lion> specice)는(은) 자신과 자신의 상속한 상위의 클래스의 제네릭 타입 값만 입력받아 컴파일이 실행
		 */
		defineSpeciceLion(sAnimal); // 상속받은 상위 클래스 정상 출력
//		defineSpeciceLion(sSimian); // 관련없는 클래스 컴파일 오류
//		defineSpeciceLion(sHuman); // 관련없는 클래스 컴파일 오류
		defineSpeciceLion(sLion); // 자신 정상출력
		System.out.println();
	}
}
