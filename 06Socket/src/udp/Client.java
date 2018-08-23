package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Client { // �ͻ���
	public static void main(String[] args) {
		DatagramPacket dp = null; // ��� �� �������
		DatagramSocket ds = null; // ���պ� ��������
		// ����һ���� ����������Ӧ
		DatagramPacket dpTo = null;
		InetAddress address = null;
		try {
			// �������Ϲ��� Ҫ��Ҫ���ͷ� ˵��ĵ�ַ
			byte[] say = "�������ĸ����".getBytes();
			// ��ȡ�����ĵ�ַ��
			address = InetAddress.getByName("localhost");
			// ���
			dp = new DatagramPacket(say, say.length, address, 8855);
			// ����
			ds = new DatagramSocket();
			ds.send(dp);

			// ����
			byte[] buf = new byte[1024];
			dpTo = new DatagramPacket(buf, buf.length);
			ds.receive(dpTo);
			// ���ǿ��ͷ������ǻظ��� ʲô ���
			String reply = new String(dpTo.getData(), 0, dpTo.getLength());
			System.out.println(dpTo.getAddress().getHostAddress() + "˵===��"
					+ reply);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
