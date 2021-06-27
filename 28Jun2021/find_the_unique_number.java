// Find the unique number

// There is an array with some numbers. All numbers are equal except for one. Try to find it!

// Example
// Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
// Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55

// It’s guaranteed that array contains at least 3 numbers.

// The tests contain some very huge arrays, so think about performance.


import java.util.Arrays;

public class Kata {
    public static double findUniq(double[] arr) {
      // Sort array in an ascending order  
      Arrays.sort(arr);

      // Return either of the first or last num
      // If the first and second num are the same, then return the last one
      if(arr[0] == arr[1]) {
        return arr[arr.length - 1];
      }
      return arr[0];
    }
}

// Shorter solution
public class Kata {
    public static double findUniq(double[] arr) {
      Arrays.sort(arr);
      return arr[0] == arr[1] ? arr[arr.length-1]:arr[0];
    }
}