package LamdaExpression;

@FunctionalInterface
interface IsFunctional {
	void testMethod(String data);
}

public class FunctinalInterfaceTest{

	// With Anonymous class.
	IsFunctional isFunc = new IsFunctional() {
		@Override
		public void testMethod(String data) {
			System.out.println("Printing " + data + " from Anonymous class.");
		}
	};

	// With lambda expression.
	IsFunctional func = (demoData) -> {
		System.out.println("Printing " + demoData + " from Lambda expression.");
	};
	
	public static void main(String[] args) {
		 IsFunctional func = (demoData) -> {
				System.out.println("Printing " + demoData + " from Lambda expression.");
			};			
			
	}

	
} 



