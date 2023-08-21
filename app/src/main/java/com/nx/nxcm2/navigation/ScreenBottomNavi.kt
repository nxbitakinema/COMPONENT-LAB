package com.nx.nxcm2.navigation

import androidx.compose.runtime.Composable
import com.nx.nxcm2.R
import com.nx.nxcm2.presentation.ScreenTabA
import com.nx.nxcm2.presentation.ScreenTabB
import com.nx.nxcm2.presentation.ScreenTabC

//sealed class ScreenBottomNavigationBar(
//    var route: String,
//    var icon: ImageVector
//) {
//
//    // BOTTOM NAVIGATION BAR
//    object Home : ScreenBottomNavigationBar("home", Icons.Filled.Home)
//    object Music : ScreenBottomNavigationBar("music", Icons.Filled.Search)
//    object Movies : ScreenBottomNavigationBar("movies", Icons.Rounded.Add)
//    object Books : ScreenBottomNavigationBar("books", Icons.Filled.FavoriteBorder)
//    object Profile : ScreenBottomNavigationBar("profile", Icons.Filled.Person)
//
//}
//
//sealed class ScreenDrawer(
//    var route: String,
//    var icon: ImageVector,
//    var title: String
//) {
//    // DRAWER
//    object Library : ScreenDrawer("library", Icons.Default.List,"LIBRARY")
//    object Eq : ScreenDrawer("eq", Icons.Default.List, "EQ")
//    object Sleep : ScreenDrawer("sleep", Icons.Default.Lock, "SLEEP TIME")
//    object Scan : ScreenDrawer("scan", Icons.Default.Share, "SCAN FILE")
//    object Clear : ScreenDrawer("clear", Icons.Default.Refresh, "CLEAR")
//    object Logout : ScreenDrawer("logout", Icons.Default.ArrowBack, "LOG OUT")
//}


sealed class Screen(
    var route: String,
    var icon: Int
) {

    // BOTTOM NAVIGATION BAR
    object Home : Screen(
        route = "home",
        icon = R.drawable.ic_home
    )
    object Music : Screen("music", R.drawable.ic_nectar)
    object Movies : Screen("movies", R.drawable.ic_payment)
    object Books : Screen("books", R.drawable.ic_orders)
    object Profile : Screen("profile", R.drawable.ic_my_details)
    object Settings : Screen("settings", R.drawable.ic_notification)

}

sealed class ScreenDrawer(
    var route: String,
    var icon: Int,
    var title: String
) {

    // DRAWER
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














// for TAB
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

