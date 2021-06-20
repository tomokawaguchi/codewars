// Sum of Digits / Digital Root

// Digital root is the recursive sum of all the digits in a number.

// Given n, take the sum of the digits of n. If that value has more than one digit, 
//continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.

// Example 
// 16  -->  1 + 6 = 7
// 942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
// 132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
// 493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2

public class DRoot {
    public static int digital_root(int n) {
        // when given n is 2 digit, convert n to list of numbers and add them until it
        // becomes 1 digit
        while (n >= 10) {
            // Convert int to string, map each char and finally format it to be array
            int[] nums = Integer.toString(n).chars().map(each -> each - '0').toArray();
            // reset n so that we can use it as result variable
            n = 0;
            // Add numbers from the list
            for (int i : nums)
                n += i;
        }
        return n;
    }
}

// Other developer's solutions

public class DRootAlternative {
    public static int digital_root(int n) {
        return (n != 0 && n % 9 == 0) ? 9 : n % 9;
    }
}

public class DRootAlternative2 {
    public static int digital_root(int n) {
        while (n > 9) {
            n = n / 10 + n % 10;
        }
        return (n);
    }
}