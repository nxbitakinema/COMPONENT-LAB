package com.nx.nxcm2.navigation

import androidx.compose.runtime.Composable
import com.nx.nxcm2.R
import com.nx.nxcm2.presentation.ScreenTabA
import com.nx.nxcm2.presentation.ScreenTabB
import com.nx.nxcm2.presentation.ScreenTabC

// BOTTOM NAVIGATION BAR
sealed class Screen(
    var route: String,
    var icon: Int,
) {
    object Home : Screen(
        route = "home",
        icon = R.drawable.ic_home
    )
    object Music : Screen("music", R.drawable.ic_home)
    object Movies : Screen("movies", R.drawable.ic_home)
    object Books : Screen("books", R.drawable.ic_home)
    object Profile : Screen("profile", R.drawable.ic_home)
    object Settings : Screen("settings", R.drawable.ic_home)

}

// DRAWER
sealed class ScreenDrawer(
    var route: String,
    var icon: Int,
    var title: String
) {
    object Library : ScreenDrawer(
        route = "library",
        icon = R.drawable.ic_home,
        title = "LIBRARY"
    )
    object Eq : ScreenDrawer("eq", R.drawable.ic_home, "EQ")
    object Sleep : ScreenDrawer("sleep", R.drawable.ic_home, "SLEEP TIME")
    object Scan : ScreenDrawer("scan", R.drawable.ic_home, "SCAN FILE")
    object Clear : ScreenDrawer("clear", R.drawable.ic_home, "CLEAR")
    object Logout : ScreenDrawer("logout", R.drawable.ic_home, "LOG OUT")
}

// TAB
// To be able to retrieve a View (Screen)
// from a list (you’ll see what I’m talking about later)
// as @Composable and not as Unit type,
// we create a typealias that changes the Unit to @Composable
typealias ComposableFun = @Composable () -> Unit

sealed class ScreenTab(
    var route: String,
    var icon: Int,
    var title: String,
    var screen: ComposableFun
) {
    object ScreenTabA : ScreenTab("TAB A", R.drawable.ic_home, "TAB A", { ScreenTabA() })
    object ScreenTabB : ScreenTab("TAB B", R.drawable.ic_home, "TAB B", { ScreenTabB() })
    object ScreenTabC : ScreenTab("TAB C", R.drawable.ic_home, "TAB C", { ScreenTabC() })
}

