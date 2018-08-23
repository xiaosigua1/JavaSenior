package cn.bdqn.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ����   =====��������
 */
public class ServerSocketTest {

	public static void main(String[] args) {
		ServerSocket serverSocket = null; // ����
		Socket socket = null; // �˿�
		InputStream inputStream = null; // ���ﳵ
		BufferedReader br = null; // ����Ա
		OutputStream outputStream = null; // ����Ա�ķ�����Ϣ
		try {
			// ����һ��ָ��λ�õĳ��� ����������
			serverSocket = new ServerSocket(8800);
			// ���п��� �ȴ��˿͹���
			socket = serverSocket.accept();
			// �˿Ϳ�ʼ�����
			inputStream = socket.getInputStream();
			/**
			 * ����Ա��һ����Ʒһ����Ʒ����ɨ��
			 * inputStream:�˿͹������Ʒ
			 */
			br = new BufferedReader(new InputStreamReader(inputStream));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println("���������Ʒ�ǣ�" + line);
			}
			/**
			 * �˿�������Ʒ  ������  �ܲ���תת���� û������
			 *  ��������  ����
			 */
			socket.shutdownInput(); // �ر���������
			// �������
			outputStream = socket.getOutputStream();
			outputStream.write("лл���Ĺ���".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// �ͷ���Դ
			try {
				outputStream.close();
				socket.close();
				br.close();
				inputStream.close();
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
