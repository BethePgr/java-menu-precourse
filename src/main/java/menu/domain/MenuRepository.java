package menu.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import menu.domain.enums.Category;
import menu.utils.Converter;

public class MenuRepository {

    private final static List<Menu> menuList = new ArrayList<>();
    private final static String japanFoods = "규동, 우동, 미소시루, 스시, 가츠동, 오니기리, 하이라이스, 라멘, 오코노미야끼";
    private final static String koreaFoods = "김밥, 김치찌개, 쌈밥, 된장찌개, 비빔밥, 칼국수, 불고기, 떡볶이, 제육볶음";
    private final static String chinaFoods = "깐풍기, 볶음면, 동파육, 짜장면, 짬뽕, 마파두부, 탕수육, 토마토 달걀볶음, 고추잡채";
    private final static String asiaFoods = "팟타이, 카오 팟, 나시고렝, 파인애플 볶음밥, 쌀국수, 똠얌꿍, 반미, 월남쌈, 분짜";
    private final static String westernFoods = "라자냐, 그라탱, 뇨끼, 끼슈, 프렌치 토스트, 바게트, 스파게티, 피자, 파니니";

    public static void init() {
        setJapanFoods();
        setKoreaFoods();
        setChinaFoods();
        setAsiaFoods();
        setWesternFoods();
    }

    private static void setJapanFoods() {
        for (String menuName : Converter.toListSplitsByComma(japanFoods)) {
            menuList.add(new Menu(Category.JAPAN, menuName));
        }
    }

    private static void setKoreaFoods() {
        for (String menuName : Converter.toListSplitsByComma(koreaFoods)) {
            menuList.add(new Menu(Category.KOREA, menuName));
        }
    }

    private static void setChinaFoods() {
        for (String menuName : Converter.toListSplitsByComma(chinaFoods)) {
            menuList.add(new Menu(Category.CHINA, menuName));
        }
    }

    private static void setAsiaFoods() {
        for (String menuName : Converter.toListSplitsByComma(asiaFoods)) {
            menuList.add(new Menu(Category.ASIA, menuName));
        }
    }

    private static void setWesternFoods() {
        for (String menuName : Converter.toListSplitsByComma(westernFoods)) {
            menuList.add(new Menu(Category.WESTERN, menuName));
        }
    }

    public static List<String> getOneCategoryOfMenuList(String category) {
        return menuList.stream()
            .filter(menu -> menu.getCategory().getType().equals(category))
            .map(menu -> menu.getMenuName()).collect(
                Collectors.toList());
    }

    public static Menu getMenuByName(String name) {
        return menuList.stream().filter(menu -> menu.getMenuName().equals(name)).findAny().get();
    }

    public static List<Menu> getMenuList(){
        return menuList;
    }
}
