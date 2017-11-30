package com.anies.kithub.http

import kotlin.coroutines.experimental.Continuation
import kotlin.coroutines.experimental.EmptyCoroutineContext
import kotlin.coroutines.experimental.startCoroutine
import kotlin.coroutines.experimental.suspendCoroutine
import kotlin.js.Promise

fun <T> async(block: suspend () -> T): Promise<T> = Promise { resolve, reject ->
    block.startCoroutine(object : Continuation<T> {
        override val context = EmptyCoroutineContext
        override fun resumeWithException(exception: Throwable) {
            reject(exception)
        }

        override fun resume(value: T) {
            resolve(value)
        }
    })
}

suspend fun <T> Promise<T>.await(): T = suspendCoroutine { cont ->
    then(
            onFulfilled = { cont.resume(it) },
            onRejected = { cont.resumeWithException(it) }
    )
}

fun launch(block: suspend () -> Unit) {
    async(block).catch { console.error("Coroutine failed: $it") }
}

