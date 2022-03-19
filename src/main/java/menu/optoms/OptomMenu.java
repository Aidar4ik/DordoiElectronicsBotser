package menu.optoms;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class OptomMenu {
    public SendMessage getMensMenu(Update update){
        SendMessage sendMessage = new SendMessage();
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> lines = new ArrayList<>();

        List<InlineKeyboardButton> buttonslines1= new ArrayList<>();
        buttonslines1.add(createButtonLine("https://t.me/+JHkIy4-PGQYyZjgy","Оптом Товары"));
        lines.add(buttonslines1);


        markup.setKeyboard(lines);
        String messages = "Примечание: Если выходит сообщение 'Лимит попыток исчерпан. Попробуйте позже' "
                +"\n"+"Подождите около 5 минут"+"\n"+
                "Категория:";
        sendMessage.setChatId(update.getMessage().getChatId().toString());
        sendMessage.setReplyMarkup(markup);
        sendMessage.setText(messages);
        return sendMessage;
    }

    public InlineKeyboardButton createButtonLine(String url,String text){
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setUrl(url);
        button.setText(text);
        button.setCallbackData("Call back data");
        return button;
    }
}
