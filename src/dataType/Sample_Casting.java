package dataType;
/*
 * casting(형변환)과 final
 * 
 */
public class Sample_Casting {

	public static void main(String[] args) {
		/* 자료형은 문자열이지만 그 내용은 숫자로 이루어진 값이다. 
		 * 이럴 경우에 문자열을 정수(integer)로 바꿀수 있다. 
		 * 문자열을 정수로 바꾸려면 다음과 같이 Integer 클래스를 사용한다. Integer는 int자료형의 Wrapper클래스이다.
		 */
		String age = "23";
		int Age = Integer.parseInt(age);
		System.out.println(Age);
		
		/*
		 * 정수를 문자열로 바꾸는 가장 쉬운 방법은 정수 앞에 빈문자열("")을 더해 주는 것.
		 */
		int weight = 84;
		String Weight = "" + weight;
		System.out.println(Weight);
		//다른 방식의 정수를 문자열로 캐스팅
		int height = 174;
		String height1 = String.valueOf(height);
		String height2 = Integer.toString(height);
		
		/*
		 * 소숫점 포함 숫자형태의 문자열을 실수형으로 캐스팅
		 * 소숫점이 포함되어 있는 숫자형태의 문자열은 Double.parseDouble 또는 Float.parseFloat를 사용하여 형변환
		 */
		 String num = "123.456";
	     double d = Double.parseDouble(num);
	     System.out.println(d);
	     
	     /*
	      * 정수와 실수 사이의 형변환
	      */
	     int n1 = 123;
	     double d1 = n1;// 정수를 실수로 바꿀때에는 캐스팅이 필요없다.
	     System.out.println(d1);  // 123.0 출력

	     double d2 = 123.456;
	     int n2 = (int) d2; // 실수를 정수로 바꿀때에는 반드시 정수형으로 캐스팅해 주어야 한다.
	     System.out.println(n2);  // 소숫점이 생략된 123 출력, 실수를 정수로 변환하면 실수의 소숫점은 제거
	}

}
