package cn.bdqn.thread;

/**
 * 01.�̳�Thread��
 */
public class MyThreadDemo extends Thread {

	/**
	 * ��д�����run����
	 */
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + "ִ����====��"
					+ i);
		}
	}

	// ���̵߳Ĳ���ִ��
	public static void main(String[] args) {
		// ���������̶߳���
		MyThreadDemo t1 = new MyThreadDemo();
		MyThreadDemo t2 = new MyThreadDemo();
		/**
		t1.run();
		t2.run();   ��������run()  ������ͨ�ķ�����һ��������ִ����ϣ���һ�������޷�ִ�У�����˳��ִ�У�
		*/

		// �����������߳� �ǵ����߳��ࣨ�̳���Thread�����ʵ����Runnable�ӿڣ���start()

		t1.setName("��1���߳�");
		t2.setName("��2���߳�");

		t1.start();
		t2.start();

	}

}
