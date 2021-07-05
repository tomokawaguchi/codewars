// Remove First and Last Character

// It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string. 
// You're given one parameter, the original string. 
// You don't have to worry with strings with less than two characters.

// Create substring with starting and ending index 
fun removeChar(str: String): String = str.substring(1, str.length -1)

// Other solutions - drop() method
fun removeChar(str: String) = str.drop(1).dropLast(1) 