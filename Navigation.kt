package com.example.bookingappjc

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import  androidx.navigation.compose.rememberNavController
import com.example.bookingappjc.Home

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.SplashScreen.route) {
        composable(route = Screen.SplashScreen.route) {
            animatedSplash(navController = navController)
        }
        composable(route = Screen.Home.route) {
            Home()
        }
    }
}