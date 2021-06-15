// Stop gninnipS My sdroW!

// Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (like the name of this kata).

// * Strings passed in will consist of only letters and spaces.
// * Spaces will be included only when more than one word is present.

// Examples:
// spinWords("Hey fellow warriors") => "Hey wollef sroirraw" 
// spinWords("This is a test") => "This is a test" 
// spinWords("This is another test") => "This is rehtona test"



public class SpinWords {

  public String spinWords(String sentence) {
    // Storing separated words in an string array  
    String [] stringsArray = sentence.split(" ");
    StringBuilder sb = new StringBuilder();
    
    // Loop through the array to check each word if its length is larger than 5
    for(int i=0; i < stringsArray.length; i++) {
      if(stringsArray[i].length() >= 5) {
        // Reverse any 5+ length word by using StringBuilder  
        for(int j=stringsArray[i].length() - 1; j >= 0; j--) {
          sb.append(stringsArray[i].charAt(j));
        }
        // Replcae obtained StringBuilder with the original word
        stringsArray[i] = sb.toString();
        // Clear the StringBuilder for the next word
        sb.setLength(0);
      }
    }
    
    // Converting obtained array to a single stirng with spaces between words
    String result = String.join(",", stringsArray).replace(",", " ");
  
    return result;
  }
}