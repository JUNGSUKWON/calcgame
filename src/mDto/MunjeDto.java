package mDto;

public class MunjeDto {
	//������ ���鶧 �ʿ��� ������
	//��
	private int num1;
	//������
	private String op;
	//��
	private int num2;
	//��
	private int dab;
	private int userNumber;
	private int okCount;//���� Ƚ��
	
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
	//getter setter �ʿ�(Shit + Alt + S)������ �ڵ����� ����
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
	
	
	//�������̵�
	
	public String toString() {
		return num1+" "+op+" "+num2+" = ?";
		
	}
	
	
}
