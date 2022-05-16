package dataType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sample_List {

	public static void main(String[] args) {
		/*
		 * 2022.05.07 ����Ʈ
		 * List�� �迭�� ��������� ���� ���ϴ�.
		 * �迭�� ũ�Ⱑ ������ ������ List�� �����̴�.
		 * List �ڷ������� ArrayList, Vector, LinkedList ���� List �������̽��� ������ �ڷ����� �ִ�.
		 */
		ArrayList<String> movie = new ArrayList<>();
		movie.add("Avengers"); 
		movie.add("Thor"); 
		movie.add("Ironman");
		movie.add("Spiderman");
		movie.add("Eternals");
		movie.add("Gurdians Of Galaxy");
		
		System.out.println(movie.get(1));
		System.out.println(movie.size()); // ������ 6
		
		movie.add(1, "Captain America"); // ù��° ��ġ�� Captain America ����
		
		System.out.println(movie.get(1)); 
		System.out.println(movie.get(2)); // ù��° ��ġ�� �ִ� Thor�� �ι�° ��ġ�� �̵�
		System.out.println(movie.size()); // ������ 7
		
		/*
		 * contains �޼ҵ�� ����Ʈ �ȿ� �ش� �׸��� �ִ����� �Ǻ��Ͽ� �� ����� boolean���� ����
		 */
		if(movie.contains("AntMan") == true) { 
			System.out.println("contains �޼ҵ� true => ��ȭ�� �����մϴ�");
		}else {
			System.out.println("contains �޼ҵ� false => ��ȭ�� �������� �ʽ��ϴ�.");
		}
		
		 movie.sort(Comparator.naturalOrder());
		 System.out.println("��������(������)���� =>" + movie);
		 movie.sort(Comparator.reverseOrder());
		 System.out.println("��������(������)���� =>" + movie);
		
		/* 
		 * remove(��ü) => ����Ʈ���� ��ü�� �ش�Ǵ� �׸��� �����ϰ� ������ ���(true, false)�� �����Ѵ�.
		 * remove(�ε���) => ����Ʈ���� �ش� �ε����� �׸��� �����ϰ� ������ �׸��� �����Ѵ�.
		 */ 
		System.out.println("remove(��ü) �޼ҵ� :" + movie.remove("Avengers"));
		System.out.println("remove(�ε���) �޼ҵ� :" + movie.remove(1));		
		
		/*
		 * asList �޼ҵ带 ����ϸ� �̹� �����ϴ� ���ڿ� �迭�� ArrayList ���� ����
		 */
		String[] data = {"138", "129", "142"};  // �̹� ������ �迭�� �ִ�.
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
        //ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        System.out.println(pitches);  // [138, 129, 142] ���
        
        /*
         * String.join("������", ����Ʈ��ü)�� ���� ����Ͽ� ����Ʈ�� �� ��ҿ� "������"�� �����Ͽ� �ϳ��� ���ڿ��� ���� �� �ִ�.
         */
        String result = String.join(",", data);
        System.out.println("join�޼ҵ�� ������ �߰��� ���ڿ�!! => " + result);
	}
}
