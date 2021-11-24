package calc;

import java.util.Random;
import java.util.Scanner;

import dto.NumDto;
import dto.OpDto;

public class Calc {

	NumDto nDto  = new NumDto();
	OpDto oDto = new OpDto();

	//문제 출력 메소드
	//무작위로 문제출력
	Random rd = new Random();

	private int answer;//연산을 실제 수행했을때의 값
	public void problem (){

		nDto.setNum1(rd.nextInt(99)+1);
		nDto.setNum2(rd.nextInt(99)+1);

		int num1=nDto.getNum1();
		int num2=nDto.getNum2();


		oDto.setOp(randomOp());//무작위로 사칙연산 정한다.
		String op = oDto.getOp();//무작위로 선정된 사칙연산

		if(checkProblem(num1,num2,op)){//뺄셈과 나눗셈일때 체크과정
			if(op.equals("+")) {
				plus(num1,num2);
			}else if(op.equals("-")) {
				minus(num1,num2);
			}else if(op.equals("*")) {
				mul(num1,num2);
			}else if(op.equals("/")) {
				div(num1,num2);
			}
		}
	}

	private String randomOp() {//무작위의 사칙연산 만드는것
		String opArr []= {"+","-","*","/"};
		int opNum = rd.nextInt(4);

		String randomOp=opArr[opNum];
		return randomOp;
	}

	public void plus(int a,int b) {
		System.out.println(nDto.getNum1()+" + "+nDto.getNum2());
		nDto.setResult(nDto.getNum1()+nDto.getNum2());
	}
	public void minus(int a,int b) {
		//뒤의수가 앞의수보다 클경우 다시 문제 내러가야됨
		System.out.println(nDto.getNum1()+" - "+nDto.getNum2());
		nDto.setResult(nDto.getNum1()-nDto.getNum2());
	}
	public void mul(int a,int b) {
		System.out.println(nDto.getNum1()+" * "+nDto.getNum2());
		nDto.setResult(nDto.getNum1()*nDto.getNum2());
	}
	public void div(int a,int b) {
		System.out.println(nDto.getNum1()+" / "+nDto.getNum2());
		nDto.setResult(nDto.getNum1()/nDto.getNum2());
	}

	public boolean checkProblem(int a,int b,String op) {
		//리턴값
		boolean isCheck = false;
		//빼기할 때 체크(첫번째 수가 두번째 수보다 커야)
		if(op.equals("-")) {
			if(a<b) {
				problem();

			}else {
				isCheck=true;
			}
		}
		//나누기 할때(첫번째 수가 두번째 수보다 커야한다.나누는 숫자가 0이 아니어야 한다)
		else if(op.equals("/")) {
			if(a<b) {//두번째숫자가 0일때 더 클수가없다.
				problem();//다시돌아간다
			}else if(b==0) {
				problem();
			}else {
				isCheck=true;
			}
		}else {
			isCheck = true;
		}
		return isCheck;
	}

	//사용자의 입력 메소드
	public void inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("답을 입력해 주세요: ");
		
		try {
			nDto.setUserNumber(sc.nextInt());//유저의 답을 입력받는다
		}catch (Exception e) {
			System.out.println("숫자만 입력하셔야 합니다!");
			inputNumber();
		}
	}

	//답 체크 메소드
	public void answerCheck() {
		if(nDto.getUserNumber()==nDto.getResult()) {
			System.out.println("맞다");
		}
		else {
			System.out.println("틀렸다");
		}
	}
	//결과 출력 메소드






}
