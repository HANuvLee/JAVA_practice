package dataType;

import java.util.Arrays;

/*
 * ���ϵ�ī��� ���׸� Ÿ���� �Ű� ���̳� ���� Ÿ������ ����� �� ��ü���� Ÿ�� ��ſ� ����ϴ� ������ �ڵ忡����?�� ǥ���ȴ�.
 * ������ 3������ ������ ����, �Ʒ��� ����.
 *  1. ���׸�Ÿ��<?> : ��� Ŭ���� / �������̽� Ÿ���� �� �� �ִ�.
 *  2. ���׸�Ÿ��<? extend ���� Ÿ��> : Ÿ�� �Ķ���Ϳ� ��ġ�ϴ� ���� Ÿ�԰� ���� Ÿ���� �� �� �ִ�.
 *  3. ���׸�Ÿ��<? super ���� Ÿ��> : Ÿ�� �Ķ���Ϳ� ��ġ�ϴ� ���� Ÿ�԰� ���� Ÿ���� �� �� �ִ�.
 */
class Specice <T> { //���׸� Ÿ���� ���� ������ Ŭ�������� ������ �������� Ŭ����
	private String name;
	private T[] specices;
	
	public Specice(String name, int num) {
		this.name = name;
		specices = (T[])(new Object[num]);// ���׸� Ÿ���� �迭�� ����ȯ�� ���ش�.
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

class Animal{ //���� ������ Ŭ����
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	//getName()�� to String�� �����Ͽ�, ������ ���� Ŭ�������� �̸� ��ӹ޾� ���
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
		
		Specice<Animal> sAnimal = new Specice<Animal>("����: ", 4);
		sAnimal.add(new Animal("����"));
		sAnimal.add(new Simian("���ο�"));
		sAnimal.add(new Human("���"));
		sAnimal.add(new Lion("����"));
		
		Specice<Simian> sSimian = new Specice<Simian>("����: ", 2);
		sSimian.add(new Simian("���ο�"));
		sSimian.add(new Human("���"));
		
		Specice<Human> sHuman = new Specice<Human>("����: ", 1);
		sHuman.add(new Human("���"));
		
		Specice<Lion> sLion = new Specice<Lion>("����: ", 2);	
		sLion.add(new Lion("����"));
		
		
		/*
		 * defineSpecice(specice <?> specice)�� ��� ���׸� Ÿ���� ���� ���� �� �ִ�.
		 */
		defineSpecice(sAnimal);
		defineSpecice(sSimian);
		defineSpecice(sHuman);
		defineSpecice(sLion);
		System.out.println();
		
		/*
		 * defineSpeciceSimian(specice <? extends simian> specice)�� ��� �ڽŰ� �ڽ��� �ڽ� Ŭ������ ���׸� Ÿ�� ���� �Է¹޾� �������� �� �� �ִ�.
		 */
//		defineSpeciceSimian(sAnimal); // ���� Ŭ������ ������ ����
		defineSpeciceSimian(sSimian); // �ڽ� �������
		defineSpeciceSimian(sHuman); //��ӹ��� Ŭ������ ���� ���
//		defineSpeciceSimian(sLion); // ��ӹ��� ���� Ŭ������ ������ ����
		System.out.println();
		
		/*
		 * defineSpeciceLion(specice <? super lion> specice)��(��) �ڽŰ� �ڽ��� ����� ������ Ŭ������ ���׸� Ÿ�� ���� �Է¹޾� �������� ����
		 */
		defineSpeciceLion(sAnimal); // ��ӹ��� ���� Ŭ���� ���� ���
//		defineSpeciceLion(sSimian); // ���þ��� Ŭ���� ������ ����
//		defineSpeciceLion(sHuman); // ���þ��� Ŭ���� ������ ����
		defineSpeciceLion(sLion); // �ڽ� �������
		System.out.println();
	}
}
