package produce_consumer;

import java.util.Stack;

public class MyThreadPool {
	// 任务容器，用Stack（线程安全的）
	Stack<Runnable> tasks = new Stack<>();

	public MyThreadPool(int number) {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < number; i++) {
			new PoolThread("MyThreadPool线程" + i).start();
		}
	}

	// 添加任务
	public void execute(Runnable r) {
		synchronized (tasks) {
			tasks.push(r);
			//通过8.7.3 的测试可以看到本jvm中notifyAll时最后一个wait的线程会首先唤醒占用任务容器！！！
			//因此用notifyAll更好观察
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
			// 查看线程启动
			System.out.println(getName() + "启动");
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
//					//为了方便观察，这里用串行执行每个
//					System.out.println(getName() + "执行任务：");
//					//为了方便观察，这里用串行执行每个，即等run完成才放弃任务容器的占用
//					tasks.pop().run();
//				}
					//这是并行执行，获取任务后立马放弃占用任务容器再独自执行任务
					task = tasks.pop();
				}
				System.out.println(getName() + "执行任务");
				task.run();
			}
		}
	}
}
