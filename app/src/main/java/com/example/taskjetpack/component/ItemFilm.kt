package com.example.taskjetpack.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.taskjetpack.R
import com.example.taskjetpack.model.Film
import com.example.taskjetpack.ui.theme.TaskJetpackTheme

@Composable
fun ItemFilm(
    film: Film,
    modifier: Modifier,
    onItemClicked: (Int) -> Unit
){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxSize()
            .clickable {
                onItemClicked(film.id)
            }
    ){
        Image(
            painter = painterResource(id = film.photo),
            contentDescription = film.title,
            modifier = Modifier.clip(RectangleShape).size(80.dp)
        )
        Spacer(modifier = Modifier.width(15.dp))
        Column {
            Text(
                text = film.title,
                style = MaterialTheme.typography.titleMedium,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.width(170.dp),
                maxLines = 1
            )
            Text(
                text = film.genre,
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primary,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.width(170.dp),
                maxLines = 1
            )

        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun ItemFilmHorizontal(){
    TaskJetpackTheme {
        ItemFilm(
            film = Film(
                id = 1,
                title = "Inside Out",
                genre = "Animasi",
                photo = R.drawable.insideout
            ),
            onItemClicked = { filmId ->
                println("Film Id: $filmId")
            },
            modifier = Modifier
        )
    }
}