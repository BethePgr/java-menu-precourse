package menu.domain;

import java.util.ArrayList;
import java.util.List;

public class Menus {

    private final List<Menu> menuList = new ArrayList<>();

    public void addMenu(Menu menu){
        menuList.add(menu);
    }

    public List<Menu> getMenuList(){
        return menuList;
    }
}
