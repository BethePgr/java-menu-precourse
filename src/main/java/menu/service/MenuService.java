package menu.service;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;
import menu.domain.Coach;
import menu.domain.Coaches;
import menu.domain.MenuRepository;
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
            selectOneCategory();
        }
    }

    public void selectOneCategory(){
        String categoryType = Category.selectCategory();
        categoryList.add(categoryType);
        addMenuAllCoach(categoryType);
    }

    public void addMenuAllCoach(String categoryType){
        for(Coach coach : coaches.getCoachList()){
            String name = Randoms.shuffle(getOneCategoryOfMenuList(categoryType)).get(0);
            coach.addMyMenuList(MenuRepository.getMenuByName(name));
        }
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
