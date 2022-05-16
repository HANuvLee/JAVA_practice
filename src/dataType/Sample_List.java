package dataType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sample_List {

	public static void main(String[] args) {
		/*
		 * 2022.05.07 리스트
		 * List는 배열과 비슷하지만 더욱 편리하다.
		 * 배열은 크기가 정해져 있지만 List는 동적이다.
		 * List 자료형에는 ArrayList, Vector, LinkedList 등의 List 인터페이스를 구현한 자료형잉 있다.
		 */
		ArrayList<String> movie = new ArrayList<>();
		movie.add("Avengers"); 
		movie.add("Thor"); 
		movie.add("Ironman");
		movie.add("Spiderman");
		movie.add("Eternals");
		movie.add("Gurdians Of Galaxy");
		
		System.out.println(movie.get(1));
		System.out.println(movie.size()); // 사이즈 6
		
		movie.add(1, "Captain America"); // 첫번째 위치에 Captain America 삽입
		
		System.out.println(movie.get(1)); 
		System.out.println(movie.get(2)); // 첫번째 위치에 있던 Thor는 두번째 위치로 이동
		System.out.println(movie.size()); // 사이즈 7
		
		/*
		 * contains 메소드는 리스트 안에 해당 항목이 있는지를 판별하여 그 결과를 boolean으로 리턴
		 */
		if(movie.contains("AntMan") == true) { 
			System.out.println("contains 메소드 true => 영화가 존재합니다");
		}else {
			System.out.println("contains 메소드 false => 영화가 존재하지 않습니다.");
		}
		
		 movie.sort(Comparator.naturalOrder());
		 System.out.println("오름차순(순방향)정렬 =>" + movie);
		 movie.sort(Comparator.reverseOrder());
		 System.out.println("내림차순(역방향)정렬 =>" + movie);
		
		/* 
		 * remove(객체) => 리스트에서 객체에 해당되는 항목을 삭제하고 삭제한 결과(true, false)를 리턴한다.
		 * remove(인덱스) => 리스트에서 해당 인덱스의 항목을 삭제하고 삭제된 항목을 리턴한다.
		 */ 
		System.out.println("remove(객체) 메소드 :" + movie.remove("Avengers"));
		System.out.println("remove(인덱스) 메소드 :" + movie.remove(1));		
		
		/*
		 * asList 메소드를 사용하면 이미 존재하는 문자열 배열로 ArrayList 생성 가능
		 */
		String[] data = {"138", "129", "142"};  // 이미 데이터 배열이 있다.
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
        //ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        System.out.println(pitches);  // [138, 129, 142] 출력
        
        /*
         * String.join("구분자", 리스트객체)와 같이 사용하여 리스트의 각 요소에 "구분자"를 삽입하여 하나의 문자열로 만들 수 있다.
         */
        String result = String.join(",", data);
        System.out.println("join메소드로 구분자 추가한 문자열!! => " + result);
	}
}
