//Duplicate Encoder

// The goal of this exercise is to convert a string to a new string where each character in the new string is "(" 
// if that character appears only once in the original string, or ")" if that character appears more than once in the original string. 
// Ignore capitalization when determining if a character is a duplicate.

// Example 
//"din"      =>  "((("
// "recede"   =>  "()()()"
// "Success"  =>  ")())())"
// "(( @"     =>  "))((" 

import java.util.*;

public class DuplicateEncoder {
  static String encode(String word){
    // Set up the string builder with lower-cased given word 
    StringBuilder sb = new StringBuilder(word.toLowerCase());
    
    // Check if given word includes ')', if so, it replace with any Capital char to distinct 
    // (If the condition is true, it returns -1)
    if(sb.indexOf(")") != -1){
      sb.setCharAt(sb.indexOf(")"), 'X');
    }
    
    // Loop through the string builder and replace with ')' when the condition is met
    for(int i=0; i < sb.length(); i++){
      int counter = 0;
      for(int j = i+1; j < sb.length(); j++){
         if (sb.charAt(i) == sb.charAt(j) || (sb.charAt(i) == ' ' && sb.charAt(j) == ' ')) {  
            sb.setCharAt(j, ')');
            counter ++;
          }
        }
      // The counter specifies if the sb.charAt(i) needs to be replaced or not
      if(counter > 0) {
        sb.setCharAt(i, ')');
        }
      }  
    
    // Replace the remaining to be '('  
    for(int k = 0; k < sb.length(); k++){
      if(sb.charAt(k) != ')'){
        sb.setCharAt(k, '(');
      }
    }
    
    // return the result as string 
    return sb.toString();
  }
}

// Other developer's solution 

public class DuplicateEncoderAlternative {
  static String encode(String word){
    word = word.toLowerCase();
    String result = "";
    for (int i = 0; i < word.length(); ++i) {
      char c = word.charAt(i);
      // By checking the lastIndexOf(c), it identifies if there is a duplicate or not
      result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
    }
    return result;
  }
}