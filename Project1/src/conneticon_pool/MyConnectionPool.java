package conneticon_pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Stack;

public class MyConnectionPool implements AutoCloseable {
	// ʹ���̰߳�ȫ��Stack
	Stack<Connection> connections = new Stack<>();
	// Ĭ�����������Ϊ10
	private int maxPoolSize = 10;

	// ���췽��
	public MyConnectionPool(String connectionURL, String userName, String userPasswd) throws SQLException {
		this(connectionURL, userName, userPasswd, 10);
	}

	public MyConnectionPool(String connectionURL, String userName, String userPasswd, int maxPoolSize)
			throws SQLException {
		this.maxPoolSize = maxPoolSize;
		for (int i = 0; i < maxPoolSize; i++) {
			connections.push(DriverManager.getConnection(connectionURL, userName, userPasswd));
		}

	}

	// ��ȡ�ͻ��ղ�������һ����һ������
	// ��ȡ����
	public synchronized Connection getConnection() throws InterruptedException {
		while (connections.empty()) {
			this.wait();
		}
		this.notifyAll();
		return connections.pop();
	}

	// ��������
	public synchronized void returnConnection(Connection connection) throws InterruptedException {
		while (connections.size() > maxPoolSize) {
			this.notifyAll();
			this.wait();
		}
		connections.push(connection);
		this.notifyAll();
	}

	@Override
	public void close() throws SQLException {
		// TODO����д�ر�
		System.out.println("�ر���������");
		while (!connections.isEmpty()) {
			Connection c = connections.pop();
			c.close();
			System.out.println("���ӹر�:" + c.isClosed());
		}
	}

}
