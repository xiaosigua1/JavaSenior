package cn.bdqn.control;

import cn.bdqn.thread.MyRunnableDemo;

/**
 * t1.join() ������ȴ�t1�߳�ִ�����֮���������̲߳���ִ�У�
 */
public class JoinDemo implements Runnable {
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
		// �����̶߳���
		Thread t1 = new Thread(demo1, "join���߳�");
		// ���������߳�t1
		t1.start();
		for (int i = 1; i <= 10; i++) { // ��main���߳��н����������
			System.out.println(Thread.currentThread().getName() + "ִ�е�iֵ��" + i);
			if (i == 5) {
				try {
					t1.join(); // �������߳�main ��ִ��t1
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
