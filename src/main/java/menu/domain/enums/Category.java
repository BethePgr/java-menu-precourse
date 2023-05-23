package menu.domain.enums;

public enum Category {
    JAPAN("일식",1),
    KOREA("한식",2),
    CHINA("중식",3),
    ASIA("아시안",4),
    WESTERN("양식",5);

    private final String type;
    private final int value;

    Category(String type, int value) {
        this.type = type;
        this.value = value;
    }

}
