package cn.bdqn.second;


/**
 * ������
 */
public class Operate {

	public static double getOperate(double num1, String operate, double num2) {
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
		return sum;
	}

}
