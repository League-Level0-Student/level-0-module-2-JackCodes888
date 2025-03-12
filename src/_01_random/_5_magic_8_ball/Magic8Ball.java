//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
	public static void main(String[] args) {
		
	
	// 2. Get the user to enter a question for the 8 ball to answer
	JOptionPane.showInputDialog(null, "What is question for the wise bal of 8.");

	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3
	Random random = new Random(); 
	int ranum = random.nextInt(3);
	// 4. If the random number is 0
	if(ranum == 0) {
		JOptionPane.showMessageDialog(null, "Yes, the magic ball of 8 says YYYYYEEEEEEEEESSSSSSSSSSSS.");
	}
	// -- tell the user "Yes"

	// 5. If the random number is 1
	if(ranum == 1) {
		JOptionPane.showMessageDialog(null, "No, the magic ball of 8 says no.");
	};
	// -- tell the user "No"

	// 6. If the random number is 2
	if(ranum == 2) {
		JOptionPane.showMessageDialog(null, "Maybe, the magic ball of 8 says ask google.");
	}
	// -- tell the user "Maybe you should ask Google?"

	// 7. If the random number is 3
	if(ranum == 2) {
		JOptionPane.showMessageDialog(null, "Repeat the question, the all wise magic 8 ball din't hear you..");
	}
	// -- write your own answer
}

}
