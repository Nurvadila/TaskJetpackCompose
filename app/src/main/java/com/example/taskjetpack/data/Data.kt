package com.example.taskjetpack.data

import com.example.taskjetpack.R
import com.example.taskjetpack.model.About
import com.example.taskjetpack.model.Drama
import com.example.taskjetpack.model.Film

object Data {
    val films = listOf(
        Film(
            id = 1,
            title = "Inside Out",
            genre = "Animasi",
            photo = R.drawable.insideout
        ),
        Film(
            id = 2,
            title = "Inside Out 2",
            genre = "Animasi",
            photo = R.drawable.insideout2
        ),
        Film(
            id = 3,
            title = "Dua Garis Biru",
            genre = "Drama Romantis" ,
            photo = R.drawable.duagarisbiru
        ),
        Film(
            id = 4,
            title = "Laskar Pelangi",
            genre = "Drama Inspiratif",
            photo = R.drawable.laskarpelangi
        ),
        Film(
            id = 5,
            title = "KKN di Desa Penari",
            genre = "Horor Supranatural",
            photo = R.drawable.kkndesapenari
        ),
        Film(
            id = 6,
            title = "Nanti Kita Cerita Tentang Hari Ini",
            genre = "Drama Keluarga",
            photo = R.drawable.nanticeritahariini
        ),
        Film(
            id = 7,
            title = "My Stupid Boss",
            genre = "Komedi",
            photo = R.drawable.mystupidboss
        ),
        Film(
            id = 8,
            title = "Dilan 1990",
            genre = "Percintaan Remaja",
            photo = R.drawable.dilan1990
        ),
        Film(
            id = 9,
            title = "Habibie & Ainun",
            genre = "Drama Biografi dan Romantis",
            photo = R.drawable.habibieainun
        ),
        Film(
            id = 10,
            title = "Miracle In Cell No.7",
            genre = "Drama Keluarga, Komedi dan Persahabatan",
            photo = R.drawable.miraclecell
        ),
    )

    val kdrama = listOf(
        Drama(
            id = 1,
            title = "Descendants of The Sun",
            genre = "Romansa, Melodrama dan Komedi",
            photo = R.drawable.descendantsofthesun
        ),
        Drama(
            id = 2,
            title = "Start-Up",
            genre = "Drama Percintaan",
            photo = R.drawable.startup
        ),
        Drama(
            id = 3,
            title = "Legend of the Blue Sea",
            genre = "Fantasi Romantis",
            photo = R.drawable.legendofthebluesea
        ),
        Drama(
            id = 4,
            title = "Hotel Del Luna",
            genre = "Fantasi Romantis dan Horor",
            photo = R.drawable.hoteldelluna
        ),
        Drama(
            id = 5,
            title = "100 Days My Prince",
            genre = "Drama Sejarah Romantis",
            photo = R.drawable.daysmyprince
        ),
        Drama(
            id = 6,
            title = "Crash Landing on You",
            genre = "Drama Romantis",
            photo = R.drawable.crashlanding
        ),
        Drama(
            id = 7,
            title = "Tale of the Nine",
            genre = "Fantasi Romantis, Aksi dan Horor",
            photo = R.drawable.taleofthenine
        ),
        Drama(
            id = 8,
            title = "Dr. Romantic 3",
            genre = "Drama Medis dan Romantis",
            photo = R.drawable.drromantic3
        ),
        Drama(
            id = 9,
            title = "Vicenzo",
            genre = "Crime Drama",
            photo = R.drawable.vincenzo
        ),
        Drama(
            id = 10,
            title = "Mouse",
            genre = "Misteri dan Crime",
            photo = R.drawable.mouse
        ),
    )

    val identitas = listOf(
        About(
            name = "NUR VADILA",
            email = "vadilanur27@gmail.com",
            university = "Papua University",
            major = "Informatics Engineering",
            photo = R.drawable.foto
        )
    )
}