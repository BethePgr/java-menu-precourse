package menu.service;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;
import menu.domain.Coach;
import menu.domain.Coaches;
import menu.domain.MenuRepository;
import menu.domain.Menus;
import menu.domain.enums.Category;

public class MenuService {

    private final Coaches coaches = new Coaches();
    private final List<String> categoryList = new ArrayList<>();

    public MenuService(List<String> coachNames){
        addCoach(coachNames);
    }

    private void addCoach(List<String> coachNames){
        for(String coachName : coachNames){
            coaches.addCoachByName(coachName);
        }
    }

    public void addHateList(Coach coach, List<String> hateList){
        for(String menuName : hateList){
            coach.addHateMenuList(MenuRepository.getMenuByName(menuName));
        }
    }

    public void selectForFiveTimes(){
        for(int i = 0;i<5;i++){
            selectOneTime();
        }
    }

    public void selectOneTime(){
        String categoryType = addCategoryList();
        addMenuAllCoach(categoryType);
    }

    public String addCategoryList(){
        String categoryType = Category.selectCategory();
        if(categoryList.stream().filter(name -> name.equals(categoryType)).count() >= 2){
            return addCategoryList();
        }
        categoryList.add(categoryType);
        return categoryType;
    }


    public void addMenuAllCoach(String categoryType){
        for(Coach coach : coaches.getCoachList()){
            addMenuOneCoach(categoryType,coach,coach.getHateMenuList(),coach.getMyMenuList());
        }
    }

    public void addMenuOneCoach(String categoryType,Coach coach, Menus hateList,Menus menuList){
        String name = Randoms.shuffle(getOneCategoryOfMenuList(categoryType)).get(0);
        if(menuList.getMenuList().stream().anyMatch(menu -> menu.getMenuName().equals(name))
        || hateList.getMenuList().stream().anyMatch(menu -> menu.getMenuName().equals(name))){
            addMenuOneCoach(categoryType,coach,hateList,menuList);
            return;
        }
        coach.addMyMenuList(MenuRepository.getMenuByName(name));
    }


    public List<String> getOneCategoryOfMenuList(String category){
        return MenuRepository.getOneCategoryOfMenuList(category);
    }

    public Coaches getCoaches(){
        return coaches;
    }

    public List<String> getCategoryList(){
        return categoryList;
    }
}
