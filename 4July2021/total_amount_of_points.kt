// Total amount of points

// Our football team finished the championship. The result of each match look like "x:y". 
// Results of all matches are recorded in the collection.

// For example: ["3:1", "2:2", "0:1", ...]

// Write a function that takes such collection and counts the points of our team in the championship. 
// Rules for counting points for each match:

// if x>y - 3 points
// if x<y - 0 point
// if x=y - 1 point

// Notes:
// there are 10 matches in the championship
// 0 <= x <= 4
// 0 <= y <= 4


fun points(games: List<String>): Int {
    var result = 0
    // Looping through the list
    for(i in games) {
        // check the condtion to get points
        // Obtain the first Char and convert it into Int
        if(i.get(0).toInt() > i.get(2).toInt()){
            result += 3
        } else if (i.get(0).toInt() == i.get(2).toInt()){
            result += 1
        }
    }    
    return result
}

/**
 * Other solutions by using sumBy method
 */
fun points(games: List<String>) = games.sumBy {
    // Store 2 teams' score separately
    val (x, y) = it.split(:)
    // Specify the condition
    when {
        x > y -> 3
        x < y -> 0
        else -> 1
    }
}
    
/**
 * map() will create a List of quantity first, then we sum them by calling sum()    
 */    
fun points(games: List<String>) = games.map { 
    if (it.first() > it.last()) 3 
    else if (it.first() == it.last()) 1 
    else 0 
    }.sum()
