package menu.domain;

import java.util.ArrayList;
import java.util.List;

public class Coaches {

    private List<Coach> coachList = new ArrayList<>();

    public void addCoach(Coach coach){
        coachList.add(coach);
    }

}
