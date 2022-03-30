package linear_search

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ProblemAKtTest {

    @Test
    fun symbolFound() {
        val input = intArrayOf(1, 2, 1, 2, 3)
        val expected = 1
        val actual = findX(input, 2)
        assertEquals(expected, actual)
    }

    @Test
    fun symbolNotFound() {
        val input = intArrayOf(1, 2, 3, 5, 4, 5, 4, 3, 1)
        val expected = -1
        val actual = findX(input, 9)
        assertEquals(expected, actual)
    }

    @Test
    fun emptyInput() {
        val input = intArrayOf()
        val expected = -1
        val actual = findX(input, 9)
        assertEquals(expected, actual)
    }
}