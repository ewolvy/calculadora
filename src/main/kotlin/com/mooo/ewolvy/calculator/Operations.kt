package com.mooo.ewolvy.calculator

class Operations{
    companion object{
        fun add(a: Double, b: Double): Double{
            return a + b
        }

        fun rest(a: Double, b: Double): Double{
            return a - b
        }

        fun mult(a: Double, b: Double): Double{
            return a * b
        }

        @Throws(ArithmeticException::class)
        fun div(a: Double, b: Double): Double{
            if (b == 0.0){
                throw ArithmeticException("Division by 0")
            }else {
                return a / b
            }
        }

        fun sqr(a: Double): Double{
            return Math.sqrt(a)
        }
    }
}