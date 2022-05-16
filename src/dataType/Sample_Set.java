package dataType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/*
 *����(Set) �ڷ����� ���հ� ���õ� ���� ���� ó���ϱ� ���� ���� �ڷ����̴�.
 *���� �ڷ����� HashSet�� ����Ͽ� ���� �� �ִ�
 *Ư¡�� �ߺ� ����� �ȵǸ� ������ ����. 
 *Set �ڷ������� HashSet, TreeSet, LinkedHashSet ���� Set �������̽��� ������ �ڷ����� �ִ�.
 *���� �ڷ����� ���� �����ϰ� ����ϴ� ���� ������, ������, �������� ���� �� �̴�.
 *
 *TreeSet�� LinkedHashSet
 *Set �ڷ����� ������ ���ٴ� Ư¡�� �ִ�. 
 *������ Set�� �Էµ� ������� �����͸� �������� ���� ��쵵 �ְ� ���δ� ������������ ���ĵ� �����͸� �������� ���� ���� ���� ���̴�. 
 *�̷���쿡�� TreeSet�� LinkedHashSet�� ����Ѵ�.
 *TreeSet - ������������ ���� �����Ͽ� �����ϴ� Ư¡�� �ִ�.
 *LinkedHashSet - �Է��� ������� ���� �����Ͽ� �����ϴ� Ư¡�� �ִ�.
 */
public class Sample_Set {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set);  //  [e, H, l, o] ���
        
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
        
        HashSet<Integer> intersection = new HashSet<>(s1);  // s1������ ������ ���� s1���� intersection ����
        intersection.retainAll(s2);  // retainAll�޼ҵ� => ������ ����
        System.out.println("������ : " +intersection);  // [4, 5, 6] ���
        
        HashSet<Integer> union = new HashSet<>(s1);  // s1���� union ����
        union.addAll(s2); //addAll�޼ҵ� => ������ ����
        System.out.println("������ : " +union);  // [1, 2, 3, 4, 5, 6, 7, 8, 9] ��� ,�ߺ����� ���Ե� ���� �Ѱ��� ǥ��.
        
        HashSet<Integer> substract = new HashSet<>(s1);  // s1���� substract ����
        substract.removeAll(s2); // ������ ����
        System.out.println("������ : " + substract);  // [1, 2, 3] ���
        
        //���� �ڷ����� ���� �߰��� ������ add �޼ҵ带 ���
        set.add("Jump");
        set.add("To");
        set.add("Java");
        System.out.println(set);  // [Java, To, Jump] ���
        
        //���� ���� ���� �Ѳ����� �߰��� ���� ������ ���� addAll �޼ҵ带 ���
        set.addAll(Arrays.asList("Happy", "Heaven"));
        System.out.println(set);
        
        //Ư���� ����
        set.remove("To");
        System.out.println(set); 
	}

}
