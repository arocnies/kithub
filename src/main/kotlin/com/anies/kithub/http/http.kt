package com.anies.kithub.http

import org.w3c.xhr.XMLHttpRequest
import kotlin.coroutines.experimental.suspendCoroutine

class HttpEndpoint(val baseUrl: String) {
    suspend fun request(method: String, url: String, body: dynamic = null) = suspendCoroutine<String> { cont ->
        val req = XMLHttpRequest()
        req.onreadystatechange = {
            if (req.readyState == XMLHttpRequest.DONE) {
                if (req.status / 100 == 2) {
                    cont.resume(req.response as String)
                } else {
                    cont.resumeWithException(RuntimeException("HTTP error: ${req.status}"))
                }
            }
        }
        req.open(method, "$baseUrl/${url.removePrefix("/")}")
        if (body != null) req.send(body) else req.send()
    }
}

