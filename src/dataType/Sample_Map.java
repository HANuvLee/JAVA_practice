package dataType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 *  Map은 사전과 비슷하며, Key와 Value를 한 쌍으로 갖는 자료형
 *  Map은 리스트나 배열처럼 순차적으로(sequential) 해당 요소 값을 구하지 않고
 *  key를 통해 value를 얻는다
 *  baseball이란 단어의 뜻을 찾기 위해서 사전의 내용을 순차적으로 모두 검색하는 것이 아니라 baseball이라는 단어가 있는 곳만을 펼쳐보는 것이다
 */
public class Sample_Map {
	
	public static void main(String[] args) {
		/*
		 * Map 역시 List와 마찬가지로 인터페이스이다. 
		 * Map 인터페이스를 구현한 Map자료형에는 HashMap, LinkedHashMap, TreeMap등이 있다.
		 */
		HashMap<String, String> map = new HashMap<>();
		map.put("people", "사람");
		map.put("car", "자동차");
		
		System.out.println(map.get("people")); //사람 출력 (key에 해당되는 value값을 얻는다.)
		System.out.println(map.get("Java")); //맵의 key에 해당하는 value가 없을 경우에 get 메소드를 사용하면 다음처럼 null이 리턴
		System.out.println("containsKey 메소드 => " + map.containsKey("people"));  // true 출력,  맵(Map)에 해당 키(key)가 있는지를 조사하여 그 결과값을 리턴
		System.out.println("remove 메소드 => " +map.remove("people")); //사람 출력, remove 메소드는 맵의 항목을 삭제하며 key값에 해당되는 아이템(key, value)을 삭제한 후 그 value 값을 리턴
		System.out.println("size 메소드 => " +map.size()); // 1출력 
		System.out.println("keySet 메소드 => " +map.keySet()); // [car] 출력, keySet() 메소드는 Map의 모든 Key를 모아서 Set 자료형으로 리턴
		List<String> keyList = new ArrayList<>(map.keySet()); //Set 자료형은 다음과 같이 List 자료형으로 바꾸어 사용 가능하다
		
	/*
	 *LinkedHashMap과 TreeMap
	 *Map의 가장 큰 특징은 순서에 의존하지 않고 key로 value를 가져오는데 있다. 
	 *하지만 가끔은 Map에 입력된 순서대로 데이터를 가져오고 싶은 경우도 있고 때로는 입력된 key에 의해 소트된 데이터를 가져오고 싶을 수도 있을 것이다. 
	 *이런경우에는 LinkedHashMap과 TreeMap을 사용하는 것이 유리하다
	 *LinkedHashMap은 입력된 순서대로 데이터를 저장하는 특징을 가지고 있다.
	 *TreeMap은 입력된 key의 오름차순 순서로 데이터를 저장하는 특징을 가지고 있다.
	 */
		
	}

}
