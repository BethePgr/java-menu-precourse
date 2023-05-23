package menu.validate;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import menu.domain.Menu;
import menu.domain.MenuRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InputCoachHateListValidateTest {

    @BeforeEach
    void setUp(){
        MenuRepository.init();
    }

    @Test
    @DisplayName("")
    void test1() throws Exception{
        //given
        List<String> menuList = new ArrayList<>(List.of("규동","우동"));
        //when
        //then
        assertDoesNotThrow(() -> InputCoachHateListValidate.validateCoachHateList(menuList));
    }

    @Test
    @DisplayName("")
    void test2() throws Exception{
        //given
        List<String> menuList = new ArrayList<>(List.of("규동","가나"));
        //when
        //then
        assertThrows(IllegalArgumentException.class, () -> InputCoachHateListValidate.validateCoachHateList(menuList));
    }
}