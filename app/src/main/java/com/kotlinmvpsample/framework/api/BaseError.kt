package com.kotlinmvpsample.framework.api

/**
 * Author: Harsh
 * Date: 08/04/18.
 */
class BaseError(private var type: String, private var message: String) {

  fun getMessage(): String {
    return message
  }

  fun setMessage(message: String) {
    this.message = message
  }

  fun getType(): ErrorType {
    return when (type.toLowerCase()) {
      "timeout" -> ErrorType.Timeout
      "network" -> ErrorType.Network
      "api" -> ErrorType.Api
      else -> ErrorType.Unknown
    }
  }

  fun setType(type: ErrorType) {
    this.type = type.name.toLowerCase()
  }

  enum class ErrorType {
    Timeout, Network, Api, Unknown
  }
}