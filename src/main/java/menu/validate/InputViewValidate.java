package menu.validate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import menu.utils.Converter;

public class InputViewValidate {

    public static void validateCoachNames(List<String> coachNames) {
        validateAllCoachNamesLength(coachNames);
        validateCoachesBetween2And5(coachNames);
        validateCoachNamesDistinct(coachNames);
    }

    private static void validateCoachNameLengthBetween2And4(String coachName) {
        if (coachName.length() <= 1 || coachName.length() >= 5) {
            throw new IllegalArgumentException("[ERROR] 코치의 이름의 길이는 2글자와 4글자 사이여야합니다.");
        }
    }

    private static void validateAllCoachNamesLength(List<String> coachNames) {
        for (String coachName : coachNames) {
            validateCoachNameLengthBetween2And4(coachName);
        }
    }

    private static void validateCoachesBetween2And5(List<String> coachNames) {
        if (coachNames.size() <= 1 || coachNames.size() >= 6) {
            throw new IllegalArgumentException("[ERROR] 같이 밥을 먹는 코치의 숫자는 2명과 5명 사이여야 합니다.");
        }
    }

    private static void validateCoachNamesDistinct(List<String> coachNames){
        if(coachNames.size() != coachNames.stream().distinct().count()){
            throw new IllegalArgumentException("[ERROR] 코치의 이름을 서로 달라야 합니다.");
        }
    }

}
