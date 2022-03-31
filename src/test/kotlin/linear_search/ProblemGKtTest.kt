package linear_search

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ProblemsKtTest {

    @Test
    fun onePeakTest() {
        val input = intArrayOf(3, 1, 4, 3, 5, 1, 1, 3, 1)
        val expected = 7
        val actual = picCraft(input)
        assertEquals(expected, actual)
    }

    @Test
    fun twoPeaksTest() {
        val input = intArrayOf(1, 2, 5, 3, 3, 5, 4, 2)
        val expected = 4
        val actual = picCraft(input)
        assertEquals(expected, actual)
    }

    @Test
    fun noPeaksTest() {
        val input = intArrayOf(1, 2, 3, 4, 5, 4, 3, 2)
        val expected = 0
        val actual = picCraft(input)
        assertEquals(expected, actual)
    }

    @Test
    fun samePeaksTest() {
        val input = intArrayOf(1, 1, 1, 1, 1)
        val expected = 0
        val actual = picCraft(input)
        assertEquals(expected, actual)
    }
}