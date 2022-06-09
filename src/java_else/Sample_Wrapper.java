package java_else;

public class Sample_Wrapper {
	
	/*
	 * 래퍼 클래스의 주요 용도는 기본 타입의 값을 박싱 해서 포장 객체로 만드는 것이지만, 문자열을 기본 타입 값으로 변환할 때에도 사용한다. 
	 * 대부분의 래퍼 클래스에는 parse + 기본 타입명으로 되어있는 정적 메서드가 있다. 이 메서드는 문자열을 매개 값으로 받아 기본 타입 값으로 변환해준다.
	 * 래퍼 객체는 내부의 값을 비교하기 위해 == 연산자를 사용할 수 없다. 내부의 값을 비교하는 것이 아니라 래퍼 객체의 참조 주소를 비교하기 때문이다.
	 * 비교 대상인 래퍼는 객체이므로 서로의 참조 주소가 다르다. 객체끼리의 비교를 하려면 내부의 값만 얻어 비교해야 하기에 equals를 사용해야 한다. 
	 * 래퍼 클래스와 기본자료형과의 비교는 == 연산과 equals연산 모두 가능하다. 그 이유는 컴파일러가 자동으로 오토박싱과 언박싱을 해주기 때문이다.
	 */

	public static void main(String[] args) {
		//Integer num = new Integer(17); 박싱
		//int n = num.intValue(); 언박싱
		
		//Integer num = 17; 자동 박싱
	    //int n = num; 자동 언박싱
	
		
		/*
		 * 문자열을 기본 타입 값으로 변환	
		 */
		String str = "10";
		String str2 = "20";
		String str3 = "30";
		
		byte b = Byte.parseByte(str);
		int i = Integer.parseInt(str);
        short s = Short.parseShort(str);
        long l = Long.parseLong(str);
        float f = Float.parseFloat(str2);
        double d = Double.parseDouble(str2);
        boolean bool = Boolean.parseBoolean(str3);
        
        System.out.println("문자열 byte값 변환 : "+b);
        System.out.println("문자열 int값 변환 : "+i);
        System.out.println("문자열 short값 변환 : "+s);
        System.out.println("문자열 long값 변환 : "+l);
        System.out.println("문자열 float값 변환 : "+f);
        System.out.println("문자열 double값 변환 : "+d);
        System.out.println("문자열 boolean값 변환 : "+bool);
        
        /*
         * 값을 비교해보기
         */
        Integer num = new Integer(10); //래퍼 클래스1
        Integer num2 = new Integer(10); //래퍼 클래스2
        int n = 10; //기본타입
		 
        System.out.println("래퍼클래스 == 기본타입 : "+(num == n)); //true
        System.out.println("래퍼클래스.equals(기본타입) : "+num.equals(n)); //true
        System.out.println("래퍼클래스 == 래퍼클래스 : "+(num == num2)); //false
        System.out.println("래퍼클래스.equals(래퍼클래스) : "+num.equals(num2)); //true
		
	}

}
