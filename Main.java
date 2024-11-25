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

      // FOR LOOPS are "shortcuts" for looping when you know 
      // how many times the loop should run
      // all loop CONTROL info is in the header
      for (int i = 0; i < 13; i++) {
         // LOOP BODY (proccess to be repeated)
         System.out.println("For loop #1, i = " + 1);
      }

      // You can change the variable by anything!
      // What does this loop do? --> counting even numbers
      // How many times does it loop? -->  8
      for (int i = 8; i <= 22; i+=2){
         System.out.println("For loop #2, i = " + i);
      }

      // BACKWARDS looping
      // You must change all 3 loops control parts!!!
      for (int i = 12; i >= 1; i--){
         System.out.println(i + " bottles of coke on the wall");
         System.out.println(i + " bottles of coke");
         System.out.println("Take one down, pass it around");
         System.out.println((i - 1) + " bottles of coke on the wall");
         // check if on the last bottle (final itteration)
         if(i == 1) {
            System.out.println("They're all gone...");
         }

      }

         // *** LOOPS AND STRINGS ***
         // While loop --> find & replace characters
         String  s = "Jackson dropped all of the chargers!";
         int i = 0; // loop counter
         // test condition: while 'a' is still in String s
         while (s.indexOf("a") >= 0) {
            // get the first index of a
            i = s.indexOf("a");
            // show character at that index
            String letter = s.substring(i, i + 1);
            System.out.println("There is an " + letter + " at index " + i);
            // get the first part of the string
            String firstPart = s.substring(0, i);
            // get the last part of the string
            String lastPart = s.substring(i+1, s.length());
            // replace character in s
            s = firstPart + "@" + lastPart;
         }
         System.out.println("String after find & replace: " + s);






      // GUESSING GAME
      Scanner scan = new Scanner(System.in);
      // Choose a random number from 0-100
      int num = (int) (Math.random() * 101);
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
