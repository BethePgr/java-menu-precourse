package menu.domain;

import menu.domain.enums.Category;

public class Menu {

    private final Category category;
    private final String menuName;

    public Menu(Category category, String menuName) {
        this.category = category;
        this.menuName = menuName;
    }

    public String getMenuName(){
        return menuName;
    }
}
