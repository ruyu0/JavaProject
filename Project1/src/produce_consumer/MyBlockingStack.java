package produce_consumer;

import java.util.Stack;

public class MyBlockingStack<E>{
	Stack<E> blockingStack;
	int limit = 20;
	//�����ٶȺ������ٶ�
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
		//��ʱ��Ϊ�˿����Ⱥ�ռ��
		try {
			Thread.sleep(10);
		} catch (InterruptedException e1) {
			// TODO: handle exception
		}
		//�ж�����ջ�Ƿ���
		while (blockingStack.size() >= limit) {
			try {
				this.notifyAll();
				this.wait();
				//��ʱ��Ϊ�˿����Ⱥ�ռ��
				Thread.sleep(10);
			} catch (InterruptedException e2) {
				// TODO: handle exception
			}
		}
		this.notifyAll();
		return blockingStack.push(e);
	}
	
	public synchronized E pop() {
		//��ʱ��Ϊ�˿����Ⱥ�ռ��
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		//�ж��Ƿ�Ϊ��
		while (blockingStack.isEmpty()) {
			try {
				this.notifyAll();
				this.wait();
				//��ʱ��Ϊ�˿����Ⱥ�ռ��
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		this.notifyAll();
		return blockingStack.pop();
	}
}
