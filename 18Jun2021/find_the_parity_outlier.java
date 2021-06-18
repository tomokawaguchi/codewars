// Find The Parity Outlier

// You are given an array (which will have a length of at least 3, but could be very large) containing integers. 
// The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. 
// Write a method that takes the array as an argument and returns this "outlier" N.

// Example 
// [2, 4, 0, 100, 4, 11, 2602, 36]
// Should return: 11 (the only odd number)

// [160, 3, 1719, 19, 11, 13, -21]
// Should return: 160 (the only even number)


public class FindOutlier{
    static int find(int[] integers){
      int numEven = 0;
      int result = 0;
      
      // loop through the int list to count the number of even numbers
      for(int i=0; i < integers.length; i++){
        if(integers[i] % 2 == 0) {
          numEven++;
        }
      }
      
      // If there is only one even number return it
      // Otherwise return the odd number and return it
      if(numEven == 1) {
        for(int i=0; i < integers.length; i++) {
          if(integers[i] % 2 == 0) {
            return integers[i];
          }
        }
      } else {
        for(int i=0; i < integers.length; i++) {
          if(integers[i] % 2 != 0) {
            return integers[i];
          }
        }
      }
      
      return 0;
    }
}

// Optimized 
public class FindOutlierOptimized{
    static int find(int[] integers){
      int oddCount = 0, oddNum = 0, evenCount = 0, evenNum = 0;
      
      // As we loop through, count the number of odd/even and store the current number
      for (int i : integers) {
        if (i % 2 == 0) {
            evenNum = i;
            evenCount++;
        } else {
            oddNum = i;
            oddCount++;
        }
        
        // When even and odd numbers are stored in respective variable
        // check which one only contains one number
        if (evenCount > 0 && oddCount > 0) {
            if (evenCount > 1) {
                return oddNum;
            } else if (oddCount > 1) {
                return evenNum;
            }
        }
    }      
      return 0;    
    }
}


// Other developer's solution 

import java.util.Arrays;

public class FindOutlierAlternative{
    public static int find(int[] integers) {
        // Since we are warned the array may be very large, we should avoid counting values any more than we need to.

        // We only need the first 3 integers to determine whether we are chasing odds or evens.
        // So, take the first 3 integers and compute the value of Math.abs(i) % 2 on each of them.
        // It will be 0 for even numbers and 1 for odd numbers.
        // Now, add them. If sum is 0 or 1, then we are chasing odds. If sum is 2 or 3, then we are chasing evens.
        int sum = Arrays.stream(integers).limit(3).map(i -> Math.abs(i) % 2).sum();
        int mod = (sum == 0 || sum == 1) ? 1 : 0;

        return Arrays.stream(integers).parallel() // call parallel to get as much bang for the buck on a "large" array
                .filter(n -> Math.abs(n) % 2 == mod).findFirst().getAsInt();
    }
}