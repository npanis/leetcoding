import java.util.*;

public class FindMostCommon {

    public static Integer mostCommon(int[] items) {
        // ----------------------------------------
        // COMPLETE THE CODE FOR THE METHOD HERE:
        //
        // Given an array of integers, return the
        // number that appears most frequently.
        //
        // If the array is empty, return null.
        // ----------------------------------------

        HashMap<Integer, Integer> seenMap = new HashMap<>();
        Integer mostCommon = null;
        Integer maxCount = 0;
        for(int item : items){
            if(!seenMap.containsKey(item)){
                seenMap.put(item, 1);
            }
            else {
                seenMap.put(item, seenMap.get(item) + 1);
            }
        }
        for(int key : seenMap.keySet()){
            if(seenMap.get(key) > maxCount){
                mostCommon = key;
                maxCount = seenMap.get(key);
            }
        }

        return mostCommon;
    }





    public static void main(String[] args) {

        // Do not change the code in the main method

        System.out.println("[1, 2, 2, 3, 3] → " +
                mostCommon(new int[]{1, 2, 2, 3, 3}));

        System.out.println("[5] → " +
                mostCommon(new int[]{5}));

        System.out.println("[] → " +
                mostCommon(new int[]{}));

        System.out.println("[1, 1, 1, 2, 3, 4] → " +
                mostCommon(new int[]{1, 1, 1, 2, 3, 4}));
    }

}


