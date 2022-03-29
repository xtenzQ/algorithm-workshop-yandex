package linear_search

// Linear search - checks all elements, O(N)
// https://www.youtube.com/watch?v=SKwB41FrGgU

// Find first (left) positive number X in sequence or display -1 if not found
fun findX(seq: String, x: Char): Int {
    return seq.indices.firstOrNull { x == seq[it] } ?: -1
}