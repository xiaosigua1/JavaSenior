package cn.bdqn.mathandrandom;

public class MathTest {

	public static void main(String[] args) {

		System.out.println("����ȡ����" + Math.ceil(20.001));
		System.out.println("����ȡ����" + Math.floor(20.999));
		System.out.println("�������룺" + Math.round(20.5));
		System.out.println("�������룺" + Math.round(20.4));
		System.out.println("���ֵ��" + Math.max(5, 20));
		System.out.println("��Сֵ��" + Math.min(20.4, 0.1));
		System.out.println("����ֵ��" + Math.abs(-52));
		System.out.println("����ֵ��" + Math.random());
		/**
		 * Math.random() �ײ���ִ����Random���е�nextDouble()
		 * 
		public static double random() {
		Random rnd = randomNumberGenerator;
		if (rnd == null) rnd = initRNG();
		return rnd.nextDouble();
		}
		 */

	}

}
