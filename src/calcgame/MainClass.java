package calcgame;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import calc.Calc;
import dto.MunjeDto;

public class MainClass {

	public static void main(String[] args) {

		//���� ����
		System.out.println("���� ���� ����");
		Calc cc = new Calc();
		
		//���� ����(����ڰ� ������ ����ŭ)
		cc.inputN();
		
		//����ڰ� ������ ���� ���� �Է�
		ArrayList<MunjeDto>mList=cc.makeMunje();
		
		for(MunjeDto dto:mList) {
			System.out.println(dto.toString());
			cc.inputNumber(dto);//���� �ִ´�.
			cc.answerCheck(dto);
			
		}
		cc.count();//������ � �������� ���
		//�������� �����ڸ� ����� ���

		//�Է��� ��ŭ ���� ���� n = 10;


//		for(MunjeDto dto:mList) {
//			System.out.println(dto.toString());
//		}

		//������ �������� �� �����غ���

		//Calc cc = new Calc();



		//������ ���
		//		cc.problem();
		//		System.out.print("1 + 1= ");

		//		//����ڰ� ������ ���� �� �Է�
		//		cc.inputNumber();
		//		System.out.println("2");


		//		//�´��� Ʋ���� üũ
		//		//������ �´� Ʋ���� Ʋ�ȴ�
		//		System.out.println("�´�");


	}
}
