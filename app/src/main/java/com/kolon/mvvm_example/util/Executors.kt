package com.kolon.mvvm_example.util

import java.util.concurrent.Executors

private val IO_EXECUTOR = Executors.newSingleThreadExecutor()

fun ioThread(f : () -> Unit) = IO_EXECUTOR.execute(f)