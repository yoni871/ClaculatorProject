package calcProject;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class to test the calculator class
 * @author jacob
 *
 */
public class Test {
	/*
	 * Method to test the calculator class
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean cont = true;
		
		while(cont == true) {
			System.out.println("Which operation do you want to do? (multiplication, division, addition, subtraction, square root, modulus, "
					+ "percent, log, factorial)");
			String op = sc.nextLine();
			
			if(op.compareToIgnoreCase("multiplication") == 0) {
				System.out.print("\nanswer = (number 1) * (number 2)");
				System.out.print("\nEnter number 1: ");
				
				try {
					double num1 = sc.nextDouble();
					System.out.print("Enter number 2: ");
					double num2 = sc.nextDouble();
					
					Calculator calc = new Calculator(num1, num2);
					
					System.out.println(num1 + "*" + num2 + " = " + calc.multiply() + "\n\n");
				}
				
				catch(InputMismatchException e) {
					System.out.println(e + ": ERROR - You did not enter a number!"  + "\n\n");
				}
				
				finally {
					sc.nextLine();
				}
			}
			
			else if(op.compareToIgnoreCase("division") == 0) {
				System.out.print("\nanswer = (number 1) / (number 2)");
				System.out.print("\nEnter number 1: ");
				
				try {
					double num1 = sc.nextDouble();
					System.out.print("Enter number 2: ");
					double num2 = sc.nextInt();
					
					Calculator calc = new Calculator(num1, num2);
					
					System.out.println(num1 + "/" + num2 + " = " + calc.divide() + "\n\n");
				}
				
				catch(InputMismatchException e) {
					System.out.println(e + ": ERROR - You did not enter a number!"  + "\n\n");
				}
				
				catch(ArithmeticException e){
					System.out.println(e + "\n\n");
				}
				
				finally {
					sc.nextLine();
				}
			}
			
			else if(op.compareToIgnoreCase("addition") == 0) {
				System.out.print("\nanswer = (number 1) + (number 2)");
				System.out.print("\nEnter number 1: ");
				
				try {
					double num1 = sc.nextDouble();
					System.out.print("Enter number 2: ");
					double num2 = sc.nextDouble();
					
					Calculator calc = new Calculator(num1, num2);
					
					System.out.println(num1 + "+" + num2 + " = " + calc.add() + "\n\n");
				}
				
				catch(InputMismatchException e) {
					System.out.println(e + ": ERROR - You did not enter a number!");
				}
				
				finally {
					sc.nextLine();
				}
			}
			
			else if(op.compareToIgnoreCase("subtraction") == 0) {
				System.out.print("\nanswer = (number 1) - (number 2)");
				System.out.print("\nEnter number 1: ");
				
				try {
					double num1 = sc.nextDouble();
					System.out.print("Enter number 2: ");
					double num2 = sc.nextDouble();
					
					Calculator calc = new Calculator(num1, num2);
					
					System.out.println(num1 + "-" + num2 + " = " + calc.subtract() + "\n\n");
				}
				
				catch(InputMismatchException e) {
					System.out.println(e + ": ERROR - You did not enter a number!"  + "\n\n");
				}
				
				finally {
					sc.nextLine();
				}
			}
			
			else if(op.compareToIgnoreCase("square root") == 0) {
				System.out.print("\nanswer = (number 1)^(1/2)");
				System.out.print("\nEnter number 1: ");
				
				try {
					double num1 = sc.nextDouble();
					
					Calculator calc = new Calculator(num1);
					
					System.out.println(num1 + "^(1/2) = " + calc.root() + "\n\n");
				}
				
				catch(InputMismatchException e) {
					System.out.println(e + ": ERROR - You did not enter a number!"  + "\n\n");
				}
				
				catch(ArithmeticException e){
					System.out.println(e + "\n\n");
				}
				
				finally {
					sc.nextLine();
				}
			}
			
			else if(op.compareToIgnoreCase("modulus") == 0) {
				System.out.print("\nanswer = (number 1) % (number 2)");
				System.out.print("\nEnter number 1: ");
				
				try {
					double num1 = sc.nextDouble();
					System.out.print("Enter number 2: ");
					double num2 = sc.nextDouble();
					
					Calculator calc = new Calculator(num1, num2);
					
					System.out.println(num1 + "%" + num2 + " = " + calc.modulus() + "\n\n");
				}
				
				catch(InputMismatchException e) {
					System.out.println(e + ": ERROR - You did not enter a number!"  + "\n\n");
				}
				
				finally {
					sc.nextLine();
				}
			}
			
			else if(op.compareToIgnoreCase("percent") == 0) {
				System.out.print("\nanswer = (number 1)%");
				System.out.print("\nEnter number 1: ");
				
				try {
					double num1 = sc.nextDouble();
					
					Calculator calc = new Calculator(num1);
					
					System.out.println(num1 + "% = " + calc.percent() + "\n\n");
				}
				
				catch(InputMismatchException e) {
					System.out.println(e + ": ERROR - You did not enter a number"  + "\n\n");
				}
				
				finally {
					sc.nextLine();
				}
			}
			
			else if(op.compareToIgnoreCase("log") == 0) {
				System.out.print("\nanswer = log(base = number 2)(number 1)");
				System.out.print("\nEnter number 1: ");
				
				try {
					double num1 = sc.nextDouble();
					System.out.print("Enter number 2: ");
					double num2 = sc.nextDouble();
					
					Calculator calc = new Calculator(num1, num2);
					
					System.out.println("log(base = " + num2 + ")(" + num1 + ")" + " = " + calc.log() + "\n\n");
				}
				
				catch(InputMismatchException e) {
					System.out.println(e + ": ERROR - You did not enter a number" + "\n\n");
				}
				
				catch(ArithmeticException e) {
					System.out.println(e + "\n\n");
				}
				
				finally {
					sc.nextLine();
				}
			}
			
			else if(op.compareToIgnoreCase("factorial") == 0) {
				System.out.print("\nanswer = (number 1)!");
				System.out.print("\nEnter number 1: ");
				
				try {
					int num1 = sc.nextInt();
					Calculator calc = new Calculator(num1);
					System.out.println(num1 + "! = " + calc.factorial() + "\n\n");
				}
				
				catch(InputMismatchException e){
					System.out.println(e + ": ERROR - Calculator does not support the factorial of a decimal or you did not enter a number!" + "\n\n");
				}
				
				catch(ArithmeticException e) {
					System.out.println(e + "\n\n");
				}
				
				finally {
					sc.nextLine();
				}
			}
			
			else {
				cont = false;
			}
		}
		
		sc.close();
		
	}

}
