package cn.bdqn.control;


/**
 * t1.yield() ���̵߳����ã�  �п��ܶԷ������ܣ�
 */
public class YieldDemo implements Runnable {
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
		YieldDemo demo1 = new YieldDemo();
		Thread t1 = new Thread(demo1, "���ײ����߳�");
		// ���������߳�t1
		t1.start();
		for (int i = 1; i <= 100; i++) { // ��main���߳��н����������
			System.out.println(Thread.currentThread().getName() + "ִ�е�iֵ��" + i);
			if (i % 2 == 0) {
				Thread.currentThread().yield(); // ���߳�����
			}
		}
	}
}
