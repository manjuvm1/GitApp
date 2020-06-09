/*Addition, Subtraction, Multiplication and devision operations*/
public class ArithmenticOperator {

	//Addition
	static void addition(int num1, int num2) {
		int result;
		result = num1 + num2;
		System.out.println("Addition of numbers : " + result);
	}
	
	//Subtraction
	static void Subtraction(int num1, int num2) {
		int result;
		result = num1 - num2;
		System.out.println("Substraction of numbers : " + result);
		addition(num1, num2);
		System.out.println("Second time " + "Addition of numbers : " + result);
	}
	
	/*Multiplication*/
	static void multiplication(float num1, int num2) {
		float result;
		result = num1 * num2;
		System.out.println("Multiplication of numbers : " + result);
	}
	
	/*Devision*/
	static void devision(double num1, int num2) {
		double result;
		result = num1 / num2;
		System.out.println("Devision of numbers : " + result);
	}

	/*Reminder*/
	static void devision(int num1, int num2) {
		System.out.println("Reminder of division of two numbers  : " + num1 % num2);
	}
	
	//Addition with return value
	static int addition(int num11) {
		int result2;
		result2 = num11 + num11;
		return result2;
	}
		
		
	public static void main(String[] args) {
		addition(1, 2);
		addition(100, 300);
		Subtraction(200, 100);
		multiplication(10, 20);
		devision(500, 100);
		int result3 = addition(100);
		System.out.println("Addition of numbers with return keyword: " + result3);
	}

}
