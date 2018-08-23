package cn.bdqn.control;

import cn.bdqn.thread.MyRunnableDemo;

/**
 * �̵߳����ȼ�
 * Ĭ����5 
 * ȡֵ��1-10
 * ���ȼ�Խ�ߴ����ȡcpu��Դ�ĸ���Խ�ߣ���������һ���ߣ���cpu��һ��û������ʱ��Ƭ��
 */
public class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println(Thread.currentThread().getName() + "ִ����====��"
					+ i);
		}
	}

	// ���̵߳Ĳ���ִ��
	public static void main(String[] args) {
		// �����߳������
		MyRunnableDemo demo1 = new MyRunnableDemo();
		MyRunnableDemo demo2 = new MyRunnableDemo();

		// �����̶߳���
		Thread t1 = new Thread(demo1, "��1���߳�");
		Thread t2 = new Thread(demo2, "��2���߳�");

		// ��ȡ�����̵߳�Ĭ�����ȼ�
		System.out.println("��1���̵߳�Ĭ�����ȼ���===��" + t1.getPriority());
		System.out.println("��2���̵߳�Ĭ�����ȼ���===��" + t2.getPriority());

		// ����t1�����ȼ�Ϊ10
		t1.setPriority(10);
		System.out.println("��1���̵߳�Ĭ�����ȼ���===��" + t1.getPriority());
		System.out.println("��2���̵߳�Ĭ�����ȼ���===��" + t2.getPriority());

		// �����߳�
		t1.start();
		t2.start();

	}
}
