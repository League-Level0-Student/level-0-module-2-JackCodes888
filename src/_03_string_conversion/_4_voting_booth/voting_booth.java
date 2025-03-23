

package _03_string_conversion._4_voting_booth;


import javax.swing.JOptionPane;


public class voting_booth
{


public static void main (String[]args) {
	String age =JOptionPane.showInputDialog(null, "Welcome to the voting booth how old are you");
	
	int ageint = Integer.parseInt(age);
	if(ageint >= 18) {
	JOptionPane.showInputDialog(null,"Who do you want for president Barack Obama or Abraham Lincon?");
	}else {
		JOptionPane.showMessageDialog(null, "Scram kid, no one cares what you think. ");
	}
}
}