package produce_consumer;


public class Consumer extends Thread {
	MyBlockingStack<?> products;

	public Consumer(MyBlockingStack<?> stack) {
		// TODO Auto-generated constructor stub
		this.products = stack;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(true) {
			try {
				Thread.sleep(products.getPopSpeed() * 10);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(products.pop() + "ฯ๛ทั" +  "...." + this.getName());
		}
	}
}
