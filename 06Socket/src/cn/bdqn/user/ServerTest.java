package cn.bdqn.user;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * ������
 */
public class ServerTest {
	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			// ��������������
			serverSocket = new ServerSocket(8800);
			// һֱ���� �ͻ����Ƿ����˵�¼
			while (true) {
				socket = serverSocket.accept();
				/**
				 * ���socket�ǵڼ����û������� ��֪��
				 * ֻ֪��һ��socket����һ���߳�
				 */
				LoginThread thread = new LoginThread(socket);
				thread.start();// �����߳�
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
