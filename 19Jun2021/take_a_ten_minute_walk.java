// Take a Ten Minute Walk

// You live in the city of Cartesia where all roads are laid out in a perfect grid. 
// You arrived ten minutes too early to an appointment, so you decided to take the opportunity to go for a short walk. 
// The city provides its citizens with a Walk Generating App on their phones 
// everytime you press the button it sends you an array of one-letter strings representing directions to walk (eg. ['n', 's', 'w', 'e']). 
// You always walk only a single block for each letter (direction) and you know it takes you one minute to traverse one city block, 
// so create a function that will return true if the walk the app gives you will take you exactly ten minutes 
// (you don't want to be early or late!) and will, of course, return you to your starting point. Return false otherwise.


// Note: 
// you will always receive a valid array containing a random assortment of direction letters ('n', 's', 'e', or 'w' only). 
// It will never give you an empty array (that's not a walk, that's standing still!).


public class TenMinWalk {
    public static boolean isValid(char[] walk) {
      int nCounter = 0;
      int sCounter = 0;
      int eCounter =0;
      int wCounter = 0;
      
      // Return false if the length is not 10
      if(walk.length != 10){
        return false;
      } else {
        for(int i=0; i < walk.length; i++){    
          // Loop through the list and count each char
          switch(walk[i]){
              case 'n' : nCounter++; break;
              case 's' : sCounter++; break;
              case 'e' : eCounter++; break;
              case 'w' : wCounter++; break;
          }
        }

        // if n/s or e/w pair does not have the same number of appearance, it should return false
        if(nCounter != sCounter || eCounter != wCounter) {
          return false;
        }
      }
      return true;
    }
}


public class TenMinWalkOptimized {
    public static boolean isValid(char[] walk) {
      // Check the length if it's 10  
      if (walk.length != 10) {
        return false;
      }
      
      // increase/decrease the counter between n/s or e/w pairs
      int x = 0, y = 0;
      for (char c: walk) {
        switch (c) {
          case 'n': y++; break;
          case 's': y--; break;
          case 'w': x++; break;
          case 'e': x--; break;
        }
      }

      //If the counter x and y are 0, it means it came back to the origin
      return x == 0 && y == 0;
    }
  }