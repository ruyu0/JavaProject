class Test{
	public static void main(String[] args){
		for (int i = 0; ; i++) {
			System.out.println(i);
			new Thread() {
				@Override
				public void run() {
					try {
						Thread.sleep(1000000);
					} catch (InterruptedException e) {
						// TODO: handle exception
					}
				};
			}.start();
		}
	}
}