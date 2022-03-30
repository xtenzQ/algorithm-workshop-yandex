package linear_search

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ProblemFKtTest {

    @Test
    fun findShortestWordsTest() {
        val input = listOf("dd", "a", "ssss", "f", "eww", "l")
        val expected = "a f l"
        val actual = findShortestWords(input)
        assertEquals(expected, actual)
    }

    @Test
    fun emptyWordsTest() {
        val input = listOf("", "", "")
        val expected = "  "
        val actual = findShortestWords(input)
        assertEquals(expected, actual)
    }
}