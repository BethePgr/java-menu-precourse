package menu;

import camp.nextstep.edu.missionutils.Randoms;
import menu.controller.MenuController;
import menu.domain.Menu;
import menu.domain.MenuRepository;
import menu.domain.enums.Category;
import menu.utils.Converter;

public class Application {
    public static void main(String[] args) {
        MenuController menuController = new MenuController();
        menuController.run();
    }
}
