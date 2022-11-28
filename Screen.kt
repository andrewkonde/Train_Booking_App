package com.example.bookingappjc

sealed class Screen(val route: String) {
    object SplashScreen : Screen("splash_screen")
    object Home : Screen("home_screen")
}
