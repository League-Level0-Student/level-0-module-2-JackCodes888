package _03_string_conversion._2_strings_cannot_add;

import javax.swing.JOptionPane;

public class StringsCannotAdd {

		// 1) Make a main method that includes all the steps below…. 
	public static void main(String[]args) {
			// 2) Ask the user to enter number 4 and hold it in the variable fourAsString 
		int x = 4;
		int y = 4;
			String fourAsString = JOptionPane.showInputDialog(null,"Enter the nimber Four.");
			// 3) Ask the user to enter number 6 and hold it in the variable sixAsString 
			String sixAsString = JOptionPane.showInputDialog(null,"Enter the nimber Six.");
			// 4) Print the addition of fourAsString and sixxfourAsString += sixAsString);
			// Did you notice 46 instead of 4 + 6 = 10?
			
			// 5) Ask the user to enter number 5 and hold it in the variable fiveAsString 
			String fiveAsString = JOptionPane.showInputDialog(null,"Enter number 5");
			// 6) Print the addition of the variables fourAsString, sixAsString, and fiveAsString 
			//(fourAsString + fiveAsString + sixAsString );
			//Did you notice 456 instead of 4 + 6 + 5 = 15?
			
			// Insert fourAsString inside the parenthesis of Integer.parseInt() and set the method equal to fourAsInt
			// Hint: int fourAsInt = Integer.parseInt(fourAsString);
			int fourAsInt = Integer.parseInt(fourAsString);
			// 7) Do the same for sixAsString. 
			int sixAsInt = Integer.parseInt(sixAsString);
			// 8) Print the addition of fourAsInt and sixAsInt using JOptionPane 
			System.out.println(fourAsString + sixAsInt);
			JOptionPane.showMessageDialog(null, sixAsInt += fourAsInt);
			// Did you notice the value 10? If so, hurray! You just changed the type of your variable from String to int.
			
			// 9) Convert fiveAsString to fiveAsInt using Integer.parseInt();  
			
			// 10) Print the addition of fourAsInt, sixAsInt, and fiveAsInt using JOptionPane 
			
			// Is your value now 15 instead of 465?
}
}
