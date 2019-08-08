package LamdaExpression;

public class ThreadWithLambda {
	public static void main(String[] args) {
		
		System.out.println("--------with out Lambda");
		//Old way:
		new Thread(new Runnable() {
		    @Override
		    public void run() {
		        System.out.println("Hello from thread");
		    }
		}).start();
		 
		System.out.println("-----------with using Lambda");
		//New way:
		new Thread(
		    () -> System.out.println("Hello from thread using Lamda")
		).start();
		
		// Using anonymous innerclass
		Runnable race1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello world !");
			}
		};
		 
		// Using lambda expression
		Runnable race2 = () -> System.out.println("Hello world !");
		 
		// Run em!
		race1.run();
		race2.run();
		
	}
	
	

}
