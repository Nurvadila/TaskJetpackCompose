package com.example.taskjetpack.navigation

sealed class Screen (val route: String) {
    data object Film : Screen ("film")
    data object Drama : Screen ("drama")
    data object About : Screen ("about")
    data object Detail : Screen ("detail")
}