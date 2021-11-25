package calc;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import dto.MunjeDto;
import dto.NumDto;
import dto.OpDto;

public class Calc {
	
	//사용자가 만들어낼 문제의 수
	private int n;
	MunjeDto mDto = new MunjeDto();

	Random rd = new Random();

	
	//문제를 사용자가 입력한 만큼 나오게 만들기
	public void inputN() {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 문제를 생성 할까요?");
		System.out.println("입력(숫자만): ");
		n=sc.nextInt();
	}
	
	//문제를 만들기
	public ArrayList<MunjeDto> makeMunje() {
		
		ArrayList<MunjeDto> mList = new ArrayList<MunjeDto>();
		System.out.println("문제들을 저장");
		for(int i=0;i<n;i++) {
			MunjeDto dto = new MunjeDto();//dto는 인스턴스

			//만약에 -,/ 나올때 첫번째 수와 두번째 수를 바꿔야 되는데...
			dto.setNum1(rd.nextInt(100)+1);
			dto.setOp(getRandOper());
			dto.setNum2(rd.nextInt(100)+1);
			
			mySwap(dto);
			if(dto.getOp().equals("+")) {
				dto.setDab(dto.getNum1()+dto.getNum2());
			}else if(dto.getOp().equals("-")) {
				dto.setDab(dto.getNum1()-dto.getNum2());
			}else if(dto.getOp().equals("*")) {
				dto.setDab(dto.getNum1()*dto.getNum2());
			}else if(dto.getOp().equals("/")) {
				dto.setDab(dto.getNum1()/dto.getNum2());
			}
			mList.add(dto);
		}
		return mList;
	}

	private void mySwap(MunjeDto dto) {
		if(dto.getOp().equals("-")||dto.getOp().equals("/")) {
			if(dto.getNum1()<dto.getNum2()) {
//				System.out.println("바뀌기전 num1="+dto.getNum1()+"num2="+dto.getNum2());
				int tmp=dto.getNum2();
				dto.setNum2(dto.getNum1());
				dto.setNum1(tmp);
//				System.out.println("바꾸면 num1="+dto.getNum1()+"num2="+dto.getNum2());
			}
		}
	}

	public String getRandOper() {
		Random rd = new Random();
		ArrayList<String> opList = new ArrayList<String>();
		opList.add("+");
		opList.add("-");
		opList.add("*");
		opList.add("/");
	
		return opList.get(rd.nextInt(opList.size()));
	}
	
	//사용자의 입력 메소드
	public void inputNumber(MunjeDto dto) {
		Scanner sc = new Scanner(System.in);
		System.out.print("답을 입력해 주세요: ");
		
		try {
			dto.setUserNumber(sc.nextInt());//유저의 답을 입력받는다
		}catch (Exception e) {
			System.out.println("숫자만 입력하셔야 합니다!");
			inputNumber(dto);
		}
	}

	static int ok =0;//맞힌 갯수
	//답 체크 메소드
	public void answerCheck(MunjeDto dto) {
		if(dto.getDab()==dto.getUserNumber()) {
			System.out.println("맞다");
			ok++;
		}
		else {
			System.out.println("틀렸다");
		}
	}
	
	public void count() {
		System.out.println(ok+"개를 맞히셨습니다! 축하드립니다.");
		
	}


//	NumDto nDto  = new NumDto();
//	OpDto oDto = new OpDto();
//
//	//문제 출력 메소드
//	//무작위로 문제출력
//
//	private int answer;//연산을 실제 수행했을때의 값
	
//	public void problem (){
//
//		nDto.setNum1(rd.nextInt(99)+1);
//		nDto.setNum2(rd.nextInt(99)+1);
//
//		oDto.setOp(randomOp());//무작위로 사칙연산 정한다.
//
//		if(checkProblem(nDto.getNum1(),nDto.getNum2(),oDto.getOp())){//뺄셈과 나눗셈일때 체크과정
//			if(oDto.getOp().equals("+")) {
//				plus(nDto.getNum1(),nDto.getNum2());
//			}else if(oDto.getOp().equals("-")) {
//				minus(nDto.getNum1(),nDto.getNum2());
//			}else if(oDto.getOp().equals("*")) {
//				mul(nDto.getNum1(),nDto.getNum2());
//			}else if(oDto.getOp().equals("/")) {
//				div(nDto.getNum1(),nDto.getNum2());
//			}
//		}
//	}

//	private String randomOp() {//무작위의 사칙연산 만드는것
//		String opArr []= {"+","-","*","/"};
//		int opNum = rd.nextInt(4);
//
//		String randomOp=opArr[opNum];
//		return randomOp;
//	}
//
//	public void plus(int a,int b) {
//		System.out.println(a+" + "+b);
//		nDto.setResult(a+b);
//	}
//	public void minus(int a,int b) {
//		//뒤의수가 앞의수보다 클경우 다시 문제 내러가야됨
//		System.out.println(a+" - "+b);
//		nDto.setResult(a-b);
//	}
//	public void mul(int a,int b) {
//		System.out.println(a+" * "+b);
//		nDto.setResult(a*b);
//	}
//	public void div(int a,int b) {
//		System.out.println(a+" / "+b);
//		nDto.setResult(a/b);
//	}

//	public boolean checkProblem(int a,int b,String op) {
//		//리턴값
//		boolean isCheck = false;
//		//빼기할 때 체크(첫번째 수가 두번째 수보다 커야)
//		if(op.equals("-")) {
//			if(a<b) {
//				problem();
//
//			}else {
//				isCheck=true;
//			}
//		}
//		//나누기 할때(첫번째 수가 두번째 수보다 커야한다.나누는 숫자가 0이 아니어야 한다)
//		else if(op.equals("/")) {
//			if(a<b) {//두번째숫자가 0일때 더 클수가없다.
//				problem();//다시돌아간다
//			}else if(b==0) {
//				problem();
//			}else {
//				isCheck=true;
//			}
//		}else {
//			isCheck = true;
//		}
//		return isCheck;
//	}


	//결과 출력 메소드






}
