package conneticon_pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Stack;

public class MyConnectionPool implements AutoCloseable {
	// 使用线程安全的Stack
	Stack<Connection> connections = new Stack<>();
	// 默认最大连接数为10
	private int maxPoolSize = 10;

	// 构造方法
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

	// 获取和回收操作必须一起在一个块中
	// 获取连接
	public synchronized Connection getConnection() throws InterruptedException {
		while (connections.empty()) {
			this.wait();
		}
		this.notifyAll();
		return connections.pop();
	}

	// 回收连接
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
		// TODO：重写关闭
		System.out.println("关闭所有连接");
		while (!connections.isEmpty()) {
			Connection c = connections.pop();
			c.close();
			System.out.println("连接关闭:" + c.isClosed());
		}
	}

}
