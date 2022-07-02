package problemArchives

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

fun problem4() {
    val largestNumber = mutableListOf<Int>()
    val numberRange = 100..999
    for (number1 in numberRange) {
        for (number2 in numberRange) {
            val sum = number1 * number2
            if (sum.toString() == sum.toString().reversed()) {
                largestNumber.add(sum)
            }
        }
    }
    println(largestNumber.maxOf { it })
}

/**
 * 906609
 */