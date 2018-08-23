package cn.bdqn.user;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class LoginThread extends Thread {

	// ����ÿ���û���Ӧ��socket
	Socket socket = null;

	public LoginThread(Socket socket) {
		this.socket = socket;
	}

	// ��ȡ�ͻ��˵����� ���ͻ�����Ӧ
	public void run() {

		InputStream is = null;
		OutputStream os = null;
		// �����л�
		ObjectInputStream ois = null;
		// ���������������
		try {
			is = socket.getInputStream();
			os = socket.getOutputStream();
			ois = new ObjectInputStream(is);
			User user = (User) ois.readObject();
			System.out.println("�����û����ǣ�" + user.getName());
			System.out.println("���������ǣ�" + user.getPassword());
			socket.shutdownInput();

			// ���û��ɹ���Ӧ
			os.write("��ϲ����¼�ɹ���".getBytes());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
				socket.close();
				ois.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
