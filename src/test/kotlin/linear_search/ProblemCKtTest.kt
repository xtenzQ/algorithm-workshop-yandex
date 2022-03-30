package linear_search

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ProblemCKtTest {

    @Test
    fun findMaxTest() {
        val input = intArrayOf(1, 2, 4, 6, 5)
        val expected = 6
        val actual = findMax(input)
        assertEquals(expected, actual)
    }

    @Test
    fun findMaxInEqualSeqTest() {
        val input = intArrayOf(2, 2, 2, 2, 2)
        val expected = 2
        val actual = findMax(input)
        assertEquals(expected, actual)
    }

    @Test
    fun findSingleMaxTest() {
        val input = intArrayOf(10)
        val expected = 10
        val actual = findMax(input)
        assertEquals(expected, actual)
    }

    @Test
    fun negativeSearchTest() {
        val input = intArrayOf(-100, -50, -10, -5, -1)
        val expected = -1
        val actual = findMax(input)
        assertEquals(expected, actual)
    }
}