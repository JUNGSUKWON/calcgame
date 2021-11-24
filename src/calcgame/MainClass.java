package calcgame;

import java.util.Random;

import calc.Calc;

public class MainClass {

	public static void main(String[] args) {

		//연산 게임
		System.out.println("연산 게임 시작");
		Calc cc = new Calc();

	
			
		//문제가 출력
		cc.problem();
//		System.out.print("1 + 1= ");
		
//		//사용자가 문제를 보고 답 입력
		cc.inputNumber();
//		System.out.println("2");
		
		
//		//맞는지 틀린지 체크
//		//맞으면 맞다 틀리면 틀렸다
		cc.answerCheck();
//		System.out.println("맞다");
	

	}
}
