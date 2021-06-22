// Counting Duplicates

// Write a function that will return the count of distinct case-insensitive alphabetic characters 
// and numeric digits that occur more than once in the input string. 
// The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

// Example 
// "abcde" -> 0 # no characters repeats more than once
// "aabbcde" -> 2 # 'a' and 'b'
// "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
// "indivisibility" -> 1 # 'i' occurs six times
// "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
// "aA11" -> 2 # 'a' and '1'
// "ABBA" -> 2 # 'A' and 'B' each occur twice


import java.util.*;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
    
    // Convert string to array with all lowercase characters
    String[] textArray = text.toLowerCase().split("");
    List<String> temp = new ArrayList<String>();

    // Storing all of the duplicated strings
    for(int i=0; i < textArray.length; i++){
      for(int j=i+1; j < textArray.length; j++){
        if(textArray[i].equals(textArray[j])){
          temp.add(textArray[i]);
        }
      }
    }
    
    // Convert list to array
    String[] itemsArray = new String[temp.size()];
    itemsArray = temp.toArray(itemsArray);
    
    // Removing all the duplicated strings by using hashset
    Set<String> set = new HashSet<String>();
    for(int i = 0; i < itemsArray.length; i++){
      set.add(itemsArray[i]);
    }

    // Returning the length 
    return set.size();
  }
}


// Other Developer's solution

public class CountingDuplicatesAlternative {
    public static int duplicateCount(String text) {
      int ans = 0;
      text = text.toLowerCase();
      while (text.length() > 0) {
        String firstLetter = text.substring(0,1);
        text = text.substring(1);
        if (text.contains(firstLetter)) ans ++;
        text = text.replace(firstLetter, "");
      }
      return ans;
    }
  }