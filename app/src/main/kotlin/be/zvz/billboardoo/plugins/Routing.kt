package be.zvz.billboardoo.plugins

import be.zvz.billboardoo.routes.rankRouting
import be.zvz.billboardoo.routes.songRouting
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        rankRouting()
        songRouting()
    }
}
