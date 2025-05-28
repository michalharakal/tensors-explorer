package sk.ai.net.tools.models.explorer

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "explorer",
    ) {
        App()
    }
}