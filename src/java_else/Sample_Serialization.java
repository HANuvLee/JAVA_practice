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
 * ����ȭ�� ������ Ŭ������ Serializable �������̽��� �����ϴ� Ŭ������ �������ν� �����ϴ�. 
 * Serializable �������̽��� �޼ҵ嵵 �ʵ嵵 ���� ��ŷ������ �ϴ� �������̽��̴�.
 */
class Article implements Serializable{	
	
	/*
	 * ��Ŭ�������� Adds a generated serial version ID ����� �̿��ϸ� �ڵ����� �ø��� ���̵� �������ش�.
	 * Java ����ȭ ��� ��ü�� ������ serialVersionUID�� ������ �־�� �Ѵ�.
	 * serialVersionUID�� �������� ������, ���������� Ŭ������ ���� ������ �̿��Ͽ� �ڵ����� ������ �ؽ� ���� �Ҵ�ȴ�.
	 * �� ������ Ŭ������ ��� ������ �߰��ǰų� �����Ǹ� serialVersionUID�� �޶�����.
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
	 * ����ȭ�� �޸𸮸� ��ũ�� �����ϰų�, ��Ʈ��ũ ��ſ� ����ϱ� ���� �������� ��ȯ�ϴ� ��
	 * �� ������ �����ʹ� ���ÿ� �޸𸮰� ���̰� ���� ������ �����ʹ� ���� �޸𸮰� ���̸� ���ÿ����� �� �� �޸𸮸� �����ϴ�(�ּҰ�) �����̴�.
	 * �� ������ �����͸� ��ũ�� �����ϰų� ����� �����ϸ� ���� ���� �����ʹ� �Ұ��ϴ�.
	 * ������ ���α׷� ���� �� �Ҵ�� �޸𸮰� �����ǰ� ��������, ��Ʈ��ũ ��� �� �� PC���� ����ϴ� �޸� ���� �ּҵ� ���� �ٸ��� �����̴�.
	 * ��, ����ȭ�� �� �ּҰ��� ������ �����͸� �� ������ �����ͷ� ��ȯ���ָ�, �� ���� �ؽ�Ʈ �Ǵ� ���̳ʸ� ���� ���·� ��ȯ�Ǿ� �����ϰų� ��� �� �Ľ��� ������ ���ǹ��� �����Ͱ� �Ǵ� ��
	 */
	static List<Article> list = new ArrayList<>();
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {	
		
		// ����ȭ �Է¹ޱ�: ���Ϸκ��� ����ȭ�� ������ �о� ��ü�� ��ȯ��Ų ��
		// �޸𸮿� �����Ų��.
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
		System.out.print("�ۼ��� �̸�: ");
		String writer = s.nextLine();
		
		System.out.print("�� ����: ");
		String message = s.nextLine();
		
		int seq = 0;
		if(list.size() != 0) {
			seq = list.get(list.size() - 1).seq + 1;
		}
		
		list.add(new Article(seq, writer, message));
		System.out.println();
		
		// ����ȭ ����ϱ�: ���� �ۼ��Ǿ����� �޸��� ��ü�� ����ȭ�� ��
		// �������� ���Ϸ� �ϵ��ũ�� �����Ѵ�.
		saveToFile();

	}
	
	private static void displayBoard() {
		System.out.println("����\t�۾���\t�޽���");
		System.out.println("-----------------------");
		
		if(list.size() == 0) {
			System.out.println("[���� ���� �����ϴ�.]");
		}
		
		list.forEach((x) -> {
			System.out.println(x);
		});
	}
	
	private static void saveToFile() throws FileNotFoundException, IOException {
		// ���� ��� ��Ʈ�� ��ü�� ���� ��, �̸��� "board.ser"��� �����ϰ� 
		// fos�� �������� ������Ʈ ��� ��Ʈ���� ������ �� writeObject �Ѵ�. 
		try(FileOutputStream fos = new FileOutputStream("board.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(list);
		}				
	}
	
	@SuppressWarnings("unchecked")
	private static void readFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {
		// ���� �Է� ��Ʈ�� ��ü�� ���� ��, �̸��� "board.ser"��� �����ϸ� �� ���Ϸκ��� �аڴٴ� ���̸� 
		// fis�� �������� ������Ʈ �Է� ��Ʈ���� ������ �� readObject �Ѵ�.
		// ������Ʈ ���·� ������ �ȿ� �ִ� ������ ���� Ÿ������ ��Ȯ�� �˱� �����Ƿ� Ÿ�� ĳ���� ���ش�.
		try(FileInputStream fis = new FileInputStream("board.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			list = (List<Article>) ois.readObject();
		}
	}
}
