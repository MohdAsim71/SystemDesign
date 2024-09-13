package com.example.systemdesign.compositePattern
//leaf Class
class Movie(private val title: String, private val genre: String) : MovieComponent {
    override fun showDetails() {
        println("Movie: $title, Genre: $genre")
    }
}
