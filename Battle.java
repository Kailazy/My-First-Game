import java.util.Scanner;
import java.awt.*;
import javax.swing.JFrame;
public class Battle {
 
    public static void main(String[] args) {
      
    	int playerHealth = 100;
        int enemyHealth = 10;
       //insert Text Here
        System.out.println("Battle");
        System.out.println("Press Enter To Continue");
        Scanner input = new Scanner(System.in);
        String playerDialogue = input.nextLine();
        
        //insert
        System.out.println("");
        System.out.println("Press Enter To Continue");
        Scanner input1 = new Scanner(System.in);
        String dialogue = input.nextLine();
        
        System.out.println("To make choices, type 1, 2, or 3");
        
        System.out.println("");
        
        while (playerHealth > 0 && enemyHealth > 0) {
          
        	System.out.println("																									Player Health " + playerHealth + "             Enemy Health " + enemyHealth + ".");
           
        	System.out.println("                                                                                            ");
            
        	System.out.println("");
           
        	//input Choice 
            System.out.println("");
           
            
            Scanner input2 = new Scanner(System.in);
            String playerAttack = input1.nextLine();
            
            if (playerAttack.equals("1")) {
                int playerDamage = (int) (Math.random() * 10);
                int enemyDamage = (int) (Math.random() * 1);
                enemyHealth = enemyHealth - playerDamage ;
                System.out.println("You have dealt " + playerDamage + " to the Enemy.");
                playerHealth = playerHealth - enemyDamage;
                System.out.println("The Enemy has dealt  " + enemyDamage + " to you.");
                System.out.println("You have " + playerHealth + " health.");
            }
           
            if (playerAttack.equals("2")) {
                int playerDamage = (int) (Math.random() * 10);
                int enemyDamage = (int) (Math.random() * 1);
                enemyHealth = enemyHealth - playerDamage ;
                System.out.println("You have dealt " + playerDamage + " to the Enemy.               The enemy has " + enemyHealth + " health.");
                playerHealth = playerHealth - enemyDamage;
                System.out.println("The Enemy has dealt " + enemyDamage + " to you.");
                System.out.println("You have " + playerHealth + " health.");
                }
            
            if (playerAttack.equals("3")) {
                int playerDamage = (int) (Math.random() * 10);
                int enemyDamage = (int) (Math.random() * 1);
                enemyHealth = enemyHealth - playerDamage ;
                System.out.println("You have dealt " + playerDamage + " to the Enemy.               The enemy has " + enemyHealth + " health.");
                playerHealth = playerHealth - enemyDamage;
                System.out.println("The Enemy has dealt  " + enemyDamage + " to you.");
                System.out.println("You have " + playerHealth + " health.");
             
            }
        }
        
        if (playerHealth <= 0) {
            System.out.println("");
        }
        
        if (enemyHealth <= 0) {
            System.out.println("");
        }
    }
}