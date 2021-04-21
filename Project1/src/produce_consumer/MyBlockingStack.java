package produce_consumer;

import java.util.Stack;

public class MyBlockingStack<E>{
	Stack<E> blockingStack;
	int limit = 20;
	//生产速度和消费速度
	int pushSpeed = 10;
	int popSpeed = 10;
	public MyBlockingStack(Stack<E> s) {
		// TODO Auto-generated constructor stub
		blockingStack = s;
	}
	
	public int getPopSpeed() {
		return popSpeed;
	}
	
	public int getPushSpeed() {
		return pushSpeed;
	}
	
	public synchronized E push(E e) {
		//延时是为了看出先后占用
		try {
			Thread.sleep(10);
		} catch (InterruptedException e1) {
			// TODO: handle exception
		}
		//判断阻塞栈是否满
		while (blockingStack.size() >= limit) {
			try {
				this.notifyAll();
				this.wait();
				//延时是为了看出先后占用
				Thread.sleep(10);
			} catch (InterruptedException e2) {
				// TODO: handle exception
			}
		}
		this.notifyAll();
		return blockingStack.push(e);
	}
	
	public synchronized E pop() {
		//延时是为了看出先后占用
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		//判断是否为空
		while (blockingStack.isEmpty()) {
			try {
				this.notifyAll();
				this.wait();
				//延时是为了看出先后占用
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		this.notifyAll();
		return blockingStack.pop();
	}
}
