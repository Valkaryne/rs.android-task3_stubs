package org.example.rs.android_stage1_task3_stubs

import org.example.rs.android_stage1_task3_stubs.subtask2.Combinator
import org.junit.Assert
import org.junit.Test

class CombinatorTests {

    private val combinator = Combinator()

    @Test
    fun testCheckChoose1() {
        val result = combinator.checkChooseFromArray(arrayOf(6, 4))
        Assert.assertEquals(2, result)
    }

    @Test
    fun testCheckChoose2() {
        val result = combinator.checkChooseFromArray(arrayOf(4, 4))
        Assert.assertEquals(1, result)
    }

    @Test
    fun testCheckChoose3() {
        val result = combinator.checkChooseFromArray(arrayOf(4, 2))
        Assert.assertEquals(null, result)
    }

    @Test
    fun testCheckChoose4() {
        val result = combinator.checkChooseFromArray(arrayOf(35, 7))
        Assert.assertEquals(3, result)
    }

    @Test
    fun testCheckChoose5() {
        val result = combinator.checkChooseFromArray(arrayOf(36, 7))
        Assert.assertEquals(null, result)
    }

    @Test
    fun testCheckChoose6() {
        val result = combinator.checkChooseFromArray(arrayOf(184756, 20))
        Assert.assertEquals(10, result)
    }
}