
package _99_extra;
import javax.swing.JOptionPane;

import game_tools.Sound;

/* NASA wants to shoot a rocket into orbit.
 * Somebody has to do the countdown or the rocket won't launch.
 * 
 * The ground control chief will tell you where to start – then count down to 0.
 * 
 * (example for '11': 11 10 9 8 7 6 5 4 3 2 1 0)
 * 
 **/

public class NasaCountdown {
    public static void main(String[] args) throws InterruptedException {
        // 2. Use a pop-up to ask the user where to start counting from
        String startCountdown = JOptionPane.showInputDialog(null,"What number would you like the countdown to start");
        // 3. Change the countdown to use the new starting point
       int countdown = Integer.parseInt(startCountdown);
        // 1. Print a countdown from 10 to 0 on the console
            for(;countdown > 0; countdown -= 1) {
            	
            	System.out.println(countdown);
            }
            System.out.println("Blastoff!!!");
            // 4. Use the Sound.speak method to hear the countdown.
            
            // 6. Use the following code to make the program wait one second for each number: Thread.sleep(1000);
            
        // 5. when the counting is done, speak "blastoff!"
    }
}


