package com.fesvieira.calculatorapp

import com.fesvieira.calculatorapp.CalculatorOperation

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null
)