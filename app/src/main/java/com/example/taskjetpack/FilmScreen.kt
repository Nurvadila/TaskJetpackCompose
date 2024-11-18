package com.example.taskjetpack

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.taskjetpack.component.ItemFilm
import com.example.taskjetpack.data.Data
import com.example.taskjetpack.model.Film
import com.example.taskjetpack.navigation.Screen

@Composable
fun FilmScreen(
    navController: NavHostController,
    films: List<Film> = Data.films
){
    Box(
        modifier = Modifier.fillMaxSize()
    ){
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                items(films, key = { it.id }){
                    ItemFilm(
                        film = it,
                        modifier = Modifier
                    ) { filmId ->
                        navController.navigate(Screen.Detail.route + "/$filmId")
                    }
                }
            }
    }
}