package objectOriented;
/*
 * �ڹٿ����� Ŭ������ �̿��� ���߻���� �������� �ʴ´�. 
 * ������ �������̽��� ���� ���߻���� ����
 * �������̽��� �ٸ� Ŭ���� �ۼ��� �⺻�� �Ǵ� Ʋ�� ����, �ٸ� Ŭ���� ������ �߰� �Ű� ���ұ��� ����ϴ� ������ �߻�Ŭ����
 * �߻� Ŭ������ �߻� �޼ҵ�Ӹ� �ƴ϶� ������, �ʵ�, �Ϲ� �޼ҵ嵵 �����Ѵ�.
 * �������̽�(interface)�� �߻� �޼ҵ�� ���, JAVA8������ �����޼ҵ�� ����Ʈ�޼ҵ尡 �����Ѵ�.
 */
interface Predator{
	String getFood(); //�������̽� ��Ģ�� ���� �޼ҵ��� �̸��� ��������Ǹ� ���� body�κ��� X
	
	//JAVA8 �̻���ʹ� �޼ҵ� body�κ��� ���� ���� ���ϴ� �������̽����� ���� ������ ������ �޼ҵ带 ���� �� �ִ�. 
	default void printFood() {
		System.out.printf("my food is %s\n", getFood());
	}
	
	int LEG_COUNT = 4; //�������̽� ��� , public static final�� ����
	
	static int speed() { // �������̽��� ����ƽ �޼��� ���� �� �������̽���.����ƽ�޼���� �� ���� ����Ͽ� �Ϲ� Ŭ������ ����ƽ �޼��带 ����ϴ� �Ͱ� �����ϰ� ��밡��.
		return LEG_COUNT * 30;
	}
}

class Animal{
	String name;

	public void setName(String name) {
		this.name = name;
	}
}

class Tiger extends Animal implements Predator{ //interface ������ ���� implementsŰ���� ���
	@Override
	public String getFood() { //�������̽� �޼ҵ�� ���Ͽ� �ݵ�� �������̵� , �������̽� �޼ҵ�� �׻� public���� ����!!
		return "Pig";
	}
}

class Lion extends Animal implements Predator{  //interface ������ ���� implementsŰ���� ���
	@Override
	public String getFood() { //�������̽� �޼ҵ�� ���Ͽ� �ݵ�� �������̵� , �������̽� �޼ҵ�� �׻� public���� ����!!
		return "Chicken";
	}
}
// ���� ��ü�� �þ ���� �ߺ��ڵ��� �þ��. (�������̽��� Ȱ���Ͽ� �ذᰡ�� Predator Interface ����)
class ZooKeeper{
	//	feed �޼ҵ��� �Է����� Tiger, Lion�� ���� �ʿ�� ������ ���� �̰��� Predator��� �������̽��� ��ü�� �� �ְ� �Ǿ���.
	//	tiger, lion�� ���� Tiger, Lion�� ��ü�̸鼭  Predator �������̽��� ��ü�̱� ������ Predator�� �ڷ����� Ÿ������ ��밡��
	//  �������̽��� Ȱ���Ͽ� ZookeeperŬ������ ������ ������ �������� Ŭ�������� ������� �������� Ŭ������ �Ǿ���!
	void feed(Predator predator) {
        System.out.println("Eat" + predator.getFood());
    }
//  �������̽� �������� ���� �ڵ��ü
//	void feed(Tiger tiger) {	//�޼ҵ� �����ε�
//		System.out.println("Tiger Eat Pig");
//	}
//	void feed(Lion lion){		//�޼ҵ� �����ε�
//		System.out.println("Lion Eat Chicken");
//	}
}
public class Interface {

	public static void main(String[] args) {
		ZooKeeper zookeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();

		zookeeper.feed(lion);
		zookeeper.feed(tiger);

	}

}
