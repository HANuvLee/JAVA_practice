package javacollectionFrameWork;

import java.util.List;
import java.util.Vector;

/*
 * List컬렉션은 객체를 일렬로 늘어놓은 구조, 인덱스로 관리하기 때문에 객체 추가시 자동 인덱스가 부여된다.
 * 인덱스는 객체를 검색, 삭제 시 사용한다.
 * List컬렉션은 객체를 저장하는 것이 아닌 객체의번지를 참조한다.
 * 동일한 객체를 저장할 수 있으며 이 경우에는 동일한 객체의 번지를 참조, null도 저장가능, 중복적인 값도 저장 가능
 */

class Blog{
	String subject;
	String content;
	String writer;
	
	public Blog(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
}

public class JCF_List_Vector {

	public static void main(String[] args) {
		/*
		 * Vector는 ArrayList와 동일한 내부 구조를 가지고 있다. 
		 * Vector 객체를 생성하기 위해서는 저장할 타입을 지정해야 한다. 
		 * ArrayList와 차이점은 Vector 클래스는 동기화된(synchronized) 메서드로 구성되어 있다. 
		 * 그렇기 때문에 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제할 수 있다. 즉, 스레드에 안전하다(Thread Safe)라고 말합니다. 
		 * 다만 동기화되어 있기 때문에 ArrayList 보다는 객체를 추가, 삭제하는 과정은 느릴수 밖에 없다. 
		 * 안전성을 추구하는데 있어서 속도를 포기한 트레이드 오프(trade off)이다.
		 */
		
		 List<Blog> list = new Vector<Blog>();

        list.add(new Blog("배열", "array", "개발에만 집중"));
        list.add(new Blog("리스트", "list", "개발에만 집중"));
        list.add(new Blog("연산자", "논리합", "개발에만 집중"));

        for(Blog blog : list) {
            System.out.println(blog.subject + ", " + blog.content + ", " + blog.writer);
        }
		

	}

}
