public class SumOfNumbers {
  public static int addDigits(int num) {
      // ------------------------------------------------------------
      // COMPLETE THE CODE FOR THE METHOD HERE:
      //
      // This method takes a non-negative integer and
      // repeatedly adds its digits until only one digit remains.
      //
      // Do not use string conversion or arrays.
      // Use math to extract and sum the digits.
      // ------------------------------------------------------------
      // have 2 loops an outer loop to confirm that the digit < 10
      // have the other loop confirm if the n digit is still greater than 0
      while (num > 10) {
          int sum = 0;
          while (num > 0) {
              sum += num % 10;
              num /= 10;
          }
          num = sum;
      }
      return num;
  }






        public static void main(String[] args) {

            // Do not change the code in the main method

            System.out.println("→ " + addDigits(38));      // 2
            System.out.println("→ " + addDigits(0));       // 0
            System.out.println("→ " + addDigits(7));       // 7
            System.out.println("→ " + addDigits(12345));   // 6
            System.out.println("→ " + addDigits(9999));    // 9
        }

}

