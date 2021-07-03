// Return Negative

// In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?

// Example:
// Kata().makeNegative(1)  // return -1
// Kata().makeNegative(-5) // return -5
// Kata().makeNegative(0)  // return 0

// Notes:
// The number can be negative already, in which case no change is required.
// Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.

class Kata {
    fun makeNegative(x: Int): Int {
        if (x > 0) {
          return -x
        }
        return x   
    }
}

// Other developer's solution 1
import kotlin.math.abs

class KataAlternative {
    fun makeNegative(x: Int) = -abs(x)
}


// Other developer's solution 2
import kotlin.math.absoluteValue

class KataAlternative2 {
    fun makeNegative(x: Int) = -x.absoluteValue
}