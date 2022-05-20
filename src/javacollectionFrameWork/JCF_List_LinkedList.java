package javacollectionFrameWork;

import java.util.LinkedList;
import java.util.List;

/*
 * List�÷����� ��ü�� �Ϸķ� �þ���� ����, �ε����� �����ϱ� ������ ��ü �߰��� �ڵ� �ε����� �ο��ȴ�.
 * �ε����� ��ü�� �˻�, ���� �� ����Ѵ�.
 * List�÷����� ��ü�� �����ϴ� ���� �ƴ� ��ü�ǹ����� �����Ѵ�.
 * ������ ��ü�� ������ �� ������ �� ��쿡�� ������ ��ü�� ������ ����, null�� ���尡��, �ߺ����� ���� ���� ����
 */
public class JCF_List_LinkedList {

	public static void main(String[] args) {
		/*
		 * ArrayList���� ���� �迭�� ��ü�� ������ �ε����� ����, LinkedList�� �����ϴ� ������ ��ũ�ؼ� ü��ó�� �����Ѵ�. 
		 * ���� LinkedList���� Ư�� �ε����� ��ü�� ������ ��, ���ŵǴ� �ε����� �� �� ��ũ�� ����ǰ� ������ ��ũ�� ������� �ʴ´�.
		 * ��ü ���� �� ������ ���� ������ ����.
		 */
		
		List<Integer> list = new LinkedList<>(); // LinkedList ����

		list.add(1); // �� �߰�
		list.add(2);
		list.add(3);
		list.add(4);

		System.out.print("�߰��� ��: ");
		for (int l : list) { // iterator�� �̿��� ����Ʈ�� �� ���
			System.out.print(l+"\t");
		}
		System.out.println();

		list.set(2, 5); // ����Ʈ ����

		System.out.print("������ ��: ");
		for (int l : list) { // iterator�� �̿��� ����Ʈ�� �� ���
			System.out.print(l+"\t");
		}
		System.out.println();

		list.remove(1); // ����Ʈ ����

		System.out.print("������ ��: ");
		for (int i = 0; i < list.size(); i++) { // �Ϲ� for�� �̿��ؼ� �ݺ�
			System.out.print(list.get(i)+"\t"); // .get() �޼��带 �̿��� ����Ʈ�� �� ���
		}
		System.out.println();
		
		}
		

	}

