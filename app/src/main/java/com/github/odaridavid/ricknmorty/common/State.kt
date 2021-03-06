package com.github.odaridavid.ricknmorty.common

sealed class State<out Result> {

    data class Success<out Result>(val data: Result? = null) : State<Result>()

    data class Error(val throwable: Throwable? = null) : State<Nothing>()
}
