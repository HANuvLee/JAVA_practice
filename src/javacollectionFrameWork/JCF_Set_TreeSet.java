package javacollectionFrameWork;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * Set �÷����� ���� ������ �������� �ʴ´�. ��ü�� �ߺ��ؼ� ������ �� ����, �ϳ��� null�� ���尡���ϴ�.
 * �׷��⿡ Set�÷����� ���� ��ü�� �����Ƿ� �ε����� ��ü�� �˻��ؼ� �������� get(index) �޼ҵ嵵 ����.
 * ��� ��ü ��ü�� ������� �� ���� �ݺ��ؼ� �������� �ݺ���(Iterator)�� �����Ѵ�.
 * iterator() �޼ҵ带 ȣ���ϸ� ���� �� �ִ�.
 * ��(������) ���� ������ ����(ã��) ���� ������ �ٸ����� �ִ� 
 * Set�� ���� ū ������ �ߺ��� �ڵ����� �������ش�
 */
public class JCF_Set_TreeSet {
	
	/*
	 * TreeSet�� ���� Ʈ���� ������� �� Set�÷����̴�.
	 * �ϳ��� ����� ��尪�� value�� ���ʰ� ������ ��带 �����ϱ� ���� �� ���� ������ �����ȴ�.
	 * TreeSet�� ��ü�� ���ϸ� �ڵ����� ���ĵǴµ� �θ𰪰� ���ؼ� ���� ���� ���� �ڽ� ��忡, ���� ���� ������ �ڽ� ��忡 ����ȴ�.
	 * TreeSet�� ���� Ž�� Ʈ��(BinarySearchTree) ������ �̷���� �־� HashSet���� �߰��� ������ �ð��� �� �ɸ����� ����, �˻��� ���� ������ ���̴� �ڷᱸ���̴�.
	 * ������ ���� �� ����Ž��Ʈ��(BinarySearchTree)�� ���·� �����͸� �����ϱ⿡ �⺻������ nature ordering�� �����ϸ� 
	 * �������� �Ű������� Comparator��ü�� �Է��Ͽ� ���� ����� ���Ƿ� ������ �� ���� �ִ�
	 * HashSet�� ��� ������ ������ �ʰ� TreeSet�� ��� �ڵ������� ���ش�
	 */

	public static void main(String[] args) {
		//TreeSet - ���� (TreeSet�� ���� �� ũ�������� �Ұ�)
		TreeSet<Integer> set1 = new TreeSet<Integer>();//TreeSet����
		TreeSet<Integer> set2 = new TreeSet<>();//new���� Ÿ�� �Ķ���� ��������
		TreeSet<Integer> set3 = new TreeSet<Integer>(set1);//set1�� ��� ���� ���� TreeSet����
		TreeSet<Integer> set4 = new TreeSet<Integer>(Arrays.asList(1,2,3));//�ʱⰪ ����
		
		//TreeSet - �� �߰� 
		TreeSet<Integer> set = new TreeSet<Integer>();//TreeSet����
		set.add(7); //���߰�
		set.add(4);
		set.add(9);
		set.add(2);
		set.add(5);
		
		//TreeSet - ũ�� ���ϱ�
		System.out.println(set.size());//ũ�� : 3
		
		//TreeSet - �� ���
		System.out.println("��ü���: " + set); //��ü��� [2,3,4]
		System.out.println("�ּҰ����: " + set.first());//�ּҰ� ���
		System.out.println("�ִ밪���: " + set.last());//�ִ밪 ���
		System.out.println("�Է°����� ū �������� �ּҰ� ���: " + set.higher(10));//�Է°����� ū �������� �ּҰ� ��� ������ null
		System.out.println("�Է°����� ���� �������� �ִ밪 ���: " + set.lower(1));//�Է°����� ���� �������� �ִ밪 ��� ������ null
				
		Iterator<Integer> iter = set.iterator();	// Iterator ���
		while(iter.hasNext()) {//���� ������ true ������ false
		    System.out.println(iter.next());
		}
		
		//TreeSet - �� ����
		set.remove(1);//�� 1 ����
		set.clear();//��� �� ����
		
		if(set.isEmpty()) {
            System.out.println("������ϴ�.");
        }

	}

}
