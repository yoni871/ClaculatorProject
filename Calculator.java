package calcProject;

/* This program performs basic mathematical operations
 */
public class Calculator {
	private double num1;
	private double num2;
	
	public Calculator(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public Calculator(double num1) {
		this.num1 = num1;
	}
	
	public double add() {
		return num1 + num2;
	}
	
	public double subtract() {
		return num1 - num2;
	}
	
	public double multiply() {
		return num1*num2;
	}
	
	public double divide() {
		if(num2 == 0) {
			throw new ArithmeticException("ERROR - Cannot divide by zero!");
		}
		
		else {
			return num1 / num2;
		}
	}
	
	public double root() { // num1 is the root to be calculated
		if(num1 <= 0) {
			throw new ArithmeticException("ERROR - Cannot take a root of a negative number or 0!"); // We cannot get a real number if we square a negative number or zero
		}
		
		else {
			return(Math.pow(num1, 0.5));
		}
	}
	
	// the method below calculates a percentage
	public double percent() {
		return num1/100;
	}
	
	// the method below calculates a percentage
	public double modulus() {
		return num1 % num2;
	}
	
	// the method below calculates log
	// num1 is the log to calculate
	// num2 is the base to calculate
	public double log() {
		if(num1 <= 0) {
			throw new ArithmeticException("ERROR - Canonot take logarithm of a non positive number or 0!");
		}
		
		//the base of a log cannot be 1, 0 or negative
		if(num2 <= 1) {
			throw new ArithmeticException("ERROR - Invalid base!");
		}
		
		else {
			return Math.log(num1) / Math.log(num2);
		}
	}
	
	// the method below calculates factorial
	public int factorial() {
		if(num1 < 0) {
			throw new ArithmeticException("ERROR - Cannot take a factorial of negative number!");
		}
		
		else {
			num1 = (int) num1;
			
			// loop to calculate the result of the factorial
			int result = 1;
			for(int i = 1; i <= num1; i++) {
				result*=i;
			}
			
			return result;
		}
	}
}
