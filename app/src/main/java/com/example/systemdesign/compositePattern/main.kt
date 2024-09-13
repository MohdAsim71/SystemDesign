package com.example.systemdesign.compositePattern

fun main() {
    // Create movies
    val movie1 = Movie("The Shawshank Redemption", "Drama")
    val movie2 = Movie("The Godfather", "Crime")
    val movie3 = Movie("Inception", "Sci-Fi")
    val movie4 = Movie("Interstellar", "Sci-Fi")

    // Create movie collections
    val sciFiCollection = MovieCollection("Sci-Fi Collection")
    val dramaAndCrimeCollection = MovieCollection("Drama and Crime Collection")
    val allMoviesCollection = MovieCollection("All Movies Collection")

    // Add movies to collections
    sciFiCollection.add(movie3)
    sciFiCollection.add(movie4)
    dramaAndCrimeCollection.add(movie1)
    dramaAndCrimeCollection.add(movie2)

    // Add collections to the all-movies collection
    allMoviesCollection.add(sciFiCollection)
    allMoviesCollection.add(dramaAndCrimeCollection)

    // Display the movie collection structure
    allMoviesCollection.showDetails()
}
