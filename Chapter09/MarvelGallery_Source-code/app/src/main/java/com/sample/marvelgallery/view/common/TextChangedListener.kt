package com.sample.marvelgallery.view.common

import android.text.Editable
import android.text.TextWatcher
import android.widget.TextView

fun TextView.addOnTextChangedListener(config: TextWatcherConfiguration.() -> Unit) {
    addTextChangedListener(TextWatcherConfiguration().apply { config() })
}

class TextWatcherConfiguration : TextWatcher {

    private var beforeTextChangedCallback: (BeforeTextChangedFunction)? = null
    private var onTextChangedCallback: (OnTextChangedFunction)? = null
    private var afterTextChangedCallback: (AfterTextChangedFunction)? = null

    fun beforeTextChanged(callback: BeforeTextChangedFunction) {
        beforeTextChangedCallback = callback
    }

    fun onTextChanged(callback: OnTextChangedFunction) {
        onTextChangedCallback = callback
    }

    fun afterTextChanged(callback: AfterTextChangedFunction) {
        afterTextChangedCallback = callback
    }

    override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
        beforeTextChangedCallback?.invoke(s.toString(), start, count, after)
    }

    override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
        onTextChangedCallback?.invoke(s.toString(), start, before, count)
    }

    override fun afterTextChanged(s: Editable) {
        afterTextChangedCallback?.invoke(s)
    }
}

private typealias BeforeTextChangedFunction = (text: String, start: Int, count: Int, after: Int) -> Unit
private typealias OnTextChangedFunction = (text: String, start: Int, before: Int, count: Int) -> Unit
private typealias AfterTextChangedFunction = (s: Editable) -> Unit