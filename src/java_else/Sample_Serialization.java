package java_else;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Scanner;

/*
 * 직렬화는 생성한 클래스를 Serializable 인터페이스를 구현하는 클래스로 만듬으로써 가능하다. 
 * Serializable 인터페이스는 메소드도 필드도 없는 마킹역할을 하는 인터페이스이다.
 */
class Article implements Serializable{	
	
	/*
	 * 이클립스에서 Adds a generated serial version ID 기능을 이용하면 자동으로 시리얼 아이디를 생성해준다.
	 * Java 직렬화 대상 객체는 동일한 serialVersionUID를 가지고 있어야 한다.
	 * serialVersionUID를 선언하지 않으면, 내부적으로 클래스의 구조 정보를 이용하여 자동으로 생성된 해시 값이 할당된다.
	 * 이 때문에 클래스의 멤버 변수가 추가되거나 삭제되면 serialVersionUID가 달라진다.
	 */
	private static final long serialVersionUID = -83252522547L;
	
	public int seq;
	public String writer, message;
	
	public Article(int seq, String writer, String message) {
		super();
		this.seq = seq;
		this.writer = writer;
		this.message = message;
	}

	@Override
	public String toString() {
		return seq + "\t" + writer + "\t" + message;
	}		
}

public class Sample_Serialization {
	/*
	 * 직렬화는 메모리를 디스크에 저장하거나, 네트워크 통신에 사용하기 위한 형식으로 변환하는 것
	 * 값 형식의 데이터는 스택에 메모리가 쌓이고 참조 형식의 데이터는 힙에 메모리가 쌓이며 스택에서는 이 힙 메모리를 참조하는(주소값) 구조이다.
	 * 값 형식의 데이터만 디스크에 저장하거나 통신이 가능하며 참조 형식 데이터는 불가하다.
	 * 이유는 프로그램 종료 시 할당된 메모리가 해제되고 없어지며, 네트워크 통신 시 각 PC마다 사용하는 메모리 공간 주소도 전혀 다르기 때문이다.
	 * 즉, 직렬화는 각 주소값이 가지는 데이터를 값 형식의 데이터로 변환해주며, 언어에 따라 텍스트 또는 바이너리 등의 형태로 변환되어 저장하거나 통신 시 파싱이 가능한 유의미한 데이터가 되는 것
	 */
	static List<Article> list = new ArrayList<>();
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {	
		
		// 직렬화 입력받기: 파일로부터 직렬화된 내용을 읽어 객체로 변환시킨 뒤
		// 메모리에 적재시킨다.
		try {
			readFromFile();
		} catch(FileNotFoundException e) {}		
		
		Scanner s = new Scanner(System.in);
		while(true) {
			prompt(s);
		}
	}

	private static void prompt(Scanner s) throws FileNotFoundException, IOException {	
		
		displayBoard();

		System.out.print(">> ");
		String command = s.nextLine();
		if(command.equalsIgnoreCase("w") || command.equalsIgnoreCase("write")) {
			write(s);
		} else if (command.equalsIgnoreCase("x") || command.equalsIgnoreCase("exit")) {
			System.exit(0);
		}

	}

	private static void write(Scanner s) throws FileNotFoundException, IOException {
		System.out.print("작성자 이름: ");
		String writer = s.nextLine();
		
		System.out.print("글 내용: ");
		String message = s.nextLine();
		
		int seq = 0;
		if(list.size() != 0) {
			seq = list.get(list.size() - 1).seq + 1;
		}
		
		list.add(new Article(seq, writer, message));
		System.out.println();
		
		// 직렬화 출력하기: 글이 작성되었으면 메모리의 객체를 직렬화한 뒤
		// 물리적인 파일로 하드디스크에 저장한다.
		saveToFile();

	}
	
	private static void displayBoard() {
		System.out.println("순서\t글쓴이\t메시지");
		System.out.println("-----------------------");
		
		if(list.size() == 0) {
			System.out.println("[아직 글이 없습니다.]");
		}
		
		list.forEach((x) -> {
			System.out.println(x);
		});
	}
	
	private static void saveToFile() throws FileNotFoundException, IOException {
		// 파일 출력 스트림 객체를 만든 후, 이름을 "board.ser"라고 지정하고 
		// fos를 바탕으로 오브젝트 출력 스트림을 생성한 뒤 writeObject 한다. 
		try(FileOutputStream fos = new FileOutputStream("board.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(list);
		}				
	}
	
	@SuppressWarnings("unchecked")
	private static void readFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {
		// 파일 입력 스트림 객체를 만든 후, 이름을 "board.ser"라고 지정하면 이 파일로부터 읽겠다는 뜻이며 
		// fis를 바탕으로 오브젝트 입력 스트림을 생성한 뒤 readObject 한다.
		// 오브젝트 형태로 읽으면 안에 있는 내용이 무슨 타입인지 정확히 알기 어려우므로 타입 캐스팅 해준다.
		try(FileInputStream fis = new FileInputStream("board.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			list = (List<Article>) ois.readObject();
		}
	}
}
