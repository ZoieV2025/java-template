import java.util.Scanner;

public class Main {

   public static void main(String []args) {

      boolean condition = false;
      // Statements inside a WHILE LOOP BODY will repeat
      // until the condituon is FALSE
      while (condition) {
         // Statments (instructions) to be repeated
         System.out.println("Hi");
         // While condition is false, the loop body won't execute
         // If we had set our condition to true, we'd have an INFINITE LOOP!
      }

      // THREE STEPS TO WRITE A LOOP
      // 1. Initialize the LOOP CONTROL variable
      int count = 1;
      // 2. Test the CONDITION in the loop header
      // here, the conition is "count <= 10"
      // but it could also just be a boolean value
      while(count <= 10){
         // Execute statements in the loop body
         System.out.println(count);
         // 3. CHANGE your loop coontrol variable
         count++; // equivalent to count = count + 1;
      }

      // GUESSING GAME
      Scanner scan = new Scanner(System.in);
      // Choose a random number from 0-100
      int num = (int) (Math.random() * 100);
      // Ask the user to guess a number from 0 to 100
      System.out.println("Guess a number from 0 to 100: ");
      // Gret the first gues using scan.nextInt();
      int guess = scan.nextInt();
      // Example of a SENTINEL while loop (like a "flag" to stop looping)
      // Loop while the guess does nto equal the random number
      while (guess != num) {
         // If the guess is less than the random number, print out "Too low!"
         if (guess < num){
            System.out.println("Too low!");
         }
         else if (guess > num) {
            System.out.println("Too high!");
         }
         // Get a new guess (sae it inot the same variable)
         System.out.println("Guess again: ");
         guess = scan.nextInt(); // LOOP CHANGE
      }

      // Print out something like "You got it!"
      // AFTER LOOP ENDS (meaning guess == num)
      System.out.println("You got it!");


   }
}
