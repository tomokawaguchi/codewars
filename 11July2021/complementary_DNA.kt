// Complementary DNA

// Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.

// If you want to know more http://en.wikipedia.org/wiki/DNA

// In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". You have function with one side of the DNA (string, except for Haskell); you need to get the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).

// More similar exercise are found here http://rosalind.info/problems/list-view/ (source)

// Example: (input: output)

// makeComplement("ATTGC") // return "TAACG"

// makeComplement("GTAT") // return "CATA"


package dna

fun makeComplement(dna : String) : String {
    val array = dna.split("")
    
    val result = array.map { when(it) {
        "A" -> "T"
        "T" -> "A"
        "C" -> "G"
        else -> "C"
    }}
    
    val re = result.slice(1..result.size-2)
       
    return re.joinToString("")
}


//Other developer's solution

fun makeComplement(dna: String) = dna.map { when(it) {
    'A' -> 'T'
    'T' -> 'A'
    'C' -> 'G'
    'G' -> 'C'
    else -> it
} }.joinToString("")