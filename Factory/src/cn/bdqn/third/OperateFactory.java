package cn.bdqn.third;

import cn.bdqn.third.impl.Addtion;
import cn.bdqn.third.impl.Division;
import cn.bdqn.third.impl.Minus;
import cn.bdqn.third.impl.Multiplication;
import cn.bdqn.third.impl.Operation;

/**
 * ������
 * 
 * 
 * 
 *  ����������� ���ǵĽӿڻ���  ʵ���࣡������   
 *  �϶���ʵ���࣡
 *  ����֮�⣬������Ҫʵ���� ʵ���� ����ʵ������Ĺ��ܣ�
 *  ��ô��ʵ���� ����Ҫ ʵ������
 *  
 *  01.�����м̳й�ϵ��
 *  02.�ж��ʵ������Ҫʵ����
 *  03.��ѡ���ǵĹ������ģʽ
 *  
 *  ��Ȼ���������ӣ� �������ǳ������չ�Ժ͸�����ǿ�ˣ���϶Ƚ��ͣ�
 *  
 */
public class OperateFactory {

	/**
	 * 
	 * @param operate  �û����ݹ������������
	 * @return  �����û����������  ���ز�ͬ���㷨
	 */
	public static Operation getOperate(String operate) {
		// ��������ָ������Ķ���
		Operation operation = null;
		switch (operate) {
		case "+":
			operation = new Addtion();
			break;
		case "-":
			operation = new Minus();
			break;
		case "*":
			operation = new Multiplication();
			break;
		case "/":
			operation = new Division();
			break;
		}
		return operation;
	}

}
