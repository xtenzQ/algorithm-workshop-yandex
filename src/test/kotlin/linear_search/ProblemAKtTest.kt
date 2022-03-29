package linear_search

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ProblemAKtTest {

    @Test
    fun symbolFound() {
        val input = "12123"
        assertEquals(1, findX(input, '2'))
    }

    @Test
    fun symbolNotFound() {
        val input = "123545431"
        assertEquals(-1, findX(input, '9'))
    }

    @Test
    fun emptyInput() {
        val input = ""
        assertEquals(-1, findX(input, '9'))
    }

    @Test
    fun allCharsAreSame() {
        val input = "1111111111111"
        assertEquals(0, findX(input, '1'))
    }

}