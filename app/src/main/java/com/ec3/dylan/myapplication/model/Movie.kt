package com.ec3.dylan.myapplication.model

import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("original_title")
    val originalTitle: String,
    @SerializedName("overview")
    val overview: String,
    @SerializedName("poster_path")
    val posterPath: String,
    @SerializedName("release_date")
    val releaseDate: String
)
fun getData() : List<Movie> {
    return listOf(
        Movie("John Wick 3: Parabellum", "El legendario sicario John Wick es perseguido por las calles de Nueva York. Lo buscan unos mercenarios por una recompensa de 14 millones de dólares por su cabeza y por romper con una regla.", "/rktDFPbfHfUbArZ6OOOKsXcv0Bm.jpg", "2019-05-17"),
        Movie("The Flash", "Barry Allen (Flash) decide usar sus superpoderes para viajar en el tiempo de esa forma cambiar algunos eventos que ocurrieron en su pasado (fallecimiento de su madre), pero al hacerlo altera su futuro y el mundo.", "/gPbM0MK8CP8A174rmUwGsADNYKD.jpg", "2023-06-13"),
        Movie("Barbie", "Después de ser expulsada de Barbieland por no ser una muñeca de aspecto perfecto, Barbie parte hacia el mundo humano para encontrar la verdadera felicidad.", "/iuFNMS8U5cb6xfzi51Dbkovj7vM.jpg", "2023-07-19")
    )
}
