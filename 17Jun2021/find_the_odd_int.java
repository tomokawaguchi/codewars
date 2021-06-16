// Find the odd int

// Given an array of integers, find the one that appears an odd number of times.

// There will always be only one integer that appears an odd number of times.



public class FindOdd {
    public static int findIt(int[] a) {
      int counter = 0;
      int answer = 0;

      // Loop through the int array to count how many times same number appear
      for(int i=0; i < a.length; i++){
        for(int j=0; j < a.length; j++) {
          if(a[i] == a[j]) {
            counter ++;
          }
        }
        // If the counter specifies odd number, return the number in an array
        if(counter % 2 == 1) {
          return answer = a[i]; 
        }
      }
      return answer;
    }
}



public class FindOddOptimized {

    public static int findIt(int[] array) {
    
        // for every int in array, check how many times int appears and count the number of times
        for (int eachNum1 : array) {          
          int counter = 0;
          
          for (int eachNum2 : array)
            if (eachNum2 == eachNum1)
            counter++;
          
            //If the counter is odd, return the number in array 
            if (counter % 2 == 1)
            return eachNum1; 
        }
        return 0;
    }
}
