package com.example.taskjetpack

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.taskjetpack.data.Data
import com.example.taskjetpack.model.Film

@Composable
fun DetailFilmScreen(
    modifier: Modifier =Modifier,
    navController: NavController,
    filmId: Int?
) {
    val newFilmList = Data.films.filter { film ->
        film.id == filmId
    }

    Column (modifier = modifier){
        DetailFilmContent(newFilmList = newFilmList)
    }
}

@Composable
private fun DetailFilmContent(
    newFilmList: List<Film>,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = modifier.padding(20.dp)
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(data = newFilmList[0].photo)
                .build(),
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(height = 250.dp, width = 170.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentDescription = "Film Image"
        )
        Spacer(modifier = Modifier.padding(16.dp))
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = newFilmList[0].title,
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = newFilmList[0].genre,
                style = MaterialTheme.typography.titleMedium
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun DetailFilmScreen() {
    DetailFilmContent(newFilmList = Data.films)
}
