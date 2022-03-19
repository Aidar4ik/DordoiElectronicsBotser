package menu.babies;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class BabiesMenu {
    public SendMessage getBabiesMenu(Update update){
        SendMessage sendMessage = new SendMessage();
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> lines = new ArrayList<>();

        List<InlineKeyboardButton> buttonslines1= new ArrayList<>();
        buttonslines1.add(createButtonLine("https://t.me/+FJnBdealvyYzYTBi","Для девочек"));
        lines.add(buttonslines1);

        List<InlineKeyboardButton> buttonslines2= new ArrayList<>();
        buttonslines2.add(createButtonLine("https://t.me/+cvguqPFckTo1MTAy","Для мальчиков"));
        lines.add(buttonslines2);

        List<InlineKeyboardButton> buttonslines3= new ArrayList<>();
        buttonslines3.add(createButtonLine("https://t.me/+zfEDSKaXR9FmNjMy","Для малышей"));
        lines.add(buttonslines3);

        markup.setKeyboard(lines);
        String messages = "Примечание: Если выходит сообщение 'Лимит попыток исчерпан. Попробуйте позже' "
                +"\n"+"Подождите около 5 минут"+"\n"+
                "\n" +
                "Категория Детской одежды:";
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
