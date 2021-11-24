package calc;

import java.util.Random;
import java.util.Scanner;

import dto.NumDto;
import dto.OpDto;

public class Calc {

	NumDto nDto  = new NumDto();
	OpDto oDto = new OpDto();

	//���� ��� �޼ҵ�
	//�������� �������
	Random rd = new Random();

	private int answer;//������ ���� ������������ ��
	public void problem (){

		nDto.setNum1(rd.nextInt(99)+1);
		nDto.setNum2(rd.nextInt(99)+1);

		int num1=nDto.getNum1();
		int num2=nDto.getNum2();


		oDto.setOp(randomOp());//�������� ��Ģ���� ���Ѵ�.
		String op = oDto.getOp();//�������� ������ ��Ģ����

		if(checkProblem(num1,num2,op)){//������ �������϶� üũ����
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

	private String randomOp() {//�������� ��Ģ���� ����°�
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
		//���Ǽ��� ���Ǽ����� Ŭ��� �ٽ� ���� �������ߵ�
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
		//���ϰ�
		boolean isCheck = false;
		//������ �� üũ(ù��° ���� �ι�° ������ Ŀ��)
		if(op.equals("-")) {
			if(a<b) {
				problem();

			}else {
				isCheck=true;
			}
		}
		//������ �Ҷ�(ù��° ���� �ι�° ������ Ŀ���Ѵ�.������ ���ڰ� 0�� �ƴϾ�� �Ѵ�)
		else if(op.equals("/")) {
			if(a<b) {//�ι�°���ڰ� 0�϶� �� Ŭ��������.
				problem();//�ٽõ��ư���
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

	//������� �Է� �޼ҵ�
	public void inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��� �ּ���: ");
		
		try {
			nDto.setUserNumber(sc.nextInt());//������ ���� �Է¹޴´�
		}catch (Exception e) {
			System.out.println("���ڸ� �Է��ϼž� �մϴ�!");
			inputNumber();
		}
	}

	//�� üũ �޼ҵ�
	public void answerCheck() {
		if(nDto.getUserNumber()==nDto.getResult()) {
			System.out.println("�´�");
		}
		else {
			System.out.println("Ʋ�ȴ�");
		}
	}
	//��� ��� �޼ҵ�






}
