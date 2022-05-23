package java_else;
/*
 * 자바 상수 풀
 * String Constant Pool 영역은 힙 영역 내부에서 String객체를 위해 별도로 관리하는 저장소이다.
 */

public class Sample_String_Constant_Pool {
	
	
	/*
	 * new 연사자가 아닌 리터럴("")로 String 객체를 생성하게 되면 JVM은 우선 String Constant Pool 영역을 방문한다.
	 * 거기서 같은 값을 가진 String객체를 찾으면 그 객체의 주소 값을 반환하여 참조하게 된다.
	 * 찾지 못한다면 String Constant Pool에 해당 값을 가진 String객체를 생성하고 그 주소값을 반환하게 된다.
	 * 이 행위를 수행하는 메소드도 존재하며 String의 intern()메소드이다.
	 */
	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");
		String s3 = "Java";
		String s4 = "Java";
		String s5 = new String("Java").intern();
		
		/*
		 * new 연산자로 String객체 생성시에 JVM에서 힙 영역에 String객체를 생성
		 * 따라서 s1을 힙 메모리에 생성, s2를 또 힙 메모리에 생성하여 이 둘은 다른 객체가 된다.
		 */
		if(s1 == s2) {
			System.out.println("s1과 s2가 같다.");
		}else {
			System.out.println("s1과 s2가 같지 않다.");
		}
		
		/*
		 * == 은 주소 값을 비교한다.
		 * equals는 주소안에 들어있는 값을 비교한다.
		 */
		if(s1 == s3) {
			System.out.println("s1과 s3가 같다.");
		}else {
			System.out.println("s1과 s3가 같지 않다."); 
		}
		
		if(s1.equals(s3)) {
			System.out.println("equals메소드: s1과 s3가 같다.");
		}else {
			System.out.println("equals메소드: s1과 s3가 같지 않다.");
		}
		
		
		if(s3 == s4) {
			System.out.println("리터럴 String 객체: s3와 s4가 같다.");
		}else {
			System.out.println("리터럴 String 객체: s3와 s4가 같지 않다.");
		}
		
		/*
		 * intern메소다가 적용된 s5
		 */
		if(s3 == s5) {
			System.out.println("intern메소드: s3과 s5가 같다.");
		}else {
			System.out.println("intern메소드: s3과 s5가 같지 않다."); 
		}
		
	}

}
