package problemArchives

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

fun problem3() {
    val list = mutableListOf<Int>()
    var number = 600851475143
    var divNumber = 2
    while (divNumber <= number) {
        if (number % divNumber == 0L) {
            list.add(divNumber)
            number /= divNumber
        }
        divNumber++
    }
    println(list)
}

/**
 * [71, 839, 1471, 6857]
 */