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
//            System.out.println("Goal " + goal.getBonusGoal() + ": " + goals);
        }
//        System.out.println("Sum of goals: " + sumGoals);
        return sumGoals;
    }

    public int calculateSalary() {
        int salary = 3000;
//        System.out.println("Manager salary = " + salary +" nr years " +numerOfYearsOfWork()+ "bonus: "+calculateGoals());

        salary = salary + (numerOfYearsOfWork() * 1000) + calculateGoals();
        System.out.println("Salary manager "+getFirstName()+ " "+getLastName()+ ": " + salary);
        return salary;
    }
}
