// Shortest Word

// Simple, given a string of words, return the length of the shortest word(s).

// String will never be empty and you do not need to account for different data types.


fun findShort(s: String): Int {  
   val stringArray = s.split(" ").toTypedArray()
   var result = stringArray[0].length
    
   for (word in stringArray)
    if(word.length < result) {
        result = word.length
    } 
    
   return result
}


// Other developer's solutions

fun findShort(s: String): Int = s.split(" ").minBy { it.length }!!.length

fun findShort(s: String) = s.split(' ').map(String::length).min()

fun findShort(s: String): Int =
    s.splitToSequence(" ").map { it.length }.min() ?: 0