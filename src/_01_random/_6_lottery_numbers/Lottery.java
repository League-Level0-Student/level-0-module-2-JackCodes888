package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;



public class Lottery {

	public static void main(String[] args) {
		Random random = new Random();
		int ranum =  (1 + random.nextInt(99));
		int num1 = 1 + random.nextInt(99);
		int num2 =  1 + random.nextInt(99);
		int num3 =  1 + random.nextInt(99);
		int num4 =  1 + random.nextInt(99);
		int num5 =  1 + random.nextInt(99);
		int num6 =  1 + random.nextInt(99);
    
		
		String lotterynums = num1+ " , "+num2+ " , "+num3+ "  ,"+num4+ " , "+num5+ ",  "+num6;
		JOptionPane.showMessageDialog(null, "Here is your lottery ticket: " +lotterynums);
		
		
		
		
		
	}
	

}
