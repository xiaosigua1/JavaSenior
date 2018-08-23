package cn.bdqn.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * �˿�=====���ͻ���
 */
public class SocketTest {

	public static void main(String[] args) {
		Socket socket = null; // �˿�
		OutputStream outputStream = null; // Ǯ��
		InputStream inputStream = null; // �˵�����������Ա�Ļ�����Ϣ
		BufferedReader br = null;
		try {
			// �˿�ȥ�ĸ��ط����ĸ����й���
			socket = new Socket("localhost", 8800);
			// ���� �൱�� Ǯ��Ǯ�� ��ȥ��.......
			outputStream = socket.getOutputStream();
			outputStream.write("����һ�Һ���ĸ��".getBytes());
			// �������
			socket.shutdownOutput();

			// ��������Ա�Ļ�����Ϣ
			inputStream = socket.getInputStream();
			// ѭ����ȡ����Ա�Ļ�����Ϣ
			br = new BufferedReader(new InputStreamReader(inputStream));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				inputStream.close();
				socket.close();
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
