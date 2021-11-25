package calcgame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import calc.Calc;
import dto.MunjeDto;

public class MainClass {

	public static void main(String[] args) {

		//연산 게임
		System.out.println("연산 게임 시작");
		Calc cc = new Calc();
		
		//문제 생성(사용자가 지정한 수만큼)
		cc.inputN();
		
		//사용자가 생성한 문제 수를 입력
		ArrayList<MunjeDto>mList=cc.makeMunje();
		
		for(MunjeDto dto:mList) {
			System.out.println(dto.toString());
			cc.inputNumber(dto);//답을 넣는다.
			cc.answerCheck(dto);
			
		}
		cc.count();//문제를 몇개 맞혔는지 출력
		//랜덤으로 연산자를 만드는 기능

		//입력한 만큼 문제 생성 n = 10;


//		for(MunjeDto dto:mList) {
//			System.out.println(dto.toString());
//		}

		//생성된 문제들을 쭉 나열해보자

		//Calc cc = new Calc();



		//문제가 출력
		//		cc.problem();
		//		System.out.print("1 + 1= ");

		//		//사용자가 문제를 보고 답 입력
		//		cc.inputNumber();
		//		System.out.println("2");


		//		//맞는지 틀린지 체크
		//		//맞으면 맞다 틀리면 틀렸다
		//		System.out.println("맞다");


	}
}
