package me.rerere.tts.model

class TtsHttpException(
    val httpCode: Int,
    val httpMessage: String,
    val errorBody: String?,
    val extractedMessage: String,
) : Exception("TTS HTTP $httpCode: $extractedMessage")