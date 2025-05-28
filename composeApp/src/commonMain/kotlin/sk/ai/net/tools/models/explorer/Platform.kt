package sk.ai.net.tools.models.explorer

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform