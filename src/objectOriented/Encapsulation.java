package objectOriented;
/*
 * 캡슐화 => 개념적으로 연관된 데이터와 함수를 하나의 클래스에 넣는것
 * 장점: 코드 구조화 , 함수 및 메소드가 인수를 취할 필요가 없어진다(this키워드를 사용하여 데이터에 직접 엑세스) , 접근제한자를 활용한 은닉기능
 * 캡슐화는 어떻게 클래스 정보에 접근 또는 수정할지 결정권한을 제공! (EX.FullName을 제공하는 메소드)
 * 
 */
class SoccerPlayer{
	private String firtsName;
	private String lastName;
	private String team;
	private int shares;
	
	//생성자
	public SoccerPlayer(String firstName, String lastName, String team, int shares) {
		this.firtsName = firstName;
		this.lastName = lastName;
		this.team = team;
		this.shares = shares;
	}
	

	//총자산을 구하는 메소드 , 외부에서 접근 가능
	public int calculateNetWorth(){
		return this.shares * getSharesPrice(this.team);
	}

	//회사에 따른 총자산 연산, 외부에서 접근 불가
	private int getSharesPrice(String team) {
		if(this.team.equals("Tottenham")) {
			return this.shares * 2; 
		}else if(this.team.equals("PSG")){
			return this.shares * 5;
		}else{
			return 0;
		}
	}
	//FullName을 제공해주는 함수
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
