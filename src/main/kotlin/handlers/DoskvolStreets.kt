package org.darkmentat.handlers

import org.darkmentat.Resources.Doskvol.Streets.mood
import org.darkmentat.Resources.Doskvol.Streets.impressions_sights
import org.darkmentat.Resources.Doskvol.Streets.impressions_sounds
import org.darkmentat.Resources.Doskvol.Streets.impressions_smells
import org.darkmentat.Resources.Doskvol.Streets.use
import org.darkmentat.Resources.Doskvol.Streets.type
import org.darkmentat.Resources.Doskvol.Streets.details
import org.darkmentat.Resources.Doskvol.Streets.props
import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton
import org.telegram.telegrambots.meta.bots.AbsSender


class DoskvolStreetsHandler(sender: AbsSender): Handler(sender, "/doskvol_streets") {

    override fun process(msg: String) {

            val mood = mood.random()
            val sights = impressions_sights.random()
            val sounds = impressions_sounds.random()
            val smells = impressions_smells.random()
            val use = use.random()
            val type = type.random()
            val details = details.random()
            val props = props.random()

            sender.execute(
                SendMessage()
                    .setChatId(chatId)
                    .setText("Обстановка: $mood\nВидно: $sights\nСлышно: $sounds\nЗапах: $smells\nФункция: $use\nТип: $type\nДетали: $details\nАнтураж: $props")
            )
    }
}