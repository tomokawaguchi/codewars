// Kata

// Given a string of words, you need to find the highest scoring word.
// Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
// You need to return the highest scoring word as a string.
// If two words score the same, return the word that appears earliest in the original string.
// All letters will be lowercase and all inputs will be valid.

// My answer

public class Kata {

    public static String high(String s) {
      int sumOfEach = 0;      
      int[] numArray = new int[array.length];
      final String alphabets = "abcdefghijklmnopqrstuvwxyz";

      // Store each word as a separate string in an array  
      String[] array = s.split(" ");

      // Looping through the string array to loop each word
      for(int i=0; i < array.length; i++) {
        //Obtaining the score of each letter and sums them all   
        for(int j=0; j < array[i].length(); j++){
          sumOfEach += alphabets.indexOf(array[i].charAt(j)) + 1;
        }
        // Storing the score of word in int array
        numArray[i] = sumOfEach;
        // Resetting the score of word for the next loop
        sumOfEach = 0;
      }
      
      int largest = numArray[0];
      int index = 0;
      
      // Find the largest score of the word and its index
      for(int k=0; k < numArray.length; k++) {
        if(largest < numArray[k]) {
          largest = numArray[k];
          index = k;
        }
      }
      // Returning the word as string by utilising the index obtained     
      return array[index];
    }
  } 