package dataType;
/*
 *  �迭�� �ڷ����� �����̴�.
 *  Ư¡
 *   -�迭�� ���̴� �����Ǿ� �ִ�!
 */
		
public class Sample_Array {

	public static void main(String[] args) {
		//1~10������ ���� �� Ȧ������ ����
		int[] odds = {1,3,5,7,9};
		//������ ����
		String[] weeks = {"��", "ȭ", "��", "��", "��", "��", "��"};
		
		
		/* �迭�� Ư¡  1.�迭�� ���̴� ����*/
//		String[] Avengers = new String[];  ���̿� ���� ���ڰ��� �����Ƿ� ������ ������ �߻��Ѵ�.
		String[] Avengers = new String[4]; //�迭�� ���̴� �����Ǿ� �ִ�.
		Avengers[0] = "Thor";
		Avengers[1] = "Ironman";
		Avengers[2] = "Hulk";
		Avengers[3] = "Spiderman";
		System.out.println("======================�迭�� ����======================");
		/* �迭�� Ư¡  2.�迭���� �����ϴ� ���*/
		System.out.println(Avengers[2]); //�ε����� �̿��Ѵ�. Avenger[2]�� �迭�� 3��° �׸��� �ǹ�
		
		
		System.out.println("======================�迭�� ����======================");
		/* �迭�� Ư¡  3.�迭�� ����*/
		for(int i=0; i <Avengers.length; i++) { //�迭�� ���̴� .length�� �̿��Ͽ� ���� �� �ִ�.
			System.out.println(Avengers[i]);
		}
		
		

	}

}
