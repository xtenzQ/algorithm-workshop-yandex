package linear_search

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ProblemEKtTest {

    @Test
    fun casualTest() {
        val input = intArrayOf(1, 2, 1, 4, 6)
        val expected = 2
        val actual = findMinimalEvenNumber(input)
        assertEquals(expected, actual)
    }

    @Test
    fun noEvenNumberInSeqTest() {
        val input = intArrayOf(1, 3, 5, 7, 9)
        val expected = -1
        val actual = findMinimalEvenNumber(input)
        assertEquals(expected, actual)
    }

    @Test
    fun emptySeqTest() {
        val input = intArrayOf()
        val expected = -1
        val actual = findMinimalEvenNumber(input)
        assertEquals(expected, actual)
    }

    @Test
    fun zeroSeqTest() {
        val input = intArrayOf(0, 2, 4, 6, 8, 10)
        val expected = 0
        val actual = findMinimalEvenNumber(input)
        assertEquals(expected, actual)
    }
}