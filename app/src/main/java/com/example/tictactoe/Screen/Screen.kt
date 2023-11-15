package com.example.tictactoe.Screen

sealed class Screen(val route: String){
    object MainScreen : Screen(route = "main")
}
