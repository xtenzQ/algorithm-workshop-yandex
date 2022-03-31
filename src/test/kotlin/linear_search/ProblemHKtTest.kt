package linear_search

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ProblemHKtTest {

    @Test
    fun doRLETest() {
        val input = "AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBB"
        val expected = "A4B3C2XYZD4E3F3A6B5"
        val actual = doRLE(input)
        assertEquals(expected, actual)
    }
}