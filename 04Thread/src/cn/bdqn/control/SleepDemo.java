package cn.bdqn.control;

/**
 * t1.sleep() ������ȴ�t1�߳�˯��֮���������̲߳���ִ�У�
 */
public class SleepDemo implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000); // �߳�����1��
				System.out.println(Thread.currentThread().getName()
						+ "ִ����====��" + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	// ���̵߳Ĳ���ִ��
	public static void main(String[] args) {
		// �����߳������
		SleepDemo demo1 = new SleepDemo();
		SleepDemo demo2 = new SleepDemo();
		// �����̶߳���
		Thread t1 = new Thread(demo1, "sleep1���߳�");
		Thread t2 = new Thread(demo2, "sleep2���߳�");
		t1.start();
		t2.start();
	}
}
