// ATM

// There is enough money available on ATM in nominal value 10, 20, 50, 100, 200 and 500 dollars.

// You are given money in nominal value of n with 1<=n<=1500.

// Try to find minimal number of notes that must be used to repay in dollars, or output -1 if it is impossible.

// Good Luck!!!

package solution

fun count(number: Int): Int {
    var counter = 0
    var remaining = number

    if(number % 10 != 0) {
        return -1 
    } else {        
        while(remaining > 0) {
            when {
                remaining >= 500 -> remaining -= 500
                remaining >= 200 -> remaining -= 200
                remaining >= 100 -> remaining -= 100
                remaining >= 50 -> remaining -= 50
                remaining >= 20 -> remaining -= 20
                remaining >= 10 -> remaining -= 10
            }
            counter++
        }
    }
    return counter
}

// Other developer's solution

val values = listOf(500, 200, 100, 50, 20, 10)

fun count(amount: Int): Int {
    val (a, k) = values.fold(Pair(amount, 0)){ (a, k), v -> Pair(a % v, k + a / v) }
    return if (a == 0) k else -1
}


fun count(number: Int):Int = when {
    number % 10 != 0 -> -1
    number - 500 >= 0 -> 1 + count(number - 500)
    number - 200 >= 0 -> 1 + count(number - 200)
    number - 100 >= 0 -> 1 + count(number - 100)
    number - 50 >= 0 -> 1 + count(number - 50)
    number - 20 >= 0 -> 1 + count(number - 20)
    number - 10 >= 0 -> 1 + count(number - 10)
    else -> 0
 }


 fun count(number: Int) = if (number % 10 > 0) -1 else listOf(500, 200, 100, 50, 20, 10)
    .fold(listOf(number, 0)) { acc, i -> listOf(acc[0] % i, acc[1] + acc[0] / i) }[1]