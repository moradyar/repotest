package com.moradyar.networkcore

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class NetworkHandler {

    fun get(uri: String): String {
        val url = URL(uri)
        val jsonString = with(url.openConnection() as HttpURLConnection) {
            requestMethod = GET
            BufferedReader(InputStreamReader(inputStream)).use {
                val response = StringBuilder()
                var inputLine = it.readLine()
                while (inputLine != null) {
                    response.append(inputLine)
                    inputLine = it.readLine()
                }
                it.close()
                return@with response.toString()
            }
        }
        return jsonString
    }

    companion object {
        private const val GET = "GET"
    }
}