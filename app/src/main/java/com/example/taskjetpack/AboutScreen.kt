package com.example.taskjetpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.taskjetpack.ui.theme.TaskJetpackTheme

@Composable
fun AboutScreen(
    modifier: Modifier = Modifier,
) {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.foto),
            contentDescription = "Profile Image" ,
            contentScale = ContentScale.Inside,
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text("Nama: Nur Vadila")
        Text("Email: vadilanur27@gmail.com")
        Text("Universitas: Universitas Papua")
        Text("Jurusan: Teknik Informatika")
    }
}

@Preview(showSystemUi = true)
@Composable
private fun AboutScreenPreview() {
    TaskJetpackTheme {
        AboutScreen()
    }
}
