package javacollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*
 * List�÷����� ��ü�� �Ϸķ� �þ���� ����, �ε����� �����ϱ� ������ ��ü �߰��� �ڵ� �ε����� �ο��ȴ�.
 * �ε����� ��ü�� �˻�, ���� �� ����Ѵ�.
 * List�÷����� ��ü�� �����ϴ� ���� �ƴ� ��ü�ǹ����� �����Ѵ�.
 * ������ ��ü�� ������ �� ������ �� ��쿡�� ������ ��ü�� ������ ����, null�� ���尡��, �ߺ����� ���� ���� ����
 * ��ü �˻�, �� ������ �ε����� ��ü �߰��� ���� ������ ������
 */
public class JCF_List_ArrayList {

	public static void main(String[] args) {
		/*
		 * �÷��� �迭���� ������ Ÿ���� �����ϱ� ���ؼ� ���׸� ���, <������ Ÿ��> �� ����.
		 * ������ Ÿ���� �Ϲ� ���� Ÿ���� �ƴ� Wrapper class Ÿ������ ����
		 * ArrayList�� �迭�� ���̴� �� �� �ε����� ��ü�� ���������� ArrayList�� ũ�Ⱑ �������� �þ��. 
		 * �迭�� ũ�⸦ ���� �����ϰ� ����ؾ� �ϸ� ũ�Ⱑ ������ �ִ�.
		 */
		List<Integer> list = new ArrayList<>();
		
		//������ Ÿ�� - random Ŭ����
		Random ran = new Random();
		for(int i = 0; i < 5;  i++) {
			list.add(ran.nextInt(30) + 1);
		}
		//���
		for(int i = 0; i < 5; i++) {
			System.out.print(list.get(i)+"\t");
		}
		System.out.println();
		
		//�߰����� - index 3 (4��°) �߰� ����
		list.add(3, 35);
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+"\t");
		}
		System.out.println();
		
		//ġȯ - ù��° ���� ġȯ
		list.set(0, 40);
		
		System.out.println("���� �� listũ��: " + list.size());
		
		//���� - ������ �ε���
		list.remove(4);
		
		System.out.println("���� �� listũ��: " + list.size());
		
		for (int i = 0; i < 5; i++) {
			System.out.print(list.get(i)+"\t");
		}
		System.out.println();
		System.out.print("iterator ���: "+"\t");
		for (int i : list) {
			System.out.print(i+"\t");
		}
	}

}
