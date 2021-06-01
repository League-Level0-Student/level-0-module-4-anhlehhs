package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
String number1=JOptionPane.showInputDialog(null, "Type a number");
String number2=JOptionPane.showInputDialog(null, "Type a number");
int number=Integer.parseInt(number1);
int number3=Integer.parseInt(number2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "addition", "subtraction", "multiplication", "division" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		if(operation == 0) {
			add(number, number3);
		}else if(operation==1) {
			subtract(number, number3);
		}else if(operation==2) {
			multiplication(number, number3);
		}else {
			division(number, number3);
		}
			
		
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat clculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }

	static void add(int x, int y) {
		JOptionPane.showMessageDialog(null, x + " + " + y + " = " + (x+y));
	}
	static void subtract(int x, int y) {
		JOptionPane.showMessageDialog(null, x +  " - " + y + " = " + (x-y));
	}

	static void multiplication(int x, int y) {
		JOptionPane.showMessageDialog(null, x +  " * " + y + " = " + (x*y));
	}
	static void division(int x, int y) {
		JOptionPane.showMessageDialog(null, x +  " / " + y + " = " + (x/y));
	}
	// 4. Create similar methods for subtraction, multiplication and division.
}