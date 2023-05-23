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
        menuList.add(new Menu(Category.JAPAN,"규동"));
        menuList.add(new Menu(Category.JAPAN,"우동"));
        menuList.add(new Menu(Category.JAPAN,"미소시루"));
        menuList.add(new Menu(Category.JAPAN,"스시"));
        menuList.add(new Menu(Category.JAPAN,"가츠동"));
        menuList.add(new Menu(Category.JAPAN,"오니기리"));
        menuList.add(new Menu(Category.JAPAN,"하이라이스"));
        menuList.add(new Menu(Category.JAPAN,"라멘"));
        menuList.add(new Menu(Category.JAPAN,"오코노미야끼"));



    }

    private static void setKoreaFoods() {
        menuList.add(new Menu(Category.KOREA,"김밥"));
        menuList.add(new Menu(Category.KOREA,"김치찌개"));
        menuList.add(new Menu(Category.KOREA,"쌈밥"));
        menuList.add(new Menu(Category.KOREA,"된장찌개"));
        menuList.add(new Menu(Category.KOREA,"비빔밥"));
        menuList.add(new Menu(Category.KOREA,"칼국수"));
        menuList.add(new Menu(Category.KOREA,"불고기"));
        menuList.add(new Menu(Category.KOREA,"떡볶이"));
        menuList.add(new Menu(Category.KOREA,"제육볶음"));

    }
    private static void setChinaFoods() {
        menuList.add(new Menu(Category.CHINA, "깐풍기"));
        menuList.add(new Menu(Category.CHINA, "볶음면"));
        menuList.add(new Menu(Category.CHINA, "동파육"));
        menuList.add(new Menu(Category.CHINA, "짜장면"));
        menuList.add(new Menu(Category.CHINA, "짬뽕"));
        menuList.add(new Menu(Category.CHINA, "마파두부"));
        menuList.add(new Menu(Category.CHINA, "탕수육"));
        menuList.add(new Menu(Category.CHINA, "토마토 달걀볶음"));
        menuList.add(new Menu(Category.CHINA, "고추잡채"));
    }

    private static void setAsiaFoods() {
        menuList.add(new Menu(Category.ASIA, "팟타이"));
        menuList.add(new Menu(Category.ASIA, "카오 팟"));
        menuList.add(new Menu(Category.ASIA, "나시고렝"));
        menuList.add(new Menu(Category.ASIA, "파인애플 볶음밥"));
        menuList.add(new Menu(Category.ASIA, "쌀국수"));
        menuList.add(new Menu(Category.ASIA, "똠얌꿍"));
        menuList.add(new Menu(Category.ASIA, "반미"));
        menuList.add(new Menu(Category.ASIA, "월남쌈"));
        menuList.add(new Menu(Category.ASIA, "분짜"));


    }
    private static void setWesternFoods() {
        menuList.add(new Menu(Category.WESTERN, "라자냐"));
        menuList.add(new Menu(Category.WESTERN, "그라탱"));
        menuList.add(new Menu(Category.WESTERN, "뇨끼"));
        menuList.add(new Menu(Category.WESTERN, "끼슈"));
        menuList.add(new Menu(Category.WESTERN, "프렌치 토스트"));
        menuList.add(new Menu(Category.WESTERN, "바게트"));
        menuList.add(new Menu(Category.WESTERN, "스파게티"));
        menuList.add(new Menu(Category.WESTERN, "피자"));
        menuList.add(new Menu(Category.WESTERN, "파니니"));

    }

    public static List<String> getOneCategoryOfMenuList(String category) {
        return menuList.stream()
            .filter(menu -> menu.getCategory().getType().equals(category))
            .map(menu -> menu.getMenuName()).collect(
                Collectors.toList());
    }

    public static Menu getMenuByName(String name) {
        return menuList.stream().filter(menu -> menu.getMenuName().equals(name)).findFirst()
            .orElseThrow(() -> new IllegalArgumentException("[ERROR] 존재하지않는 메뉴입니다."));
    }

    public static List<Menu> getMenuList(){
        return menuList;
    }
}
