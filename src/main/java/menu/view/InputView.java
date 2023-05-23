package menu.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static void startGame(){
        System.out.println("점심 메뉴 추천을 시작합니다.\n");
    }

    public static String inputCoachNames(){
        System.out.println("코치의 이름을 입력해 주세요. (, 로 구분)");
        return Console.readLine();
    }
}
