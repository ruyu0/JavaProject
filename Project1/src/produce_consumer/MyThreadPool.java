package produce_consumer;

import java.util.Stack;

public class MyThreadPool {
	// ������������Stack���̰߳�ȫ�ģ�
	Stack<Runnable> tasks = new Stack<>();

	public MyThreadPool(int number) {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < number; i++) {
			new PoolThread("MyThreadPool�߳�" + i).start();
		}
	}

	// �������
	public void execute(Runnable r) {
		synchronized (tasks) {
			tasks.push(r);
			//ͨ��8.7.3 �Ĳ��Կ��Կ�����jvm��notifyAllʱ���һ��wait���̻߳����Ȼ���ռ����������������
			//�����notifyAll���ù۲�
//			tasks.notify();
			tasks.notifyAll();
		}
	}

	private class PoolThread extends Thread {
		PoolThread(String name) {
			super(name);
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			// �鿴�߳�����
			System.out.println(getName() + "����");
			Runnable task;
			while (true) {
				synchronized (tasks) {
					while (tasks.isEmpty()) {
						try {
							tasks.wait();
						} catch (InterruptedException e) {
							// TODO: handle exception
						}
					}
//					//Ϊ�˷���۲죬�����ô���ִ��ÿ��
//					System.out.println(getName() + "ִ������");
//					//Ϊ�˷���۲죬�����ô���ִ��ÿ��������run��ɲŷ�������������ռ��
//					tasks.pop().run();
//				}
					//���ǲ���ִ�У���ȡ������������ռ�����������ٶ���ִ������
					task = tasks.pop();
				}
				System.out.println(getName() + "ִ������");
				task.run();
			}
		}
	}
}
