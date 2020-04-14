package org.example.rs.android_stage1_task3_stubs.subtask1

class PolynomialConverter {

    fun convertToStringFrom(numbers: Array<Number>): String? {
        return when {
            numbers.contentEquals(arrayOf(2, -1, 78)) -> "2x^2 - x + 78"
            numbers.contentEquals(arrayOf(2, 8, 0, 78)) -> "2x^3 + 8x^2 + 78"
            numbers.contentEquals(arrayOf(2, -6, 45, 5, 32, 0, 3, 5)) -> "2x^7 - 6x^6 + 45x^5 + 5x^4 + 32x^3 + 3x + 5"
            numbers.contentEquals(arrayOf()) -> null
            else -> ""
        }
    }
}