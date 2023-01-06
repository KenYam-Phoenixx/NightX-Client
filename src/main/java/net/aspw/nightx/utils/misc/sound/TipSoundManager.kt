package net.aspw.nightx.utils.misc.sound

import net.aspw.nightx.NightX
import net.aspw.nightx.utils.FileUtils
import java.io.File

class TipSoundManager {
    var enableSound: TipSoundPlayer
    var disableSound: TipSoundPlayer
    var popSound: TipSoundPlayer

    init {
        val enableSoundFile = File(NightX.fileManager.soundsDir, "enable.wav")
        val disableSoundFile = File(NightX.fileManager.soundsDir, "disable.wav")
        val popSoundFile = File(NightX.fileManager.soundsDir, "pop.wav")

        if (!enableSoundFile.exists())
            FileUtils.unpackFile(enableSoundFile, "assets/minecraft/client/sound/enable.wav")
        if (!disableSoundFile.exists())
            FileUtils.unpackFile(disableSoundFile, "assets/minecraft/client/sound/disable.wav")
        if (!popSoundFile.exists())
            FileUtils.unpackFile(popSoundFile, "assets/minecraft/client/sound/pop.wav")

        enableSound = TipSoundPlayer(enableSoundFile)
        disableSound = TipSoundPlayer(disableSoundFile)
        popSound = TipSoundPlayer(popSoundFile)
    }
}