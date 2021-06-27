// Your order, please

// Your task is to sort a given string. 
// Each word in the string will contain a single number. This number is the position the word should have in the result.

// Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

// If the input string is empty, return an empty string. 
// The words in the input String will only contain valid consecutive numbers.

// Examples 
// "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
// "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
// ""  -->  ""    


import java.util.*;

public class Order {
  public static String order(String words) {
     // Storing each word in an array 
    String[] array = words.split(" ");
    ArrayList<Integer> indexArray = new ArrayList<Integer>();
    
    String result = "";
    
    // If there is no number included, return empty string
    if(!words.matches(".*\\d.*")) {
      return result;
    } else {
        // Store each number in an array
      for(String word : array)
        for(int j=0; j < word.length(); j++){
          if(Character.isDigit(word.charAt(j))) {
            indexArray.add(Character.getNumericValue(word.charAt(j))); 
          }
        }
        // Reorder the words based on the index obtained
      String temp[] = new String[array.length];
      for (int i=0; i<array.length; i++){
        temp[indexArray.get(i) - 1] = array[i];      
      }

      // Converting array to string with the space between the words
      StringBuilder sb = new StringBuilder(temp[0]);
      for(int k=1; k < temp.length; k++){
        sb.append(" " + temp[k]);
      }

      result = sb.toString();

      return result;
    }    
}

// Other developer's solution 

public class OrderAlter {
    public static String order(String words) {
         String[] arr = words.split(" ");
         StringBuilder result = new StringBuilder("");
         for (int i = 0; i < 10; i++) {
             for (String s : arr) {
                 if (s.contains(String.valueOf(i))) {
                     result.append(s + " ");
                 }
             }
         }
         return result.toString().trim();
     }
 }
