@file:JvmName("ParserUtil")

package org.kat.util

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

fun <T> String.toJsonObject(valueType: Class<T>): T {
    return jacksonObjectMapper().readValue(this, valueType)
}