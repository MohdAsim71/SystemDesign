package com.example.systemdesign.compositePattern

class MovieCollection(private val name: String) : MovieComponent {
    private val children = mutableListOf<MovieComponent>()

    fun add(component: MovieComponent) {
        children.add(component)
    }

    fun remove(component: MovieComponent) {
        children.remove(component)
    }

    override fun showDetails() {
        println("Collection: $name")
        for (child in children) {
            child.showDetails()
        }
    }
}
