package cn.bdqn.inner;

public class ThreadTest {
	public static void main(String[] args) {
		// �����ڲ���
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("�ϴ�磡�����ˣ�");
				}
			}
		});
		thread.start();

	}

}
