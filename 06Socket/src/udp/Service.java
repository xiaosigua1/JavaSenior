package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.net.SocketException;

public class Service { // ������
	public static void main(String[] args) {
		DatagramPacket dp = null; // ��� �� �������
		DatagramSocket ds = null; // ���պ� ��������
		// ����һ���� ���ͻ�����Ӧ
		DatagramPacket dpTo = null;
		try {
			byte[] buf = new byte[1024];
			// �������ݰ��Ķ���
			dp = new DatagramPacket(buf, buf.length);
			ds = new DatagramSocket(8855);
			// ����
			ds.receive(dp);
			// ��ʾ���յ���Ϣ ���
			String msg = new String(dp.getData(), 0, dp.getLength());
			// ��ȡ �Է��ĵ�ַ �ͻ��˵���Ϣ
			System.out.println(dp.getAddress().getHostAddress() + "˵====��"
					+ msg);

			// �ظ��� �ͻ���
			byte[] reply = "���ã���ĸ�Ѿ�������".getBytes();
			// dp���Ǵӿͻ��˴������ŷ� �ŷ��Ͽ϶��� �ļ��˵ĵ�ַ
			SocketAddress address = dp.getSocketAddress();
			// ����ɹ�
			dpTo = new DatagramPacket(reply, reply.length, address);
			// ����
			ds.send(dpTo);
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}