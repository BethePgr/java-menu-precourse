package menu.domain;

import java.util.ArrayList;
import java.util.List;

public class Coaches {

    private List<Coach> coachList = new ArrayList<>();

    public void addCoach(Coach coach){
        coachList.add(coach);
    }

    public void addCoachByName(String name){
        coachList.add(new Coach(name));
    }

    public List<Coach> getCoachList(){
        return coachList;
    }
}
