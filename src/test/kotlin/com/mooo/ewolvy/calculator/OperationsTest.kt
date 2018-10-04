package com.mooo.ewolvy.calculator

import org.junit.Assert.*
import org.junit.Test
import java.util.*

class OperationsTest{
    private val delta = 0.1
    @Test
    fun addTest(){
        val a = Random().nextDouble() * 1000
        val b = Random().nextDouble() * 1000
        val res = Operations.add(a, b)
        assertEquals(a + b, res, delta)
    }

    @Test
    fun restTest(){
        val a = Random().nextDouble() * 1000
        val b = Random().nextDouble() * 1000
        val res = Operations.rest(a, b)
        assertEquals(a - b, res, delta)
    }

    @Test
    fun multTest(){
        val a = Random().nextDouble() * 1000
        val b = Random().nextDouble() * 1000
        val res = Operations.mult(a, b)
        assertEquals(a * b, res, delta)
    }

    @Test
    fun divTest(){
        val a = Random().nextDouble() * 1000
        val r = Random().nextDouble() * 1000
        val b = if (r != 0.0){r} else {1.0}
        val res = Operations.div(a, b)
        assertEquals(a / b, res, delta)
    }

    @Test(expected = ArithmeticException::class)
    fun divBy0Test(){
        Operations.div(1.0, 0.0)
    }

    @Test
    fun sqrTest(){
        val a = Random().nextDouble() * 1000
        val res = Operations.sqr (a)
        val delta = 0.1
        assertEquals(Math.sqrt(a), res, delta)
    }
}