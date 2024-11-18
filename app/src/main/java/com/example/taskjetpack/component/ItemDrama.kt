package com.example.taskjetpack.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.taskjetpack.R
import com.example.taskjetpack.model.Drama
import com.example.taskjetpack.ui.theme.TaskJetpackTheme

@Composable
fun ItemDrama(
    drama: Drama,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = drama.photo),
            contentDescription = drama.title,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = drama.title,
            textAlign = TextAlign.Center,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview
@Composable
private fun ItemDramaPreview() {
    TaskJetpackTheme {
        ItemDrama(
            drama = Drama(
                1,
                "Descendants of The Sun",
                "Romansa, Melodrama dan Komedi",
                R.drawable.descendantsofthesun
            )
        )
    }
}