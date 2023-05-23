package menu.utils;

import java.util.Arrays;
import java.util.List;

public class Converter {

    public static List<String> toListSplitsByComma(String input){
        return Arrays.asList(input.split(","));
    }
}
