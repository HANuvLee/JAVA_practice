package java_else;

/*
 * String객체는 한번 할당된 공간이 변하지 않지만 StringBuffer 또는 StringBuilder는 객체공간이 부족할 시 크기를 늘린다.
 * StringBuffer는 멀티 스레드 상태에서 동기화를 지원한다. StringBuilder 단이 스레드 환경에서 사용한다.
 * 속도 : StringBuilder > StringBuffer / 안정 : StringBuffer > StringBuilder
 * 주로 문자열 변경을 하는 작업에서 사용 
 * String 객체는 문자열을 추가 작업 시 객체내부의 데이터를 수정 할 수 없어 문자열이 추가된 새로운 객체를 생성한다.
 * 기존의 데이터는 가비지 컬렉션에 의해 메모리가 해제되기를 기다린다.
 * 이와 다르게 빌더와 버퍼 두 클래스는 내부 버퍼에 문자열을 저장하고 그 안에서 추가,수정,삭제가 가능하도록 설계되어 있다.
 * 문자열 연산이 많을 경우에는 String클래스를 사용하면 되고 연산이 많다면 StringBuffer나 StringBuilder를 사용하면된다.
 */

public class Sample_StringBuffer {

	public static void main(String[] args) {
		String s = "ABCDEFU";
		StringBuffer sb = new StringBuffer(s); //string -> stringBuffer로 변환
		
		System.out.println("처음상태 : " + sb); //처음상태 -> ABCDEFU
		System.out.println("문자열 String 변환 : " + sb.toString()); //String 변환하기
		System.out.println("문자열 추출 : " + sb.substring(2,4)); //문자열 추출하기
        System.out.println("문자열 추가 : " + sb.insert(2,"추가")); //문자열 추가하기
        System.out.println("문자열 삭제 : " + sb.delete(2,4)); //문자열 삭제하기
        System.out.println("문자열 연결 : " + sb.append(" and your mom and your sister and your job")); //문자열 붙이기
        System.out.println("문자열의 길이 : " + sb.length()); //문자열의 길이구하기
        System.out.println("용량의 크기 : " + sb.capacity()); //용량의 크기 구하기
        System.out.println("문자열 역순 변경 : " + sb.reverse()); //문자열 뒤집기
        System.out.println("마지막 상태 : " + sb); //마지막 상태 : boj ruoy dna retsis ruoy dna mom ruoy dnaUFEDCBA
	}

}
