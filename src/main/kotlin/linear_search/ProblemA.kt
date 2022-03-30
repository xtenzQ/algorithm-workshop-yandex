package linear_search

import kotlin.math.max
import kotlin.math.min

// Linear search - checks all elements, O(N)
// https://www.youtube.com/watch?v=SKwB41FrGgU

// Problem A. Find first (left) positive number X in sequence or display -1 if not found
fun findX(seq: IntArray, x: Int): Int {
    return seq.indices.firstOrNull { x == seq[it] } ?: -1
}

// Problem B.

// Problem D. Find the biggest number in sequence and the second-biggest number
fun findTwoMax(seq: IntArray): IntArray {
    var firstMax = max(seq[0], seq[1])
    var secondMax = min(seq[0], seq[1])

    for (currentNumber in seq) {
        if (currentNumber > firstMax) {
            secondMax = firstMax
            firstMax = currentNumber
        } else if (currentNumber > secondMax) {
            secondMax = currentNumber
        }
    }
    return intArrayOf(firstMax, secondMax)
}

// Problem E. Find minimal even number in sequence or print -1 if not found
fun findMinimalEvenNumber(seq: IntArray): Int {
    var answer = -1
    var flag = false
    for (currentNumber in seq) {
        if (currentNumber % 2 == 0 && (!flag || answer > currentNumber)) {
            answer = currentNumber
            flag = true
        }
    }
    return answer
}

// Problem F. Display the shortest words separated by a space
fun findShortestWords(words: List<String>): String {
    var minLength = words[0].length
    for (word in words) {
        if (word.length < minLength) {
            minLength = word.length
        }
    }
    // https://stackoverflow.com/questions/36262305/difference-between-list-and-array-types-in-kotlin
    var answer = arrayListOf<String>()
    for (word in words) {
        if (word.length == minLength) {
            answer.add(word)
        }
    }
    return answer.joinToString(separator = " ")
}