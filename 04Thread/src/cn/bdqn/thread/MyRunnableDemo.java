package cn.bdqn.thread;

/**
 * 02.ʵ��Runnable�ӿ�
 */
public class MyRunnableDemo implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
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

		// �����߳�
		t1.start();
		t2.start();

	}
}
