package menu.view;

import java.util.List;
import java.util.stream.Collectors;
import menu.domain.Coach;
import menu.service.MenuService;
import menu.utils.Converter;

public class OutputView {

    public static void startGame(){
        System.out.println("점심 메뉴 추천을 시작합니다.\n");
    }

    public static void printResult(MenuService menuService){
        System.out.println("메뉴 추천 결과입니다.\n");
        System.out.println("[ 구분 | 월요일 | 화요일 | 수요일 | 목요일 | 금요일 ]");
        System.out.println(Converter.makeOneStringByList(menuService.getCategoryList(),"[ 카테고리"));
        printCoachMenus(menuService);
    }

    public static void printCoachMenus(MenuService menuService){
        for(Coach coach : menuService.getCoaches().getCoachList()){
            List<String> collect = coach.getMyMenuList().getMenuList().stream()
                .map(menu -> menu.getMenuName()).collect(
                    Collectors.toList());
            System.out.println(Converter.makeOneStringByList(collect,"[ " + coach.getName()));
        }
    }
}
