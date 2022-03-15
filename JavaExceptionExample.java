
public class JavaExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a = 10/0;
			

			
		}
		catch(ArithmeticException a) {
			
			System.out.println("Arithmetic error occured");

			
		}
		
		finally {
			System.out.println("Finally block always gets executed");
		}
	}

}
