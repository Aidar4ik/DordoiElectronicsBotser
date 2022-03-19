package menu;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {

    public SendMessage getMainMenu(Update update){
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> list = new ArrayList<>();
        list.add(createMenu("Мужская одежда"));
        list.add(createMenu("Женская одежда"));
        list.add(createMenu("Детская одежда"));
        list.add(createMenu("Товары Оптом"));
        replyKeyboardMarkup.setKeyboard(list);

        SendMessage send = new SendMessage();
        String messages = "❕Здравствуйте меня зовут Айдар, и я создатель этого бота.\n" +
                "Этот бот предназначен для того чтобы, делиться товарами с рынка Дордой.\n" +
                "❕Этот бот хранит в себе данные о категориях\n" +
                "❕По любым вопросам можете написать мне на \n" +
                "WhatsApp: +996502215034";
        send.setChatId(update.getMessage().getChatId().toString());
        send.setReplyMarkup(replyKeyboardMarkup);
        send.setText(messages);
        return send;
    }

    public KeyboardRow createMenu(String name) {
        KeyboardRow keyboardRow = new KeyboardRow();
        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText(name);
        keyboardRow.add(keyboardButton);
        return keyboardRow;
    }
}

