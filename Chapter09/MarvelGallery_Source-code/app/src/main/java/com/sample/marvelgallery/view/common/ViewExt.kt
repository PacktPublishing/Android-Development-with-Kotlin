package com.sample.marvelgallery.view.common

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Parcelable
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide

fun ImageView.loadImage(photoUrl: String, centerCropped: Boolean = false) {
    Glide.with(context)
            .load(photoUrl)
            .apply { if (centerCropped) centerCrop() }
            .into(this)
}

fun Context.toast(text: String, length: Int = Toast.LENGTH_LONG) {
    Toast.makeText(this, text, length).show()
}

fun <T : Parcelable> Activity.extra(key: String, default: T? = null): Lazy<T> = lazy { intent?.extras?.getParcelable<T>(key) ?: default ?: throw Error("No value $key in extras") }

inline fun <reified T : Activity> Context.getIntent() = Intent(this, T::class.java)