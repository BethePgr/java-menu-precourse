package menu.controller;

import java.util.List;
import menu.utils.Converter;
import menu.validate.InputCoachNamesValidate;
import menu.view.InputView;

public class InputController {

    public static List<String> inputCoachNames(){
        try{
            List<String> coachNames = Converter.toListSplitsByComma(InputView.inputCoachNames());
            InputCoachNamesValidate.validateCoachNames(coachNames);
            return coachNames;
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return inputCoachNames();
        }
    }

}
