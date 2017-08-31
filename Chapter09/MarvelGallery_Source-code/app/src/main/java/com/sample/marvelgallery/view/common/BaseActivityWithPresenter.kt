package com.sample.marvelgallery.view.common

import android.support.v7.app.AppCompatActivity
import com.sample.marvelgallery.presenter.Presenter

abstract class BaseActivityWithPresenter : BaseActivity() {

    abstract val presenter: Presenter

    override fun onDestroy() {
        super.onDestroy()
        presenter.onViewDestroyed()
    }
}
