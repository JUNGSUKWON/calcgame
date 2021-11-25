package mDto;

public class MunjeDto {
	//문제를 만들때 필요한 데이터
	//수
	private int num1;
	//연산자
	private String op;
	//수
	private int num2;
	//답
	private int dab;
	private int userNumber;
	private int okCount;//맞힌 횟수
	
	public int getOkCount() {
		return okCount;
	}
	public void setOkCount(int okCount) {
		this.okCount = okCount;
	}
	public int getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}
	//getter setter 필요(Shit + Alt + S)눌러서 자동으로 생성
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getDab() {
		return dab;
	}
	public void setDab(int dab) {
		this.dab = dab;
	}
	
	
	//오버라이딩
	
	public String toString() {
		return num1+" "+op+" "+num2+" = ?";
		
	}
	
	
}
