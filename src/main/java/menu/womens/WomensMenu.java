package menu.womens;

import org.glassfish.hk2.api.InstanceLifecycleEvent;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class WomensMenu {
    public SendMessage getWomensMenu(Update update){
        SendMessage sendMessage = new SendMessage();
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> lines = new ArrayList<>();

        List<InlineKeyboardButton> buttonslines1= new ArrayList<>();
        buttonslines1.add(createButtonLine("https://t.me/+eXjGBNZvuuAxMTY6","Платья"));
        buttonslines1.add(createButtonLine("https://t.me/+iPtUhFGJ76diMTNi","Футболки"));
        buttonslines1.add(createButtonLine("https://t.me/+aorrTWxa6owwNzVi","Пальто"));
        lines.add(buttonslines1);

        List<InlineKeyboardButton> buttonslines2= new ArrayList<>();
        buttonslines2.add(createButtonLine("https://t.me/+pPOVeE6CwkxkOGI6","Кардиганы"));
        buttonslines2.add(createButtonLine("https://t.me/+c-kqomr5_dhmNzky","Обувь"));
        buttonslines2.add(createButtonLine("https://t.me/+JqmhXqf-yMAwNTRi","Костюмы"));
        lines.add(buttonslines2);

        List<InlineKeyboardButton> buttonslines3= new ArrayList<>();
        buttonslines3.add(createButtonLine("https://t.me/+kQHh8dGH6pYyZGNi","Свиттеры"));
        buttonslines3.add(createButtonLine("https://t.me/+k_WMpgIhdHo1Mzgy","Тренчи"));
        buttonslines3.add(createButtonLine("https://t.me/+GSVW3fuWF0g2MzAy","Брюки"));
        lines.add(buttonslines3);

        List<InlineKeyboardButton> buttonslines4= new ArrayList<>();
        buttonslines4.add(createButtonLine("https://t.me/+QIP-WFA8ohZkNzIy","Сумки"));
        buttonslines4.add(createButtonLine("https://t.me/+RXEBIBY6JuwwN2M6","Блузы"));
        buttonslines4.add(createButtonLine("https://t.me/+lx-cN_Bes7QyOGZi","Водолазки"));
        lines.add(buttonslines4);

        List<InlineKeyboardButton> buttonslines5= new ArrayList<>();
        buttonslines5.add(createButtonLine("https://t.me/+WHx5hHFiLe9hYTk6","Юбки"));
        buttonslines5.add(createButtonLine("https://t.me/+XLSZJm-JQcw1MWIy","Джинсы"));
        buttonslines5.add(createButtonLine("https://t.me/+rVv9CvjMO_k3YTcy","Куртки"));
        lines.add(buttonslines5);

        List<InlineKeyboardButton> buttonslines6= new ArrayList<>();
        buttonslines6.add(createButtonLine("https://t.me/+qJsOfafTrCM3Y2Ji","Топы"));
        buttonslines6.add(createButtonLine("https://t.me/+BqKIhwf122kxM2Yy","Туники"));
        lines.add(buttonslines6);


        markup.setKeyboard(lines);
        String messages = "Примечание: Если выходит сообщение 'Лимит попыток исчерпан. Попробуйте позже' "
                +"\n"+"Подождите около 5 минут"+"\n"+
                "\n" +
                "Категория Женской одежды:";
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
