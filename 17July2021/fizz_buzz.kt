// Fizz Buzz

// Return an array containing the numbers from 1 to N, where N is the parametered value.

// Replace certain values however if any of the following conditions are met:

// - If the value is a multiple of 3: use the value "Fizz" instead
// - If the value is a multiple of 5: use the value "Buzz" instead
// - If the value is a multiple of 3 & 5: use the value "FizzBuzz" instead

// N will never be less than 1.

// Method calling example:

// fizzBuzz(3) -->  ["1", "2", "Fizz"]



fun fizzBuzz(n: Int): Array<String> {
  var listArray = (1..n).toList().map { it.toString() }.toTypedArray()
    
    for(i in listArray.indices) 
        when {
            listArray[i].toInt() % 15 == 0 -> listArray.set(i, "FizzBuzz")
            listArray[i].toInt() % 3 == 0 -> listArray.set(i, "Fizz")
            listArray[i].toInt() % 5 == 0 -> listArray.set(i, "Buzz")
            else -> listArray[i]
        } 
    return listArray
}

// Other developer's solution

fun fizzBuzz(n: Int) = (1..n).map {
    when{it % 15 == 0 -> "FizzBuzz"
        it % 5 == 0 -> "Buzz"
        it % 3 == 0 -> "Fizz"
        else -> "$it"
    }
}.toTypedArray()