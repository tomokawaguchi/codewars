// Convert number to reversed array of digits

// Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

// Example:
// 348597 => [7,9,5,8,4,3]


object Kata {
    // Convert the givern long to String so that we can map
    // Each char needs to be mapped as Int 
    // Reverse the List<Int> and convert it to IntArray 
    fun digitize(n:Long):IntArray    
        = n.toString().map { it.toString().toInt() }.reversed().toIntArray()
}