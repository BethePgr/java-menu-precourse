package menu.validate;

import java.util.List;
import menu.domain.Menu;
import menu.domain.MenuRepository;

public class InputCoachHateListValidate {

    public static void validateCoachHateList(List<String> menuList) {
        validateHateListLengthBetween0And2(menuList);
        validateHateFoodIsInMenuRepo(menuList);
    }

    private static void validateHateListLengthBetween0And2(List<String> menuList) {
        if (menuList.size() > 2) {
            throw new IllegalArgumentException("[ERROR] 싫어하는 음식은 최대 2개까지만 입력 가능합니다.");
        }
    }

    private static void validateHateFoodIsInMenuRepo(List<String> menuList) {
        for (String menu : menuList) {
            if (MenuRepository.getMenuList().stream()
                .noneMatch(menuName -> menuName.getMenuName().equals(menu))) {
                throw new IllegalArgumentException("[ERROR] 해당 메뉴는 메뉴리스트에 없는 메뉴입니다.");
            }
        }
    }
}
