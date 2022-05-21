package javacollectionFrameWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*
 *  Map 컬렉션은 키(Key)와 값(value)으로 구성된 Entry 객체를 저장하는 구조를 가지고 있다.
 *  키와 값은 모두 객체이며, 키는 중복될 수 없다. 
 *  만약, 동일한 키를 가지고 있는 Entry 객체를 Map 컬렉션에 저장하면, 기존의 값은 없어지고 새로운 값으로 대치된다.
 *  Map 인터페이스를 구현하기 때문에 Map 인터페이스에 선언된 메서드를 모두 가지고 있다.
 */
public class JCF_Map_HashMap {

	public static void main(String[] args) {
		/*
		 * HashMap은 Map 인터페이스를 구현한 대표적인 Map 컬렉션이다. 
		 * Map 인터페이스를 상속하고 있기에 Map의 성질을 그대로 가지고 있다. 
		 * HashMap은 이름 그대로 해싱(Hashing)을 사용하기 때문에 많은 양의 데이터를 검색하는 데 있어서 뛰어난 성능을 보인다.
		 * HashMap의 키로 사용할 객체는 hashCode()와 equals()메서드를 오버라이드해서 동등 객체가 될 조건을 정의해야 한다.
		 * 동등 객체에서 동일한 키가 될 조건은 hashCode() 값이 같고, equals() 메서드가 true를 반환해야 한다.
		 * List처럼 저장공간을 한 칸씩 늘리지 않고 약 두배로 늘리며. 여기서 과부하가 많이 발생한다.
		 */
		HashMap<String,String> map1 = new HashMap<String,String>();//HashMap생성
		HashMap<String,String> map2 = new HashMap<>();//new에서 타입 파라미터 생략가능
		HashMap<String,String> map3 = new HashMap<>(map1);//map1의 모든 값을 가진 HashMap생성
		HashMap<String,String> map4 = new HashMap<>(10);//초기 용량(capacity)지정
		HashMap<String,String> map5 = new HashMap<>(10, 0.7f);//초기 capacity,load factor지정
		HashMap<String,String> map6 = new HashMap<String,String>(){{//초기값 지정
		    put("a","b");
		}};
		
		
		Map<Integer, String> map = new HashMap<>(){{ //초기값 지정
			put(1,"사과"); //값 추가
			put(2,"바나나");
			put(3,"포도");
		}};
		
		System.out.println(map); //전체 출력 : {1=사과, 2=바나나, 3=포도}
		System.out.println(map.get(1));//key값 1의 value얻기 : 사과
		
		//entrySet() 활용
		for (Entry<Integer, String> entry : map.entrySet()) {
		    System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
		}
		//[Key]:1 [Value]:사과
		//[Key]:2 [Value]:바나나
		//[Key]:3 [Value]:포도
		
		//KeySet() 활용
		for(Integer i : map.keySet()){ //저장된 key값 확인
		    System.out.println("[Key]:" + i + " [Value]:" + map.get(i));
		}
		//[Key]:1 [Value]:사과
		//[Key]:2 [Value]:바나나
		//[Key]:3 [Value]:포도
		
		/* ==> HashMap 출력 방법. 
		 * 그냥 print하게 되면 {}로 묶어 Map의 전체 key값, value가 출력. 
		 * 특정 key값의 value를 가져오고싶다면 get(key)를 사용
		 * 전체를 출력하려면 entrySet()이나 keySet()메소드를 활용하여 Map의 객체를 반환받은 후 출력. 
		 * entrySet()은 key와 value 모두가 필요할 경우 사용 & keySet()은 key 값만 필요할 경우 사용하는데 key값만 받아서 get(key)를 활용
		 * value도 출력할 수도 있기에 대부분 코드가 간단한 keySet을 활용하지만 key값을 이용하여 value를 찾는 과정에서 시간이 많이 소모되므로
		 * 많은 양의 데이터를 가져와야 한다면 entrySet()이 좋다.(약 20%~200% 성능 저하)
		 */
		
		
		/* iterator 사용*/
		
		//entrySet().iterator()
		Iterator<Entry<Integer, String>> entries = map.entrySet().iterator();
		while(entries.hasNext()){
		    Map.Entry<Integer, String> entry = entries.next();
		    System.out.println("[Key]:" + entry.getKey() + " [Value]:" +  entry.getValue());
		}
		//[Key]:1 [Value]:사과
		//[Key]:2 [Value]:바나나
		//[Key]:3 [Value]:포도
				
		//keySet().iterator()
		Iterator<Integer> keys = map.keySet().iterator();
		while(keys.hasNext()){
		    int key = keys.next();
		    System.out.println("[Key]:" + key + " [Value]:" +  map.get(key));
		}
		//[Key]:1 [Value]:사과
		//[Key]:2 [Value]:바나나
		//[Key]:3 [Value]:포도
		

	}
}