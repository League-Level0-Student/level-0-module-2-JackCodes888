//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i += 1) {
		Random randomMaker = new Random();
		
		int randnum = randomMaker.nextInt(5);
		
		System.out.println(randnum);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if(randnum == 1) {
			System.out.println("I like your watch.");
		}else if (randnum == 2) {
			System.out.println(" I like your shoes.");
		}else if (randnum == 3) {
			System.out.println(" I like your feet.");
		}else if (randnum == 4) {
			System.out.println(" I like your eyes.");
		}else if (randnum == 5) {
			System.out.println(" I like your hair.");
		}
		// 2. Repeat all the code above 10 times
		}
		// 3. Find someone to test out your program. They will like it :)
	}
}
