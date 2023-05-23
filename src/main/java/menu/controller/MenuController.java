package menu.controller;

import java.util.List;
import menu.domain.Coach;
import menu.domain.Menu;
import menu.domain.MenuRepository;
import menu.domain.Menus;
import menu.service.MenuService;
import menu.utils.Converter;
import menu.view.InputView;
import menu.view.OutputView;

public class MenuController {

    public void run(){
        MenuRepository.init();
        OutputView.startGame();
        List<String> strings = InputController.inputCoachNames();

        MenuService menuService = new MenuService(strings);

        for(Coach coach : menuService.getCoaches().getCoachList()){
            String hateList = InputController.inputHateList(coach);
            if(!hateList.isBlank()){
                List<String> hateLists = Converter.toListSplitsByComma(hateList);
                menuService.addHateList(coach,hateLists);
            }
        }
        menuService.selectForFiveTimes();
        OutputView.printResult(menuService);
    }
}
