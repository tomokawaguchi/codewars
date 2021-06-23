// Persistent Bugger

// Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, 
// which is the number of times you must multiply the digits in num until you reach a single digit.

// For example:

//  persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4 and 4 has only one digit
                 
//  persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,1*2*6 = 12, and finally 1*2 = 2
                  
//  persistence(4) == 0 // because 4 is already a one-digit number


class Persist {
  public static int persistence(long n) {
    int counter = 0;
    // As long as given number n is smaller than or equal to 10, do the followings
    while(n >= 10) {
      // Convert the given n to string array  
      String[] numStringArray = String.valueOf(n).split("");

      // Convert the numStringArray to int array
      int intArray[] = new int[numStringArray.length];
      for(int i=0; i < numStringArray.length; i++){
        intArray[i] = Integer.parseInt(numStringArray[i]);
      }      
      
      // Set n = 1 and start multiplying each number
      n = 1;
      for(int each : intArray) {
          n *= each;
      } 

      // Increase the counter as long as the condtion is met 
      counter ++;
    }
    
    return counter;
  }
}

// Other developer's solution

class PersistAlternative {
  public static int persistence(long n) {
    long m = 1, r = n;

    if (r / 10 == 0)
      return 0;

    for (r = n; r != 0; r /= 10)
      m *= r % 10;

    return persistence(m) + 1;
    
  }
}