package linear_search

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.test.assertContentEquals

internal class ProblemDKtTest {

    @Test
    fun casualTest() {
        val input = intArrayOf(1, 3, 2, 5, 10, 12, 11)
        val expected = intArrayOf(12, 11)
        val actual = findTwoMax(input)
        assertContentEquals(expected, actual)
    }

    @Test
    fun shortInputTest() {
        val input = intArrayOf(2, 2)
        val expected = intArrayOf(2, 2)
        val actual = findTwoMax(input)
        assertContentEquals(expected, actual)
    }

    @Test
    fun sameMaxLongTest() {
        val input = intArrayOf(1, 3, 2, 15, 15, 12, 11)
        val expected = intArrayOf(15, 15)
        val actual = findTwoMax(input)
        assertContentEquals(expected, actual)
    }
}