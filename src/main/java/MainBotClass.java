import menu.MainMenu;
import menu.babies.BabiesMenu;
import menu.mens.MensMenu;
import menu.optoms.OptomMenu;
import menu.womens.WomensMenu;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class MainBotClass extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "dordoi_storebot";
    }

    //5221870523:AAH12yhoU-QnrELDVwWeSYAnSQ8OJ5caB4w
    @Override
    public String getBotToken() {
        return "5224886865:AAETW7BWSgL8uY5I1vEv4PqNClWeeWYx_64";
    }

    @Override
    public void onUpdateReceived(Update update) {
        String message = update.getMessage().getText().toString();
        switch (message) {
            case "/start":
                MainMenu mainMenu = new MainMenu();
                try {
                    execute(mainMenu.getMainMenu(update));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                break;
            case "Женская одежда":
                WomensMenu womensMenu = new WomensMenu();
                try {
                    execute(womensMenu.getWomensMenu(update));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                break;
            case "Мужская одежда":
                MensMenu mensMenu = new MensMenu();
                try {
                    execute(mensMenu.getMensMenu(update));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                break;
            case "Детская одежда":
                BabiesMenu babiesMenu = new BabiesMenu();
                try {
                    execute(babiesMenu.getBabiesMenu(update));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                break;
            case "Товары Оптом":
                OptomMenu optomMenu = new OptomMenu();
                try {
                    execute(optomMenu.getMensMenu(update));
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}
