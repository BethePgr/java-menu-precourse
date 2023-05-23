package menu.validate;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import menu.utils.Converter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InputViewValidateTest {


    @Test
    @DisplayName("코치가 한 명이므로 에러를 던져야 한다.")
    void test1() throws Exception {
        //given
        String input = "one";
        //when
        List<String> coachNames = Converter.toListSplitsByComma(input);
        //then
        assertThrows(IllegalArgumentException.class, () -> InputViewValidate.validateCoachNames(coachNames));
    }

    @Test
    @DisplayName("코치가 두명이고 두 명의 글자수가 3개이니 에러를 던지지 않는다.")
    void test2() throws Exception {
        //given
        String input = "one,two";
        //when
        List<String> coachNames = Converter.toListSplitsByComma(input);
        //then
        assertDoesNotThrow(() -> InputViewValidate.validateCoachNames(coachNames));
    }

    @Test
    @DisplayName("코치 한 명의 이름이 5글자이므로 에러를 던진다.")
    void test3() throws Exception {
        //given
        String input = "one,two,three,four";
        //when
        List<String> coachNames = Converter.toListSplitsByComma(input);
        //then
        assertThrows(IllegalArgumentException.class, () -> InputViewValidate.validateCoachNames(coachNames));
    }

    @Test
    @DisplayName("코치가 6명 존재하므로 에러를 던진다.")
    void test4() throws Exception {
        //given
        String input = "one,two,thr,four,five,six";
        //when
        List<String> coachNames = Converter.toListSplitsByComma(input);
        //then
        assertThrows(IllegalArgumentException.class, () -> InputViewValidate.validateCoachNames(coachNames));
    }

    @Test
    @DisplayName("코치가 이름 중복이 존재하므로 에러를 던진다.")
    void test5() throws Exception {
        //given
        String input = "one,two,thr,thr,six";
        //when
        List<String> coachNames = Converter.toListSplitsByComma(input);
        //then
        assertThrows(IllegalArgumentException.class, () -> InputViewValidate.validateCoachNames(coachNames));
    }
}