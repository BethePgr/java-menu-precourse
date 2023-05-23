package menu.domain;

public class Coach {

    private final String name;
    private final Menus hateMenuList;
    private final Menus myMenuList;

    public Coach(String name) {
        this.name = name;
        this.hateMenuList = new Menus();
        this.myMenuList = new Menus();
    }

    public void addMyMenuList(Menu menu){
        myMenuList.addMenu(menu);
    }

    public String getName(){
        return name;
    }
}
