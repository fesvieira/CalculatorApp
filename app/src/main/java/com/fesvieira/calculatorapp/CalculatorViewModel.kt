package com.fesvieira.calculatorapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CalculatorViewModel:ViewModel(){
    var state by mutableStateOf(CalculatorState())
        private set
}