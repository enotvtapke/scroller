package de.scroller

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform