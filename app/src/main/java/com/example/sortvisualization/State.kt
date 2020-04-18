package com.example.sortvisualization

sealed class State {
    data class Sorting(val dataset: Array<BarChart.Bar>) : State()
}