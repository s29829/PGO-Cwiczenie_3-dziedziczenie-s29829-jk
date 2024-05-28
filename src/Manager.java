import java.util.ArrayList;

public class Manager extends Employee {

    ArrayList<Goal> goals = new ArrayList<>();

    public Manager(String firstName, String lastName, String address, String email, String idNumberPesel, int dateRecruitment) {
        super(firstName, lastName, address, email, idNumberPesel, dateRecruitment);
    }

    public void addGoals(Goal g) {
        goals.add(g);
    }

    private int calculateGoals() {
        int sumGoals = 0;
        for (Goal goal : goals) {
            sumGoals += goal.getBonusGoal();
        }
        return sumGoals;
    }

    public int calculateSalary() {
        int salary = 3000;

        salary = salary + (numerOfYearsOfWork() * 1000) + calculateGoals();
        System.out.println("Salary manager "+getFirstName()+ " "+getLastName()+ ": " + salary);
        return salary;
    }
}
