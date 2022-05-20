package javacollectionFrameWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set 컬렉션은 저장 순서가 유지되지 않는다. 객체를 중복해서 저장할 수 없고, 하나의 null만 저장가능하다.
 * 대신 전체 객체를 대상으로 한 번씩 반복해서 가져오는 반복자(Iterator)를 제공하여 iterator() 메소드를 호출하면 얻을 수 있다.
 * 만약 요소의 저장 순서를 유지해야 한다면 LinkedHashSet 클래스를 사용
 * Set컬렉션은 순서 자체가 없으므로 인덱스로 객체를 검색해서 가져오는 get(index) 메소드도 없다.
 * 들어갈(저장할) 때의 순서와 나올(찾을) 때의 순서가 다를수도 있다 
 * Set의 가장 큰 장점은 중복을 자동으로 제거해준다
 */
public class JCF_Set_HashSet {
	/*
	 * HashSet은 객체들을 순서없이 저장하고 동일한 객체는 중복 저장하지 않는다.
	 * HashSet은 객체를 저장하기 전에 먼저 객체의 hashCode() 메소드를 호출해서 해시코드를 얻어내고 저장되어 있는 객체들의 해시코드와 비교한다. 
	 * 만약 같은 해시코드가 있다면 다시 equals() 메소드로 두 객체를 비교해서 true가 나오면 동일한 객체로 판단하고 중복 저장하지 않는다.
	 * 가장빠른 임의 접근 속도를 가진다
	 * 비선형 구조이기에 순서가 없으며 인덱스도 존재하지 않는다. 
	 * 그렇기에 값을 추가 및 삭제 시 추가 혹은 삭제하고자 하는 값이 Set 내부에 있는지 검색 한 뒤 추가나 삭제를 하기 때문에 속도가 List구조에 비해 느림.
	 */

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();

        set.add("JAVA");
        set.add("자바");
        set.add("JAVA");
        set.add("개발에만 집중");
        set.add("JAVA는 객체지향언어입니다.");

        int size = set.size();
        System.out.println("총 객체수 : " + size);

        Iterator<String> iterator = set.iterator();// Iterator 사용 
        while(iterator.hasNext()) { //값이 있으면 true 없으면 false
            String str = iterator.next(); //하나의 객체를 가져올 때 next() 메소드를 사용
            System.out.println(str);
        }

        set.remove("JAVA"); 

        size = set.size();
        System.out.println("제거 후 총 객체수 : " + size);

        set.clear(); //모든 값 제거

        if(set.isEmpty()) {
            System.out.println("비었습니다.");
        }
	
	}

}
