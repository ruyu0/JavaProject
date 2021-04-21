package produce_consumer;


public class Producer extends Thread {
	MyBlockingStack<String> products;
	static String[] productKind = { "A", "B", "C", "D", "E" };

	public Producer(MyBlockingStack<String> stack) {
		// TODO Auto-generated constructor stub
		this.products = stack;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while(true) {
			try {
				Thread.sleep(products.getPushSpeed() * 10);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println(products.push(productKind[(int)(Math.random() * 5)]) + "Éú²ú" + "...." + this.getName());
		}
	}
}
