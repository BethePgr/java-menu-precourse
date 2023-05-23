package menu.view;

import camp.nextstep.edu.missionutils.Console;
import menu.domain.Coach;

public class InputView {

    public static String inputCoachNames(){
        System.out.println("코치의 이름을 입력해 주세요. (, 로 구분)");
        return Console.readLine();
    }

    public static String inputCoachHateList(Coach coach){
        System.out.println(coach.getName() + "(이)가 못 먹는 메뉴를 입력해 주세요.");
        return Console.readLine();
    }
}
