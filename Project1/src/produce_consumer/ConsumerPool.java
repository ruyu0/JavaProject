package produce_consumer;

import java.util.Vector;

public class ConsumerPool {
	//�������
	MyBlockingStack<?> task;
	//�Q���б�
	Vector<Thread> pool = new Vector<>();
	public ConsumerPool(MyBlockingStack<?> task) {
		// TODO Auto-generated constructor stub
		this.task = task;
	}
	//��ӾQ�́K����
	public void execute(Thread t) {
		pool.add(t);
		System.out.println("�Ѿ����" + t.getName() + "������");
		t.start();
	}
}
