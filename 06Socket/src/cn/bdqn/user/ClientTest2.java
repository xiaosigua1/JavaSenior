package cn.bdqn.user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * �û���¼
 */
public class ClientTest2 {

	public static void main(String[] args) {
		Socket socket = null;
		InputStream inputStream = null;
		OutputStream outputStream = null;
		BufferedReader br = null;
		// ���л�
		ObjectOutputStream oos = null;

		try {
			// ����socket����
			socket = new Socket("localhost", 8800);
			// ���������������
			inputStream = socket.getInputStream();
			outputStream = socket.getOutputStream();
			// ������¼�Ķ���
			User user = new User("admin2", "654321");
			// ���л���������
			oos = new ObjectOutputStream(outputStream);
			oos.writeObject(user);
			socket.shutdownOutput();

			// ��¼�ɹ�֮�� ���������������Ӧ ��Ҫ����
			br = new BufferedReader(new InputStreamReader(inputStream));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println("�����������ǵĻ�Ӧ=====��" + line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				socket.close();
				oos.close();
				outputStream.close();
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
