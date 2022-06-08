package com.test.jetpackcompose_calculator_app

sealed class CalculatorOperation(val symbol : String) {
    object Add: CalculatorOperation("+")
    object Sub: CalculatorOperation("-")
    object Multiply: CalculatorOperation("x")
    object Divide: CalculatorOperation("/")

}
