package mDto;
/*
 * 
 * 수 데이터 클래스
 */

import java.util.Random;

//dto는 데이터를 관리하는 클래스
public class NumDto {
	private int num1;//무작위로 숫자가 정해짐
	private int num2;
	private int userNumber;//유저가 입력받을 변수
	private int result;//정답
	
	public int getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}
	
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	//	private int result;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}

	//메소드
	//값을 세팅


}
