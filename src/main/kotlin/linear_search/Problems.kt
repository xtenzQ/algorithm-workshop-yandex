package linear_search

import kotlin.math.max
import kotlin.math.min

// Linear search - checks all elements, O(N)
// https://www.youtube.com/watch?v=SKwB41FrGgU

/**
 * Problem A.
 * Find first (left) positive number X in sequence or display -1 if not found
 *
 * @param seq numbers sequence with length N (0..IntMax)
 * @param x searched number
 *
 * @return position of number [x], -1 if number not found
 */
fun findX(seq: IntArray, x: Int): Int {
    // return seq.indices.firstOrNull { x == seq[it] } ?: -1
    for (currentPosition in seq.indices) {
        if (seq[currentPosition] == x) {
            return currentPosition
        }
    }
    return -1
}

/**
 * Problem B.
 * Find last (right) position of number X in sequence or display -1 if not found
 *
 * @param seq numbers sequence with length N (0..IntMax)
 * @param x searched number
 *
 * @return position of number [x], -1 if number not found
 */
fun findVeryRightX(seq: IntArray, x: Int): Int {
    // return seq.indices.lastOrNull { x == seq[it] } ?: -1
    for (currentPosition in seq.indices.reversed()) {
        if (seq[currentPosition] == x) {
            return currentPosition
        }
    }
    return -1
}

/**
 * Problem С.
 * Find max number in sequence
 *
 * @param seq numbers sequence with length N (1..IntMax)
 *
 * @return maximum number in a sequence [seq]
 */
fun findMax(seq: IntArray): Int {
    var answer = seq[0]
    for (currentPosition in 1 until seq.size) {
        if (seq[currentPosition] > answer) {
            answer = seq[currentPosition]
        }
    }
    return answer
}

/**
 * Problem D.
 * Find the biggest number in sequence and the second-biggest number
 *
 * @param seq numbers sequence with length N (1..IntMax)
 *
 * @return [IntArray] of two maximum numbers of [seq]
 */
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

/**
 * Problem E.
 * Find minimal even number in sequence or print -1 if not found
 *
 * @param seq numbers sequence with length N (0..IntMax)
 *
 * @return minimal even number or -1 if not found
 */
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

/**
 * Problem F.
 * Display the shortest words separated by a space
 *
 * @param words list of words
 *
 * @return string divided by spaces including the shortest words
 */
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

/**
 * Problem G.
 * PitCraft is a 2D game and its work consists of 1x1 blocks. Player's island is a set of columns of a different
 * height and includes water blocks and stone blocks. After a heavy rain, the island was flooded and filled the low
 * ground.
 *
 * Picture below illustrates the island. s is a stone block, w is a water block.
 *
 *         s
 *     s w s
 * s w s s s w w s
 * s w s s s w w s
 * s s s s s s s s s
 */
fun picCraft(listOfHeights: IntArray): Int {
    var peakPos = 0
    for (currentPosition in listOfHeights.indices) {
        if (listOfHeights[currentPosition] > listOfHeights[peakPos]) {
            peakPos = currentPosition
        }
    }
    var result = 0
    var localPeak = 0
    for (currentPosition in 0 until peakPos) {
        if (listOfHeights[currentPosition] > localPeak) {
            localPeak = listOfHeights[currentPosition]
        }
        result += localPeak - listOfHeights[currentPosition]
    }
    localPeak = 0
    for (currentPosition in listOfHeights.size - 1 downTo peakPos) {
        if (listOfHeights[currentPosition] > localPeak) {
            localPeak = listOfHeights[currentPosition]
        }
        result += localPeak - listOfHeights[currentPosition]
    }
    return result
}