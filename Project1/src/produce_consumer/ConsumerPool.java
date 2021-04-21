package produce_consumer;

import java.util.Vector;

public class ConsumerPool {
	//任务队列
	MyBlockingStack<?> task;
	//綫程列表
	Vector<Thread> pool = new Vector<>();
	public ConsumerPool(MyBlockingStack<?> task) {
		// TODO Auto-generated constructor stub
		this.task = task;
	}
	//添加綫程並啓動
	public void execute(Thread t) {
		pool.add(t);
		System.out.println("已经添加" + t.getName() + "并启动");
		t.start();
	}
}
