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

   }
}
