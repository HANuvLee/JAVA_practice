package dataType;
/*
 *  배열은 자료형의 집합이다.
 *  특징
 *   -배열의 길이는 고정되어 있다!
 */
		
public class Sample_Array {

	public static void main(String[] args) {
		//1~10까지의 숫자 중 홀수들의 집합
		int[] odds = {1,3,5,7,9};
		//요일의 집합
		String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
		
		
		/* 배열의 특징  1.배열의 길이는 고정*/
//		String[] Avengers = new String[];  길이에 대한 숫자값이 없으므로 컴파일 오류가 발생한다.
		String[] Avengers = new String[4]; //배열의 길이는 고정되어 있다.
		Avengers[0] = "Thor";
		Avengers[1] = "Ironman";
		Avengers[2] = "Hulk";
		Avengers[3] = "Spiderman";
		System.out.println("======================배열값 접근======================");
		/* 배열의 특징  2.배열값에 접근하는 방법*/
		System.out.println(Avengers[2]); //인덱싱을 이용한다. Avenger[2]는 배열의 3번째 항목을 의미
		
		
		System.out.println("======================배열의 길이======================");
		/* 배열의 특징  3.배열의 길이*/
		for(int i=0; i <Avengers.length; i++) { //배열의 길이는 .length를 이용하여 구할 수 있다.
			System.out.println(Avengers[i]);
		}
		
		

	}

}
