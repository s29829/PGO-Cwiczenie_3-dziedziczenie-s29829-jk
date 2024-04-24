import java.util.ArrayList;

public class Manager extends Employee {

    ArrayList<Goal> goals = new ArrayList<>();

    public Manager(String firstName, String lastName, String city, String email, String idNumberPesel, int dateBirth) {
        super(firstName, lastName, city, email, idNumberPesel, dateBirth);

    }

    public void addGoals(Goal g) {
        goals.add(g);
    }
}
