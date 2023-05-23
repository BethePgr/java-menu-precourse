package menu.domain;

import java.util.ArrayList;
import java.util.List;
import menu.domain.enums.Category;

public class MenuRepository {

    private final static List<Menu> menuList = new ArrayList<>();

    public void init(){
        setJapanFoods();
        setKoreaFoods();
        setChinaFoods();
        setAsiaFoods();
        setWesternFoods();
    }

    private void setJapanFoods() {
        String japanFoods = "규동, 우동, 미소시루, 스시, 가츠동, 오니기리, 하이라이스, 라멘, 오코노미야끼";
        for(String menuName : japanFoods.split(",")){
            menuList.add(new Menu(Category.JAPAN,menuName));
        }
    }

    private void setKoreaFoods(){
        String koreaFoods = "김밥, 김치찌개, 쌈밥, 된장찌개, 비빔밥, 칼국수, 불고기, 떡볶이, 제육볶음";
        for(String menuName : koreaFoods.split(",")){
            menuList.add(new Menu(Category.KOREA,menuName));
        }
    }

    private void setChinaFoods(){
        String chinaFoods = "깐풍기, 볶음면, 동파육, 짜장면, 짬뽕, 마파두부, 탕수육, 토마토 달걀볶음, 고추잡채";
        for(String menuName : chinaFoods.split(",")){
            menuList.add(new Menu(Category.CHINA,menuName));
        }
    }

    private void setAsiaFoods(){
        String asiaFoods = "팟타이, 카오 팟, 나시고렝, 파인애플 볶음밥, 쌀국수, 똠얌꿍, 반미, 월남쌈, 분짜";
        for(String menuName : asiaFoods.split(",")){
            menuList.add(new Menu(Category.ASIA,menuName));
        }
    }

    private void setWesternFoods(){
        String westernFoods = "라자냐, 그라탱, 뇨끼, 끼슈, 프렌치 토스트, 바게트, 스파게티, 피자, 파니니";
        for(String menuName : westernFoods.split(",")){
            menuList.add(new Menu(Category.WESTERN,menuName));
        }
    }
}
