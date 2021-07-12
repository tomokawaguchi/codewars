// Maximum Length Difference

// You are given two arrays a1 and a2 of strings. Each string is composed with letters from a to z. 
// Let x be any string in the first array and y be any string in the second array.

// Find max(abs(length(x) − length(y)))

// If a1 and/or a2 are empty return -1 in each language except in Haskell (F#) where you will return Nothing (None).

// Example:
// a1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"]
// a2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]
// mxdiflg(a1, a2) --> 13

// Bash note:
// input : 2 strings with substrings separated by ,
// output: number as a string


package maxlendiff

fun mxdiflg(a1:Array<String>, a2:Array<String>):Int {
    // Retrun -1 if it's empty
    if(a1.isEmpty() || a2.isEmpty()) return -1
    
    // Sort arrays and get the first and last elements 
    val longest1 = a1.sortedBy { it.length }.last().length
    val shortest1 = a1.sortedBy { it.length }.first().length
    val longest2 = a2.sortedBy { it.length }.last().length
    val shortest2 = a2.sortedBy { it.length }.first().length

    val dif1 = longest1 - shortest2
    val dif2 = longest2 - shortest1   
    
    // Alternative is to return maxOf(dif1, dif2)
    return if(dif1 > dif2) dif1 else dif2
}


// Other developer's solutions

fun mxdiflg(a1:Array<String>, a2:Array<String>) 
    = a1.flatMap { s1 -> a2.map { kotlin.math.abs(s1.length - it.length) } }.max() ?: -1


fun mxdiflg(a1:Array<String>, a2:Array<String>) = if (a1.isEmpty() || a2.isEmpty()) -1 else listOf(
    a1.maxBy { it.length }!!.length - a2.minBy { it.length }!!.length,
    a2.maxBy { it.length }!!.length - a1.minBy { it.length }!!.length
).max()