package org.kat.controller

import io.javalin.Context
import org.kat.User

class UserController(private val data: Map<Int, User>) {

    fun getUser(ctx: Context) {
        ctx.pathParam("id").toInt().let { index ->
            data[index]?.let { user ->
                ctx.json(user)
                return
            }
            ctx.status(404)
        }
    }
}