package cn.bdqn.second;

import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������һ�����֣�");
		double num1 = input.nextDouble();
		System.out.println("������������ţ�");
		String operate = input.next();
		System.out.println("������ڶ������֣�");
		double num2 = input.nextDouble();
		// ��ȡ���
		double sum = Operate.getOperate(num1, operate, num2);
		System.out.println("����ǣ�" + sum);

	}
}
