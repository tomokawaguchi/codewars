// Find the missing letter

// Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.

// You will always get an valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
// The array will always contain letters in only one case.

// Example:

// ['a','b','c','d','f'] -> 'e' ['O','Q','R','S'] -> 'P'

// ["a","b","c","d","f"] -> "e"
// ["O","Q","R","S"] -> "P"
// (Use the English alphabet with 26 letters!)

// Have fun coding it and please don't forget to vote and rank this kata! :-)

// I have also created other katas. Take a look if you enjoyed this kata!


public class Kata{
    public static char findMissingLetter(char[] array){
      String alphabet = "abcdefghijklmnopqrstuvwxyz";
      
      // Getting a position of the first letter
      int initial = alphabet.indexOf(Character.toLowerCase(array[0]));   
      // Create a string that is same length as a given array
      // This will includes the difference
      alphabet = alphabet.substring(initial, initial + array.length);
    
      char result = 'a';
      
      // Loop through the array to find the difference from alphabet string
      for(int i=0; i < array.length; i++){
        if(Character.toLowerCase(array[i]) != alphabet.charAt(i)) {        
          result = alphabet.charAt(i);
          break;
        }
      } 

      // If the given array is with capital letters, capitalise the result 
      return Character.isUpperCase(array[0]) ? Character.toUpperCase(result) : result;
    }
}

// Other developer's solution
public class KataAlternative
{
  public static char findMissingLetter(char[] array){
    char expectableLetter = array[0];
    for(char letter : array){
      if(letter != expectableLetter) break;
      expectableLetter++;
    }
    return expectableLetter;
  }
}