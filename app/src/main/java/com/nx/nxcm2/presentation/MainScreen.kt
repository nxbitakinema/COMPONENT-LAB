package com.nx.nxcm2.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.DrawerValue
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberDrawerState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.compose.rememberNavController
import com.nx.nxcm2.R
import com.nx.nxcm2.component.BottomNavigationBar
import com.nx.nxcm2.component.Drawer
import com.nx.nxcm2.component.TopAppBarX
import com.nx.nxcm2.navigation.NavGraph

@Composable
fun MainScreen() {

    val navController = rememberNavController()
    val scope = rememberCoroutineScope()
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBarX(
                scaffoldState = scaffoldState,
                scope = scope
            )
        },
        drawerContent = {
            Drawer(
                scaffoldState = scaffoldState,
                scope = scope,
                navController = navController
            )
        },
        drawerBackgroundColor = colorResource(id = R.color.colorPrimary),
        bottomBar = { BottomNavigationBar(navController) },
        backgroundColor = colorResource(id = R.color.colorPrimaryDark)
    ) { padding ->
        Row(
            modifier = Modifier.padding(padding)
        ) {
            Box(
                modifier = Modifier.padding(padding)
            ) {
                NavGraph(navController = navController)

            }
        }
    }
}



