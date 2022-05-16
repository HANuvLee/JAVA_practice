package dataType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/*
 *집합(Set) 자료형은 집합과 관련된 것을 쉽게 처리하기 위해 만든 자료형이다.
 *집합 자료형은 HashSet을 사용하여 만들 수 있다
 *특징은 중복 허용이 안되며 순서가 없다. 
 *Set 자료형에는 HashSet, TreeSet, LinkedHashSet 등의 Set 인터페이스를 구현한 자료형이 있다.
 *집합 자료형을 정말 유용하게 사용하는 경우는 교집합, 합집합, 차집합을 구할 때 이다.
 *
 *TreeSet과 LinkedHashSet
 *Set 자료형은 순서가 없다는 특징이 있다. 
 *하지만 Set에 입력된 순서대로 데이터를 가져오고 싶은 경우도 있고 때로는 오름차순으로 정렬된 데이터를 가져오고 싶을 수도 있을 것이다. 
 *이런경우에는 TreeSet과 LinkedHashSet을 사용한다.
 *TreeSet - 오름차순으로 값을 정렬하여 저장하는 특징이 있다.
 *LinkedHashSet - 입력한 순서대로 값을 정렬하여 저장하는 특징이 있다.
 */
public class Sample_Set {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set);  //  [e, H, l, o] 출력
        
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
        
        HashSet<Integer> intersection = new HashSet<>(s1);  // s1데이터 유지를 위해 s1으로 intersection 생성
        intersection.retainAll(s2);  // retainAll메소드 => 교집합 수행
        System.out.println("교집합 : " +intersection);  // [4, 5, 6] 출력
        
        HashSet<Integer> union = new HashSet<>(s1);  // s1으로 union 생성
        union.addAll(s2); //addAll메소드 => 합집합 수행
        System.out.println("합집합 : " +union);  // [1, 2, 3, 4, 5, 6, 7, 8, 9] 출력 ,중복으로 포함된 값은 한개씩 표현.
        
        HashSet<Integer> substract = new HashSet<>(s1);  // s1으로 substract 생성
        substract.removeAll(s2); // 차집합 수행
        System.out.println("차집합 : " + substract);  // [1, 2, 3] 출력
        
        //집합 자료형에 값을 추가할 때에는 add 메소드를 사용
        set.add("Jump");
        set.add("To");
        set.add("Java");
        System.out.println(set);  // [Java, To, Jump] 출력
        
        //여러 개의 값을 한꺼번에 추가할 때는 다음과 같이 addAll 메소드를 사용
        set.addAll(Arrays.asList("Happy", "Heaven"));
        System.out.println(set);
        
        //특정값 제거
        set.remove("To");
        System.out.println(set); 
	}

}
