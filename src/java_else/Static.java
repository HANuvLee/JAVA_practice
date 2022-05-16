package java_else;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 정적변수 = 클래스변수 = Static변수
 * 항상 값이 변하지 않는 경우라면 static 사용시 메모리의 이점을 얻을 수 있다.
 * static을 사용하는 또 한가지 이유로 공유 개념이 있다. 
 * static으로 설정하면 같은 곳의 메모리 주소만을 바라보기 때문에 static 변수의 값을 공유하게 된다.
 */
class Counter{
//	int count = 0; //객체 생성시 객체변수의 count값으 증가시켜도 c1과 c2객체는 서로 다른 메모리를 가리키고 있어 카운트가 증가되지 않는다(객체변수는 항상 독립적인 값을 갖는다).
	static int count = 0; //변수에 static 키워드를 붙이면 자바는 메모리 할당을 딱 한번만 하게 되어 메모리 사용에 이점. static키워드로 인해 count값이 공유되어 카운트가 증가!!!
	
	Counter() {
		count++; //count는 더이상 객체변수가 아님으로 this.을 제거
		System.out.println(count);//this.제거
	}
	
	// 스태틱 메소드 안에서는 객체변수 접근이 불가능 하다. 위 예에서는 count 변수가 static 변수이기 때문에 스태틱 메소드(static method)에서 접근이 가능한것.
	public static int getCount() { //getCount() 라는 static 메소드가 추가
		return count;
	}
}

//보통 static 메소드는 유틸리티성 메소드를 작성할 시 많이 사용
class Util{
	public static String getCurrentDate(String fmt) {
		SimpleDateFormat sdf = new SimpleDateFormat(fmt);
		return sdf.format(new Date());
	}
}

public class Static {

	public static void main(String[] args) {
		Counter c1 = new Counter(); //객체마다 메모리 별도 생성
		Counter c2 = new Counter(); //객체마다 메모리 별도 생성
		System.out.println(Counter.getCount()); //메소드 앞에 static 키워드를 붙이면 Counter.getCount() 와 같이 객체 생성없이 클래스를 통해 메서드를 직접 호출가능
		System.out.println(Util.getCurrentDate("yyyyMMdd")); //유틸메소드 오늘 날짜 출력
	}

}
