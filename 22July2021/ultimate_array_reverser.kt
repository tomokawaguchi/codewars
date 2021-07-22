// Ultimate Array Reverser

// Given an array of strings, reverse them and their order in such way that their length stays the same as the length of the original inputs.

// Example:
// Input:  {"I", "like", "big", "butts", "and", "I", "cannot", "lie!"}
// Output: {"!", "eilt", "onn", "acIdn", "ast", "t", "ubgibe", "kilI"}


fun reverse(a: List<String>): List<String> {  
    // Create a string that is jointed and revsered 
    var reversedString = a.joinToString("").reversed()
    // Create a list of int containing the length of each word
    val lengthList = a.map { it.length }    
    val result = mutableListOf<String>()
    var previous = 0
    
    // Make substring based on the each length for the slot and add to the empty list while looping the lengthList 
    for (each in lengthList) {
        result.add(reversedString.substring(previous, previous + each))
        previous = previous + each
    }   
    return result
}


// Other developer's solution 

fun reverse(a: List<String>): List<String> {
    var contentsReversed = a.joinToString("").reversed()
    val output = mutableListOf<String>()
    for (word in a) {
        // Take the word from the start to the length given
        val newWord = contentsReversed.take(word.length)
        // Removing the current word from the reversed string for the nex loop
        contentsReversed = contentsReversed.drop(word.length)
        // Add the newWord 
        output.add(newWord)
    }
    return output
}