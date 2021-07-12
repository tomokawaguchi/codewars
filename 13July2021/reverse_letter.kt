// Simple Fun #176: Reverse Letter

// Task
// Given a string str, reverse it omitting all non-alphabetic characters.

// Example
// For str = "krishan", the output should be "nahsirk".
// For str = "ultr53o?n", the output should be "nortlu".

// Input/Output
// - [input] string str
// A string consists of lowercase latin letters, digits and symbols.

// - [output] a string


fun reverseLetter(str: String) = str.reversed().filter{ it.isLetter() }


// Other developer's solution
fun reverseLetter(str: String): String {
    return str.filter(Char::isLetter).reversed()
}