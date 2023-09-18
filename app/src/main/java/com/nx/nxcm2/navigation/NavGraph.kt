package com.nx.nxcm2.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.nx.nxcm2.presentation.BooksScreen
import com.nx.nxcm2.presentation.HomeScreen
import com.nx.nxcm2.presentation.MoviesScreen
import com.nx.nxcm2.presentation.MusicScreen
import com.nx.nxcm2.presentation.ProfileScreen
import com.nx.nxcm2.presentation.ScreenDrawerA
import com.nx.nxcm2.presentation.ScreenDrawerB
import com.nx.nxcm2.presentation.ScreenDrawerC
import com.nx.nxcm2.presentation.ScreenDrawerD
import com.nx.nxcm2.presentation.ScreenDrawerE
import com.nx.nxcm2.presentation.ScreenDrawerF
import com.nx.nxcm2.presentation.SettingsScreen

@Composable
fun NavGraph(
    navController: NavHostController
) {
    NavHost(
        navController,
        startDestination = Screen.Home.route
    ) {

        // BOTTOM NAVIGATION
        composable(Screen.Home.route) {
            HomeScreen()
        }
        composable(Screen.Music.route) {
            MusicScreen()
        }
        composable(Screen.Movies.route) {
            MoviesScreen()
        }
        composable(Screen.Books.route) {
            BooksScreen()
        }
        composable(Screen.Profile.route) {
            ProfileScreen()
        }
        composable(Screen.Settings.route) {
            SettingsScreen()
        }

        // DRAWER
        composable(ScreenDrawer.Library.route) {
            ScreenDrawerA()
        }
        composable(ScreenDrawer.Eq.route) {
            ScreenDrawerB()
        }
        composable(ScreenDrawer.Sleep.route) {
            ScreenDrawerC()
        }
        composable(ScreenDrawer.Scan.route) {
            ScreenDrawerD()
        }
        composable(ScreenDrawer.Clear.route) {
            ScreenDrawerE()
        }
        composable(ScreenDrawer.Logout.route) {
            ScreenDrawerF()
        }


    }
}