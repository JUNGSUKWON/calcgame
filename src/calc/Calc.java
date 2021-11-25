package calc;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import dto.MunjeDto;
import dto.NumDto;
import dto.OpDto;

public class Calc {
	
	//����ڰ� ���� ������ ��
	private int n;
	MunjeDto mDto = new MunjeDto();

	Random rd = new Random();

	
	//������ ����ڰ� �Է��� ��ŭ ������ �����
	public void inputN() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ������ ���� �ұ��?");
		System.out.println("�Է�(���ڸ�): ");
		n=sc.nextInt();
	}
	
	//������ �����
	public ArrayList<MunjeDto> makeMunje() {
		
		ArrayList<MunjeDto> mList = new ArrayList<MunjeDto>();
		System.out.println("�������� ����");
		for(int i=0;i<n;i++) {
			MunjeDto dto = new MunjeDto();//dto�� �ν��Ͻ�

			//���࿡ -,/ ���ö� ù��° ���� �ι�° ���� �ٲ�� �Ǵµ�...
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
//				System.out.println("�ٲ���� num1="+dto.getNum1()+"num2="+dto.getNum2());
				int tmp=dto.getNum2();
				dto.setNum2(dto.getNum1());
				dto.setNum1(tmp);
//				System.out.println("�ٲٸ� num1="+dto.getNum1()+"num2="+dto.getNum2());
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
	
	//������� �Է� �޼ҵ�
	public void inputNumber(MunjeDto dto) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��� �ּ���: ");
		
		try {
			dto.setUserNumber(sc.nextInt());//������ ���� �Է¹޴´�
		}catch (Exception e) {
			System.out.println("���ڸ� �Է��ϼž� �մϴ�!");
			inputNumber(dto);
		}
	}

	static int ok =0;//���� ����
	//�� üũ �޼ҵ�
	public void answerCheck(MunjeDto dto) {
		if(dto.getDab()==dto.getUserNumber()) {
			System.out.println("�´�");
			ok++;
		}
		else {
			System.out.println("Ʋ�ȴ�");
		}
	}
	
	public void count() {
		System.out.println(ok+"���� �����̽��ϴ�! ���ϵ帳�ϴ�.");
		
	}


//	NumDto nDto  = new NumDto();
//	OpDto oDto = new OpDto();
//
//	//���� ��� �޼ҵ�
//	//�������� �������
//
//	private int answer;//������ ���� ������������ ��
	
//	public void problem (){
//
//		nDto.setNum1(rd.nextInt(99)+1);
//		nDto.setNum2(rd.nextInt(99)+1);
//
//		oDto.setOp(randomOp());//�������� ��Ģ���� ���Ѵ�.
//
//		if(checkProblem(nDto.getNum1(),nDto.getNum2(),oDto.getOp())){//������ �������϶� üũ����
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

//	private String randomOp() {//�������� ��Ģ���� ����°�
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
//		//���Ǽ��� ���Ǽ����� Ŭ��� �ٽ� ���� �������ߵ�
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
//		//���ϰ�
//		boolean isCheck = false;
//		//������ �� üũ(ù��° ���� �ι�° ������ Ŀ��)
//		if(op.equals("-")) {
//			if(a<b) {
//				problem();
//
//			}else {
//				isCheck=true;
//			}
//		}
//		//������ �Ҷ�(ù��° ���� �ι�° ������ Ŀ���Ѵ�.������ ���ڰ� 0�� �ƴϾ�� �Ѵ�)
//		else if(op.equals("/")) {
//			if(a<b) {//�ι�°���ڰ� 0�϶� �� Ŭ��������.
//				problem();//�ٽõ��ư���
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


	//��� ��� �޼ҵ�






}
