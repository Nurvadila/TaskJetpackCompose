package com.example.taskjetpack

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BrowseGallery
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Topic
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.taskjetpack.component.BottomBar
import com.example.taskjetpack.navigation.NavigationItem
import com.example.taskjetpack.navigation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FilmApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
){
    val navBackStackEntry = navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry.value?.destination?.route
    val context = LocalContext.current

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Film dan Drama")
                }
            )
        },
        bottomBar = {
            BottomBar(navController)
        },
        modifier = modifier
    ) {
        contentPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Film.route,
            modifier = modifier.padding(contentPadding)
        ){
            composable(Screen.Film.route){
                FilmScreen(navController)
            }
            composable(Screen.Drama.route){
                DramaScreen()
            }
            composable(Screen.About.route){
                AboutScreen()
            }

            composable(Screen.Detail.route + "/{filmId}",
                arguments = listOf(navArgument("filmId"){
                    type = NavType.IntType
                })
            ) {navBackStackEntry ->
                DetailFilmScreen(
                    navController = navController,
                    filmId = navBackStackEntry.arguments?.getInt("filmId"))
            }
        }
    }
}
