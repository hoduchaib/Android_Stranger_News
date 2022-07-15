package com.example.strangernews

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import com.example.strangernews.di.RepositoryModule
import com.example.strangernews.di.ViewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.ksp.generated.module

class MyApplication: Application() {

    private val rootModules = listOf(RepositoryModule().module, ViewModelModule().module)

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            modules(rootModules)
        }
    }
}
