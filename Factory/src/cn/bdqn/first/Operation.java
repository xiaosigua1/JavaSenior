package cn.bdqn.first;

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
		double sum = 0; // ������
		switch (operate) {
		case "+":
			sum = num1 + num2;
			break;
		case "-":
			sum = num1 - num2;
			break;
		case "*":
			sum = num1 * num2;
			break;
		case "/":
			sum = num1 / num2;
			break;
		}
		System.out.println("����ǣ�" + sum);
	}
}
