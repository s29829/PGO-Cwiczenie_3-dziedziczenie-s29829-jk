import java.util.ArrayList;

public class Tester extends Employee{

    ArrayList<String> testsCategories = new ArrayList<>();

    public Tester(String firstName, String lastName, String address, String email, String idNumberPesel, int dateRecruitment) {
        super(firstName, lastName, address, email, idNumberPesel, dateRecruitment);
    }

    public void addTestType(String testsCategory) {
        this.testsCategories.add(testsCategory);
    }

    private int calculateTests() {
        int benefits = 0;
        for (String testCategory : testsCategories) {
            benefits +=  300;

        }
        return benefits;
    }

    public int calculateSalary() {
        int salary = 3000;
        salary += (numerOfYearsOfWork() * 1000) + calculateTests();
        System.out.println("Salary tester "+getFirstName()+ " "+getLastName()+ ": " + salary );
        return salary;
    }

}
