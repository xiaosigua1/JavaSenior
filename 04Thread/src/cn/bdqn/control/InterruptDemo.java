package cn.bdqn.control;

/*
 * �����̵߳���ֹ״̬
 */
public class InterruptDemo implements Runnable {

	@Override
	public void run() {

		// �ж��߳��Ƿ�����ֹ״̬
		if (Thread.currentThread().isInterrupted()) {
			System.out.println("��ǰ�߳�״̬��  ��ֹ״̬");
		} else {
			for (int i = 1; i <= 50; i++) {
				System.out.println(Thread.currentThread().isInterrupted());
				Thread.currentThread().interrupt(); // ������ֹ״̬
				System.out.println(Thread.currentThread().getName()
						+ "ִ����====��" + i);
				if (i == 2) {
					Thread.currentThread().interrupted();// �����ֹ״̬
				}
			}
		}
	}

	public static void main(String[] args) {

		// �����̶߳���
		InterruptDemo demo = new InterruptDemo();
		Thread t = new Thread(demo);
		t.start();// �����߳�

	}

}
