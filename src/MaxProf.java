public class MaxProf {
    public static int maxProfit(int[] prices) {
        // ------------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Finds the maximum profit you can achieve from
        // buying and selling a stock once. You must buy
        // before you sell. Returns 0 if no profit is possible.
        //
        // Uses a single pass and keeps track of the lowest
        // price seen so far to calculate profit dynamically.
        // ------------------------------------------
    }


    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("→ " +
                maxProfit(new int[]{7, 1, 5, 3, 6, 4}));  // 5

        System.out.println("→ " +
                maxProfit(new int[]{7, 6, 4, 3, 1}));     // 0

        System.out.println("→ " +
                maxProfit(new int[]{1, 2}));              // 1

        System.out.println("→ " +
                maxProfit(new int[]{5, 4, 3, 2, 1}));     // 0

        System.out.println("→ " +
                maxProfit(new int[]{2, 4, 1}));           // 2
    }
}
