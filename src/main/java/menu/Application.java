package menu;

import menu.controller.MenuController;
import menu.domain.enums.Category;
import menu.utils.Converter;

public class Application {
    public static void main(String[] args) {
        MenuController menuController = new MenuController();
        menuController.run();
    }
}
