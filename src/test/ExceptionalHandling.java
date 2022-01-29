package test;

public class ExceptionalHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		int[] array1 = {5, 67, 354, 264};
		
		try {
			int result = num/0;
			System.out.println(array1[10]);
			}
		catch(ArithmeticException a) {
			System.out.println("Inside ArithmeticException block");
		}
		catch(ArrayIndexOutOfBoundsException b) {
			System.out.println("Inside ArrayIndexOutOfBoundsException block");
		}
		
		catch(Exception e) {
			System.out.println("Inside default exception block");
		}
		finally {
			
			System.out.println("inside finally");
		}

		
		System.out.println("after try and catch");
		
	}

}	
