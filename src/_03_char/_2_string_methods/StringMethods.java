package _03_char._2_string_methods;

import javax.swing.JOptionPane;

public class StringMethods {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to contain a minimum of 3 characters
String Jon= new String("Jon");
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
System.out.println(Jon.charAt(1));
		
		// 3. Print the length of your String to the console.
		//    HINT: .length()
System.out.println(Jon.length());
		
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
for (int i = 0; i < Jon.length(); i++) {
	System.out.println(Jon.charAt(i));
}
		
String input=JOptionPane.showInputDialog(null, "What character would you want to know?");
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		char c = input.charAt(0);
		for (int i = 0; i < Jon.length(); i++) {
			if(Jon.charAt(i) == c) {
				JOptionPane.showMessageDialog(null, "That character is at position " + i);
			}
		}
	}
}


