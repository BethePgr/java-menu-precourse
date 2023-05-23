package menu.domain.enums;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Category {
    JAPAN("일식", 1),
    KOREA("한식", 2),
    CHINA("중식", 3),
    ASIA("아시안", 4),
    WESTERN("양식", 5);

    private final String type;
    private final int value;

    Category(String type, int value) {
        this.type = type;
        this.value = value;
    }

    public static String selectCategory() {
        int num = Randoms.pickNumberInRange(1, 5);
        return Arrays.stream(Category.values()).filter(category -> category.value == num).findAny()
            .orElseThrow(() -> new IllegalArgumentException("[ERROR] 해당 카테고리는 존재하지 않습니다.")).type;
    }

    public String getType(){
        return type;
    }
}
