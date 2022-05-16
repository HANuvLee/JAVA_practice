package objectOriented;
/*
 * ĸ��ȭ => ���������� ������ �����Ϳ� �Լ��� �ϳ��� Ŭ������ �ִ°�
 * ����: �ڵ� ����ȭ , �Լ� �� �޼ҵ尡 �μ��� ���� �ʿ䰡 ��������(thisŰ���带 ����Ͽ� �����Ϳ� ���� ������) , ���������ڸ� Ȱ���� ���б��
 * ĸ��ȭ�� ��� Ŭ���� ������ ���� �Ǵ� �������� ���������� ����! (EX.FullName�� �����ϴ� �޼ҵ�)
 * 
 */
class SoccerPlayer{
	private String firtsName;
	private String lastName;
	private String team;
	private int shares;
	
	//������
	public SoccerPlayer(String firstName, String lastName, String team, int shares) {
		this.firtsName = firstName;
		this.lastName = lastName;
		this.team = team;
		this.shares = shares;
	}
	

	//���ڻ��� ���ϴ� �޼ҵ� , �ܺο��� ���� ����
	public int calculateNetWorth(){
		return this.shares * getSharesPrice(this.team);
	}

	//ȸ�翡 ���� ���ڻ� ����, �ܺο��� ���� �Ұ�
	private int getSharesPrice(String team) {
		if(this.team.equals("Tottenham")) {
			return this.shares * 2; 
		}else if(this.team.equals("PSG")){
			return this.shares * 5;
		}else{
			return 0;
		}
	}
	//FullName�� �������ִ� �Լ�
	public String getName() {
		return this.firtsName + this.lastName;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		SoccerPlayer son = new SoccerPlayer("Son", "HeungMin", "Tottenham",  5000);
		SoccerPlayer messi = new SoccerPlayer("Lionel", "Messi", "PSG", 8500);
		
		System.out.println(son.getName());
		System.out.println(son.calculateNetWorth());
		System.out.println(messi.getName());
		System.out.println(messi.calculateNetWorth());

	}

}
