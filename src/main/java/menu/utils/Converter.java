package menu.utils;

import java.util.Arrays;
import java.util.List;

public class Converter {

    public static List<String> toListSplitsByComma(String input){
        return Arrays.asList(replaceSpaceToNothing(input).split(","));
    }

    public static String replaceSpaceToNothing(String input){
        return input.replace(" ","");
    }

    public static String makeOneStringByList(List<String> categories,String word){
        StringBuilder stringBuilder = new StringBuilder(word);
        for(String str : categories){
            stringBuilder.append(" | ").append(str);
        }
        return stringBuilder.append(" ]").toString();
    }
}
