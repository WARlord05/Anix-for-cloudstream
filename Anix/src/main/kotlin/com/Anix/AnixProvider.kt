package com.Anix

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class AnixProvider: Plugin() {
    override fun load(context: Context) {
        registerMainAPI(Anix())
        registerExtractorAPI(AnimesagaStream())
    }
}