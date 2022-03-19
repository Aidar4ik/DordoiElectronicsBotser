package menu.mens;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class MensMenu {
    public SendMessage getMensMenu(Update update){
        SendMessage sendMessage = new SendMessage();
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> lines = new ArrayList<>();

        List<InlineKeyboardButton> buttonslines1= new ArrayList<>();
        buttonslines1.add(createButtonLine("https://t.me/+a_AlIPxtPKhlN2Ji","Футболки"));
        buttonslines1.add(createButtonLine("https://t.me/+XDzitZJXMy0wNTEy","Обувь"));
        buttonslines1.add(createButtonLine("https://t.me/+jQ795ju5kjlhZDVi","Кофты"));
        lines.add(buttonslines1);

        List<InlineKeyboardButton> buttonslines2= new ArrayList<>();
        buttonslines2.add(createButtonLine("https://t.me/+F6uUSaPwa8dmYzIy","Рубашки"));
        buttonslines2.add(createButtonLine("https://t.me/+Q-oDJWw7F3NhNWNi","Джинсы"));
        buttonslines2.add(createButtonLine("https://t.me/+PT69UXfeaRhlNDUy","Пиджаки"));
        lines.add(buttonslines2);

        List<InlineKeyboardButton> buttonslines3= new ArrayList<>();
        buttonslines3.add(createButtonLine("https://t.me/+7pO8mKzc7Wg5ZmUy","Спортивная одежда"));
        buttonslines3.add(createButtonLine("https://t.me/+A-0iqUkeCpg2OTYy","Костюмы"));
        buttonslines3.add(createButtonLine("https://t.me/+_j3mClXaiKVmNWUy","Кардиганы"));
        lines.add(buttonslines3);

        List<InlineKeyboardButton> buttonslines4= new ArrayList<>();
        buttonslines4.add(createButtonLine("https://t.me/+R_iNjGGuuFtiNGIy","Водолазки"));
        buttonslines4.add(createButtonLine("https://t.me/+AFV3vq2szrw4ZjM6","Галстуки"));
        buttonslines4.add(createButtonLine("https://t.me/+rZcnNBvxZf8xZDJi","Ремни"));
        lines.add(buttonslines4);

        markup.setKeyboard(lines);
        String messages = "Примечание: Если выходит сообщение 'Лимит попыток исчерпан. Попробуйте позже' "
                +"\n"+"Подождите около 5 минут"+"\n"+
                "\n" +
                "Категория Мужской одежды:";
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
