package cn.bdqn.third;

import java.util.Scanner;

import cn.bdqn.third.impl.Operation;

public class OperationDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������һ�����֣�");
		double num1 = input.nextDouble();
		System.out.println("������������ţ�");
		String operate = input.next();
		System.out.println("������ڶ������֣�");
		double num2 = input.nextDouble();
		Operation operation = OperateFactory.getOperate(operate);
		System.out.println(operation.getResult(num1, num2));

	}
}
