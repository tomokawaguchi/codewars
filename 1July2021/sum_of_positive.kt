// Sum of positive

// You get an array of numbers, return the sum of all of the positives ones.

// Example [1,-4,7,12] => 1 + 7 + 12 = 20

// Note: if there is nothing to sum, the sum is default to 0.


fun sum(numbers: IntArray): Int {
    var result = 0
    for(num in numbers){
        if(num > 0){
            result += num
        }
    }
    return result
}


// Other developer's solutions

fun sumAlter(numbers: IntArray) = numbers.filter { it > 0 }.sum()